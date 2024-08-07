package com.example.stories.android.feature.process.domain.model

import android.os.Parcelable
import androidx.annotation.Keep
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
        val currentPartId: String,
        val isRated: Boolean
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
                    currentPartId = story.currentPartId,
                    isRated = story.isRated
                )
            }
        }
    }

    object ShimmerItem : IStoryProcess()
}

// Часть истории, в конце которой есть выбор из нескольких вариантов
// или один вариант Продолжить
@Parcelize
@Keep
data class StoryPart(
    @SerializedName("index")
    val partId: String,
    val articles: List<Article>
) : Parcelable

@Parcelize
@Keep
data class Article(
    @SerializedName("index")
    val id: String,
    val text: String? = null,
    val isOpen: Boolean = false,
    val choices: List<Choice> = emptyList(),
    val remark: Remark? = null,
    val pictureUrl: String? = null
) : Parcelable

@Parcelize
@Keep
data class Choice(
    val title: String,
    val nextStoryPartId: String? = null
) : Parcelable

@Parcelize
@Keep
data class Remark(
    val remark: String,
    val name: String,
    val color: RemarkColor = RemarkColor.FIRSTLY
) : Parcelable

@Keep
enum class RemarkColor {
    FIRSTLY,
    SECONDARY
}