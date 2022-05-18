package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {
 private var artistList = ArrayList<Artist>()
    override suspend fun getArtistFromCache(): List<Artist> = artistList

    override suspend fun saveArtistToCache(artists: List<Artist>) {
        artistList.clear()
        artistList.addAll(artists)
    }
}