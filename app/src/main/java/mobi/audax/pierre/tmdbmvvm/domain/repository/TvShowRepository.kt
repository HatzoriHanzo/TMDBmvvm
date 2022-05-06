package mobi.audax.pierre.tmdbmvvm.domain.repository

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShow(): List<TvShow>?
}