package mobi.audax.pierre.tmdbmvvm.data.repository.movie

import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movie:List<Movie>)
}