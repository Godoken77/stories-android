package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyWillBeForgottenRu1 = Story(
    id = "6",
    pictureUrl = "https://i.ibb.co/fFzZvw7/image.jpg",
    name = "Забудется все, что было",
    categories = listOf(
        Category.NEW,
        Category.HORROR,
        Category.FANTASY
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Была темная и ненастная ночь, когда группа друзей собралась в хижине глубоко в лесу. Они приехали туда на выходные, чтобы отдохнуть и повеселиться, но и не подозревали, что их ждет нечто зловещее..."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Приближалась ночь, и группа друзей собрались вокруг костра, рассказывая истории о привидениях и пытаясь напугать друг друга. Они смеялись и шутили, не понимая, что их худшие кошмары вот-вот сбудутся."
                ),
                Article(
                    id = "1",
                    text = "Внезапно раздался громкий стук в дверь. Все вздрогнули от неожиданности."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Эмма",
                        remark = "Кто бы это мог быть?",
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Джейк",
                        remark = "Я не знаю, но я не пойду проверять.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "После минутного молчания стук раздался снова, на этот раз громче. Группа обменялась встревоженными взглядами."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Может быть, это просто кто-то заблудился в лесу. Мы должны хотя бы пойти посмотреть, кто это...",
                        name = "Сара",
                    )
                ),
                Article(
                    id = "6",
                    text = "Группа неохотно направилась к двери. Когда они открыли ее, в комнату ворвался холодный порыв ветра, заставивший их вздрогнуть. Но там никого не было."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Алло? Там кто-нибудь есть?",
                        name = "Том"
                    )
                ),
                Article(
                    id = "8",
                    text = "Внезапно мимо них промелькнула темная фигура и исчезла в темноте. Группа закричала и побежала обратно внутрь, захлопнув за собой дверь."
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Что это было? ",
                        name = "Эмма"
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Я не знаю, но нам нужно убираться отсюда.",
                        name = "Джейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    text = "Когда они сбились в кучу, пытаясь сообразить, что делать, они услышали странные звуки, доносящиеся с чердака. Это звучало так, как будто кто-то ходил там, наверху."
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Мы должны пойти и проверить, что там...",
                        name = "Сара"
                    )
                ),
                Article(
                    id = "13",
                    text = "Поднимаясь по лестнице, группа услышала шепот и хихиканье, доносившиеся из темноты. Они посветили вокруг фонариком, но ничего не увидели."
                ),
                Article(
                    id = "14",
                    text = "Внезапно люк над ними со скрипом открылся. Появилась бледная, призрачная фигура, уставившаяся на них сверху вниз горящими красными глазами."
                ),
                Article(
                    id = "15",
                    text = "Группа закричала и побежала обратно вниз по лестнице, но дверь была закрыта. Они оказались в ловушке."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Что нам теперь делать?",
                        name = "Том"
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Мы должны найти другой выход!",
                        name = "Сара",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    text = "Пока они искали другой выход, они услышали еще больше шепота и хихиканья, доносившихся отовсюду. Казалось, что к ним приближаются десятки призрачных фигур."
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Мне это не нравится...",
                        name = "Эмма"
                    )
                ),
                Article(
                    id = "20",
                    text = "Внезапно в комнате потемнело. Фонарик погас. Их окружала темнота и звуки шепчущих голосов."
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
                        remark = "Мы должны держаться вместе, чтобы найти способ выбраться отсюда.",
                        name = "Джейк"
                    )
                ),
                Article(
                    id = "1",
                    text = "Но, спотыкаясь в темноте, они поняли, что были не одни. Что-то преследовало их, что-то холодное и злое."
                ),
                Article(
                    id = "2",
                    text = "Они слышали его дыхание на своих шеях, чувствовали, как его ледяные пальцы тянутся к ним. И они знали, с замиранием в животе, что скоро умрут."
                ),
                Article(
                    id = "3",
                    text = "Но что это было? Кто или что преследовало их? Все, что мы знаем, это то, что в ту ночь произошло что-то ужасное, что-то, что никогда не будет забыто."
                )
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "По мере того, как ночь приближалась, шторм снаружи усиливался, усиливая чувство страха у группы. Они сбились в кучу, цепляясь друг за друга, ожидая, когда то, что преследовало их, проявит себя."
                ),
                Article(
                    id = "1",
                    text = "Внезапно раздался громкий стук в дверь. Они все подпрыгнули, их сердца бешено колотились в груди."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Пожалуйста, кто-нибудь, помогите нам!",
                        name = "Сара"
                    )
                ),
                Article(
                    id = "3",
                    text = "Но ответа не последовало. Стук продолжался, становясь с каждым мгновением все громче и настойчивее."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Мы должны что-то сделать, мы не можем просто сидеть здесь и ждать смерти.",
                        name = "Джейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "С этими словами он встал и направился к двери, полный решимости противостоять тому, что находилось по ту сторону."
                ),
                Article(
                    id = "6",
                    text = "Потянувшись к ручке, он заколебался, раздумывая, правильно ли это было. Но прежде, чем он успел передумать, дверь распахнулась, открыв фигуру, стоящую в темноте."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Оно было высоким и стройным, с длинными скрюченными пальцами и глазами, которые горели, как угли. Он стоял там, уставившись на них, его дыхание вырывалось неровными вздохами."
                ),
                Article(
                    id = "1",
                    text = "Группа закричала и побежала обратно в комнату, захлопнув за собой дверь. Но они знали, что это был только вопрос времени, когда оно найдет способ проникнуть внутрь."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Мы должны найти способ выбраться отсюда, должен быть какой-то способ!",
                        name = "Том"
                    )
                ),
                Article(
                    id = "3",
                    text = "Пока они обыскивали хижину в поисках способа сбежать, они услышали странные звуки, доносящиеся снаружи. Казалось, что-то скребется в окна, пытаясь проникнуть внутрь."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Мы должны закрыть окна!",
                        name = "Сара",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "Но как только она это сделала, то увидела, как что-то движется в темноте снаружи. Это была фигура, точно такая же, как та, что ворвалась в дверь, только эта была еще более ужасающей."
                ),
                Article(
                    id = "6",
                    text = "У него были длинные закрученные рога на голове и глаза, которые горели потусторонним светом. Он стоял там, наблюдая за ними, его дыхание вырывалось неровными вздохами."
                ),
                Article(
                    id = "7",
                    text = "Группа закричала и побежала обратно в центр комнаты, сбившись в кучу и ожидая, когда фигура сделает свой ход."
                ),
                Article(
                    id = "8",
                    text = "Но этого не произошло. Вместо этого группа услышала голос, зовущий их снаружи."
                ),
            )
        ),
        StoryPart(
            partId = "5",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        remark = "Привет? Здесь кто-нибудь есть?",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    text = "Группа обменялась растерянными взглядами, гадая, не ловушка ли это."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Кто вы?",
                        name = "Джейк"
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Меня зовут Джон, я заблудился в лесу. Ты можешь мне помочь?",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "Группа заколебалась, не уверенная, можно ли доверять этому незнакомцу. Но прежде, чем они успели принять решение, они услышали звук приближающихся к хижине шагов."
                ),
                Article(
                    id = "5",
                    text = "С неприятным ощущением в животе они поняли, что были не одни. Что-то охотилось за ними, что-то, что с каждой минутой становилось все ближе."
                ),
                Article(
                    id = "6",
                    text = "И они с глубоким чувством ужаса понимали, что время у них на исходе."
                ),
                Article(
                    id = "7",
                    text = "Группа посмотрела друг на друга, их глаза расширились от страха. Они знали, что должны быстро принять решение."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Мы не можем впустить его, это может быть уловкой.",
                        name = "Сара"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Мы не можем просто оставить его там, он тоже может быть в опасности.",
                        name = "Том"
                    )
                ),
                Article(
                    id = "10",
                    text = "Группа на мгновение заколебалась, не уверенная, можно ли ему доверять. Но они знали, что не могли оставить кого-то одного в лесу в такую ночь, как эта."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyWillBeForgottenEn1 = Story(
    id = "6",
    pictureUrl = "https://i.ibb.co/fFzZvw7/image.jpg",
    name = "Everything that happened will be forgotten",
    categories = listOf(
        Category.NEW,
        Category.HORROR,
        Category.FANTASY
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "It was a dark and stormy night when a group of friends gathered in a hut deep in the forest. They came there for the weekend to relax and have fun, but they did not suspect that something sinister was waiting for them..."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Night was approaching, and a group of friends gathered around a campfire, telling ghost stories and trying to scare each other. They laughed and joked, not realizing that their worst nightmares were about to come true."
                ),
                Article(
                    id = "1",
                    text = "Suddenly there was a loud knock on the door. Everyone was startled."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Emma",
                        remark = "Who could it be?",
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Jake",
                        remark = "I do not know, but I will not go to check.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "After a moment of silence, the knock sounded again, this time louder. The group exchanged worried glances."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Maybe it's just someone got lost in the woods. We should at least go see who it is...",
                        name = "Sarah",
                    )
                ),
                Article(
                    id = "6",
                    text = "The group reluctantly headed for the door. When they opened it, a cold gust of wind rushed into the room, making them shiver. But there was no one there."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Hello? Is anyone there?",
                        name = "Tom"
                    )
                ),
                Article(
                    id = "8",
                    text = "Suddenly a dark figure flashed past them and disappeared into the darkness. The group screamed and ran back inside, slamming the door behind them."
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "What was that? ",
                        name = "Emma"
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "I do not know, but we need to get out of here.",
                        name = "Jake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    text = "When they huddled together trying to figure out what to do, they heard strange noises coming from the attic. It sounded like someone was walking up there."
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "We have to go and check what's there...",
                        name = "Sarah"
                    )
                ),
                Article(
                    id = "13",
                    text = "Going up the stairs, the group heard whispers and giggles coming from the darkness. They shone a flashlight around, but saw nothing."
                ),
                Article(
                    id = "14",
                    text = "Suddenly the hatch above them creaked open. A pale, ghostly figure appeared, staring down at them with glowing red eyes."
                ),
                Article(
                    id = "15",
                    text = "The group screamed and ran back down the stairs, but the door was closed. They were trapped."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "What should we do now?",
                        name = "Tom"
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "We have to find another way out!",
                        name = "Sarah",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    text = "While they were looking for another way out, they heard even more whispers and giggles coming from everywhere. It seemed that dozens of ghostly figures were approaching them."
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "I don't like it...",
                        name = "Emma"
                    )
                ),
                Article(
                    id = "20",
                    text = "Suddenly the room went dark. The flashlight went out. They were surrounded by darkness and the sounds of whispering voices."
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
                        remark = "We have to stick together to find a way out of here.",
                        name = "Jake"
                    )
                ),
                Article(
                    id = "1",
                    text = "But, stumbling in the dark, they realized that they were not alone. Something was chasing them, something cold and evil."
                ),
                Article(
                    id = "2",
                    text = "They heard his breath on their necks, felt his icy fingers reaching for them. And they knew, with a sinking feeling in their stomach, that they were going to die soon."
                ),
                Article(
                    id = "3",
                    text = "But what was it? Who or what was chasing them? All we know is that something terrible happened that night, something that will never be forgotten."
                )
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "As night approached, the storm outside intensified, increasing the group's sense of fear. They huddled together, clinging to each other, waiting for what was chasing them to manifest itself."
                ),
                Article(
                    id = "1",
                    text = "Suddenly there was a loud knock on the door. They all jumped, their hearts pounding wildly in their chests."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Please, someone help us!",
                        name = "Sarah"
                    )
                ),
                Article(
                    id = "3",
                    text = "But there was no response. The knocking continued, getting louder and more insistent every moment."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "We have to do something, we can't just sit here and wait for death.",
                        name = "Jake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "With these words, he got up and headed for the door, determined to confront what was on the other side."
                ),
                Article(
                    id = "6",
                    text = "Reaching for the pen, he hesitated, wondering if it was the right thing to do. But before he could change his mind, the door swung open, revealing a figure standing in the dark."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "It was tall and slender, with long crooked fingers and eyes that burned like coals. He stood there staring at them, his breath coming out in ragged gasps."
                ),
                Article(
                    id = "1",
                    text = "The group screamed and ran back into the room, slamming the door behind them. But they knew it was only a matter of time before it found a way to get inside."
                ),
                Article(
                    id ="2",
                    remark = Remark(
                        remark = "We have to find a way out of here, there must be some way!",
                        name = "Tom"
                    )
                ),
                Article(
                    id = "3",
                    text = "While they were searching the hut for a way to escape, they heard strange noises coming from outside. It seemed that something was scratching at the windows, trying to get inside."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "We have to close the windows!",
                        name = "Sarah",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "But as soon as she did, she saw something moving in the dark outside. It was a figure exactly like the one that burst through the door, only this one was even more terrifying."
                ),
                Article(
                    id = "6",
                    text = "He had long twisted horns on his head and eyes that burned with an otherworldly light. He stood there, watching them, his breath coming out in ragged gasps."
                ),
                Article(
                    id = "7",
                    text = "The group screamed and ran back to the center of the room, huddled together and waiting for the piece to make its move."
                ),
                Article(
                    id = "8",
                    text = "But it didn't happen. Instead, the group heard a voice calling them from outside."
                ),
            )
        ),
        StoryPart(
            partId = "5",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    remark = Remark(
                        remark = "Hello? Is anyone here?",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    text = "The group exchanged confused glances, wondering if it was a trap."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        remark = "Who are you?",
                        name = "Jake"
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "My name is John, I got lost in the woods. Can you help me?",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "The group hesitated, not sure if this stranger could be trusted. But before they could make a decision, they heard the sound of footsteps approaching the hut."
                ),
                Article(
                    id = "5",
                    text = "With an unpleasant feeling in their stomach, they realized that they were not alone. Something was hunting them, something that was getting closer by the minute."
                ),
                Article(
                    id = "6",
                    text = "And they realized with a deep sense of horror that their time was running out."
                ),
                Article(
                    id = "7",
                    text = "The group looked at each other, their eyes widened with fear. They knew they had to make a quick decision."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "We can't let him in, it could be a trick.",
                        name = "Sarah"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "We can't just leave him there, he might be in danger too.",
                        name = "Tom"
                    )
                ),
                Article(
                    id = "10",
                    text = "The group hesitated for a moment, not sure if it could be trusted. But they knew they couldn't leave someone alone in the woods on a night like this."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)