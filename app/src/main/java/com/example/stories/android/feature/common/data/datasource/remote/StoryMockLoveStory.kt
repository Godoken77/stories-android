package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyLoveStoryRu1 = Story(
    id = "4",
    pictureUrl = "https://i.ibb.co/FhPpkys/image.jpg",
    name = "История любви",
    categories = listOf(
        Category.NEW,
        Category.ROMANTIC
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Был солнечный июньский день, и Элис прогуливалась по парку. Она только что сдала выпускные экзамены в колледже и с нетерпением ждала спокойного лета. Прогуливаясь, она заметила симпатичного парня, сидящего на скамейке и читающего книгу."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Элис не смогла удержаться и украдкой бросила на него несколько взглядов, проходя мимо. Она заметила, что у него были растрепанные каштановые волосы и очаровательная улыбка. Когда она собиралась пройти мимо него, парень поднял голову, и их глаза встретились."
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
                        name = "Парень",
                        remark = "Привет."
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Элис",
                        remark = "Привет...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Парень",
                        remark = "Прекрасный день, не правда ли?"
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Элис",
                        remark = "Да, это так.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Меня зовут Бен.",
                        name = "Парень",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Я Элис.",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Приятно познакомиться, Элис.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "И мне...",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Может составишь мне компанию в такой прекрасный день?",
                        name = "Бен"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "С удовольствием.",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "Они поболтали несколько минут, и Элис узнала, что Бен изучал английскую литературу в том же колледже, что и она. Она была заинтригована им и не могла не чувствовать влечения к нему. В ее голове пролетали вопросы. Любовь с первого взгляда? Такое вообще возможно?"
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Это была самая приятная прогулка за последнее время",
                        name = "Бен"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Я тоже так считаю... Может быть продолжим наше общение?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Да конечно, я только за! Давай я запишу твой...",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "14",
                    text = "После их случайной встречи в парке Элис и Бен обменялись номерами телефонов и начали переписываться. Они переписывались допоздна, обсуждая книги, фильмы, свои надежды и мечты."
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Слушай. Ты здесь?",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Да. Что такое?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Я не могу не рискнуть...",
                        name = "Бен"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "Ты о чем? Все нормально?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Не знаю, Элис. Я приглашаю тебя на свидание. Хочу узнать тебя поближе.",
                        name = "Бен"
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        remark = "Элис?",
                        name = "Бен"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "я согласна, Бен. Я этого ждала... Я просто рада)",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Бен пригласил Элис на свидание. Он предложил им сходить в книжный магазин и выбрать книги друг для друга."
                ),
                Article(
                    id = "1",
                    text = "Элис понравилась эта идея, и они договорились встретиться в книжном магазине в следующую субботу. Когда Элис пришла, Бен уже был там и просматривал полки."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Бен",
                        remark = "Привет.",
                    ),
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Элис",
                        remark = "Привет.",
                        color = RemarkColor.SECONDARY
                    ),
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Бен",
                        remark = "Как ты? Как твои дела?",
                    ),
                ),
                Article(
                    id = "5",
                    text = "Следующие несколько часов они провели, осматривая книжный магазин и болтая о своих любимых книгах. Элис была удивлена, обнаружив, что Бен обладает глубокими познаниями в литературе, и она была впечатлена его проницательностью."
                ),
                Article(
                    id = "6",
                    text = "После того, как они выбрали свои книги, Бен предложил им прогуляться по парку. Они нашли тихое местечко на берегу озера и сели на скамейку."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Элис",
                        remark = "Это действительно мило.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Бен",
                        remark = "Да, это так, я действительно рад, что ты согласилась.",
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Я тоже...",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "Несколько минут они сидели в уютном молчании, прежде чем Бен заговорил."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Элис, я знаю, что это наше первое свидание, но я чувствую, что между нами есть связь, я не хочу торопить события, но я просто хотел сказать тебе, что ты мне действительно нравишься...",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "12",
                    text = "Элис почувствовала, как ее сердце пропустило удар. "
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Ты мне тоже очень нравишься, Бен.",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Но я не хочу спешить, давай узнаем друг друга получше.",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Да ты права, Элис. Это мудрое решение. Я согласен.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "16",
                    text = "В течение следующих нескольких недель Элис и Бен сходили еще на несколько свиданий. Они смотрели фильмы, подолгу гуляли и устраивали пикники в парке. Элис влюблялась в Бена окончательно."
                )
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        remark = "Бен...",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        remark = "Да? Ты в порядке?",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Я люблю тебя...",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "...",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Бен?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Я тоже люблю тебя, Элис.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "6",
                    text = "Но на их пути стояли некоторые препятствия. Родители Элис переживали тяжелый развод, и она изо всех сил пыталась справиться с переменами в своей семье. Бен поддерживал ее и выслушивал, когда ей нужно было выговориться, но Элис видела, что это сказывалось и на нем."
                ),
                Article(
                    id = "7",
                    text = "Тем временем Бен разбирался со своими собственными проблемами. У него была работа на полставки в книжном магазине, но этого было недостаточно, чтобы платить за квартиру. Он подумывал о том, чтобы бросить колледж и найти работу на полный рабочий день, но не хотел отказываться от своей мечты стать писателем."
                ),
                Article(
                    id = "8",
                    choices = listOf(),
                    text = "Элис пыталась поддержать его..."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "По мере того, как шло время, отношения Элис и Бена начали меняться. Они все еще виделись, но оба были больше заняты своей собственной жизнью. Элис проходила стажировку в местной газете, а Бен подрабатывал в книжном магазине."
                ),
                Article(
                    id = "1",
                    text = "Они по-прежнему переписывались друг с другом каждый день, но Элис заметила, что их разговоры стали более поверхностными. Они не говорили о своих надеждах и мечтах так много, как раньше, и Элис начала беспокоиться, что они отдаляются друг от друга."
                ),
                Article(
                    id = "2",
                    text = "Однажды Элис получила неожиданное сообщение от Бена."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Привет, Элис, мне нужно с тобой поговорить.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "4",
                    text = "Сердце Элис упало. У нее было такое чувство, что она знала, что сейчас произойдет."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Что-то случилось?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Прости, Элис, но я думаю, нам нужно сделать перерыв.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "7",
                    text = "Элис почувствовала, как на глаза у нее навернулись слезы."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Почему?",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Я просто чувствую, что мы отдаляемся друг от друга, я не хочу отвлекать тебя от твоих мечтаний, и я не хочу, чтобы меня отвлекали от моих.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "10",
                    text = "Элис почувствовала укол печали в груди. Она не хотела терять Бена, но также знала, что он был прав. Они оба находились на перепутье в своей жизни, и им нужно было сосредоточиться на своих собственных целях."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Я понимаю...",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Я буду скучать по тебе, Элис, ты удивительный человек, и я знаю, что ты добьешься своих целей.",
                        name = "Бен",
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Не делай мне еще больнее, прошу тебя.",
                        name = "Элис",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    text = "Элис почувствовала себя пустой, когда положила трубку. Она знала, что они с Беном, возможно, никогда больше не будут вместе, но была благодарна за то время, которое они провели вместе. Она вновь ощутила целеустремленность и решимость следовать своей мечте."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyLoveStoryEn1 = Story(
    id = "4",
    pictureUrl = "https://i.ibb.co/FhPpkys/image.jpg",
    name = "Love story",
    categories = listOf(
        Category.NEW,
        Category.ROMANTIC
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "It was a sunny June day, and Alice was walking in the park. She had just passed her final college exams and was looking forward to a quiet summer. While walking, she noticed a cute guy sitting on a bench and reading a book."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Alice couldn't resist stealing a few glances at him as she passed by. She noticed that he had disheveled brown hair and a charming smile. When she was about to walk past him, the guy raised his head and their eyes met."
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
                        name = "Guy",
                        remark = "Hello."
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Alice",
                        remark = "Hello...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Guy",
                        remark = "Beautiful day, isn't it?"
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Alice",
                        remark = "Yes, it is.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "My name is Ben.",
                        name = "Guy",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "I am Alice.",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Nice to meet you, Alice.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "And me...",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Can you keep me company on such a beautiful day?",
                        name = "Ben"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "With pleasure.",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "They chatted for a few minutes, and Alice found out that Ben studied English literature at the same college as her. She was intrigued by him and couldn't help but feel attracted to him. Questions flew through her head. Love at first sight? Is this even possible?"
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "It was the most pleasant walk in a while",
                        name = "Ben"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "I think so too... Can we continue our communication?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Yes of course, I'm only for! Let me write down your...",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "14",
                    text = "After their chance meeting in the park, Alice and Ben exchanged phone numbers and started texting. They corresponded late into the night, discussing books, movies, their hopes and dreams."
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Listen. Are you here?",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Yes. What is it?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "I can't help but take a chance...",
                        name = "Ben"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "What are you talking about? Is everything okay?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "I don't know, Alice. I'm asking you out on a date. I want to get to know you better.",
                        name = "Ben"
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        remark = "Alice?",
                        name = "Ben"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "I agree, Ben. I've been waiting for this... I'm just glad)",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Ben asked Alice out on a date. He suggested they go to a bookstore and choose books for each other."
                ),
                Article(
                    id = "1",
                    text = "Alice liked this idea and they agreed to meet at the bookstore next Saturday. When Alice arrived, Ben was already there, looking through the shelves."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Ben",
                        remark = "Hello.",
                    ),
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Alice",
                        remark = "Hello.",
                        color = RemarkColor.SECONDARY
                    ),
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Ben",
                        remark = "How are you? How are you doing?",
                    ),
                ),
                Article(
                    id = "5",
                    text = "They spent the next few hours looking around the bookstore and chatting about their favorite books. Alice was surprised to find that Ben has a deep knowledge of literature, and she was impressed by his insight."
                ),
                Article(
                    id = "6",
                    text = "After they selected their books, Ben suggested they take a walk in the park. They found a quiet place by the lake and sat on a bench."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Alice",
                        remark ="It's really cute.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Ben",
                        remark = "Yes, it is, I'm really glad you agreed.",
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Me too...",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "They sat in comfortable silence for a few minutes before Ben spoke."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Alice, I know this is our first date, but I feel that there is a connection between us, I don't want to rush things, but I just wanted to tell you that I really like you...",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "12",
                    text = "Alice felt her heart skip a beat. "
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "I really like you too, Ben.",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "But I don't want to rush, let's get to know each other better.",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Yes, you're right, Alice. This is a wise decision. I agree.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "16",
                    text = "Alice and Ben went on several more dates over the next few weeks. They watched movies, took long walks and had picnics in the park. Alice was falling in love with Ben completely."
                )
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        remark = "Ben...",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        remark = "Yes? Are you okay?",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "I love you...",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "...",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Ben?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "I love you too, Alice.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "6",
                    text = "But there were some obstacles in their way. Alice's parents were going through a difficult divorce, and she struggled to cope with the changes in her family. Ben supported her and listened to her when she needed to talk, but Alice could see that it affected him too."
                ),
                Article(
                    id = "7",
                    text = "Meanwhile, Ben was dealing with his own problems. He had a part-time job at a bookstore, but it wasn't enough to pay the rent. He considered dropping out of college and finding a full-time job, but didn't want to give up on his dream of becoming a writer."
                ),
                Article(
                    id = "8",
                    choices = listOf(),
                    text = "Alice tried to support him..."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "As time went on, Alice and Ben's relationship began to change. They were still seeing each other, but both were more preoccupied with their own lives. Alice did an internship at a local newspaper, and Ben worked part-time at a bookstore."
                ),
                Article(
                    id = "1",
                    text = "They still corresponded with each other every day, but Alice noticed that their conversations became more superficial. They didn't talk about their hopes and dreams as much as they used to, and Alice began to worry that they were drifting apart."
                ),
                Article(
                    id = "2",
                    text = "One day Alice received an unexpected message from Ben."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Hi Alice, I need to talk to you.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "4",
                    text = "Alice's heart sank. She had the feeling that she knew what was going to happen."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Did something happen?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Sorry, Alice, but I think we need to take a break.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "7",
                    text = "Alice felt tears welling up in her eyes."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Why?",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "I just feel that we are moving away from each other, I don't want to distract you from your dreams, and I don't want to be distracted from mine.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "10",
                    text = "Alice felt a pang of sadness in her chest. She didn't want to lose Ben, but she also knew he was right. They were both at a crossroads in their lives, and they needed to focus on their own goals."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "I understand...",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "I will miss you, Alice, you are an amazing person, and I know that you will achieve your goals.",
                        name = "Ben",
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Don't hurt me even more, please.",
                        name = "Alice",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    text = "Alice felt empty when she hung up. She knew that she and Ben might never be together again, but she was grateful for the time they spent together. She again felt purposefulness and determination to follow her dream."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)