package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}