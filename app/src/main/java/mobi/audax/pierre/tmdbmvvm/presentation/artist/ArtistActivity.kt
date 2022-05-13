package mobi.audax.pierre.tmdbmvvm.presentation.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mobi.audax.pierre.tmdbmvvm.R
import mobi.audax.pierre.tmdbmvvm.databinding.ActivityArtistBinding

class ArtistActivity : AppCompatActivity() {
private lateinit var binding : ActivityArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_artist)
    }
}