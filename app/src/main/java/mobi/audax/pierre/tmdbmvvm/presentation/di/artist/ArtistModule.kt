package mobi.audax.pierre.tmdbmvvm.presentation.di.artist


import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.domain.usecase.GetArtistUseCase
import mobi.audax.pierre.tmdbmvvm.domain.usecase.UpdateArtistUseCase
import mobi.audax.pierre.tmdbmvvm.presentation.artist.ArtistViewModelFactory

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistUseCase,
        updateArtistsUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}