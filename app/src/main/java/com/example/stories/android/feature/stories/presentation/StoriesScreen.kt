package com.example.stories.android.feature.stories.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.orbitmvi.orbit.compose.collectAsState

@Composable
internal fun StoriesScreen(
    viewModel: StoriesViewModel
) {
    val state = viewModel.collectAsState().value

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

    }
}