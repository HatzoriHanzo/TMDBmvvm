package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.data.api.TMDBService
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasource.ArtistRemoteDataSource
import mobi.audax.pierre.tmdbmvvm.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasource.MovieRemoteDatasource
import mobi.audax.pierre.tmdbmvvm.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import mobi.audax.pierre.tmdbmvvm.data.repository.tvshow.datasource.TvShowRemoteDataSource
import javax.inject.Singleton


@Module
class RemoteDataModule(private val apiKey: String) {


    @Singleton
    @Provides
    fun provideMovieRemoteData(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }
    @Singleton
    @Provides
    fun provideArtistRemoteData(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }
    @Singleton
    @Provides
    fun provideTvShowRemoteData(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }


}