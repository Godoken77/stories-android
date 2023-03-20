package com.example.stories.android.common.design.views

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stories.android.common.design.colors.AppColors
import com.example.stories.android.feature.category.domain.model.Category
import org.neural.stories.R

data class CategoryItemViewState(
    val category: Category,
    val name: String,
    @DrawableRes val iconId: Int
)

@Composable
fun CategoryItem(
    state: CategoryItemViewState,
    onClick: (CategoryItemViewState) -> Unit
) {
    BackgroundCornered(
        backgroundColor = AppColors.White.copy(alpha = 0.09f),
        roundedCornerSize = 67.dp,
        modifier = Modifier
            .clickable(
                role = Role.Button,
                onClick = {
                    onClick(state)
                }
            )
            .height(45.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                    vertical = 10.dp
                )
        ) {
            Icon(
                painter = painterResource(id = state.iconId),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(24.dp)
            )
            MarginHorizontal(margin = 10.dp)
            Title3(text = state.name)
        }
    }
}

@Preview
@Composable
private fun PreviewCategoryItem() {
    val categoryNew = Category.NEW
    val nameNew = "Новинки"
    val iconIdNew = R.drawable.ic_category_new

    val categoryAdventure = Category.ADVENTURE
    val nameAdventure = "Приключения"
    val iconIdAdventure = R.drawable.ic_category_adventure

    val stateNew = CategoryItemViewState(
        category = categoryNew,
        name = nameNew,
        iconId = iconIdNew
    )

    val stateAdventure = CategoryItemViewState(
        category = categoryAdventure,
        name = nameAdventure,
        iconId = iconIdAdventure
    )

    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
        ) {
            Row {
                CategoryItem(
                    state = stateNew,
                    onClick = {}
                )
                MarginHorizontal(margin = 8.dp)
                CategoryItem(
                    state = stateAdventure,
                    onClick = {}
                )
            }
        }
    }
}