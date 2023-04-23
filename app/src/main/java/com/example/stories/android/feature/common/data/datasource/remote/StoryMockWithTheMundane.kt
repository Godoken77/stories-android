package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyWithTheMundaneRu1 = Story(
    id = "9",
    pictureUrl = "https://i.ibb.co/K03cqq8/image.jpg",
    name = "Все началось с обыденного",
    categories = listOf(
        Category.NEW,
        Category.ADVENTURE,
        Category.DETECTIVE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Вечер был тихий, и детектив Джонсон только что устроился в своем любимом кресле, чтобы расслабиться после долгого дня в участке. Когда он взял свой телефон, чтобы проверить, нет ли пропущенных звонков или срочных сообщений, его внимание привлекло уведомление. Это было сообщение с неизвестного номера, и из-за краткого предварительного просмотра оно звучало как срочное."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "С любопытством нахмурившись, детектив Джонсон открыл сообщение, гадая, кто мог пытаться достучаться до него в такой час."
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
                        name = "Аноним",
                        remark = "У меня есть информация об ограблении на 3-й улице.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    text = "Джонсон нахмурился. Он расследовал это ограбление в течение нескольких недель, но у него не было никаких зацепок."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Кто это?",
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Аноним",
                        remark = "Это не важно. Важно то, что у меня есть информация, которая может помочь вам поймать грабителей.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "Сердце Джонсона учащенно забилось. Может ли это быть прорывом в деле? Или же это засада, чтобы убрать меня с дела? Детектив замешкался."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Что ты знаешь?",
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Аноним",
                        remark = "Встретимся в парке на 5-й улице в полночь. Приходи один.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "7",
                    text = "Джонсон колебался. Встреча с анонимным информатором посреди ночи казалась опасной. Но ему нужно было поймать этих грабителей, и он не мог упустить такую возможность."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Хорошо, я буду там.",
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Аноним",
                        remark = "Буду ждать. Только без глупостей, детектив.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "В полночь Джонсон прибыл в парк. Он осмотрел окрестности, но не увидел никого, кто выглядел бы подозрительно. Он уже собирался уходить, когда у него зазвонил телефон."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Сюда.",
                        name = "Аноним",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Джонсон поднял голову и увидел фигуру, вышедшую из тени. Это была женщина в толстовке с капюшоном и солнцезащитных очках. Она поманила его к себе."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Детектив осторожно приблизился к ней."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Что у тебя есть для меня?",
                    )
                ),
                Article(
                    id = "2",
                    text = "Женщина протянула ему листок бумаги."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Это номерной знак автомобиля, на котором было совершено ограбление. Я видела его припаркованным возле магазина той ночью.",
                        name = "Аноним",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "Сердце Джонсона подпрыгнуло. Это была именно та информация, которая ему была нужна, чтобы раскрыть дело. Для него эта рваная бумажка уже была большим шагом к раскрытию дела."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Спасибо, у тебя есть еще какая-либо информация?",
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Это все, что я знаю. Но будь осторожен. Люди, которые это сделали, опасны...",
                        name = "Женщина",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Но откуда...",
                    )
                ),
                Article(
                    id = "8",
                    text = "Прежде чем Джонсон успел спросить, женщина растворилась в ночи. Он посмотрел на номерной знак и запомнил его. Затем он направился обратно к своей машине, испытывая смесь возбуждения и дурных предчувствий."
                ),
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "На следующий день Джонсон проверил номер машины по полицейской базе данных. Оно было зарегистрировано на имя человека по имени Майкл Дрейк. Джонсон еще немного покопался и обнаружил, что Дрейк имел судимость за кражу со взломом и нападение."
                ),
                Article(
                    id = "1",
                    text = "Джонсон знал, что должен действовать быстро. Он и его команда установили наблюдение за квартирой Дрейка и ждали, когда он предпримет какие-либо действия."
                ),
                Article(
                    id = "2",
                    text = "Прошло совсем немного времени, прежде чем Дрейк вышел из своей квартиры и сел в машину. Команда Джонсона незаметно последовала за ним. Они наблюдали, как Дрейк подъехал к складу на окраине города."
                ),
                Article(
                    id = "3",
                    text = "Сердце Джонсона упало. У него было предчувствие, что именно здесь хранились украденные товары. Но он не мог просто ворваться сюда без ордера."
                ),
                Article(
                    id = "4",
                    text = "Он позвонил своему руководителю и объяснил ситуацию. После некоторого раздумья они решили получить ордер и произвести обыск на складе."
                ),
                Article(
                    id = "5",
                    text = "Рейд прошел успешно. Джонсон и его команда обнаружили украденные товары, а также большой тайник с наркотиками и оружием. Дрейк и его сообщники были арестованы и обвинены в многочисленных преступлениях."
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Дрейк, рейд прошел успешно. Мы нашли украденные товары, наркотики и оружие. Спасибо тебе, что привел нас сюда...",
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Поздравляю, Джонсон. Ты, должно быть, сейчас чувствуешь себя героем...",
                        name = "Дрейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Дело не в том, чтобы быть героем, Дрейк.... Мы выполняем свою работу и ловим таких как ты, чтобы сделать мир хоть немного безопаснее."
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "У вас на нас ничего нет. Мы невиновны, пока не будет доказана наша вина, помнишь?",
                        name = "Дрейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Вы и ваши сообщники были пойманы с украденными товарами, наркотиками и оружием. Этого достаточно для обвинения и ареста."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Ты думаешь, что победил, Джонсон. Но это еще не конец. Мои адвокаты вытащат нас из этого, и мы довольно скоро вернемся на улицы.",
                        name = "Дрейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Ваши адвокаты могут попытаться, но улики против вас. И мы будем внимательно наблюдать за вами. Мы больше не позволим вам и вашей шайке наносить вред обществу."
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Возможно, ты выиграешь эту битву, Джонсон. Но война еще не закончилась. Ты видишь меня не в последний раз.",
                        name = "Дрейк",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Мы будем готовы принять тебя, Дрейк. И мы сделаем все возможное, чтобы добиться правосудия."
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Дрейк",
                        color = RemarkColor.SECONDARY,
                        remark = "Мы еще посмотрим на это, Джонсон. Мы еще посмотрим на это..."
                    )
                ),
                Article(
                    id = "17",
                    text = "Джонсон испытывал чувство облегчения и удовлетворения, наблюдая, как преступников уводят в наручниках. Но он также знал, что это был всего лишь один случай из многих. Всегда было бы больше преступников, которых нужно было бы поймать, больше дел, которые нужно было бы раскрыть."
                ),
                Article(
                    id = "18",
                    text = "И все таки - кто была та женщина?"
                ),
            )
        ),
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyWithTheMundaneEn1 = Story(
    id = "9",
    pictureUrl = "https://i.ibb.co/K03cqq8/image.jpg",
    name = "It all started with the mundane",
    categories = listOf(
        Category.NEW,
        Category.ADVENTURE,
        Category.DETECTIVE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "It was a quiet evening, and Detective Johnson had just settled into his favorite chair to relax after a long day at the station. When he picked up his phone to check if there were any missed calls or urgent messages, a notification caught his attention. It was a message from an unknown number, and because of the brief preview, it sounded urgent."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "With a curious frown, Detective Johnson opened the message, wondering who could be trying to reach him at such an hour."
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
                        name = "Anonymous",
                        remark = "I have information about a robbery on 3rd Street.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    text = "Johnson frowned. He had been investigating this robbery for several weeks, but he had no leads."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Who is this?",
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Anonymous",
                        remark = "It doesn't matter. The important thing is that I have information that can help you catch the robbers.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "Johnson's heart started beating fast. Could this be a breakthrough in the case? Or is this an ambush to get me off the case? The detective hesitated."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Johnson",
                        remark = "What do you know?",
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Anonymous",
                        remark = "Meet me in the park on 5th Street at midnight. Come alone.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "7",
                    text = "Johnson hesitated. Meeting an anonymous informant in the middle of the night seemed dangerous. But he needed to catch these robbers, and he could not miss this opportunity."
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Johnson",
                        remark = "OK, I'll be there.",
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Anonymous",
                        remark = "I'll be waiting. Just don't be silly, Detective.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "At midnight Johnson arrived at the park. He looked around the neighborhood, but didn't see anyone who looked suspicious. He was about to leave when his phone rang."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Here.",
                        name ="Anonymous",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Johnson looked up and saw a figure come out of the shadows. It was a woman in a hoodie and sunglasses. She beckoned him to her."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "The detective approached her cautiously."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Johnson",
                        remark = "What do you have for me?",
                    )
                ),
                Article(
                    id = "2",
                    text = "The woman handed him a piece of paper."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "This is the license plate of the car on which the robbery was committed. I saw it parked outside the store that night.",
                        name = "Anonymous",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "4",
                    text = "Johnson's heart jumped. This was exactly the information he needed to solve the case. For him, this torn piece of paper was already a big step towards solving the case."
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Thank you, do you have any more information?",
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "That's all I know. But be careful. The people who did this are dangerous...",
                        name = "Woman",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Johnson",
                        remark = "But from where...",
                    )
                ),
                Article(
                    id = "8",
                    text = "Before Johnson could ask, the woman disappeared into the night. He looked at the license plate and memorized it. Then he headed back to his car, feeling a mixture of excitement and foreboding."
                ),
            )
        ),
        StoryPart(
            partId = "3",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "The next day, Johnson checked the license plate number on the police database. It was registered in the name of a man named Michael Drake. Johnson did some more digging and discovered that Drake had a criminal record for burglary and assault."
                ),
                Article(
                    id = "1",
                    text = "Johnson knew he had to act fast. He and his team set up surveillance of Drake's apartment and waited for him to take any action."
                ),
                Article(
                    id = "2",
                    text = "It wasn't long before Drake left his apartment and got into the car. Johnson's team followed him unnoticed. They watched Drake drive up to a warehouse on the outskirts of town."
                ),
                Article(
                    id = "3",
                    text = "Johnson's heart sank. He had a hunch that this was where the stolen goods were stored. But he couldn't just barge in here without a warrant."
                ),
                Article(
                    id = "4",
                    text = "He called his supervisor and explained the situation. After some thought, they decided to get a warrant and search the warehouse."
                ),
                Article(
                    id = "5",
                    text = "The raid was successful. Johnson and his team found stolen goods, as well as a large cache of drugs and weapons. Drake and his accomplices were arrested and charged with numerous crimes."
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Drake, the raid was successful. We found stolen goods, drugs and weapons. Thank you for bringing us here...",
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Congratulations, Johnson. You must be feeling like a hero right now...",
                        name = "Drake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Johnson",
                        remark = "It's not about being a hero, Drake.... We do our job and catch people like you to make the world a little safer."
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "You have nothing on us. We are innocent until proven guilty, remember?",
                        name = "Drake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Johnson",
                        remark = "You and your accomplices were caught with stolen goods, drugs and weapons. That's enough to charge and arrest."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "You think you've won, Johnson. But this is not the end. My lawyers will get us out of this and we'll be back on the streets pretty soon.",
                        name= "Drake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Your lawyers may try, but the evidence is against you. And we will be watching you closely. We will no longer allow you and your gang to harm society."
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Maybe you'll win this battle, Johnson. But the war is not over yet. It won't be the last time you see me.",
                        name = "Drake",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Johnson",
                        remark = "We will be ready to receive you, Drake. And we will do everything possible to get justice."
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Drake",
                        color = RemarkColor.SECONDARY,
                        remark = "We'll see about that, Johnson. We'll see about that later..."
                    )
                ),
                Article(
                    id = "17",
                    text = "Johnson felt a sense of relief and satisfaction watching the criminals being led away in handcuffs. But he also knew that this was just one case out of many. There would always be more criminals to catch, more cases to solve."
                ),
                Article(
                    id = "18",
                    text = "And yet - who was that woman?"
                ),
            )
        ),
    ),
    currentPartId = "0",
    isRecommended = true
)