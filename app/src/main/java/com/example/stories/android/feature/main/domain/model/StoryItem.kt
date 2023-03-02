package com.example.stories.android.feature.main.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StoryItem(
    val id: String,
    val pictureUrl: String,
    val name: String
) : Parcelable