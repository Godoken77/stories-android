package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storySpaceRu1 = Story(
    id = "3",
    pictureUrl = "https://i.ibb.co/ZxMZVwX/image.jpg",
    name = "Затерянный в космосе",
    categories = listOf(
        Category.NEW,
        Category.FANTASY,
        Category.ADVENTURE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Шел 2050 год, и освоение космоса стало нормой. Джон, астронавт-ветеран, был выбран для руководства первой миссией на Марс."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Взволнованный и нервничающий, он покинул Землю со своей командой, готовый к тому, что стало бы самым значительным достижением в истории человечества. "
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
                        remark = "Хьюстон, это коммандер Джонсон. Я завершил свой выход в открытый космос и возвращаюсь на шаттл.",
                        name = "Астронавт"
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Принято, коммандер. Мы получаем телеметрические данные с вашего скафандра. Похоже, все в порядке.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Астронавт",
                        remark = "приятно слышать. Сейчас я открываю люк."
                    )
                ),
                Article(
                    id = "3",
                    text = "Внезапно раздается громкий шипящий звук."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Хьюстон, я обнаруживаю падение давления в воздушном шлюзе. Сейчас я его запечатываю.",
                        name = "Астронавт",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Вас понял, коммандер. Мы также наблюдаем падение давления. Тебе нужно как можно скорее вернуться в шаттл.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    text = "Астронавт быстро возвращается в шаттл, но давление продолжает падать. Он пытается закрыть шлюз, но уже слишком поздно."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Хьюстон, давление все еще падает. Я не могу это остановить.",
                        name = "Астронавт"
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Коммандер, мы делаем все, что в наших силах. Подожди.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    text = "Астронавт хватает ртом воздух, когда давление падает еще больше. Он знает, что у него мало времени."
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Хьюстон, скажи моей семье, что я люблю их….",
                        name = "Астронавт"
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Мы так и сделаем, коммандер. Держись там.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Как раз в тот момент, когда кажется, что вся надежда потеряна, в воздушном шлюзе внезапно повышается давление. Астронавт чувствует, как воздух устремляется обратно в шаттл."
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Хьюстон, давление стабилизируется. Я снова могу дышать.",
                        name = "Астронавт"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Это невероятно, коммандер. Мы не уверены, как это произошло, но мы рады, что вы все еще с нами.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    text = "Астронавта срочно отправляют обратно на Землю за медицинской помощью. Чудом он выживает после этого инцидента, но то, что произошло, навсегда изменило его. Он знает, что был близок к смерти, и это осознание остается с ним на всю оставшуюся жизнь."
                ),
                Article(
                    id = "16",
                    text = "В последующие годы Джонсон становится представителем космической безопасности, выступая за совершенствование технологий и процедур для предотвращения аварий, подобных той, с которой он столкнулся. Он уходит из НАСА, но продолжает вдохновлять молодых людей, мечтающих исследовать звезды."
                ),
                Article(
                    id = "17",
                    text = "Годы спустя, когда люди будут вспоминать космическую миссию Джонсона, они будут вспоминать чудесное событие, позволившее ему выжить. Но для самого Джонсона этот опыт является постоянным напоминанием о хрупкости жизни и важности безопасности во всех аспектах освоения космоса."
                ),
                Article(
                    id = "18",
                    text = "Несмотря на его пропаганду безопасности, в космосе продолжают происходить несчастные случаи, и Джонсону напоминают об этом, когда до него доходит весть об очередной трагедии. Он оплакивает потерянные жизни и задается вопросом, мог ли он еще что-нибудь сделать, чтобы предотвратить это."
                ),
                Article(
                    id = "19",
                    text = "Когда Джонсон становится старше, он понимает, что его время на Земле ограничено. Но он находит утешение в осознании того, что смог изменить мир к лучшему, пусть даже в незначительной степени. И он оглядывается на свое пребывание в космосе с чувством гордости и благодарности, зная, что ему удалось испытать то, что выпадает на долю немногих людей."
                ),
                Article(
                    id = "20",
                    text = "Джонсон сейчас на пенсии и живет спокойной жизнью со своей семьей, но он все еще поддерживает связь со своими бывшими коллегами из НАСА. Однажды, ни с того ни с сего, он получает звонок, который навсегда изменит его жизнь..."
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "Джонсон, это Хьюстон. У нас срочная ситуация. Массивный астероид направляется к Земле, и нам нужно, чтобы вы возглавили миссию, чтобы остановить его. Ты полетишь с Оливером, одним из наших лучших астронавтов.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "22",
                    text = "Джонсон ошеломлен этой новостью. Он слишком хорошо знает об опасностях космических полетов, но он также знает, что это возможность изменить ситуацию к лучшему в глобальном масштабе."
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        remark = "Я сделаю это. В скором времени буду у вас",
                        name = "Джонсон",
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        remark = "Ждем вас, спасибо, Джонсон. Страна этого не забудет.",
                        name = "Хьюстон",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "25",
                    text = "Он быстро собирает свои вещи и направляется в штаб-квартиру НАСА, где встречает Оливера и остальных членов команды, которые присоединятся к ним в миссии. Они проводят недели в тренировках, обдумывая каждую деталь миссии и готовясь к наихудшему сценарию.",
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
                    text = "Наконец, наступает день запуска. Джонсон и Оливер садятся в шаттл и отправляются в космос, направляясь к астероиду."
                ),
                Article(
                    id = "1",
                    text = "Приближаясь к астероиду, Джонсон и Оливер понимают, что эта миссия будет гораздо более сложной, чем они когда-либо себе представляли. Астероид больше, чем они ожидали, и они знают, что одна ошибка может стоить человечеству множества жизней."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "В крайний свой полет... я попрощался со своей семьей, но вернулся на землю."
                    )
                ),
                Article(
                    id = "3",
                    text = "..."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Меня спасли обстоятельства... Я тут не причём."
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Оливер",
                        remark = "Ты ошибаешься.... Астероид больше, чем мы думали..",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Ты прав... Хьюстон? Прием."
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Да?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Астероид больше, чем мы могли подозревать."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Вам надо быть осторожнее... Мы с вами... У вас получится.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "....."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Ну что.. Мы готовы к началу."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Разрешаю начать операцию.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    text = "Оказалось все не так как было на тренировках, но они не сдаются, работая вместе, чтобы разработать план уничтожения астероида. Они используют серию взрывчатых веществ, тщательно размещенных для обеспечения максимального эффекта. А затем, испытывая одновременно страх и решимость, они активируют взрывчатку."
                ),
                Article(
                    id = "14",
                    text = "Но можности детонатора не хватило, чтобы разрушить астероид полностью, часть астероида откололась и начала падение на Землю."
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Астероид не был остановлен!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Нам, не хватило взрывчатки, Хьюстон!",
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        name = "Оливер",
                        remark = "Джонсон... Смотри!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Оливер, не сейчас..."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "Астероид столкнется с землей в течение трех часов",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Что произойдёт после столкновение, Хьюстон?"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Хьюстон",
                        remark = "я... п.... в.... тр..... ско.....",
                        color = RemarkColor.SECONDARY
                    ),
                ),
                Article(
                    id = "22",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Хьюстон?"
                    )
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        name = "Оливер",
                        color = RemarkColor.SECONDARY,
                        remark = "Не трать зря время, магнитное поле Земли отключило электричество. У нас больше нет связи..."
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Черт..."
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        name = "Оливер",
                        remark = "мы не сможем вернуться на землю без связи...",
                        color = RemarkColor.SECONDARY,
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        name = "Джонсон",
                        remark = "Я знаю."
                    )
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storySpaceEn1 = Story(
    id = "3",
    pictureUrl = "https://i.ibb.co/ZxMZVwX/image.jpg",
    name = "Lost in Space",
    categories = listOf(
        Category.NEW,
        Category.FANTASY,
        Category.ADVENTURE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "It was 2050, and space exploration became the norm. John, a veteran astronaut, was chosen to lead the first mission to Mars."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Excited and nervous, he left Earth with his team, ready for what would be the most significant achievement in human history. "
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
                        remark = "Houston, this is Commander Johnson. I have completed my spacewalk and am returning to the shuttle.",
                        name = "Astronaut"
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Houston",
                        remark = "Accepted, Commander. We're getting telemetry data from your spacesuit. Everything seems to be in order.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Astronaut",
                        remark = "nice to hear. I'm opening the hatch now."
                    )
                ),
                Article(
                    id = "3",
                    text = "Suddenly there is a loud hissing sound."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Houston, I detect a pressure drop in the airlock. I'm sealing it now.",
                        name = "Astronaut",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Understood, Commander. We are also seeing a drop in pressure. You need to get back to the shuttle as soon as possible.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    text = "The astronaut quickly returns to the shuttle, but the pressure continues to drop. He tries to close the airlock, but it's too late."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Houston, pressure is still dropping. I can't stop it.",
                        name = "Astronaut"
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Commander, we are doing everything in our power. Wait.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "9",
                    text = "The astronaut gasps for air when the pressure drops even more. He knows he doesn't have much time."
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Houston, tell my family I love them....",
                        name = "Astronaut"
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "We will do that, Commander. Hang in there.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Just at the moment when it seems that all hope is lost, the pressure in the airlock suddenly rises. The astronaut feels the air rushing back into the shuttle."
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Houston, the pressure is stabilizing. I can breathe again.",
                        name = "Astronaut"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "This is unbelievable, Commander. We're not sure how it happened, but we're glad you're still with us.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    text = "The astronaut is being urgently sent back to Earth for medical help. Miraculously, he survives the incident, but what happened changed him forever. He knows that he was close to death, and this realization remains with him for the rest of his life."
                ),
                Article(
                    id = "16",
                    text = "In the following years, Johnson became a representative of space security, advocating for the improvement of technologies and procedures to prevent accidents like the one he encountered. He is leaving NASA, but continues to inspire young people who dream of exploring the stars."
                ),
                Article(
                    id = "17",
                    text = "Years later, when people will remember Johnson's space mission, they will remember the miraculous event that allowed him to survive. But for Johnson himself, this experience is a constant reminder of the fragility of life and the importance of safety in all aspects of space exploration."
                ),
                Article(
                    id = "18",
                    text = "Despite his propaganda of safety, accidents continue to occur in space, and Johnson is reminded of this when the news of another tragedy reaches him. He mourns the lives lost and wonders if there was anything else he could have done to prevent it."
                ),
                Article(
                    id ="19",
                    text = "When Johnson gets older, he realizes that his time on Earth is limited. But he finds solace in the realization that he was able to change the world for the better, even to a small extent. And he looks back on his stay in space with a sense of pride and gratitude, knowing that he managed to experience what falls to the lot of few people."
                ),
                Article(
                    id = "20",
                    text = "Johnson is now retired and living a quiet life with his family, but he still keeps in touch with his former NASA colleagues. One day, out of the blue, he gets a call that will change his life forever..."
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        remark = "Johnson, this is Houston. We have an urgent situation. A massive asteroid is heading towards Earth and we need you to lead the mission to stop it. You will fly with Oliver, one of our best astronauts.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "22",
                    text = "Johnson is stunned by this news. He knows all too well about the dangers of space flight, but he also knows that this is an opportunity to make a difference on a global scale."
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        remark = "I'll do it. I will be with you soon",
                        name = "Johnson",
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        remark = "We are waiting for you, thank you, Johnson. The country will not forget this.",
                        name = "Houston",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "25",
                    text = "He quickly packs up his things and heads to NASA headquarters, where he meets Oliver and the rest of the team who will join them on the mission. They spend weeks in training, thinking over every detail of the mission and preparing for the worst-case scenario.",
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
                    text = "Finally, the launch day is coming. Johnson and Oliver board a shuttle and go into space, heading for an asteroid."
                ),
                Article(
                    id = "1",
                    text = "As Johnson and Oliver approach the asteroid, they realize that this mission is going to be much more challenging than they ever imagined. The asteroid is bigger than they expected, and they know that one mistake can cost humanity many lives."
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Johnson",
                        remark = "On your last flight... I said goodbye to my family, but returned to earth."
                    )
                ),
                Article(
                    id = "3",
                    text = "..."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Circumstances saved me... I have nothing to do with it."
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Oliver",
                        remark = "You're wrong.... The asteroid is bigger than we thought..",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        name = "Johnson",
                        remark = "You're right... Houston? Reception."
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Houston",
                        remark = "Yes?",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Johnson",
                        remark = "The asteroid is bigger than we could have suspected."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Houston",
                        remark = "You need to be more careful... We are with you... You will succeed.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    text = "....."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Well.. We are ready to start."
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Houston",
                        remark = "Permission to start the operation.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "13",
                    text = "It turned out everything was not as it was in training, but they do not give up, working together to develop a plan to destroy the asteroid. They use a series of explosives carefully placed to ensure maximum effect. And then, feeling both fear and determination, they activate explosives."
                ),
                Article(
                    id = "14",
                    text = "But the detonator's capability was not enough to destroy the asteroid completely, part of the asteroid broke off and began falling to Earth."
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        name = "Houston",
                        remark = "The asteroid was not stopped!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        name = "Johnson",
                        remark = "We didn't have enough explosives, Houston!",
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        name = "Oliver",
                        remark = "Johnson... Look!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Oliver, not now..."
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        name = "Houston",
                        remark = "Asteroid will collide with earth within three hours",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "20",
                    remark = Remark(
                        name = "Johnson",
                        remark = "What happens after the collision, Houston?"
                    )
                ),
                Article(
                    id = "21",
                    remark = Remark(
                        name = "Houston",
                        remark = "I ... p.... in .... tr..... coo.....",
                        color = RemarkColor.SECONDARY
                    ),
                ),
                Article(
                    id = "22",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Houston?"
                    )
                ),
                Article(
                    id = "23",
                    remark = Remark(
                        name = "Oliver",
                        color = RemarkColor.SECONDARY,
                        remark = "Don't waste your time, the Earth's magnetic field has turned off the electricity. We don't have a connection anymore..."
                    )
                ),
                Article(
                    id = "24",
                    remark = Remark(
                        name = "Johnson",
                        remark = "Damn..."
                    )
                ),
                Article(
                    id = "25",
                    remark = Remark(
                        name = "Oliver",
                        remark = "we will not be able to return to earth without communication...",
                        color = RemarkColor.SECONDARY,
                    )
                ),
                Article(
                    id = "26",
                    remark = Remark(
                        name = "Johnson",
                        remark = "I know."
                    )
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)