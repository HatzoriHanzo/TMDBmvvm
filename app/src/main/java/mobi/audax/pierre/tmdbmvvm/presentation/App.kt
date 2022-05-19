package mobi.audax.pierre.tmdbmvvm.presentation

import android.app.Application
import mobi.audax.pierre.tmdbmvvm.BuildConfig
import mobi.audax.pierre.tmdbmvvm.presentation.di.Injector
import mobi.audax.pierre.tmdbmvvm.presentation.di.artist.ArtistSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.core.*
import mobi.audax.pierre.tmdbmvvm.presentation.di.movie.MovieSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow.TvShowSubComponent


class App : Application(), Injector {
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}