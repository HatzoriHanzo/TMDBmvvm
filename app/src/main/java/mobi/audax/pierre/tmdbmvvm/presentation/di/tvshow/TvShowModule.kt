package mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow


import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.domain.usecase.GetTvShowUseCase
import mobi.audax.pierre.tmdbmvvm.domain.usecase.UpdateTvShowUseCase
import mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow.TvShowScope
import mobi.audax.pierre.tmdbmvvm.presentation.tvshow.TvShowViewModelFactory

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowUseCase,
        updateTvShowsUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}