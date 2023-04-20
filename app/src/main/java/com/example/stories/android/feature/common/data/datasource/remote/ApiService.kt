package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.common.data.datasource.remote.response.BaseResponse
import com.example.stories.android.feature.common.model.AdSettings
import com.example.stories.android.feature.common.model.ResponseStory
import com.example.stories.android.feature.common.model.ResponseStoryContent
import com.example.stories.android.feature.common.model.Story
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
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

    @DELETE("story/{storyId}")
    suspend fun deleteStory(
        @Header("Credentials") credentials: String = "123qaaq123QAAQ!@",
        @Header("Locale") locale: String = "RUSSIAN",
        @Path("storyId") storyId: String
    ): BaseResponse<Story>

    @POST("story")
    suspend fun setStory(
        @Header("Credentials") credentials: String = "123qaaq123QAAQ!@",
        @Header("Locale") locale: String = "RUSSIAN",
        @Body story: Story,
    ): BaseResponse<Unit>

    // Ad
    @GET("ad")
    suspend fun getAdSettings(): BaseResponse<AdSettings>
}