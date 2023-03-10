package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.StoryPart

internal class Service {

    // Mock stories
    private val story1 = Story(
        id = "1",
        pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
        name = "Белый Бим",
        categories = listOf(
            Category.NEW,
            Category.COMEDY,
            Category.ADVENTURE
        ),
        storyParts = listOf(
            StoryPart(
                partId = "1",
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
                                title = "Продолжить_2",
                                nextStoryPartId = "2"
                            ),
                            Choice(
                                title = "Продолжить_3",
                                nextStoryPartId = "3"
                            )
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "2",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
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
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(
                                title = "Продолжить_3",
                                nextStoryPartId = "3"
                            ),
                            Choice(
                                title = "Продолжить_4",
                                nextStoryPartId = "4"
                            ),
                            Choice(title = "Конец")
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "3",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
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
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(
                                title = "Продолжить_4",
                                nextStoryPartId = "4"
                            )
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "4",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
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
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(title = "Конец")
                        )
                    )
                ),
            )
        ),
        currentPartId = "1"
    )

    private val story2 = story1.copy(
        id = "2",
        name = "Ведьмак",
        categories = listOf(
            Category.NEW,
            Category.FANTASY,
            Category.ADVENTURE
        ),
        isRecommended = true
    )

    private val story3 = story1.copy(
        id = "3",
        name = "Лето в пионерском галстуке",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.HORROR
        ),
        isRecommended = true
    )

    private val story4 = story1.copy(
        id = "4",
        name = "Трус, Балбес и Бывалый",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.COMEDY
        ),
        isRecentlyOpened = true
    )

    private val story5 = story1.copy(
        id = "5",
        name = "Шерлок Холмс и Доктор Кто",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.DETECTIVE
        ),
        isRecentlyOpened = true,
        isRecommended = true
    )

    suspend fun getStories(): List<Story> {
        return listOf(
            story1,
            story2,
            story3,
            story4,
            story5
        )
    }
}