package mobi.audax.pierre.tmdbmvvm.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mobi.audax.pierre.tmdbmvvm.R
import mobi.audax.pierre.tmdbmvvm.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {
    lateinit var binding : ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_movie)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_movie)
    }
}