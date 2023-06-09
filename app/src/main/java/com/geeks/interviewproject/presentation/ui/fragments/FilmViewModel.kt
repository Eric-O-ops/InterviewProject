package com.geeks.interviewproject.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.geeks.interviewproject.domain.usecases.GetFilmListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilmViewModel @Inject constructor(
    private val filmUseCase: GetFilmListUseCase
): ViewModel() {

    fun getPokemonList() = filmUseCase()
}