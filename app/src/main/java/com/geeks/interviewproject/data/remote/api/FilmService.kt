package com.geeks.interviewproject.data.remote.api

import com.geeks.interviewproject.data.remote.dtos.FilmDto
import retrofit2.http.GET
import retrofit2.http.Path

const val END_POINT = "films/"

interface FilmService {

    @GET(END_POINT)
    suspend fun fetchFilms(): List<FilmDto>

    @GET("$END_POINT{id}")
    fun fetchDetailFilm(
        @Path("id") idModel: String?
    ): FilmDto
}