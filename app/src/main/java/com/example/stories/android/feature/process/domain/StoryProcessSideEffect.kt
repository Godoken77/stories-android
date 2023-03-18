package com.example.stories.android.feature.process.domain

internal sealed class StoryProcessSideEffect {

    object ScrollToLastArticle : StoryProcessSideEffect()

    object ShowResetConfirmationDialog : StoryProcessSideEffect()

    object DismissResetConfirmationDialog : StoryProcessSideEffect()

    object ShowRateBottomSheet : StoryProcessSideEffect()

    object HideRateBottomSheet : StoryProcessSideEffect()

    object ShowAd : StoryProcessSideEffect()
}