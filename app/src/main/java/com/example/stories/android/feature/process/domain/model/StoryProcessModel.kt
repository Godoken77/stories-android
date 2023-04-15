package com.example.stories.android.feature.process.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.common.model.Story
import com.google.gson.annotations.SerializedName
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
    @SerializedName("index")
    val partId: String,
    val articles: List<Article>
) : Parcelable

@Parcelize
data class Article(
    @SerializedName("index")
    val id: String,
    val text: String? = null,
    val isOpen: Boolean = false,
    val choices: List<Choice> = emptyList(),
    val remark: Remark? = null
) : Parcelable

@Parcelize
data class Choice(
    val title: String,
    val nextStoryPartId: String? = null
) : Parcelable

@Parcelize
data class Remark(
    val remark: String,
    val name: String,
    val color: RemarkColor = RemarkColor.FIRSTLY
) : Parcelable

enum class RemarkColor {
    FIRSTLY,
    SECONDARY
}