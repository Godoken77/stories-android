package com.example.stories.android.feature.common.data.datasource.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "settings")
data class SettingsEntity(
    @PrimaryKey
    val id: Int = 0,
    @ColumnInfo(name = "story_to_continue_id")
    val storyToContinueId: String? = null,
    @ColumnInfo(name = "is_first_session")
    val isFirstSession: Boolean = true
): Parcelable