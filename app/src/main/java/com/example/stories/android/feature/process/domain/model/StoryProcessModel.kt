package com.example.stories.android.feature.process.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.common.model.Story
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class IStoryProcess : Parcelable {

    data class StoryProcessModel(
        val id: String,
        val pictureUrl: String,
        val name: String,
        val categories: List<CategoryItem>,
        val storyParts: List<StoryPart>,
        val currentPartId: String
    ) : IStoryProcess() {
        companion object {
            fun fromStory(story: Story): StoryProcessModel {
                return StoryProcessModel(
                    id = story.id,
                    categories = story.categories.map {
                        CategoryItem.fromCategory(it)
                    },
                    storyParts = story.storyParts,
                    pictureUrl = story.pictureUrl,
                    name = story.name,
                    currentPartId = story.currentPartId
                )
            }
        }
    }

    object ShimmerItem : IStoryProcess()
}

// Часть истории, в конце которой есть выбор из нескольких вариантов
// или один вариант Продолжить
@Parcelize
data class StoryPart(
    val partId: String,
    val articles: List<Article>
) : Parcelable

@Parcelize
data class Article(
    val id: String,
    val text: String,
    val isOpen: Boolean = false,
    val choices: List<Choice> = emptyList(),
) : Parcelable

@Parcelize
data class Choice(
    val title: String,
    val nextStoryPartId: String? = null
) : Parcelable