package com.geeks.interviewproject.di

import com.geeks.interviewproject.data.repositories.FilmRepositoryImpl
import com.geeks.interviewproject.domain.repositories.FilmRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindFilmRepository(repository: FilmRepositoryImpl): FilmRepository
}