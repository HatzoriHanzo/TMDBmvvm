package mobi.audax.pierre.tmdbmvvm.presentation.di.movie

import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.domain.usecase.GetMoviesUseCase
import mobi.audax.pierre.tmdbmvvm.domain.usecase.UpdateMoviesUseCase
import mobi.audax.pierre.tmdbmvvm.presentation.di.movie.MovieScope
import mobi.audax.pierre.tmdbmvvm.presentation.movie.MovieViewModelFactory

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}