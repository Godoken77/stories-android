package com.example.stories.android.feature.process.domain

internal sealed class StoryProcessSideEffect {
    object ScrollToLastArticle : StoryProcessSideEffect()
}