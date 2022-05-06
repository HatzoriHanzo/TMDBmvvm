package mobi.audax.pierre.tmdbmvvm.data.model.movie


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_movies")
data class Movie(
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("posterPath")
    val posterPath: String?,
    @SerializedName("releaseDate")
    val releaseDate: String?,
    @SerializedName("title")
    val title: String?

    )