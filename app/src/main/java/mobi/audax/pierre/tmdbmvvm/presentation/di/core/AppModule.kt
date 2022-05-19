package mobi.audax.pierre.tmdbmvvm.presentation.di.core

import android.content.Context
import dagger.Module
import dagger.Provides
import mobi.audax.pierre.tmdbmvvm.presentation.di.artist.ArtistSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.movie.MovieSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow.TvShowSubComponent
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class, TvShowSubComponent::class, ArtistSubComponent::class])
class AppModule(private val context: Context) {

 @Singleton
 @Provides
 fun provideApplicationContext():Context{
     return context.applicationContext
 }





}