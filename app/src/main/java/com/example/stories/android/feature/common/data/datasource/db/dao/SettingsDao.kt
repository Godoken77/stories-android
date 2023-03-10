package com.example.stories.android.feature.common.data.datasource.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.stories.android.feature.common.data.datasource.db.entity.SettingsEntity

@Dao
interface SettingsDao {

    @Query("SELECT * FROM settings LIMIT 1")
    suspend fun getSettings(): SettingsEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateSettings(settings: SettingsEntity)
}