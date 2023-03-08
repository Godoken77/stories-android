package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import javax.inject.Inject

internal class StoryProcessUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : StoryProcessUseCase {

    override suspend fun getStoryProcessByStoryId(storyId: String): IStoryProcess.StoryProcessModel {
        val story = storyRepository
            .getStories()
            .first {
                it.id == storyId
            }
        return IStoryProcess.StoryProcessModel.fromStory(story)
    }
}