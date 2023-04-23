package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyElenaRu1 = Story(
    id = "1",
    pictureUrl = "https://i.ibb.co/0sb6BLq/image.jpg",
    name = "Елена",
    categories = listOf(
        Category.NEW,
        Category.ROMANTIC,
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Елена проснулась от звука дождя, стучащего в ее окно. Она застонала и перевернулась на другой бок, пытаясь не обращать внимания на тупую боль в голове. Прошлая ночь была сплошной чередой мигающих огней и грохочущей музыки, и у нее было ощущение, что она переборщила."
                ),
                Article(
                    id = "1",
                    text = "Когда она, спотыкаясь, выбралась из постели и направилась в ванную, то мельком увидела себя в зеркале. Ее волосы были в беспорядке, макияж размазался, а глаза налились кровью. Она снова застонала, жалея, что не может просто забраться обратно в постель и отоспаться с похмелья."
                ),
                Article(
                    id = "2",
                    text = "Но на это не было времени. Через два часа у Елены было собеседование при приеме на работу, и ей нужно было взять себя в руки, если она хотела получить хоть какой-то шанс получить эту должность. Это была работа в начинающей компании, к которой она присматривалась в течение нескольких месяцев, и наконец-то ей представилась возможность пройти собеседование."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Елена быстро приняла душ, накинула какую-то одежду и начала наносить макияж, чтобы скрыть следы своей бурной ночной прогулки. Она как раз собиралась приступить к укладке волос, когда услышала стук в дверь."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Елена",
                        remark = "Это еще кто...",
                    )
                ),
                Article(
                    id = "2",
                    text = "Она нахмурилась, гадая, кто мог беспокоить ее в такой час. Она быстро закончила с макияжем и пошла открывать дверь, надеясь, что это не соседка жалуется на шум."
                ),
                Article(
                    id = "3",
                    text = "Но когда она открыла дверь, то была удивлена, увидев своего бывшего парня, стоящего там и выглядящего таким же красивым, как всегда. Она почувствовала укол тоски в груди, но быстро отогнала его."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Что ты здесь делаешь?",
                        name = "Елена",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Я просто хочу поговорить.",
                        name = "Парень",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "О чем...",
                        name = "Елена"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Может впустишь для начала?",
                        name = "Парень",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Ну хорошо.. заходи.",
                        name = "Елена"
                    )
                ),
                Article(
                    id = "9",
                    text = "Елена колебалась, но в конце концов отступила в сторону и впустила его. Она не знала, о чем он мог хотеть поговорить, но не могла устоять перед желанием снова быть рядом с ним."
                ),
                Article(
                    id = "10",
                    text = "Они сели на диван, и Елена попыталась игнорировать знакомое ощущение его тела рядом с ее. Она ждала, что он заговорит, но он просто сидел, уставившись на свои руки."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Я совершил ошибку. Я не должен был отпускать тебя. Я все еще люблю тебя, Лен.",
                        name = "Парень",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Сердце Елены пропустило удар. Она тоже никогда не переставала любить его, но знала, что у них никогда ничего не получится. Они были слишком разными, слишком изменчивыми."
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "Я не знаю, что сказать.",
                        name = "Елена"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Скажи, что дашь мне еще один шанс.",
                        name = "Парень",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    text = "Елена колебалась, зная, что это закончится только разбитым сердцем. Но потом она подумала о собеседовании при приеме на работу и о том, как сильно ей нужна была эта возможность. Может быть, она смогла бы использовать это в своих интересах."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark = "Хорошо. Но при одном условии. Ты должен пойти со мной на собеседование сегодня.",
                        name = "Елена",
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Хорошо.",
                        name = "Парень",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    text = "Ее бывший парень выглядел смущенным, но в конце концов согласился. Елена почувствовала, как ее захлестнуло чувство триумфа. Возможно, это был второй шанс, в котором она нуждалась, но не со своим бывшим парнем, а со своей карьерой."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Они вышли из квартиры и направились в штаб-квартиру компании. Елена нервничала, но в то же время чувствовала себя странно уверенно. Теперь у нее было секретное оружие, и она была полна решимости использовать его в своих интересах."
                ),
                Article(
                    id = "1",
                    text = "Когда они вошли в здание, Елена увидела группу людей, ожидающих в вестибюле. Она узнала в них других кандидатов на эту должность. Все они выглядели профессионально и собранно, и Елена внезапно почувствовала неловкость из-за своего растрепанного вида."
                ),
                Article(
                    id = "2",
                    text = "Но потом она увидела выражение их лиц, когда ее бывший парень вошел следом за ней. Они все уставились на него, как будто он был какая-то знаменитость."
                ),
                Article(
                    id = "3",
                    text = "Бывший парень Елены, казалось, оказывал магнетическое воздействие на людей, и она видела, как другие кандидаты оценивали его, пытаясь понять, кто он такой и что здесь делает."
                ),
                Article(
                    id = "4",
                    text = "Когда они подошли к столу администратора, Елена увидела, как глаза женщины расширились от узнавания. "
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Администратор",
                        remark = "О боже мой, ты знаменитый актер, Алекс Родригес!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    text = "Сердце Елены упало, когда ее бывший парень, а точнее, Алекс, очаровательно улыбнулся и пожал руку секретарше. Елена понятия не имела, что он знаменит, или что он скрывал это от нее все это время."
                ),
                Article(
                    id = "7",
                    text = "Она почувствовала укол гнева из-за того, что ее использовали, но быстро подавила его. Ей нужно было сосредоточиться на собеседовании, и Алекс мог стать ее пропуском к получению работы."
                ),
                Article(
                    id = "8",
                    text = "Пока они ждали своей очереди, Елена видела, как другие кандидаты бросали в их сторону завистливые взгляды. Она пыталась не обращать на них внимания, но не могла избавиться от ощущения, что они находятся в невыгодном положении."
                ),
                Article(
                    id = "9",
                    text = "Наконец, настала их очередь войти в комнату для интервью. Елена глубоко вздохнула и последовала за Алексом внутрь. Номер был просторным и современным, с окнами от пола до потолка, из которых открывался вид на городской пейзаж. За длинным столом сидели три человека, и все они подняли головы, когда они вошли."
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
                        name = "Женщина",
                        remark = "Доброе утро, пожалуйста, присаживайтесь.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Елена",
                        remark = "Благодарю.",
                    )
                ),
                Article(
                    id = "2",
                    text = "Елена и Алекс сели, и интервью началось. Елена уверенно отвечала на вопросы, но чувствовала на себе взгляды интервьюеров, устремленные на Алекса. Казалось, он был в центре внимания, хотя он здесь просто для поддержки."
                ),
                Article(
                    id = "3",
                    text = "Наконец, все было кончено. Елена и Алекс встали, чтобы уйти, и женщина во главе стола пожала им руки. \n"
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Женщина",
                        remark = "Спасибо, что пришли сегодня, мы будем на связи.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Елена",
                        remark = "Благодарю вас!",
                    )
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Алекс",
                        remark = "Ты отлично справилась.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Елена",
                        remark = "Ты даже не должен был быть здесь."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Алекс",
                        remark = "О чем ты говоришь? Ты же меня сама попросила...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Елена",
                        remark = "Какая разница? Ты не обязан был идти."
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Алекс",
                        remark = "Но.. Подожди..",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Елена",
                        remark = "Просто уходи... Ты воспользовался моим положением."
                    )
                ),
                Article(
                    id = "13",
                    text = "Выходя из здания, она услышала, как дождь барабанит по тротуару. Она почувствовала, как ее захлестнуло разочарование как в себе, так и в Алексе. Она думала, что нашла способ продвинуться вперед, но все это было ложью."
                ),
                Article(
                    id = "14",
                    text = "Но, возвращаясь домой, она не могла избавиться от ощущения, что происходит что-то еще. Происходило что-то серьезное, и она не знала, что это было. Просто какое-то плохое предчувствие."
                ),
                Article(
                    id = "15",
                    text = "Пока Елена шла по залитым дождем улицам, в ее голове проносились всевозможные варианты. Почему он солгал ей о своем статусе знаменитости? Возьмут ли меня на эту должность? Была ли я лучше тех кандидатов? Для чего Алекс пришел сегодня?"
                ),
                Article(
                    id = "16",
                    text = "Вопросы вертелись у нее в голове, но она не могла придумать ни одного ответа. Она почувствовала, как внутри нее нарастает чувство разочарования."
                ),
                Article(
                    id = "17",
                    text = "Она приехала домой и сразу же начала рыскать по Интернету в поисках информации. Она поискала новостные статьи об Алексе Родригесе."
                ),
                Article(
                    id = "18",
                    text = "Но она ничего не смогла найти. Это было похоже на то, что он исчез из поля зрения общественности. Елена почувствовала, как в животе у нее поселилось чувство неловкости. Если Алекс пытался что-то скрыть, это не могло быть ничем хорошим."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyElenaEn1 = Story(
    id = "1",
    pictureUrl = "https://i.ibb.co/0sb6BLq/image.jpg",
    name = "Elena",
    categories = listOf(
        Category.NEW,
        Category.ROMANTIC,
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Elena woke up to the sound of rain pounding on her window. She groaned and rolled over, trying to ignore the dull pain in her head. Last night was a continuous series of flashing lights and thundering music, and she had the feeling that she had overdone it."
                ),
                Article(
                    id = "1",
                    text = "When she stumbled out of bed and headed to the bathroom, she caught a glimpse of herself in the mirror. Her hair was a mess, her makeup was smeared, and her eyes were bloodshot. She moaned again, wishing she could just crawl back into bed and sleep off the hangover."
                ),
                Article(
                    id = "2",
                    text = "But there was no time for that. Two hours later, Elena had a job interview, and she needed to pull herself together if she wanted to get at least some chance of getting this position. It was a job at a start-up company, which she had been eyeing for several months, and finally she had the opportunity to be interviewed."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Elena quickly took a shower, threw on some clothes and started applying makeup to hide the traces of her stormy night walk. She was just about to start styling her hair when she heard a knock on the door."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Elena",
                        remark = "Who else is that...",
                    )
                ),
                Article(
                    id = "2",
                    text = "She frowned, wondering who could be bothering her at such an hour. She quickly finished with her makeup and went to open the door, hoping that it wasn't the neighbor complaining about the noise."
                ),
                Article(
                    id = "3",
                    text = "But when she opened the door, she was surprised to see her ex-boyfriend standing there looking as handsome as ever. She felt a pang of longing in her chest, but quickly pushed it away."
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "What are you doing here?",
                        name = "Elena",
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "I just want to talk.",
                        name = "Guy",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "About what...",
                        name = "Elena"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Can you let me in first?",
                        name = "Guy",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "All right.. come in.",
                        name = "Elena"
                    )
                ),
                Article(
                    id = "9",
                    text = "Elena hesitated, but eventually stepped aside and let him in. She didn't know what he might want to talk about, but she couldn't resist the desire to be with him again."
                ),
                Article(
                    id = "10",
                    text = "They sat down on the sofa, and Elena tried to ignore the familiar feeling of his body next to hers. She waited for him to speak, but he just sat there staring at his hands."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "I made a mistake. I shouldn't have let you go. I still love you, Len.",
                        name = "Guy",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    text = "Elena's heart missed a beat. She also never stopped loving him, but she knew that nothing would ever work out between them. They were too different, too changeable."
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "I do not know what to say.",
                        name = "Elena"
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Say you'll give me another chance.",
                        name = "Guy",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "15",
                    text = "Elena hesitated, knowing that it would only end with a broken heart. But then she thought about the job interview and how much she needed this opportunity. Maybe she could use it to her advantage."
                ),
                Article(
                    id = "16",
                    remark = Remark(
                        remark= "OK. But on one condition. You have to come with me for an interview today.",
                        name = "Elena",
                    )
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Good.",
                        name = "Guy",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "18",
                    text = "Her ex-boyfriend looked confused, but eventually agreed. Elena felt a sense of triumph wash over her. Maybe it was the second chance she needed, not with her ex-boyfriend, but with her career."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "They left the apartment and went to the company headquarters. Elena was nervous, but at the same time she felt strangely confident. Now she had a secret weapon, and she was determined to use it to her advantage."
                ),
                Article(
                    id = "1",
                    text = "When they entered the building, Elena saw a group of people waiting in the lobby. She recognized them as other candidates for the position. They all looked professional and collected, and Elena suddenly felt awkward because of her disheveled appearance."
                ),
                Article(
                    id = "2",
                    text = "But then she saw the look on their faces when her ex-boyfriend came in after her. They all stared at him like he was some kind of celebrity."
                ),
                Article(
                    id = "3",
                    text = "Elena's ex-boyfriend seemed to have a magnetic effect on people, and she saw how other candidates evaluated him, trying to figure out who he was and what he was doing here."
                ),
                Article(
                    id = "4",
                    text = "When they approached the administrator's desk, Elena saw the woman's eyes widen with recognition. "
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Administrator",
                        remark = "Oh my God, you're a famous actor, Alex Rodriguez!",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "6",
                    text = "Elena's heart sank when her ex-boyfriend, or rather, Alex, smiled charmingly and shook hands with the secretary. Elena had no idea that he was famous, or that he had been hiding it from her all this time."
                ),
                Article(
                    id = "7",
                    text = "She felt a pang of anger at being used, but quickly suppressed it. She needed to focus on the interview, and Alex could be her passport to getting a job."
                ),
                Article(
                    id = "8",
                    text = "While they were waiting for their turn, Elena saw other candidates throwing envious glances in their direction. She tried to ignore them, but she couldn't shake the feeling that they were at a disadvantage."
                ),
                Article(
                    id = "9",
                    text = "Finally, it's their turn to enter the interview room. Elena took a deep breath and followed Alex inside. The room was spacious and modern, with floor-to-ceiling windows overlooking the city skyline. There were three people sitting at a long table, and they all looked up when they entered."
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
                        name = "Woman",
                        remark = "Good morning, please have a seat.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Elena",
                        remark = "Thank you.",
                    )
                ),
                Article(
                    id = "2",
                    text = "Elena and Alex sat down and the interview started. Elena answered the questions confidently, but she felt the eyes of the interviewers directed at Alex. He seemed to be the center of attention, even though he was just here for support."
                ),
                Article(
                    id = "3",
                    text = "Finally, it was over. Elena and Alex got up to leave, and the woman at the head of the table shook their hands. \n"
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        name = "Woman",
                        remark = "Thank you for coming today, we'll be in touch.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        name = "Elena",
                        remark = "Thank you!",
                    )
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Alex",
                        remark = "You did a great job.",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        name = "Elena",
                        remark = "You weren't even supposed to be here."
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        name = "Alex",
                        remark = "What are you talking about? You asked me yourself...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        name = "Elena",
                        remark = "What's the difference? You didn't have to go."
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        name = "Alex",
                        remark = "No.. Wait..",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        name = "Elena",
                        remark = "Just leave... You took advantage of my position."
                    )
                ),
                Article(
                    id = "13",
                    text = "As she was leaving the building, she heard the rain drumming on the sidewalk. She felt a surge of disappointment both in herself and in Alex. She thought she had found a way to move forward, but it was all a lie."
                ),
                Article(
                    id = "14",
                    text = "But, returning home, she could not get rid of the feeling that something else was happening. Something serious was going on, and she didn't know what it was. Just some kind of bad feeling."
                ),
                Article(
                    id = "15",
                    text = "As Elena walked through the rain-drenched streets, all sorts of options flashed through her head. Why did he lie to her about his celebrity status? Will I be hired for this position? Was I better than those candidates? Why did Alex come today?"
                ),
                Article(
                    id = "16",
                    text = "Questions were spinning in her head, but she couldn't think of a single answer. She felt a growing sense of disappointment inside her."
                ),
                Article(
                    id = "17",
                    text = "She arrived home and immediately started scouring the Internet for information. She searched for news articles about Alex Rodriguez."
                ),
                Article(
                    id = "18",
                    text = "But she couldn't find anything. It was like he had disappeared from public view. Elena felt a feeling of unease settle in her stomach. If Alex was trying to hide something, it couldn't be anything good."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)