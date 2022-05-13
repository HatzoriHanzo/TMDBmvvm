package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShowList
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datsource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl( private val tmdbService: TMDBService, private val apiKey:String) :TvShowRemoteDataSource {
    override suspend fun getRemoteTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)
}