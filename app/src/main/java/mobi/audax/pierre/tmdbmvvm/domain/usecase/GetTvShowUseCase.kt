package mobi.audax.pierre.tmdbmvvm.domain.usecase

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow
import mobi.audax.pierre.tmdbmvvm.domain.repository.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}