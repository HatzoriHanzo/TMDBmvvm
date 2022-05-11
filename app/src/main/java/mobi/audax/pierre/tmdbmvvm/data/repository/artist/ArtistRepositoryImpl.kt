package mobi.audax.pierre.tmdbmvvm.data.repository.artist

import android.util.Log
import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistCacheDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistLocalDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistRemoteDataSource
import mobi.audax.pierre.tmdbmvvm.domain.repository.ArtistRepository

class ArtistRepositoryImpl(
    private val artistCacheDataSource: ArtistCacheDataSource,
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource
) : ArtistRepository {

    override suspend fun getArtist(): List<Artist>? {
        return getArtistsFromCache()
    }

    override suspend fun updateArtist(): List<Artist>? {
        val newListOfArtists = getArtistsFromApi()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistToLocal(newListOfArtists)
        artistCacheDataSource.saveArtistToCache(newListOfArtists)
        return newListOfArtists
    }

    suspend fun getArtistsFromApi(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            val response = artistRemoteDataSource.getArtists()
            val body = response.body()
            if (body != null) {
                artistList = body.artists
            }
        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }
        return artistList
    }

    suspend fun getArtistsFromDB(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            artistList = artistLocalDataSource.getArtistsFromDB()

        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }
        return artistList
    }

    suspend fun getArtistsFromCache(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            artistList = artistCacheDataSource.getArtistFromCache()
        } catch (e: Exception) {
            Log.e("MyTag", "getMoviesFromApi: " + e.message.toString())
        }

        if (artistList.isNotEmpty()) {
            return artistList
        } else {
            artistList = getArtistsFromDB()
            artistCacheDataSource.saveArtistToCache(artistList)
        }
        return artistList
    }
}