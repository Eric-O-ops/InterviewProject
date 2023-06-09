package com.geeks.interviewproject.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geeks.interviewproject.R
import com.geeks.interviewproject.databinding.FragmentFilmBinding
import com.geeks.interviewproject.presentation.adapters.FilmAdapter
import com.geeks.interviewproject.presentation.base.BaseFragment
import com.geeks.interviewproject.presentation.models.pokemon.toPresentation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FilmFragment : BaseFragment<FragmentFilmBinding, FilmViewModel>(R.layout.fragment_film) {

    override val binding by viewBinding(FragmentFilmBinding::bind)
    override val viewModel: FilmViewModel by viewModels()
    private val filmAdapter = FilmAdapter(this::onClick)

    override fun initialize() {
        binding.filmRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = filmAdapter
        }
    }

    override fun setupSubscribes() {
        viewModel.getPokemonList().subscribe(
            left = { error ->
                Log.e("TAG", error)
            },
            right = { data ->
                filmAdapter.submitList(data.map { it.toPresentation() })
            }
        )
    }

    private fun onClick(id: String) {
        findNavController().navigate(
            FilmFragmentDirections
                .actionFilmFragmentToDetailFilmFragment()
                .setId(id)
        )
    }
}