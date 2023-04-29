package com.example.stories.android.feature.process.di

import com.example.stories.android.feature.process.domain.usecase.AdvertisementUseCase
import com.example.stories.android.feature.process.domain.usecase.AdvertisementUseCaseImpl
import com.example.stories.android.feature.process.domain.usecase.RateAppUseCase
import com.example.stories.android.feature.process.domain.usecase.RateAppUseCaseImpl
import com.example.stories.android.feature.process.domain.usecase.StoryProcessUseCase
import com.example.stories.android.feature.process.domain.usecase.StoryProcessUseCaseImpl
import com.example.stories.android.feature.splash.domain.usecase.PermissionUseCase
import com.example.stories.android.feature.splash.domain.usecase.PermissionUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
internal interface StoryProcessModule {

    @Binds
    fun bindStoryProcessUseCase(impl: StoryProcessUseCaseImpl): StoryProcessUseCase

    @Binds
    fun bindAdvertisementUseCase(impl: AdvertisementUseCaseImpl): AdvertisementUseCase

    @Binds
    fun bindRateAppUseCase(impl: RateAppUseCaseImpl): RateAppUseCase

    @Binds
    fun bindPermissionUseCase(impl: PermissionUseCaseImpl): PermissionUseCase
}