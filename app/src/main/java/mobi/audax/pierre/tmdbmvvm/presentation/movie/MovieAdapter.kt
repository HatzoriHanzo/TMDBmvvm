package mobi.audax.pierre.tmdbmvvm.presentation.movie

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mobi.audax.pierre.tmdbmvvm.R
import mobi.audax.pierre.tmdbmvvm.data.model.movie.Movie
import mobi.audax.pierre.tmdbmvvm.databinding.ListItemBinding

class MovieAdapter :RecyclerView.Adapter<MyViewHolder>(){
    private val movieList = ArrayList<Movie>()

    fun setList(movies:List<Movie>){
        movieList.clear()
        movieList.addAll(movies)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position])
    }
}

class MyViewHolder(val binding:ListItemBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(movie: Movie){
        binding.titleTextView.text = movie.title
        binding.descriptionTextView.text = movie.overview
        val posterURL = "https://image.tmdb.org/t/p/w500"+movie.posterPath
        Log.e("MyTAG", "bind: $posterURL", )
        Glide.with(binding.imageView.context)
            .load(posterURL)
            .into(binding.imageView)
    }

}