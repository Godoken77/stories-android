package com.example.stories.android.feature.main.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stories.android.feature.main.domain.MainSideEffect
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun MainScreen(
    viewModel: MainViewModel
) {
    val state = viewModel.collectAsState().value

    viewModel.collectSideEffect {
        when (it) {
            is MainSideEffect.OpenStory -> {
            }
            is MainSideEffect.OpenStoriesByCategory -> {
            }
        }
    }

    Box(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Hello World!",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}