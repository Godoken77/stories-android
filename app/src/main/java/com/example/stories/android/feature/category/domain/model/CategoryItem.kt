package com.example.stories.android.feature.category.domain.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.stories.android.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryItem(
    val category: Category,
    @StringRes val nameId: Int,
    @DrawableRes val iconId: Int
) : Parcelable {
    companion object {
        fun fromCategory(category: Category): CategoryItem {
            return CategoryItem(
                category = category,
                nameId = when (category) {
                    Category.COMEDY -> R.string.category_item_name_comedy
                    Category.NEW -> R.string.category_item_name_new
                    Category.ADVENTURE -> R.string.category_item_name_adventure
                    Category.DETECTIVE -> R.string.category_item_name_detective
                    Category.FANTASY -> R.string.category_item_name_fantasy
                    Category.HORROR -> R.string.category_item_name_horror
                    Category.ROMANTIC -> R.string.category_item_name_romantic
                },
                iconId = when (category) {
                    Category.COMEDY -> R.drawable.ic_category_comedy
                    Category.NEW -> R.drawable.ic_category_new
                    Category.ADVENTURE -> R.drawable.ic_category_adventure
                    Category.DETECTIVE -> R.drawable.ic_category_detective
                    Category.FANTASY -> R.drawable.ic_category_fantasy
                    Category.HORROR -> R.drawable.ic_category_horror
                    Category.ROMANTIC -> R.drawable.ic_category_romantic
                }
            )
        }
    }
}
