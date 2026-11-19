package com.example.pertemuan9.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pertemuan9.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class DataViewModel(
    savedStateHandle: SavedStateHandle
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel(){



    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui state for ItemDetailScreen
 */

data class DetailSiswaState(
    val detailSiswa: DetailSiswa = DetailSiswa()
)