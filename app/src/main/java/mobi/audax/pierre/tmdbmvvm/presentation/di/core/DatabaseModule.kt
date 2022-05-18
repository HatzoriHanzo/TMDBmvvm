package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.db.ArtistDao
import mobi.audax.pierre.tmdbmvvm.data.db.MovieDao
import mobi.audax.pierre.tmdbmvvm.data.db.TMDBDatabase
import mobi.audax.pierre.tmdbmvvm.data.db.TvShowDao
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TMDBDatabase =
        Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbcliente").build()

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao = tmdbDatabase.movieDao()

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao = tmdbDatabase.artistDao()

    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase): TvShowDao = tmdbDatabase.tvDao()
}