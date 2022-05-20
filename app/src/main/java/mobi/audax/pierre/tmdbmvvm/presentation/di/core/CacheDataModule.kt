package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistCacheDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieCacheDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource.TvShowCacheDataSource
import javax.inject.Singleton


@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }
}