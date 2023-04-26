package com.example.stories.android.feature.analytics.domain

internal interface AmplitudeAnalytics {

    fun logEvent(event: String)

    fun logEvent(event: String, properties: Map<String, Any?>)
}