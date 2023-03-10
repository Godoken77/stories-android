package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.model.Story

internal interface StoryRepository {

    suspend fun getStories(): List<Story>

    suspend fun setStoryPart(
        storyId: String,
        partId: String
    ): String

    suspend fun setArticleOpened(
        storyId: String,
        currentPartId: String,
        articleId: String
    ): Boolean
}