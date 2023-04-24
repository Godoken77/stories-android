package com.example.stories.android.feature

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.choose.presentation.ChooseCategoryFragment
import com.example.stories.android.feature.main.presentation.MainFragment
import com.example.stories.android.feature.process.presentation.StoryProcessFragment
import com.example.stories.android.feature.splash.presentation.SplashFragment
import com.example.stories.android.feature.stories.presentation.StoriesFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal object AppScreens {

    fun MainScreen(): FragmentScreen =
        FragmentScreen { MainFragment() }

    fun StoriesScreen(category: Category): FragmentScreen =
        FragmentScreen { StoriesFragment.newInstance(category) }

    fun StoryProcessScreen(
        storyId: String,
        isFirstStory: Boolean = false
    ): FragmentScreen = FragmentScreen {
        StoryProcessFragment.newInstance(
            storyId = storyId,
            isFirstStory = isFirstStory
        )
    }

    fun SplashScreen(): FragmentScreen =
        FragmentScreen { SplashFragment() }

    fun ChooseCategoryScreen(): FragmentScreen =
        FragmentScreen { ChooseCategoryFragment() }
}