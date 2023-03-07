package com.example.stories.android.feature.process.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.stories.android.feature.AppScreens
import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.category.domain.model.CategoryItem
import com.example.stories.android.feature.process.domain.StoryProcessSideEffect
import com.example.stories.android.feature.process.domain.StoryProcessState
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.StoryPart
import com.example.stories.android.feature.process.domain.model.StoryProcessModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.Container
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import javax.inject.Inject

@HiltViewModel
internal class StoryProcessViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val router: Router
) : ViewModel(), ContainerHost<StoryProcessState, StoryProcessSideEffect> {

    companion object {
        const val STORY_ID = "storyId"
    }

    private val storyId: String by lazy {
        requireNotNull(savedStateHandle[STORY_ID])
    }

    override val container: Container<StoryProcessState, StoryProcessSideEffect> =
        container(
            initialState = StoryProcessState(
                storyProcessModel = StoryProcessModel(
                    id = "2",
                    pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
                    name = "Белый Бим",
                    categories = listOf(
                        Category.NEW,
                        Category.COMEDY,
                        Category.ADVENTURE
                    ).map {
                          CategoryItem.fromCategory(it)
                    },
                    storyParts = listOf(
                        StoryPart(
                            partId = "partId_1",
                            articles = listOf(
                                Article(
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                            " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                            " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                            " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                                    isOpen = true,
                                    id = "1"
                                ),
                                Article(
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                            " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                            " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                            " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                                    id = "2"
                                ),
                                Article(
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                            " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                            " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                            " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                                    id = "3"
                                ),
                                Article(
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                            " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                            " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                            " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                                    id = "4"
                                ),
                                Article(
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                            " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                            " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                            " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                                    id = "5"
                                ),
                                Article(
                                    text = "«Вы обратили внимание на совет Ланигана?»–" +
                                            " Комиссар быстро отсчитал своими толстыми, коротенькими, напоминающими" +
                                            " сардельки пальцами пять шиллингов и положил их на столешницу»",
                                    id = "6",
                                    choices = listOf(
                                        Choice(
                                            title = "Продолжить",
                                            nextStoryPartId = "partId_2"
                                        ),
                                        Choice(
                                            title = "Продолжить_2",
                                            nextStoryPartId = "partId_2"
                                        ),
                                        Choice(
                                            title = "Продолжить_3",
                                            nextStoryPartId = "partId_2"
                                        )
                                    )
                                )
                            ),
                        ),
                        StoryPart(
                            partId = "partId_2",
                            articles = listOf(
                                Article(
                                    id = "1",
                                    text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                                    isOpen = true
                                ),
                                Article(
                                    id = "2",
                                    text = "«Вы обратили внимание на совет Ланигана?»–",
                                    choices = listOf(
                                        Choice(title = "Конец")
                                    )
                                )
                            ),
                        )
                    ),
                    currentPartId = "partId_1"
                )
            ),
            savedStateHandle = savedStateHandle
        ) {
            onViewReady()
        }

    private fun onViewReady() = intent {

    }

    fun openStoriesByCategory(category: Category) = intent {
        router.navigateTo(AppScreens.StoriesScreen(category))
    }

    fun onBackPressed() = intent {
        router.exit()
    }

    fun onContinueClicked() = intent {
        val storyProcess = state.storyProcessModel
        val storyParts = storyProcess.storyParts
        val currentStoryPart = storyParts.first {
            it.partId == storyProcess.currentPartId
        }

        val nextArticle = currentStoryPart.articles.first { !it.isOpen }

        reduce {
            state.copy(
                storyProcessModel = storyProcess.copy(
                    storyParts = storyParts.map {
                        if (it.partId == currentStoryPart.partId) {
                            currentStoryPart.copy(
                                articles = currentStoryPart.articles.map { article ->
                                    if (article.id == nextArticle.id) {
                                        article.copy(isOpen = true)
                                    } else {
                                        article
                                    }
                                }
                            )
                        } else {
                            it
                        }
                    }
                )
            )
        }
        postSideEffect(StoryProcessSideEffect.ScrollToLastArticle)
    }

    fun onChoiceClicked(choice: Choice) = intent {
        val storyProcess = state.storyProcessModel
        if (choice.nextStoryPartId != null) {
            reduce {
                state.copy(
                    storyProcessModel = storyProcess.copy(
                        currentPartId = choice.nextStoryPartId
                    )
                )
            }
        }
    }
}