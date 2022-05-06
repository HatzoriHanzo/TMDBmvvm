package mobi.audax.pierre.tmdbmvvm.domain.repository

import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtist(): List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}