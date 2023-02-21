package com.example.stories.android.feature

import com.example.stories.android.feature.main.presentation.MainFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal object AppScreens {

    fun MainScreen(): FragmentScreen =
        FragmentScreen { MainFragment() }
}