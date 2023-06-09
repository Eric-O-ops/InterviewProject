package com.geeks.interviewproject.presentation.ui.fragments.detail

import androidx.lifecycle.ViewModel
import com.geeks.interviewproject.domain.usecases.GetDetailFilmUseCase
import com.geeks.interviewproject.presentation.models.pokemon.toPresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailFilmViewModel @Inject constructor(
    private val detailFilmUseCase: GetDetailFilmUseCase
): ViewModel() {

    fun getDetailFilm(id: String) = detailFilmUseCase(id).toPresentation()
}