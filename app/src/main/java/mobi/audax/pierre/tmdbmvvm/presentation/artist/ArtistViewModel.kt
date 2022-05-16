package mobi.audax.pierre.tmdbmvvm.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import mobi.audax.pierre.tmdbmvvm.domain.usecase.GetArtistUseCase
import mobi.audax.pierre.tmdbmvvm.domain.usecase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {
    fun getArtist() = liveData{
        val artistList = getArtistUseCase.execute()
        emit(artistList)
    }
    fun updateArtist() = liveData{
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }
}