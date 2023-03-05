package com.example.stories.android.feature

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.main.presentation.MainFragment
import com.example.stories.android.feature.stories.presentation.StoriesFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal object AppScreens {

    fun MainScreen(): FragmentScreen =
        FragmentScreen { MainFragment() }

    fun StoriesScreen(category: Category): FragmentScreen =
        FragmentScreen { StoriesFragment.newInstance(category) }
}