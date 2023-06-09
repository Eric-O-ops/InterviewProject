package com.geeks.interviewproject.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.geeks.interviewproject.databinding.ItemFilmBinding
import com.geeks.interviewproject.presentation.base.BaseDiffUtilItemCallBack
import com.geeks.interviewproject.presentation.models.pokemon.FilmPresentation

class FilmAdapter(private val onClick: (id: String) -> Unit) :
    ListAdapter<FilmPresentation, FilmAdapter.ViewHolder>(BaseDiffUtilItemCallBack.Base()) {

    inner class ViewHolder(private val binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(pokemonDomain: FilmPresentation) = with(binding) {
            title.text = pokemonDomain.title
            originalTitle.text = pokemonDomain.original_title
            image.load(pokemonDomain.image)

            itemView.setOnClickListener {
                getItem(adapterPosition)?.let { onClick(it.id) }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        return ViewHolder(
            ItemFilmBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}