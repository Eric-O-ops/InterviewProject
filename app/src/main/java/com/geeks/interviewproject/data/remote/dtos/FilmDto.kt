package com.geeks.interviewproject.data.remote.dtos

import com.geeks.interviewproject.domain.models.pokemon.FilmDomain
import com.google.gson.annotations.SerializedName

data class FilmDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("original_title")
    val original_title: String,
    @SerializedName("original_title_romanised")
    val original_title_romanised: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("movie_banner")
    val movie_banner: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("director")
    val director: String,
    @SerializedName("producer")
    val producer: String,
    @SerializedName("release_date")
    val release_date: String,
    @SerializedName("running_time")
    val running_time: String,
   @SerializedName("rt_score")
   val rt_score: String
)

fun FilmDto.toDomain() = FilmDomain(
    id = id,
    title = title,
    original_title = original_title,
    original_title_romanised = original_title_romanised,
    image = image,
    movie_banner = movie_banner,
    description = description,
    director = director,
    producer = producer,
    release_date = release_date,
    running_time = running_time,
    rt_score = rt_score
)