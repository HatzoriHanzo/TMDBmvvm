package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}