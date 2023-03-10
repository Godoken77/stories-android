package com.example.stories.android.feature.common.data.datasource.db

import androidx.room.RoomDatabase
import com.example.stories.android.feature.common.data.datasource.db.dao.SettingsDao
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity

@androidx.room.Database(
    entities = [
        StoryEntity::class,
        SettingsEntity::class
    ],
    version = 1
)
abstract class Database : RoomDatabase() {

    abstract fun storyDao(): StoryDao

    abstract fun settingsDao(): SettingsDao
}