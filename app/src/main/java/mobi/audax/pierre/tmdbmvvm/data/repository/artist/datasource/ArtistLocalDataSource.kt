package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistToLocal(artists: List<Artist>)
    suspend fun clearAll()
}