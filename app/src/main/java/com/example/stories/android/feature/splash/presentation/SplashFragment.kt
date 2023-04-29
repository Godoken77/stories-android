package com.example.stories.android.feature.splash.presentation

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.feature.splash.domain.SplashSideEffect
import dagger.hilt.android.AndroidEntryPoint
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@AndroidEntryPoint
internal class SplashFragment : Fragment() {

    private val viewModel: SplashViewModel by viewModels()

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
    ) {
        viewModel.openNextScreen()
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

    private fun requestPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.POST_NOTIFICATIONS) !=
                PackageManager.PERMISSION_GRANTED
            ) {
                requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            } else {
                viewModel.openNextScreen()
            }
        } else {
            viewModel.openNextScreen()
        }
    }

    @Composable
    private fun ScreenContent() {
        val state = viewModel.collectAsState().value

        viewModel.collectSideEffect {
            when (it) {
                is SplashSideEffect.RequestPermissions -> {
                    requestPermissions()
                }
            }
        }

        SplashScreen()
    }
}