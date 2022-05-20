package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.db.ArtistDao
import mobi.audax.pierre.tmdbmvvm.data.db.MovieDao
import mobi.audax.pierre.tmdbmvvm.data.db.TvShowDao
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistLocalDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieLocalDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource.TvShowLocalDataSource
import javax.inject.Singleton


@Module
class LocalDataModule {


    @Provides
    @Singleton
    fun provideMovieLocalData(dao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(dao)
    }

    @Provides
    @Singleton
    fun provideArtistLocalData(dao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(dao)
    }

    @Provides
    @Singleton
    fun provideTvShowLocalData(dao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(dao)
    }
}