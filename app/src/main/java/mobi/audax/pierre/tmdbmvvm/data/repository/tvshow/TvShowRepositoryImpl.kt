package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow

import android.util.Log
import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowLocalDataSource: TvShowLocalDataSourceImpl,
    private val tvShowRemoteDataSource: TvShowRemoteDataSourceImpl,
    private val tvShowCacheDataSource: TvShowCacheDataSourceImpl
) : TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShow(): List<TvShow>? {
        val newListOfTvShows = getRemoteTvShows()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowsToDB(newListOfTvShows)
        tvShowCacheDataSource.saveTvShowsToCache(newListOfTvShows)
        return newListOfTvShows
    }

    suspend fun getRemoteTvShows(): List<TvShow> {
        lateinit var listTvShows: List<TvShow>
        try {
            val response = tvShowRemoteDataSource.getRemoteTvShows()
            val body = response.body()
            if (body != null) {
                listTvShows = body.tvShows
            }
        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }
        return listTvShows
    }

    suspend fun getLocalTvShowsFromDB(): List<TvShow> {
        lateinit var listTvShows: List<TvShow>
        try {
                listTvShows = tvShowLocalDataSource.getTvShowsFromDB()
        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }
        if (listTvShows.isNotEmpty()){
            return listTvShows

        }else{
            listTvShows = getRemoteTvShows()

        }
        return listTvShows
    }

    suspend fun getTvShowsFromCache():List<TvShow>{
        lateinit var listTvShows:List<TvShow>
        try {
            listTvShows = tvShowCacheDataSource.getTvShowsFromCache()
        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }

        if (listTvShows.isNotEmpty()){
            return listTvShows
        }else{
            listTvShows = getLocalTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowsToCache(listTvShows)
        }
        return listTvShows
    }

}