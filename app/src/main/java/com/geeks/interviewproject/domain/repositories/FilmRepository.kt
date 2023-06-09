package com.geeks.interviewproject.domain.repositories

import com.eric.domain.either.Either
import com.geeks.interviewproject.domain.models.pokemon.FilmDomain
import kotlinx.coroutines.flow.Flow

interface FilmRepository {

    fun getFilmList(): Flow<Either<String, List<FilmDomain>>>

    fun getDetailFilm(id: String): FilmDomain
}