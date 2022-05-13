package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.db.TvShowDao
import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datsource.TvShowLocalDataSource

class TvShowLocalDataSourceImpl(private var tvDao: TvShowDao) : TvShowLocalDataSource {
    override suspend fun getTvShows(): List<TvShow> {
        return tvDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        tvDao.saveTvShows(tvShows)
    }

    override suspend fun clearAll() {
        tvDao.deleteAllTvShows()
    }
}