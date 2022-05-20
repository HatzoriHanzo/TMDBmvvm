package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
    suspend fun clearAll()
}