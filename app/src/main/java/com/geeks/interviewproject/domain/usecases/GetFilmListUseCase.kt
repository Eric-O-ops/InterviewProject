package com.geeks.interviewproject.domain.usecases

import com.geeks.interviewproject.domain.repositories.FilmRepository
import javax.inject.Inject

class GetFilmListUseCase @Inject constructor(
    private val filmRepository: FilmRepository
) {

    operator fun invoke() = filmRepository.getFilmList()
}