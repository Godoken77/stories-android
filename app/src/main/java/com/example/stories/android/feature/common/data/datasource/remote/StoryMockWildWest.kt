package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

val storyWildWestRu1 = Story(
    id = "5",
    pictureUrl = "https://i.ibb.co/qxC90Jw/image.jpg",
    name = "Дикий запад",
    categories = listOf(
        Category.NEW,
        Category.ADVENTURE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Джек был отъявленным бандитом, которого боялись все, кто его знал. У него был быстрый палец на спусковом крючке и репутация безжалостного человека. Он въехал в город на своем верном коне, мощном черном жеребце, которого украл у конкурирующей банды головорезов."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "Когда Джек шел по пыльной главной улице, в городе было тихо. Единственным звуком было позвякивание его шпор и поскрипывание кожаного седла. Он приехал в этот город только по одной причине - ограбить банк."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Он спешился перед берегом и привязал свою лошадь к коновязи. Солнце палило прямо на него, но он этого не чувствовал. Его разум был сосредоточен на поставленной задаче. Он толкнул дверь банка и вошел, держа руку на рукоятке револьвера."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Джек",
                        remark = "Руки вверх, ублюдки. Это ограбление!"
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Кассир",
                        remark = "Не стреляй прошу, у меня дети...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Джек",
                        remark = "Закрой рот и доставай все деньги что у вас тут есть!"
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Да конечно... сейчас... сэр",
                        name = "Кассир",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Шевелись, или я вышибу тебе мозги!",
                        name = "Джек",
                    )
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Вот, забирайте, все что есть.",
                        name = "Кассир",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Вот и славно, кидай все это в мешок!",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "9",
                    text = "Кассир быстро подчинился и высыпал содержимое в мешок, который Джек принес с собой."
                ),
                Article(
                    id = "10",
                    text = "Джек как раз собирался делать ноги, но..."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Брось свое оружие, Джек.",
                        name = "Шериф",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Черт, он захотел меня продать...",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "чего ты там шепчешь, Джек? Давай без глупостей… ты меня знаешь.",
                        name = "Шериф",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Да ладно тебе, шериф... Какие глупости? Я лишь повернусь к тебе лицом.",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "Я слежу за...",
                        name = "Шериф",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    text = "ВЫСТРЕЛ"
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "В следующий раз постарайтесь быстрее, шериф...",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "Ублюдок, я тебя убью...",
                        name = "Шериф",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Не сегодня, шериф. До скорого.",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "20",
                    text = "Ухмыльнувшись, Джек бросился к двери, расталкивая съежившихся кассиров и клиентов, укрывшихся под столами и стульями. Он выскочил на жаркое послеполуденное солнце, его сердце бешено колотилось в груди."
                ),
                Article(
                    id = "21",
                    choices = listOf(),
                    text = "Он вскочил на своего коня и сильно натянул поводья, чтобы развернуть его. Черный жеребец встал на дыбы, его грива и хвост развевались на ветру."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Джек пришпорил своего коня и бешено помчался по улице, пули просвистели мимо него. Он пригибался и петлял, петляя зигзагами по городу, его лошадь двигалась по пыльной дороге, как змея."
                ),
                Article(
                    id = "1",
                    text = "Законники преследовали его по пятам, но Джек был полон решимости сбежать. Он во весь опор мчался к окраине города, сердце бешено колотилось в груди. Джек чувствовал, как они приближаются, но отказывался сдаваться. Он пришпорил своего коня еще сильнее, доведя его до предела."
                ),
                Article(
                    id = "2",
                    text = "Он выбрался оттуда живым. Джек снова был свободен…"
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Джек",
                        remark = "Ну что ж, еще одно дело... Надо ехать дальше...",
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
                    text = "Джек проехал несколько миль, его сердце все еще колотилось от адреналина. Он знал, что не сможет остановиться, пока не окажется далеко от этого города и законников, которые пытались его задержать."
                ),
                Article(
                    id = "1",
                    text = "По дороге он обдумывал свой следующий шаг. У него была сумка, полная украденных денег, но он знал, что не может просто потратить их открыто. Ему нужно было на некоторое время залечь на дно и придумать план."
                ),
                Article(
                    id = "2",
                    text = "Он решил направиться в горы, где, как он знал, была потайная пещера, которая могла бы стать хорошим укрытием. Это было опасное путешествие с коварной местностью и опасной дикой природой, но Джек был уверен в своих навыках."
                ),
                Article(
                    id = "3",
                    text = "....."
                ),
                Article(
                    id = "4",
                    text = "Он скакал несколько дней, питаясь лишь вяленым мясом и избегая любых городов или поселков. Он всегда был одиноким человеком и наслаждался свободой. Он сам по себе."
                ),
                Article(
                    id = "5",
                    text = "Наконец он добрался до гор и после нескольких дней поисков нашел пещеру. Она была спрятана за водопадом, и Джеку пришлось проплыть через ледяную лужу воды, чтобы добраться до нее."
                ),
                Article(
                    id = "6",
                    text = "Оказавшись внутри, он развел костер и устроился поудобнее, подсчитывая добычу и планируя свой следующий шаг. Он знал, что не сможет оставаться здесь вечно, но сейчас ему хотелось отдохнуть и перегруппироваться."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Джек",
                        remark = "Шериф ходит за мной по пятам. Он одержим мной. Интересно, почему же...",
                    )
                ),
                Article(
                    id = "8",
                    choices = listOf(),
                    text = "По мере того, как дни превращались в недели, Джек начал чувствовать беспокойство. Он скучал по острым ощущениям погони, по приливу адреналина, который сопровождал дерзкое ограбление. Он знал, что ему нужно вернуться в игру."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "До него дошли слухи о поезде с грузом золота, проходящем через соседний город. Джек знал, что это его шанс. Он собрал свое снаряжение и отправился в путь, готовый к очередному приключению."
                ),
                Article(
                    id = "1",
                    text = "Подъезжая к городу, Джек не мог не чувствовать себя живым. Он знал, что живет на грани, но именно это того стоило. Он был бандитом, мятежником, и он не хотел, чтобы было по-другому."
                ),
                Article(
                    id = "2",
                    text = "Джек прибыл в город как раз в тот момент, когда поезд подъезжал к станции. Он наблюдал из соседнего переулка, как охранники выгрузили партию золота и поместили ее в ближайший банк."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Ну что, Карл? Рабочий день закончен… можно и в паб",
                        name = "Охранник"
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Как же я этого ждал... Идем уже.",
                        name = "Законник",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "Как только они слиняли, Джек сделал свой ход."
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Добрый вечер, дорогие друзья... Я лишь пришел за тем, что вам привезли. Отдайте и будете жить еще очень долго.",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Но… мы не можем... сэр",
                        name = "Кассирша",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "Ты, наверное, не поняла, красотка. Думаешь ты станешь героем, если твои мозги окажутся на этой стене?",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Не надо... пожалуйста... ",
                        name = "Кассирша",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Просто давай сюда слитки и мы разойдёмся по своим делам.",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Хорошо... сейчас...",
                        name = "Кассирша",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "И без глупостей...",
                        name = "Джек"
                    )
                ),
                Article(
                    id = "13",
                    text = "Кассиры заколебались, но отказать Джеку было нельзя. Он сделал предупредительный выстрел, и они быстро подчинились, передав мешки со слитками."
                ),
                Article(
                    id = "14",
                    text = "Отъезжая, Джек не мог отделаться от чувства триумфа. Он совершил еще одно дерзкое ограбление и вновь вышел сухим."
                ),
                Article(
                    id = "15",
                    text = "Но он также знал, что закон будет преследовать его сильнее, чем когда-либо. Ему придется быть более осторожным, более хитрым, если он хочет остаться в живых."
                ),
                Article(
                    id = "16",
                    text = "Однако для Джека все это было частью игры. Он был бандитом, негодяем, и ему нравились острые ощущения от погони. Пока он был жив, он знал, что всегда будет жить на грани."
                ),
                Article(
                    id = "17",
                    text = "Надежно спрятав золото, Джек во весь опор поскакал в ночь, стараясь держаться как можно дальше от города. Он знал, что шериф и его отряд достаточно скоро выйдут на его след, но пока он радовался и гордился собой."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)

val storyWildWestEn1 = Story(
    id = "5",
    pictureUrl = "https://i.ibb.co/qxC90Jw/image.jpg",
    name = "Wild West",
    categories = listOf(
        Category.NEW,
        Category.ADVENTURE
    ),
    storyParts = listOf(
        StoryPart(
            partId = "0",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Jack was a notorious bandit who was feared by everyone who knew him. He had a quick trigger finger and a reputation for ruthlessness. He rode into town on his trusty steed, a powerful black stallion that he stole from a rival gang of thugs."
                ),
                Article(
                    id = "1",
                    choices = listOf(),
                    text = "When Jack walked down the dusty main street, the city was quiet. The only sound was the clink of his spurs and the creak of his leather saddle. He came to this city for only one reason - to rob a bank."
                ),
            )
        ),
        StoryPart(
            partId = "1",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "He dismounted in front of the shore and tied his horse to a hitching post. The sun was beating down on him, but he didn't feel it. His mind was focused on the task at hand. He pushed open the door of the bank and entered with his hand on the butt of his revolver."
                ),
                Article(
                    id = "1",
                    remark = Remark(
                        name = "Jack",
                        remark = "Hands up, bastards. This is a robbery!"
                    )
                ),
                Article(
                    id = "2",
                    remark = Remark(
                        name = "Cashier",
                        remark = "Please don't shoot, I have children...",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Jack",
                        remark = "Shut your mouth and get all the money you have here!"
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "Yes of course... now... sir",
                        name = "Cashier",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    remark = Remark(
                        remark = "Move or I'll blow your brains out!",
                        name = "Jack",
                    )
                ),
                Article(
                    id = "6",
                    text = "....."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "Here, take everything you have.",
                        name = "Cashier",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "That's nice, throw it all in the bag!",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "9",
                    text = "The cashier quickly obeyed and emptied the contents into the bag that Jack had brought with him."
                ),
                Article(
                    id = "10",
                    text = "Jack was just about to make his feet, but..."
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Drop your weapon, Jack.",
                        name = "Sheriff",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "Damn, he wanted to sell me...",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "13",
                    remark = Remark(
                        remark = "what are you whispering there, Jack? Let's not be silly… you know me.",
                        name = "Sheriff",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "14",
                    remark = Remark(
                        remark = "Come on, Sheriff... What nonsense? I'll just turn to face you.",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "15",
                    remark = Remark(
                        remark = "I'm watching...",
                        name = "Sheriff",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "16",
                    text = "SHOT"
                ),
                Article(
                    id = "17",
                    remark = Remark(
                        remark = "Try faster next time, sheriff...",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "18",
                    remark = Remark(
                        remark = "Bastard, I'll kill you...",
                        name = "Sheriff",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "19",
                    remark = Remark(
                        remark = "Not today, Sheriff. See you soon.",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "20",
                    text = "Grinning, Jack rushed to the door, pushing aside cowering cashiers and customers hiding under tables and chairs. He jumped out into the hot afternoon sun, his heart pounding wildly in his chest."
                ),
                Article(
                    id = "21",
                    choices = listOf(),
                    text = "He jumped on his horse and pulled hard on the reins to turn it around. The black stallion reared up, his mane and tail fluttering in the wind."
                ),
            )
        ),
        StoryPart(
            partId = "2",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "Jack spurred his horse and raced madly down the street, bullets whistled past him. He ducked and twisted, zigzagging through the city, his horse moving along the dusty road like a snake."
                ),
                Article(
                    id = "1",
                    text = "The lawyers were chasing him, but Jack was determined to escape. He raced at full speed to the outskirts of the city, his heart pounding in his chest. Jack could feel them coming, but he refused to give up. He spurred his horse even harder, pushing him to the limit."
                ),
                Article(
                    id = "2",
                    text = "He got out of there alive. Jack was free again..."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        name = "Jack",
                        remark = "Well, one more thing... We have to go further...",
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
                    text = "Jack drove a few miles, his heart was still pounding with adrenaline. He knew that he would not be able to stop until he was far away from this city and the lawyers who tried to detain him."
                ),
                Article(
                    id = "1",
                    text = "On the way, he was thinking about his next step. He had a bag full of stolen money, but he knew he couldn't just spend it openly. He needed to lay low for a while and come up with a plan."
                ),
                Article(
                    id = "2",
                    text = "He decided to head to the mountains, where he knew there was a secret cave that could be a good hiding place. It was a dangerous journey with treacherous terrain and dangerous wildlife, but Jack was confident in his skills."
                ),
                Article(
                    id ="3",
                    text = "....."
                ),
                Article(
                    id = "4",
                    text = "He rode for several days, eating only dried meat and avoiding any cities or towns. He had always been a lonely man and enjoyed freedom. He's on his own."
                ),
                Article(
                    id = "5",
                    text = "Finally he got to the mountains and after several days of searching found a cave. She was hidden behind a waterfall, and Jack had to swim through an icy pool of water to get to her."
                ),
                Article(
                    id = "6",
                    text = "Once inside, he lit a fire and got comfortable, counting the loot and planning his next move. He knew he couldn't stay here forever, but right now he wanted to rest and regroup."
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        name = "Jack",
                        remark = "The sheriff is following me around. He's obsessed with me. I wonder why...",
                    )
                ),
                Article(
                    id = "8",
                    choices = listOf(),
                    text= "As the days turned into weeks, Jack began to feel anxious. He missed the thrill of the chase, the rush of adrenaline that accompanied the daring robbery. He knew he needed to get back into the game."
                ),
            )
        ),
        StoryPart(
            partId = "4",
            articles = listOf(
                Article(
                    id = "0",
                    isOpen = true,
                    text = "He heard rumors about a train with a cargo of gold passing through a neighboring city. Jack knew this was his chance. He packed up his gear and set off, ready for another adventure."
                ),
                Article(
                    id = "1",
                    text = "Approaching the city, Jack couldn't help but feel alive. He knew he was living on the edge, but it was worth it. He was a bandit, a rebel, and he didn't want it to be any other way."
                ),
                Article(
                    id = "2",
                    text = "Jack arrived in town just as the train was approaching the station. He watched from a nearby alley as the guards unloaded a shipment of gold and placed it in the nearest bank."
                ),
                Article(
                    id = "3",
                    remark = Remark(
                        remark = "Well, Carl? The working day is over ... you can go to the pub",
                        name = "Security guard"
                    )
                ),
                Article(
                    id = "4",
                    remark = Remark(
                        remark = "How I've been waiting for this... Let's go already.",
                        name = "Lawyer",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "5",
                    text = "As soon as they left, Jack made his move."
                ),
                Article(
                    id = "6",
                    remark = Remark(
                        remark = "Good evening, dear friends... I just came for what was brought to you. Give it back and you will live for a very long time.",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "7",
                    remark = Remark(
                        remark = "But... we can't... sir",
                        name = "Cashier",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "8",
                    remark = Remark(
                        remark = "You probably didn't understand, pretty girl. Do you think you will become a hero if your brains end up on this wall?",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "9",
                    remark = Remark(
                        remark = "Don't... please...",
                        name = "Cashier",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "10",
                    remark = Remark(
                        remark = "Just give me the bars and we'll go about our business.",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "11",
                    remark = Remark(
                        remark = "Good... now...",
                        name = "Cashier",
                        color = RemarkColor.SECONDARY
                    )
                ),
                Article(
                    id = "12",
                    remark = Remark(
                        remark = "And no nonsense...",
                        name = "Jack"
                    )
                ),
                Article(
                    id = "13",
                    text = "The cashiers hesitated, but it was impossible to refuse Jack. He fired a warning shot, and they quickly obeyed, handing over bags of bullion."
                ),
                Article(
                    id = "14",
                    text = "Driving away, Jack couldn't shake the feeling of triumph. He committed another audacious robbery and got away with it again."
                ),
                Article(
                    id = "15",
                    text = "But he also knew that the law would pursue him harder than ever. He will have to be more careful, more cunning, if he wants to stay alive."
                ),
                Article(
                    id = "16",
                    text = "However, for Jack, it was all part of the game. He was a bandit, a scoundrel, and he liked the thrill of the chase. As long as he was alive, he knew that he would always live on the edge."
                ),
                Article(
                    id = "17",
                    text = "Having safely hidden the gold, Jack rode at full speed into the night, trying to stay as far away from the city as possible. He knew that the sheriff and his squad would be on his trail soon enough, but for now he was happy and proud of himself."
                ),
            )
        )
    ),
    currentPartId = "0",
    isRecommended = true
)