package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyJoRu1 = Story(
    id = "2",
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
                        remark = "О чем он говорил? Действительно ли здесь замешан кто-то по-крупнее? Нужно копнуть глубже..."
                    )
                )
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyJoEn1 = Story(
    id = "2",
    pictureUrl = "https://i.ibb.co/YhDscn6/image.jpg",
    name = "Joe and Smith",
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
                    text = "Detective Johnson has worked in the police for more than ten years and has seen a lot of terrible crimes. But this case was different. The victim was a wealthy businessman with ties to organized crime, and the killer left an encrypted message written in blood at the crime scene. Johnson knew that he was dealing with a dangerous and cunning criminal, and was determined to solve this case."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Detective Johnson has never been prone to superstition. But as he approached the old abandoned mansion, he couldn't help feeling uneasy. It was said that the mansion was haunted, and some people claimed to have seen ghostly visions in the windows. Johnson dismissed the rumors as nonsense, but couldn't shake the feeling that something was wrong."
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
                        remark = "Dispatcher, I'm heading to an old abandoned mansion. They say there are ghosts there, but I'm a skeptic.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Dispatcher",
                        remark = "Accepted, Detective. Be careful there.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "The front door is ajar. I'm coming in."
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "I understand you. Be alert.",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Do you hear that creak?",
                        name = "Detective Johnson",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "No, what's going on, Detective?",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "It looks like someone was upstairs. I'm going to check it out.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Be careful, detective.",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Someone is here... Stop, police!",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Detective, are you okay?",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Detective?",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "False alarm. It's just an old coat.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Stay focused.",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Dispatcher, we have a murder. Send reinforcements to my place.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "I understand you, Detective. Stay put.",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Hold on, buddy. We'll find out who did it...",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Reinforcements are already in place.",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "This bookshelf looks out of place.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "Dispatcher, I found something. Now.... Yes, a secret safe in the library bookshelf.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Accepted, Detective. Can you open it?",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        remark = "No. I'll need a locksmith.",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "I understand you, Detective. We'll send someone here.",
                        name = "Dispatcher",
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
                        remark = "Detective, the safe is open. You will like what is in it",
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        remark = "I'm on my way, thank you",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        remark = "Smith, can you meet me at the train station? I have something interesting for you. There was a secret safe at the crime scene... and in it we found an accounting book containing interesting names...",
                        name = "Detective Johnson"
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        remark = "Morning begins with good news, Detective. I'll be there in 10 minutes.",
                        name = "Officer Smith",
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
                        name = "Detective Johnson",
                        remark = "Good afternoon officer."
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "And the same to you, Jones, show your find...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Hold on.... We know who killed Oliver and why. The name is literally written in this book."
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "So the killer didn't bother to divert suspicion from himself?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Rather, he just couldn't find the secret in Oliver's house."
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "Huh, well, who is this and where is he now?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "This is Robert Lagoon, and he is now heading to the airport to leave our state."
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "So what are we waiting for, Detective? We need to act act immediately.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "I agree. Let's get to work..."
                    )
                ),
                Article(
                    id = "9",
                    text = "....."
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Dispatcher",
                        remark = "Detective? An officer? Are you there? Answer, over.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Yes, already on sesta, where is he now? Reception."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Dispatcher",
                        remark = "Officer?... Reception",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Which officer?? Robert... Oliver's killer.... What kind of negligent approach to work? Reception."
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        name = "Dispatcher",
                        color = RemarkColor.SECONDARY,
                        remark = "I'm sorry, Detective... first day of work... ahem. Robert is at Terminal A right now, talking to someone on the phone. Reception "
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Thank you, if there is movement immediately notify. Reception."
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Dispatcher",
                        remark = "I understand you. Reception.",
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
                        name = "Detective Johnson",
                        remark = "Where the hell is this Smith...."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "I've been standing behind you here for a minute. Reception, haha.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "And all you have to do is joke, Officer. "
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "Come on... Let's go to the terminal ",
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
                        name = "Dispatcher",
                        remark = "Uh, Detective? The suspect leaves the airport and is about to run into you...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "This is a surprise.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "I understand you. Reception."
                    )
                ),
                Article(
                    id = "3",
                    text = "....."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Young man... Can you tell me the time?"
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "Yes, of course.... Wait.... And why do you have a watch on your hands?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "To record the time of your detention Robert... Or who are you according to the new document? Michelangelo?"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "Have you probably confused me with someone else? I'm going.... to his.... um grandma?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Your grandmother is already waiting for you, let's go. I do not advise you to resist..."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Officer Smith",
                        remark = "Dispatcher, take the car to the exit of the second floor. Reception."
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Dispatcher",
                        remark = "I understand you, officer. Reception."
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "Can we agree?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Let's agree... We will only arrive now and we will definitely agree."
                    )
                ),
                Article(
                    id = "13",
                    text = "....."
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Well.... How do you like our hotel?"
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "You thought you could outsmart me, but you were wrong."
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "You're wasting your time.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "We'll see about that. You're going to jail for what you did."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Robert Lagoon",
                        color = RemarkColor.SECONDARY,
                        remark = "You don't understand who you're dealing with. Do you think this is the end? Do you think putting me in jail will end the crimes? We are always 6 steps ahead of you! You have no idea what awaits you."
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Save your threats. We have all the evidence we need to put you behind bars forever."
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Robert Lagoon",
                        remark = "Do you think I'm the only one involved?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "22",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "What are you talking about?"
                    )
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        name = "Robert Lagoon",
                        color = RemarkColor.SECONDARY,
                        remark = "There are bigger players working here. You think you've solved this case, but you're only scratching the surface."
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "I've heard enough of your lies."
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        name = "Robert Lagoon",
                        color = RemarkColor.SECONDARY,
                        remark = "Do as you like. But mark my words, Detective. You will come back to me."
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "Take him away."
                    )
                ),
                Article(
                    id = "27",
                    text = "....."
                ),
                Article(
                    id = "28",
                    remark = Remark(
                        name = "Detective Johnson",
                        remark = "What was he talking about? Is there really someone bigger involved? We need to dig deeper..."
                    )
                )
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)