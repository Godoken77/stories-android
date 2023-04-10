package com.example.stories.android.feature.common.data.datasource.remote.response

data class BaseResponse<T>(
    val message: String,
    val localCode: Int,
    val data: T?
)