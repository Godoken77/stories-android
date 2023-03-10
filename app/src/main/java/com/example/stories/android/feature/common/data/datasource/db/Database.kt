package com.example.stories.android.feature.common.data.datasource.db

import androidx.room.RoomDatabase
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity

@androidx.room.Database(
    entities = [StoryEntity::class],
    version = 1
)
abstract class Database : RoomDatabase() {

    abstract fun storyDao(): StoryDao
}