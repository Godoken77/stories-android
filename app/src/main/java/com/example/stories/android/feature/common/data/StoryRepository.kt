package com.example.stories.android.feature.common.data

import com.example.stories.android.feature.common.model.Story

internal interface StoryRepository {

    suspend fun getStories(): List<Story>
}