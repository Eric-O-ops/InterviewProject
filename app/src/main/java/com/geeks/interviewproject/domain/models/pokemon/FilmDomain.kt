package com.geeks.interviewproject.domain.models.pokemon

data class FilmDomain(
    val id: String,
    val title: String,
    val original_title: String,
    val original_title_romanised: String,
    val image: String,
    val movie_banner: String,
    val description: String,
    val director: String,
    val producer: String,
    val release_date: String,
    val running_time: String,
    val rt_score: String
)