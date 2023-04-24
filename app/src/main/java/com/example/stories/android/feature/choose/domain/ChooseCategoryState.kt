package com.example.stories.android.feature.choose.domain

import android.os.Parcelable
import com.example.stories.android.feature.category.domain.model.CategoryItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChooseCategoryState(
    val isFailure: Boolean = false,
    val firstCategory: Pair? = null,
    val secondCategory: Pair? = null
): Parcelable

@Parcelize
data class Pair(
    val first: CategoryItem,
    val second: String
): Parcelable