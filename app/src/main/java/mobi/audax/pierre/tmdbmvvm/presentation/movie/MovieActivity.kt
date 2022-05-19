package mobi.audax.pierre.tmdbmvvm.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import mobi.audax.pierre.tmdbmvvm.R
import mobi.audax.pierre.tmdbmvvm.databinding.ActivityMovieBinding
import mobi.audax.pierre.tmdbmvvm.presentation.di.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    private lateinit var movieViewModel: MovieViewModel

    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
        (application as Injector).createMovieSubComponent().inject(this)

        movieViewModel = ViewModelProvider(this, factory).get(MovieViewModel::class.java)

        val responseLiveData = movieViewModel.getMovies().observe(this, Observer {
            Log.i("MYTAG", it.toString())
        })
    }
}