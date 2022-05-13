package mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datsource

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getRemoteTvShows(): Response<TvShowList>
}