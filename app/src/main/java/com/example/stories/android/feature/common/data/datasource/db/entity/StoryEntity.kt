package com.example.stories.android.feature.common.data.datasource.db.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.StoryPart
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "stories")
@TypeConverters(StoryConverter::class)
data class StoryEntity(
    @PrimaryKey
    val id: String,
    val pictureUrl: String,
    val name: String,
    val categories: List<Category>,
    @ColumnInfo(name = "story_parts")
    val storyParts: List<StoryPart>,
    @ColumnInfo(name = "current_part_id")
    val currentPartId: String,
    val isRecentlyOpened: Boolean = false,
    val isRecommended: Boolean = false
): Parcelable {
    companion object {
        fun fromStory(story: Story): StoryEntity {
            return StoryEntity(
                id = story.id,
                pictureUrl = story.pictureUrl,
                name = story.name,
                categories = story.categories,
                storyParts = story.storyParts,
                currentPartId = story.currentPartId,
                isRecentlyOpened = story.isRecentlyOpened,
                isRecommended = story.isRecommended
            )
        }
    }
}
