package mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow

import dagger.Subcomponent
import mobi.audax.pierre.tmdbmvvm.presentation.tvshow.TvShowActivity

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }

}

