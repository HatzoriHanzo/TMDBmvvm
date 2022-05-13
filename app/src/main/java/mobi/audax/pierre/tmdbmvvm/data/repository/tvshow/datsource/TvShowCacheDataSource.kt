package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datsource

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow

interface TvShowCacheDataSource  {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShowList:List<TvShow>)
}