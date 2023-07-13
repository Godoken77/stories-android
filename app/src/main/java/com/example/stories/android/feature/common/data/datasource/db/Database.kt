package com.example.stories.android.feature.common.data.datasource.db

import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.stories.android.feature.common.data.datasource.db.dao.SettingsDao
import com.example.stories.android.feature.common.data.datasource.db.dao.StoryDao
import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity
import com.example.stories.android.feature.common.data.datasource.db.entity.StoryEntity

@androidx.room.Database(
    entities = [
        StoryEntity::class,
        SettingsEntity::class
    ],
    version = 3
)
abstract class Database : RoomDatabase() {

    abstract fun storyDao(): StoryDao

    abstract fun settingsDao(): SettingsDao
}

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("UPDATE stories SET story_parts = ''")
        database.execSQL("UPDATE stories SET current_part_id = '1'")
    }
}

val MIGRATION_2_3 = object : Migration(2, 3) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE settings ADD COLUMN is_ad_enabled INTEGER NOT NULL DEFAULT(1)")
    }
}