package mobi.audax.pierre.tmdbmvvm.domain.usecase

import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow
import mobi.audax.pierre.tmdbmvvm.domain.repository.TvShowRepository



class UpdateTvShowUseCase(private val tvRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvRepository.updateTvShow()
}