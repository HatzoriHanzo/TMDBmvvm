package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datsource

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShows(): List<TvShow>
    suspend fun saveTvShowsToDB(tvShows: List<TvShow>)
    suspend fun clearAll()
}