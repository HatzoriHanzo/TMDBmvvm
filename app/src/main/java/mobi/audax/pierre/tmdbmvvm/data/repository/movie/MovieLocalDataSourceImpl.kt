package mobi.audax.pierre.tmdbmvvm.data.repository.movie

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import mobi.audax.pierre.tmdbmvvm.data.db.MovieDao
import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie

class MovieLocalDataSourceImpl(private val dao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> = dao.getMovies()


    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(IO).launch {
            dao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(IO).launch {
            dao.deleteAllMovies()
        }
    }
}