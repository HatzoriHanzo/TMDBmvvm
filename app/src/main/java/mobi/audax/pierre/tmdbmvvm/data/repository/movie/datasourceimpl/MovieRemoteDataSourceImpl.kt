package mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import mobi.audax.pierre.tmdbmvvm.data.model.movie.MovieList
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}