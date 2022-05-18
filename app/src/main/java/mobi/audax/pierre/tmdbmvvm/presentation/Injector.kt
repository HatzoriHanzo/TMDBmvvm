package mobi.audax.pierre.tmdbmvvm.presentation

import mobi.audax.pierre.tmdbmvvm.presentation.di.artist.ArtistSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.movie.MovieSubComponent
import mobi.audax.pierre.tmdbmvvm.presentation.di.tvshow.TvShowSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
}