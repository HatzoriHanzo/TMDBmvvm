package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistFromCache():List<Artist>
    suspend fun saveArtistToCache(artists:List<Artist>)

}