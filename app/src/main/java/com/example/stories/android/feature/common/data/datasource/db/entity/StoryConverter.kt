package com.example.stories.android.feature.common.data.datasource.db.entity

import androidx.room.TypeConverter
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.process.domain.model.StoryPart
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class StoryConverter {

    @TypeConverter
    fun fromCategories(categories: List<Category>): String {
        return Gson().toJson(categories)
    }

    @TypeConverter
    fun toCategories(data: String): List<Category> {
        val listType = object : TypeToken<List<Category>>() { }.type
        return Gson().fromJson(data, listType)
    }

    @TypeConverter
    fun fromStoryParts(storyParts: List<StoryPart>): String {
        return Gson().toJson(storyParts)
    }

    @TypeConverter
    fun toStoryParts(data: String?): List<StoryPart> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }
        val listType = object : TypeToken<List<StoryPart>>() { }.type
        return Gson().fromJson(data, listType)
    }
}