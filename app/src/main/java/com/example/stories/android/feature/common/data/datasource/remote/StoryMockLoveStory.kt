package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyLoveStoryRu1 = Story(
    id = "3",
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