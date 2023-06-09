package com.geeks.interviewproject.presentation.ui.fragments.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.geeks.interviewproject.R
import com.geeks.interviewproject.databinding.FragmentDetailFilmBinding
import com.geeks.interviewproject.presentation.base.BaseFragment

class DetailFilmFragment :
    BaseFragment<FragmentDetailFilmBinding, DetailFilmViewModel>(R.layout.fragment_detail_film) {
    override val binding by viewBinding(FragmentDetailFilmBinding::bind)
    override val viewModel: DetailFilmViewModel by viewModels()
    private val args by navArgs<DetailFilmFragmentArgs>()


    override fun setupUI() {
        val film = viewModel.getDetailFilm(args.id)
        with(binding) {
            title.text = film.title
            originalTitle.text = film.original_title
            originalTitleRomanised.text = film.original_title_romanised
            description.text = film.description
            director.text = film.director
            producer.text= film.producer
            releaseDate.text = film.release_date
            runningTime.text = film.running_time
            score.text = film.rt_score
            image.load(film.image)
            movieBanner.load(film.movie_banner)
        }
    }
}