package com.example.stories.android.feature.process.domain

internal sealed class StoryProcessSideEffect {

    object ScrollToLastArticle : StoryProcessSideEffect()

    object ShowResetConfirmationDialog : StoryProcessSideEffect()

    object DismissResetConfirmationDialog : StoryProcessSideEffect()

    object ShowBlockBackDialog : StoryProcessSideEffect()

    object DismissBlockBackDialog : StoryProcessSideEffect()

    object ShowRateBottomSheet : StoryProcessSideEffect()

    object HideRateBottomSheet : StoryProcessSideEffect()

    object OpenPlayMarket : StoryProcessSideEffect()

    object ShowRateAppBottomSheet : StoryProcessSideEffect()

    object ShowAd : StoryProcessSideEffect()

    object StartPayment : StoryProcessSideEffect()
}