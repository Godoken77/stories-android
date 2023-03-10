package com.example.stories.android.feature.stories.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.feature.category.domain.model.Category
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
internal class StoriesFragment : Fragment() {

    private val viewModel: StoriesViewModel by viewModels()

    companion object {
        fun newInstance(category: Category): Fragment =
            StoriesFragment().apply {
                arguments = bundleOf(
                    StoriesViewModel.CATEGORY to category
                )
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MaterialTheme {
                    Scaffold(
                        content = { padding ->
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(AppColors.BackgroundDark)
                                    .padding(padding)
                            ) {
                                ScreenContent()
                            }
                        }
                    )
                }
            }
        }
    }

    @Composable
    private fun ScreenContent() {
        StoriesScreen(viewModel = viewModel)
    }
}