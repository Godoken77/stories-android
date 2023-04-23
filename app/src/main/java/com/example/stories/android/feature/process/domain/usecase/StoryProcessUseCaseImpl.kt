package com.example.stories.android.feature.process.domain.usecase

import com.example.stories.android.feature.common.data.SettingsRepository
import com.example.stories.android.feature.common.data.StoryRepository
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import javax.inject.Inject

internal class StoryProcessUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository,
    private val settingsRepository: SettingsRepository
) : StoryProcessUseCase {

    override suspend fun getStoryProcessWithStoryParts(storyId: String): IStoryProcess.StoryProcessModel {
        val story = storyRepository.getStoryProcessWithStoryParts(storyId = storyId)
        settingsRepository.setStoryToContinue(storyId)
        return IStoryProcess.StoryProcessModel.fromStory(story)
    }

    override suspend fun setStoryPart(storyId: String, partId: String): String {
        return storyRepository.setStoryPart(
            storyId = storyId,
            partId = partId
        )
    }

    override suspend fun setStoryRated(storyId: String) {
        storyRepository.setStoryRated(storyId)
    }

    override suspend fun setArticleOpened(
        storyId: String,
        partId: String,
        articleId: String
    ): List<Article> {
        return storyRepository.setArticleOpened(
            storyId = storyId,
            currentPartId = partId,
            articleId = articleId
        )
    }

    override suspend fun resetStoryProgress(storyId: String): String {
        return storyRepository.resetStoryProgress(storyId = storyId)
    }
}