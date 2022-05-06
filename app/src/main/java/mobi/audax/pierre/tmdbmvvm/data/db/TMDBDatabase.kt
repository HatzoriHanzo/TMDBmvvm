package mobi.audax.pierre.tmdbmvvm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import mobi.audax.pierre.tmdbmvvm.data.model.artist.Artist
import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie
import mobi.audax.pierre.tmdbmvvm.data.model.tvshow.TvShow


@Database(
    entities = [Artist::class, TvShow::class, Movie::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao

    abstract fun artistDao(): ArtistDao

    abstract fun tvDao(): TvShowDao

}