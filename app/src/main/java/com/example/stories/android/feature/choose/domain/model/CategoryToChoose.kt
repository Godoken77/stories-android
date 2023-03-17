package com.example.stories.android.feature.choose.domain.model

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.Category
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryToChoose(
    val category: Category,
    val storyId: String
): Parcelable
