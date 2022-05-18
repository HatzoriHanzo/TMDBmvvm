package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.domain.repository.ArtistRepository
import mobi.audax.pierre.tmdbmvvm.domain.repository.MovieRepository
import mobi.audax.pierre.tmdbmvvm.domain.repository.TvShowRepository
import mobi.audax.pierre.tmdbmvvm.domain.usecase.*
import javax.inject.Singleton


@Module
class UseCaseModule {


    // Movies
    @Provides
    @Singleton
    fun provideMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }

    // Artist
    @Provides
    @Singleton
    fun provideArtistUseCase(artistRepository: ArtistRepository ): GetArtistUseCase{
        return GetArtistUseCase(artistRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUseCase{
        return UpdateArtistUseCase(artistRepository)
    }

    // TvShow
    @Provides
    @Singleton
    fun provideTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowUseCase{
        return GetTvShowUseCase(tvShowRepository)
    }

    @Provides
    @Singleton
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowUseCase{
        return UpdateTvShowUseCase(tvShowRepository)
    }
}