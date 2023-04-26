package com.example.stories.android.feature.analytics.domain

import android.content.Context
import com.amplitude.api.Amplitude
import com.amplitude.api.AmplitudeClient
import com.example.stories.android.App
import dagger.hilt.android.qualifiers.ApplicationContext
import org.json.JSONObject
import javax.inject.Inject

internal class AmplitudeAnalyticsImpl @Inject constructor(
    @ApplicationContext context: Context,
) : AmplitudeAnalytics {

    private val client: AmplitudeClient = Amplitude.getInstance()
        .initialize(context, "a7e7113fb13a1d502addfb5b8c8cedbf")
        .enableForegroundTracking(context as App)
        .useAdvertisingIdForDeviceId()

    override fun logEvent(event: String) {
        client.logEvent(event)
    }

    override fun logEvent(event: String, properties: Map<String, Any?>) {
        JSONObject().runCatching {
            properties.forEach { put(it.key, it.value) }
            this
        }.onSuccess {
            client.logEvent(event, it)
        }
    }
}