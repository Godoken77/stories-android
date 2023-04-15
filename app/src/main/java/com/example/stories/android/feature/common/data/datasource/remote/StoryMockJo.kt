package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyJoRu1 = Story(
    id = "1",
    pictureUrl = "https://i.ibb.co/YhDscn6/image.jpg",
    name = "Джо и Смит",
    categories = listOf(
        Category.NEW,
        Category.DETECTIVE,
        Category.ADVENTURE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Детектив Джонсон проработал в полиции более десяти лет и повидал немало ужасных преступлений. Но этот случай был другим. Жертвой был богатый бизнесмен, имеющий связи с организованной преступностью, и убийца оставил на месте преступления зашифрованное послание, написанное кровью. Джонсон знал, что имеет дело с опасным и хитрым преступником, и был полон решимости раскрыть это дело."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Детектив Джонсон никогда не был склонен к суевериям. Но, приближаясь к старому заброшенному особняку, он не мог избавиться от чувства неловкости. Говорили, что в особняке водятся привидения, и некоторые люди утверждали, что видели призрачные видения в окнах. Джонсон отверг слухи как чушь, но не мог избавиться от ощущения, что что-то не так."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        remark = "Диспетчер, я направляюсь к старому заброшенному особняку. Говорят, там водятся привидения, но я скептик.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Принято, детектив. Будь там осторожен.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Входная дверь приоткрыта. Я захожу."
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Вас понял. Будьте начеку.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Вы слышите этот скрип?",
                        name = "Детектив Джонсон",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Нет, что происходит, детектив?",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Похоже, кто-то был наверху. Я собираюсь это проверить.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Будьте осторожны, детектив.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Здесь кто-то есть... Стоять, полиция!",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Детектив, вы в порядке?",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Детектив?",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Ложная тревога. Это просто старое пальто.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Оставайся сосредоточенным.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Диспетчер, у нас убийство. Отправьте подкрепление на мое место.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Вас понял, детектив. Оставайся на месте.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Держись, приятель. Мы найдем кто это сделал...",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Подкрепление уже на месте.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Эта книжная полка выглядит неуместно.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "Диспетчер, я кое-что нашел. Сейчас…. да, потайной сейф в книжной полке библиотеке.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Принято, детектив. Ты можешь его открыть?",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        remark = "Нет. Мне понадобится слесарь.",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "Вас понял, детектив. Мы пришлем кого-нибудь сюда.",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "22",
                    text = "....."
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        remark = "Детектив, сейф открыт. Вам понравится, что в нем находится",
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        remark = "Уже еду, спасибо",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        remark = "Смит, ты можешь встретить меня на вокзале? У меня есть кое-что интересное для тебя. На месте преступление был потайной сейф… и в нем мы обнаружили бухгалтерскую книгу, в которой находятся интересные имена...",
                        name = "Детектив Джонсон"
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        remark = "Утро начинается с хороших новостей, детектив. Я буду там через 10 минут.",
                        name = "Офицер Смит",
                        color = RemarkColor.SECONDARY
                    ),
                    choices = listOf(),
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Добрый день офицер."
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "И тебе того же Джонс, показывай свою находку...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Держи.... Мы знаем кто и за что убил Оливера. Имя буквально написано в этой книге."
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "То есть убийца не удосужился отвести от себя подозрения?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Скорее он просто не смог найти секрет в доме Оливера."
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Хах, ну что кто это и где он сейчас?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Это Роберт Лагун, и сейчас он направляется в аэропорт, чтобы покинуть наш штат."
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Так чего же мы ждем, детектив? Нам нужно действовать действовать немедленно.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Согласен. Давайте приступим к работе…"
                    )
                ),
                Article(
                    id = "9",
                    text = "....."
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Детектив? Офицер? Вы на месте? Ответьте, прием.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Да, уже на сесте, где он сейчас? Прием."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Офицер?... Прием",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Какой офицер?? Роберт… убийца Оливера.... Что за халатный подход к работе? Прием."
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        name = "Диспетчер",
                        color = RemarkColor.SECONDARY,
                        remark = "Прошу прощения, детектив… первый рабочий день… кхм. Роберт сейчас у терминала А, разговаривает с кем-то по телефону. Прием "
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Спасибо, если будет движение сразу оповещай. Прием."
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Вас понял. Прием.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    text = "....."
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Где черт побери этот Смит...."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Здесь я уже как минуту стою за тобой. Прием, хаха.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "А тебе все лишь бы шутки шутить, офицер. "
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Да ладно тебе... Пойдем к терминалу ",
                        color = RemarkColor.SECONDARY
                    ),
                    choices = listOf(),
                ),
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Эм, детектив? Подозреваемый выходит из аэропорта и вот-вот столкнуться с вами...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Вот это неожиданность.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Вас понял. Прием."
                    )
                ),
                Article(
                    id = "3",
                    text = "....."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Молодой человек... Не подскажете время?"
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "Да, конечно.... Подождите.... А для чего у вас на руках часы?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Чтобы зафиксировать время твоего задержания Роберт... Или кто ты по новым документа? Микеланджело?"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "Вы наверное с кем-то меня перепутали? Я еду.... к своей.... эм бабушке?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Твоя бабушка тебя уже ждет, поехали. Не советую сопротивляться..."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Офицер Смит",
                        remark = "Диспетчер, машину на выход второго этажа. Прием."
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Диспетчер",
                        remark = "Вас понял, офицер. Прием."
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "Может договоримся?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Договоримся... Сейчас только приедем и обязательно договоримся."
                    )
                ),
                Article(
                    id = "13",
                    text = "....."
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Ну что.... Как тебе наш отель?"
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Ты думал, что сможешь перехитрить меня, но ты ошибался."
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "Ты напрасно тратишь свое время.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Это мы еще посмотрим. Ты отправишься в тюрьму за то, что сделал."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Роберт Лагун",
                        color = RemarkColor.SECONDARY,
                        remark = "Ты не понимаешь, с кем имеешь дело. Ты думаешь, это конец? Думаешь посадив меня преступления закончиться? Мы всегда на 6 шагов впереди вас! Ты понятия не имеешь, что вас ждет."
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Прибереги свои угрозы. У нас есть все необходимые доказательства, чтобы упрятать тебя за решетку навсегда."
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Роберт Лагун",
                        remark = "Ты думаешь, в этом замешан только я? ",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "22",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "О чем ты говоришь?"
                    )
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        name = "Роберт Лагун",
                        color = RemarkColor.SECONDARY,
                        remark = "Здесь работают более крупные игроки. Вы думаете, что раскрыли это дело, но вы только царапаете поверхность."
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Я достаточно наслушался твоей лжи."
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        name = "Роберт Лагун",
                        color = RemarkColor.SECONDARY,
                        remark = "Поступай как знаешь. Но попомнишь мои слова, детектив. Вы еще вернетесь ко мне."
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "Уведите его."
                    )
                ),
                Article(
                    id = "27",
                    text = "....."
                ),
                Article(
                    id = "28",
                    remark = Remark(
                        name = "Детектив Джонсон",
                        remark = "о чем он говорил? Действительно ли здесь замешан кто-то по-крупнее? Нужно копнуть глубже..."
                    )
                )
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)