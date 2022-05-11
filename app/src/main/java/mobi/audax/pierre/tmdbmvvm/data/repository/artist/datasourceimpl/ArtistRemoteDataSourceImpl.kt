package mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import mobi.audax.pierre.tmdbmvvm.data.model.artist.ArtistList
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmbdService:TMDBService,private val apiKey: String) :ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmbdService.getPopularArtists(apiKey)

}