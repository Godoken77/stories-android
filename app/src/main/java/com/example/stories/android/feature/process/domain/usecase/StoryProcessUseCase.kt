package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.process.domain.model.IStoryProcess

internal interface StoryProcessUseCase {

    suspend fun getStoryProcessByStoryId(storyId: String): IStoryProcess.StoryProcessModel
}