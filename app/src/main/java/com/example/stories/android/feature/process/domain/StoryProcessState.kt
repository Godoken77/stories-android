package com.example.stories.android.feature.process.domain

import android.os.Parcelable
import com.example.stories.android.feature.process.domain.model.IStoryProcess
import kotlinx.parcelize.Parcelize

@Parcelize
data class StoryProcessState(
    val storyProcessModel: IStoryProcess,
    val isProgress: Boolean = true,
    val isFailure: Boolean = false,
    val payOffer: PayOffer = PayOffer()
) : Parcelable

@Parcelize
data class PayOffer(
    val price: String? = null,
    val isEnabled: Boolean = false
) : Parcelable