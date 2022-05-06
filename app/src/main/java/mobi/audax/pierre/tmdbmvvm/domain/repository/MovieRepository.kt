package mobi.audax.pierre.tmdbmvvm.domain.repository

import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}