package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import mobi.audax.pierre.tmdbmvvm.data.db.ArtistDao
import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistLocalDataSource

class ArtistLocalDataSourceImpl(private val dao:ArtistDao) : ArtistLocalDataSource {


    override suspend fun getArtists(): List<Artist> = dao.getArtists()

    override suspend fun saveArtistToLocal(artists: List<Artist>) {
        CoroutineScope(IO).launch {
            dao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(IO).launch {
            dao.deleteAllArtists()
        }
    }
}