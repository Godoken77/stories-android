package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyNightRoadRu1 = Story(
    id = "8",
    pictureUrl = "https://i.ibb.co/zHMKKZX/image.jpg",
    name = "Ночная дорога",
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
                    text = "Была темная и ненастная ночь, и Сара ехала по пустынной проселочной дороге. Она свернула не туда и заблудилась. Дождь барабанил по ветровому стеклу, мешая что-либо видеть. Дворники работали на полную мощность, но этого было недостаточно. Ей пришлось притормозить."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Внезапно посреди дороги появилась чья-то фигура. Это был мужчина, отчаянно размахивавший руками. Сара притормозила и опустила стекло."
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
                        color = RemarkColor.SECONDARY,
                        remark = "Пожалуйста, вы должны мне помочь! Моя машина сломалась, и у меня нет никакой возможности позвать на помощь. Ты можешь меня подвезти?",
                        name = "Неизвестный"
                    )
                ),
                Article(
                    id = "1",
                    text = "Сара колебалась. Ее учили не подбирать попутчиков, но что-то в этом мужчине было не так. Он промок насквозь, а его одежда была порвана. Она не могла оставить его на мели у черта на куличках в такую погоду."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Сара",
                        remark = "Хорошо, залезай."
                    )
                ),
                Article(
                    id = "3",
                    text = "Мужчина забрался на заднее сиденье, и Сара тронулась. Мужчина несколько минут молчал, и Сара попыталась завязать беседу. Но он, казалось, не был заинтересован в разговоре."
                ),
                Article(
                    id = "4",
                    text = "Внезапно машина Сары начала тарахтеть. Она съехала на обочину."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Что происходит?",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Сара",
                        remark = "Я не знаю..."
                    )
                ),
                Article(
                    id = "7",
                    text = "Мужчина вышел из машины и открыл капот. Сара наблюдала, как он возится с двигателем. Через несколько минут он закрыл капот и вернулся в машину."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Кажется, я все исправил.",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    text = "Сара завела машину, и она с ревом ожила. Она вздохнула с облегчением и продолжила движение. Но что-то в этом мужчине все еще вызывало у нее беспокойство."
                ),
                Article(
                    id = "10",
                    text = "Проехав еще несколько минут, Сара заметила что-то в зеркале заднего вида. Мужчина пересел с заднего сиденья на переднее пассажирское. Она не слышала, как он пошевелился, но он был там."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Сара",
                        remark = "Что ты делаешь?"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Я подумал, что лучше посижу здесь...",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    text = "Сара попыталась не обращать внимания на чувство неловкости, пробежавшее у нее по спине. Она поехала дальше, надеясь скоро добраться до места назначения."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Но мужчина продолжал вести себя странно. Он подолгу смотрел на нее, и она чувствовала на себе его взгляд, даже когда не смотрела. И каждый раз, когда она пыталась завязать разговор, он давал ей короткие, пренебрежительные ответы."
                ),
                Article(
                    id = "1",
                    text = "Наконец, Сара больше не могла этого выносить."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Сара",
                        remark = "Ладно, что происходит? Почему ты так странно себя ведешь?"
                    )
                ),
                Article(
                    id = "3",
                    text = "Мужчина повернулся к ней, его взгляд был темным и угрожающим."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Я не веду себя странно, я просто наслаждаюсь поездкой...",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "Сердце Сары учащенно забилось. Она знала, что совершила ошибку, взяв его в машину. Но сейчас она не могла обернуться. Она должна была продолжать вести машину."
                ),
                Article(
                    id = "6",
                    text = "Внезапно посреди дороги снова появилась фигура. Сара ударила по тормозам, и машина резко остановилась."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Сара",
                        remark = "Что за черт?"
                    )
                ),
                Article(
                    id = "8",
                    text = "Мужчина вышел из машины и направился к фигуре. Сара в ужасе смотрела, как они исчезает в темноте."
                ),
                Article(
                    id = "9",
                    text = "Ей показалось, что она прождала несколько часов, но мужчина не возвращался. Она снова попыталась завести машину, но она не реагировала. Сара застряла в этом страшном месте одна."
                ),
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Затем она услышала какой-то шум. Сначала он был слабым, но становился все громче и громче. Это был звук шагов, становившихся все ближе и ближе."
                ),
                Article(
                    id = "1",
                    text = "Сара знала, что ей нужно выйти из машины. Она открыла дверь и вышла, оглядываясь в поисках источника шагов."
                ),
                Article(
                    id = "2",
                    text = "Но там никого не было."
                ),
                Article(
                    id = "3",
                    text = "Пока Сара стояла снаружи машины, шаги становились все громче и ближе. Она почувствовала, как бешено колотится ее сердце, когда огляделась вокруг, пытаясь определить источник шума. Дождь перешел в легкую морось, но в темноте все еще было трудно что-либо разглядеть."
                ),
                Article(
                    id = "4",
                    text = "Внезапно из-за спины протянулась рука и схватила ее за плечо. Сара закричала, разворачиваясь лицом к нападавшему. Но там никого не было."
                ),
                Article(
                    id = "5",
                    text = "Она лихорадочно оглядывалась по сторонам, пытаясь понять, что происходит. Она слышала дыхание, но никого не видела."
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Сара",
                        remark = "Кто там?"
                    )
                ),
                Article(
                    id = "7",
                    text = "Ответа не последовало."
                ),
                Article(
                    id = "8",
                    text = "Инстинкты Сары подсказывали ей вернуться в машину и запереть двери. Но она знала, что этого будет недостаточно. Она должна была выяснить, что происходит."
                ),
                Article(
                    id = "9",
                    text = "Она медленно пошла по дороге, ее чувства были на пределе. Каждый звук, казалось, усиливался, каждый шелестящий лист и хрустящая ветка повергали ее в панику."
                ),
                Article(
                    id = "10",
                    text = "Пока она шла, ей показалось, что она увидела вдалеке движущуюся фигуру. Она остановилась и прищурилась, пытаясь разглядеть, что это было. Но из-за дождя было плохо видно."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Сара",
                        remark = "Алло? Там кто-нибудь есть?"
                    )
                ),
                Article(
                    id = "12",
                    text = "Ответа не последовало."
                ),
                Article(
                    id = "13",
                    text = "Сара продолжала идти, ее глаза вглядывались в темноту в поисках каких-либо признаков опасности. Ей казалось, что она идет по ночному кошмару, каждый шаг приближал ее к чему-то невыразимому."
                ),
                Article(
                    id = "14",
                    text = "Затем она услышала звук, от которого у нее кровь застыла в жилах. Это был звук смеха, глубокого и зловещего. Она повернулась, чтобы побежать обратно к машине, но что-то схватило ее за лодыжку, заставив споткнуться и упасть."
                ),
                Article(
                    id = "15",
                    text = "Она сильно ударилась о землю, у нее закружилась голова. Когда она подняла глаза, то увидела мужчину, стоящего над ней с кривой улыбкой на лице."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Тебе не следовало приходить сюда...",
                        name = "Неизвестный",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    text = "Сара попыталась отползти, но мужчина схватил ее за волосы и притянул обратно к себе. Она закричала, но никто ее не услышал. Она была одна, на пустой дороге, с сумасшедшим."
                ),
                Article(
                    id = "18",
                    text = "Мужчина начал говорить, его слова были едва различимы. Он говорил о вещах, которые не имели никакого смысла для Сары."
                ),
                Article(
                    id = "19",
                    text = "Она попыталась вырваться, но он крепко держал ее. Она чувствовала его горячее дыхание на своей шее, его фальшивый смех звенел у нее в ушах."
                ),
                Article(
                    id = "20",
                    text = "А потом все погрузилось во тьму."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Когда Сара проснулась, она лежала на земле одна. Дождь прекратился, и небо начало светлеть. Она огляделась вокруг, пытаясь понять, что произошло."
                ),
                Article(
                    id = "1",
                    text = "Но не было никаких признаков присутствия мужчины, никаких признаков какой-либо борьбы. Как будто все это было ночным кошмаром."
                ),
                Article(
                    id = "2",
                    text = "Сара медленно встала, в голове у нее стучало. Она, спотыкаясь, вернулась к машине, пытаясь собрать воедино то, что произошло. Но ответов не было."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyNightRoadEn1 = Story(
    id = "8",
    pictureUrl = "https://i.ibb.co/zHMKKZX/image.jpg",
    name = "Night Road",
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
                    text = "It was a dark and stormy night, and Sarah was driving along a deserted country road. She took a wrong turn and got lost. The rain drummed on the windshield, making it difficult to see anything. The wipers were working at full capacity, but it wasn't enough. She had to slow down."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Suddenly a figure appeared in the middle of the road. It was a man waving his arms frantically. Sarah slowed down and rolled down the window."
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
                        color = RemarkColor.SECONDARY,
                        remark = "Please, you have to help me! My car broke down and I have no way to call for help. Can you give me a ride?",
                        name = "Unknown"
                    )
                ),
                Article(
                    id = "1",
                    text = "Sarah hesitated. She had been taught not to pick up fellow travelers, but there was something wrong with this man. He was soaked through and his clothes were torn. She couldn't leave him stranded in the middle of nowhere in this weather."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Sarah",
                        remark = "OK, get in."
                    )
                ),
                Article(
                    id = "3",
                    text = "The man climbed into the back seat, and Sarah drove off. The man was silent for several minutes, and Sarah tried to start a conversation. But he didn't seem interested in the conversation."
                ),
                Article(
                    id = "4",
                    text = "Suddenly Sarah's car started rattling. She pulled over to the side of the road."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "What's going on?",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Sarah",
                        remark = "I do not know..."
                    )
                ),
                Article(
                    id = "7",
                    text = "The man got out of the car and opened the hood. Sarah watched him fiddle with the engine. After a few minutes, he closed the hood and returned to the car."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "I think I fixed everything.",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    text = "Sarah started the car and it roared to life. She breathed a sigh of relief and continued moving. But something about this man still made her uneasy."
                ),
                Article(
                    id = "10",
                    text = "After driving a few more minutes, Sarah noticed something in the rearview mirror. The man moved from the back seat to the front passenger seat. She didn't hear him move, but he was there."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Sarah",
                        remark = "What are you doing?"
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "I thought I'd rather sit here...",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    text = "Sarah tried to ignore the feeling of unease that ran down her spine. She drove on, hoping to reach her destination soon."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "But the man continued to behave strangely. He looked at her for a long time, and she felt his gaze on her even when she wasn't looking. And every time she tried to strike up a conversation, he gave her short, dismissive answers."
                ),
                Article(
                    id = "1",
                    text = "Finally, Sarah couldn't take it anymore."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Sarah",
                        remark = "Okay, what's going on? Why are you acting so weird?"
                    )
                ),
                Article(
                    id = "3",
                    text = "The man turned to her, his gaze was dark and threatening."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "I'm not acting weird, I'm just enjoying the ride...",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "Sarah's heart started beating faster. She knew she had made a mistake by taking him in the car. But she couldn't turn around now. She had to keep driving."
                ),
                Article(
                    id = "6",
                    text = "Suddenly a figure appeared in the middle of the road again. Sarah slammed on the brakes and the car came to an abrupt stop."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Sarah",
                        remark = "What the hell?"
                    )
                ),
                Article(
                    id = "8",
                    text = "The man got out of the car and walked towards the figure. Sarah watched in horror as they disappeared into the darkness."
                ),
                Article(
                    id = "9",
                    text = "It seemed to her that she waited for several hours, but the man did not return. She tried to start the car again, but it didn't react. Sarah is stuck in this scary place alone."
                ),
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Then she heard some noise. It was weak at first, but it was getting louder and louder. It was the sound of footsteps getting closer and closer."
                ),
                Article(
                    id = "1",
                    text = "Sarah knew she had to get out of the car. She opened the door and went out, looking around for the source of the footsteps."
                ),
                Article(
                    id = "2",
                    text = "But there was no one there."
                ),
                Article(
                    id = "3",
                    text = "While Sarah was standing outside the car, the footsteps got louder and closer. She felt her heart pounding wildly as she looked around, trying to identify the source of the noise. The rain turned into a light drizzle, but it was still difficult to see anything in the dark."
                ),
                Article(
                    id = "4",
                    text = "Suddenly a hand reached out from behind her and grabbed her shoulder. Sarah screamed, turning to face her attacker. But there was no one there."
                ),
                Article(
                    id = "5",
                    text = "She frantically looked around, trying to figure out what was going on. She could hear breathing, but she couldn't see anyone."
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Sarah",
                        remark = "Who's there?"
                    )
                ),
                Article(
                    id = "7",
                    text = "There was no response."
                ),
                Article(
                    id = "8",
                    text = "Sarah's instincts told her to get back in the car and lock the doors. But she knew it wouldn't be enough. She had to find out what was going on."
                ),
                Article(
                    id = "9",
                    text = "She walked slowly down the road, her feelings were at the limit. Every sound seemed to be amplified, every rustling leaf and crunching branch plunged her into panic."
                ),
                Article(
                    id = "10",
                    text = "While she was walking, she thought she saw a moving figure in the distance. She stopped and squinted, trying to see what it was. But it was hard to see because of the rain."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Sarah",
                        remark = "Hello? Is anyone there?"
                    )
                ),
                Article(
                    id = "12",
                    text = "There was no response."
                ),
                Article(
                    id = "13",
                    text = "Sarah kept walking, her eyes peering into the darkness in search of any signs of danger. It seemed to her that she was walking through a nightmare, every step brought her closer to something inexpressible."
                ),
                Article(
                    id = "14",
                    text = "Then she heard a sound that froze her blood in her veins. It was the sound of laughter, deep and sinister. She turned to run back to the car, but something grabbed her ankle, causing her to stumble and fall."
                ),
                Article(
                    id = "15",
                    text = "She hit the ground hard, she felt dizzy. When she looked up, she saw a man standing over her with a crooked smile on his face."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "You shouldn't have come here...",
                        name = "Unknown",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "17",
                    text = "Sarah tried to crawl away, but the man grabbed her by the hair and pulled her back to him. She screamed, but no one heard her. She was alone, on an empty road, with a madman."
                ),
                Article(
                    id = "18",
                    text = "The man started talking, his words were barely distinguishable. He was talking about things that didn't make any sense to Sarah."
                ),
                Article(
                    id = "19",
                    text = "She tried to break away, but he held her tight. She felt his hot breath on her neck, his fake laughter rang in her ears."
                ),
                Article(
                    id = "20",
                    text = "And then everything went dark."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "When Sarah woke up, she was lying on the ground alone. The rain stopped and the sky began to lighten. She looked around, trying to figure out what had happened."
                ),
                Article(
                    id = "1",
                    text = "But there was no sign of a man, no sign of any struggle. It was like it was all a nightmare."
                ),
                Article(
                    id = "2",
                    text = "Sarah got up slowly, her head was pounding. She stumbled back to the car, trying to piece together what had happened. But there were no answers."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)