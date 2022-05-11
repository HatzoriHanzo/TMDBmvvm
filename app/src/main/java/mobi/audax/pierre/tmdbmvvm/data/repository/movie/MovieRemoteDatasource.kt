package mobi.audax.pierre.tmdbmvvm.data.repository.movie

import mobi.audax.pierre.tmdbmvvm.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>

}