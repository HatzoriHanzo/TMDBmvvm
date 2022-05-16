package mobi.audax.pierre.tmdbmvvm.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import mobi.audax.pierre.tmdbmvvm.domain.usecase.GetTvShowUseCase
import mobi.audax.pierre.tmdbmvvm.domain.usecase.UpdateTvShowUseCase

class TvShowViewModel(
    private val getTvShowUseCase: GetTvShowUseCase,
    private val updateTvShowUseCase: UpdateTvShowUseCase
) : ViewModel() {
    fun getTvShow() = liveData{
        val tvShowList = getTvShowUseCase.execute()
        emit(tvShowList)
    }
    fun updateTvShow() = liveData{
        val tvShowList = updateTvShowUseCase.execute()
        emit(tvShowList)
    }
}