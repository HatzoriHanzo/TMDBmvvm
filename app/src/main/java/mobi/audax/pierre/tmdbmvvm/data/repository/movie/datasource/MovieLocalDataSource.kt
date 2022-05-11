package mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource

import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}