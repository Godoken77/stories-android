package com.example.stories.android.feature.process.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import kotlinx.parcelize.Parcelize

@Parcelize
data class StoryProcessModel(
    val id: String,
    val pictureUrl: String,
    val name: String,
    val categories: List<Category>,
    val storyParts: List<StoryPart>
) : Parcelable

// Часть истории, в конце которой есть выбор из нескольких вариантов
// или один вариант Продолжить
@Parcelize
data class StoryPart(
    val partId: String,
    val articles: List<String>,
    val choices: List<Choice>
) : Parcelable

@Parcelize
data class Choice(
    val title: String,
    val nextStoryPartId: String
) : Parcelable