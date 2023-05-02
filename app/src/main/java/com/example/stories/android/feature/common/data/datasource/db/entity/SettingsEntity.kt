package com.example.stories.android.feature.common.data.datasource.db.entity

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
@Entity(tableName = "settings")
data class SettingsEntity(
    @PrimaryKey
    val id: Int = 0,
    @ColumnInfo(name = "story_to_continue_id")
    val storyToContinueId: String? = null,
    @ColumnInfo(name = "is_first_session")
    val isFirstSession: Boolean = true,
    @ColumnInfo(name = "count")
    val alreadyReadArticleCount: Int = 0,
    @ColumnInfo(name = "session_count")
    val sessionCount: Int = 0,
    @ColumnInfo(name = "is_app_rated")
    val isAppRated: Boolean = false,
    @ColumnInfo(name = "is_notify_permission_enabled")
    val isNotifyPermissionEnabled: Boolean = false
): Parcelable