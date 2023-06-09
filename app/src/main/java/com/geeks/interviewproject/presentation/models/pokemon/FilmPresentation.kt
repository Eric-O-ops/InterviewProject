package com.geeks.interviewproject.presentation.models.pokemon

import com.geeks.interviewproject.domain.models.pokemon.FilmDomain
import com.geeks.interviewproject.presentation.base.BaseDiffUtilItemCallBack

data class FilmPresentation(
    override val id: String,
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
) : BaseDiffUtilItemCallBack

fun FilmDomain.toPresentation() = FilmPresentation(
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

