package com.example.stories.android.feature.choose.domain.usecase

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.choose.domain.model.CategoryToChoose
import com.example.stories.android.feature.common.data.StoryRepository
import javax.inject.Inject

internal class CategoryToChooseUseCaseImpl @Inject constructor(
    private val storyRepository: StoryRepository
): CategoryToChooseUseCase {

    override suspend fun getCategoriesToChoose(): Pair<CategoryToChoose, CategoryToChoose> {
        val recommendedStories = storyRepository.getStories().filter {
            it.isRecommended
        }

        val firstStoryToChoose = recommendedStories.first {
            it.categories.contains(Category.HORROR)
        }
        val secondStoryToChoose = recommendedStories.first {
            it.categories.contains(Category.ROMANTIC) && it.id != firstStoryToChoose.id
        }

        return Pair(
            first = CategoryToChoose(
                category = Category.HORROR,
                storyId = firstStoryToChoose.id
            ),
            second = CategoryToChoose(
                category = Category.ROMANTIC,
                storyId = secondStoryToChoose.id
            )
        )
    }
}