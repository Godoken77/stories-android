package com.example.stories.android.feature.common.data.datasource.remote.response

import androidx.annotation.Keep

@Keep
data class BaseResponse<T>(
    val message: String,
    val localCode: Int,
    val data: T?
)