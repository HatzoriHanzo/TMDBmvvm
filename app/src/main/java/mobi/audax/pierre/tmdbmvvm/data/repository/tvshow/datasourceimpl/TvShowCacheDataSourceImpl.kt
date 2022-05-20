package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {
    private var tvShowCacheList = ArrayList<TvShow>()
    override suspend fun getTvShowsFromCache(): List<TvShow> = tvShowCacheList

    override suspend fun saveTvShowsToCache(tvShowList:List<TvShow>) {
        this.tvShowCacheList.clear()
        this.tvShowCacheList.addAll(tvShowList)
    }
}