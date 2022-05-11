package mobi.audax.pierre.tmdbmvvm.data.repository.movie

import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import mobi.audax.pierre.tmdbmvvm.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}