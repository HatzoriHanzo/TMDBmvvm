package mobi.audax.pierre.tmdbmvvm.domain.usecase

import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie
import mobi.audax.pierre.tmdbmvvm.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()

}