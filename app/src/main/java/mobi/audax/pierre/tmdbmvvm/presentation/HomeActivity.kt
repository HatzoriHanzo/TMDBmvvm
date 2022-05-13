package mobi.audax.pierre.tmdbmvvm.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mobi.audax.pierre.tmdbmvvm.R
import mobi.audax.pierre.tmdbmvvm.databinding.ActivityHomeBinding
import mobi.audax.pierre.tmdbmvvm.presentation.artist.ArtistActivity
import mobi.audax.pierre.tmdbmvvm.presentation.movie.MovieActivity
import mobi.audax.pierre.tmdbmvvm.presentation.tvshow.TvShowActivity


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.moviesButton.setOnClickListener {
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
           // startActivity(Intent(this, MovieActivity::class.java))
        }
        binding.tvshowButton.setOnClickListener {
            startActivity(Intent(this, TvShowActivity::class.java))
        }
        binding.artistButton.setOnClickListener {
            startActivity(Intent(this, ArtistActivity::class.java))
        }
    }
}