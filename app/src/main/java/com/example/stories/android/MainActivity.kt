package com.example.stories.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stories.android.feature.AppScreens
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Replace
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val navigator = AppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            navigator.applyCommands(arrayOf<Command>(Replace(AppScreens.MainScreen())))
        }
    }

    override fun onResume() {
        super.onResume()
        (application as App).navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        (application as App).navigatorHolder.removeNavigator()
        super.onPause()
    }
}