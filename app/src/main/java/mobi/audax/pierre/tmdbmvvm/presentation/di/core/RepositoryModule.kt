package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.ArtistRepositoryImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistCacheDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistLocalDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistRemoteDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.MovieRepositoryImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieCacheDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieLocalDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieRemoteDatasource
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.TvShowRepositoryImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.domain.repository.ArtistRepository
import mobi.audax.pierre.tmdbmvvm.domain.repository.MovieRepository
import mobi.audax.pierre.tmdbmvvm.domain.repository.TvShowRepository
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
         artistCacheDataSource: ArtistCacheDataSource,
         artistRemoteDataSource: ArtistRemoteDataSource,
         artistLocalDataSource: ArtistLocalDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistCacheDataSource,
            artistRemoteDataSource,
            artistLocalDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowLocalDataSource: TvShowLocalDataSourceImpl,
        tvShowRemoteDataSource: TvShowRemoteDataSourceImpl,
        tvShowCacheDataSource: TvShowCacheDataSourceImpl
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowLocalDataSource,
            tvShowRemoteDataSource,
            tvShowCacheDataSource
        )
    }
}