package com.geeks.interviewproject.data.repositories

import com.geeks.interviewproject.data.base.BaseRepository
import com.geeks.interviewproject.data.remote.api.FilmService
import com.geeks.interviewproject.data.remote.dtos.toDomain
import com.geeks.interviewproject.domain.models.pokemon.FilmDomain
import com.geeks.interviewproject.domain.repositories.FilmRepository
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val filmApi: FilmService
) : BaseRepository(), FilmRepository {

    override fun getFilmList() = doRequest {
        filmApi.fetchFilms().map { pokemonDto ->
            pokemonDto.toDomain()
        }
    }

    override fun getDetailFilm(id: String) = filmApi.fetchDetailFilm(id).toDomain()
}