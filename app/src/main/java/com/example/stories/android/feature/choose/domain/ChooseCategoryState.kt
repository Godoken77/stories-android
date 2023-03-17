package com.example.stories.android.feature.choose.domain

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChooseCategoryState(
    val isFailure: Boolean = false,
    val firstCategory: Pair<CategoryItem, String>? = null,
    val secondCategory: Pair<CategoryItem, String>? = null
): Parcelable