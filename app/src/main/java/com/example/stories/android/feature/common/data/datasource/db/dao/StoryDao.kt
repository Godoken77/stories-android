package com.example.stories.android.feature.common.data.datasource.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity

@Dao
interface StoryDao {

    @Query("SELECT * FROM stories")
    suspend fun getStories(): List<StoryEntity>

    @Query("SELECT * FROM stories WHERE id = :storyId")
    suspend fun getStoryById(storyId: String): StoryEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(stories: List<StoryEntity>)

    @Update
    suspend fun updateStory(storyEntity: StoryEntity)
}