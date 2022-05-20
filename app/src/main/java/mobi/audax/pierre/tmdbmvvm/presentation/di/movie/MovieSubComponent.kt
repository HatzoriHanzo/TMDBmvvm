package mobi.audax.pierre.tmdbmvvm.presentation.di.movie

import dagger.Subcomponent
import mobi.audax.pierre.tmdbmvvm.presentation.movie.MovieActivity

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): MovieSubComponent
    }

}

