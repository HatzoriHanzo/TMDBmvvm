package mobi.audax.pierre.tmdbmvvm.presentation.di.artist

import dagger.Subcomponent
import mobi.audax.pierre.tmdbmvvm.presentation.artist.ArtistActivity

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }

}

