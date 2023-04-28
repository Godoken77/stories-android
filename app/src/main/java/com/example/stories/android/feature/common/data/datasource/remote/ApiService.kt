package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.common.data.datasource.remote.response.BaseResponse
import com.example.stories.android.feature.common.model.AdSettings
import com.example.stories.android.feature.common.model.ResponseStory
import com.example.stories.android.feature.common.model.ResponseStoryContent
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiService {

    // Stories
    @GET("story/all")
    suspend fun getStories(
        @Header("Locale") locale: String,
    ): BaseResponse<List<ResponseStory>>

    @GET("story/{storyId}")
    suspend fun getStory(
        @Header("Locale") locale: String,
        @Path("storyId") storyId: String
    ): BaseResponse<ResponseStoryContent>

    // Ad
    @GET("ad")
    suspend fun getAdSettings(): BaseResponse<AdSettings>
}