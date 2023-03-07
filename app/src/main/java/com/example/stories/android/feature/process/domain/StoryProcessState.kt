package com.example.stories.android.feature.process.domain

import android.os.Parcelable
import com.example.stories.android.feature.process.domain.model.StoryProcessModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class StoryProcessState(
    val storyProcessModel: StoryProcessModel,
    val isProgress: Boolean = true,
    val isFailure: Boolean = false
) : Parcelable