package mobi.audax.pierre.tmdbmvvm.domain.usecase

import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist
import mobi.audax.pierre.tmdbmvvm.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtist()
}