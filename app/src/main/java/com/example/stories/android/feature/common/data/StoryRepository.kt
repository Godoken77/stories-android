package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article

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
    ): List<Article>

    suspend fun resetStoryProgress(storyId: String): String

    suspend fun getStoryProcessWithStoryParts(storyId: String): Story
}