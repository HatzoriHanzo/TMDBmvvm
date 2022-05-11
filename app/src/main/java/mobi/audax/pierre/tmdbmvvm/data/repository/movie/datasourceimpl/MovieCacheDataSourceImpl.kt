package mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasourceimpl

import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> = movieList

    override suspend fun saveMoviesToCache(movie: List<Movie>) {
        movieList.clear()
        movieList.addAll(movie)
    }
}