package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import dagger.Component
import mobi.audax.pierre.tmdbmvvm.presentation.di.artist.ArtistSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.movie.MovieSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow.TvShowSubComponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RetrofitModule::class,
        DatabaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {
    fun movieSubComponent(): MovieSubComponent
    fun artistSubComponent(): ArtistSubComponent
    fun tvShowSubComponent(): TvShowSubComponent

}