package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.process.domain.model.IStoryProcess

internal interface StoryProcessUseCase {

    suspend fun getStoryProcessByStoryId(storyId: String): IStoryProcess.StoryProcessModel

    suspend fun setStoryPart(storyId: String, partId: String): String

    suspend fun setArticleOpened(
        storyId: String,
        partId: String,
        articleId: String
    )
}