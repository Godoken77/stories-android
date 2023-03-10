package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import javax.inject.Inject

internal class StoryProcessUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
) : StoryProcessUseCase {

    override suspend fun getStoryProcessWithStoryParts(storyId: String): IStoryProcess.StoryProcessModel {
        val story = storyRepository.getStoryProcessWithStoryParts(storyId = storyId)
        /*val story = storyRepository
            .getStories()
            .first {
                it.id == storyId
            }*/
        return IStoryProcess.StoryProcessModel.fromStory(story)
    }

    override suspend fun setStoryPart(storyId: String, partId: String): String {
        return storyRepository.setStoryPart(
            storyId = storyId,
            partId = partId
        )
    }

    override suspend fun setArticleOpened(storyId: String, partId: String, articleId: String) {
        storyRepository.setArticleOpened(
            storyId = storyId,
            currentPartId = partId,
            articleId = articleId
        )
    }

    override suspend fun resetStoryProgress(storyId: String): String {
        return storyRepository.resetStoryProgress(storyId = storyId)
    }
}