package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.Remark
import com.example.stories.android.feature.process.domain.model.RemarkColor
import com.example.stories.android.feature.process.domain.model.StoryPart

internal class Service {

    // Mock stories
    private val storyReal2 = Story(
        id = "succub",
        pictureUrl = "https://i.ibb.co/G3bZL8M/women.png",
        name = "Соблазнительные чары суккуба",
        categories = listOf(
            Category.NEW,
            Category.HORROR,
            Category.FANTASY
        ),
        storyParts = listOf(
            StoryPart(
                partId = "1",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Джек был человеком, который жил ночной жизнью. Его привлекали яркие огни и пульсирующие ритмы города после наступления темноты. Он работал в популярном баре, где проводил ночи, смешивая напитки и болтая с клиентами, все время наслаждаясь яркой энергией сцены."
                    ),
                    Article(
                        id = "2",
                        text = "Однажды вечером, когда он смешивал мартини, его внимание привлекла женщина. Она была высокой и эффектной, с темными волосами, которые волнами падали ей на спину. Ее глаза блестели, а обтягивающее черное платье мало оставляло простора для воображения. Она двигалась по клубу уверенно и грациозно, привлекая внимание. Джек был очарован ею."
                    ),
                    Article(
                        id = "3",
                        text = "Когда ночь подходила к концу, Джека тянуло к ней. Он наблюдал, как она потягивала свой напиток в тихой угловой кабинке, не сводя с него глаз. Он колебался мгновение, прежде чем решил подойти к ней, его сердце колотилось."
                    ),
                    Article(
                        id = "4",
                        remark = Remark(
                            remark = "Могу я предложить вам что-то?",
                            name = "Джек",
                            color = RemarkColor.FIRSTLY
                        )
                    ),
                    Article(
                        id = "5",
                        text = "Он пытался говорить уверенно, но она лишь слегка улыбнулась.",
                    ),
                    Article(
                        id = "6",
                        remark = Remark(
                            remark = "Думаю, ты уже знаешь, чего я хочу..",
                            name = "Незнакомка",
                            color = RemarkColor.SECONDARY
                        )
                    ),
                    Article(
                        id = "7",
                        text = "Джек почувствовал, как по его спине пробежали мурашки. Было в ней что-то, что он находил одновременно соблазнительным и пугающим, но он не мог устоять перед ее очарованием. Он налил ей выпить и сел напротив нее."
                    ),
                    Article(
                        id = "8",
                        text = "Пока они разговаривали, Джек обнаружил, что очарован ею. Казалось, она знала о нем все, все страхи и желания, которые он когда-либо испытывал. Он не мог избавиться от ощущения, что он был под ее чарами, потерянный в глубине ее завораживающего взгляда"
                    ),
                    Article(
                        id = "9",
                        text = "Женщина пригласила его на вечеринку в роскошный особняк на окраине города, обещая незабываемую ночь наслаждений и наслаждений."
                    ),
                    Article(
                        id = "10",
                        text = "Джеку не терпелось испытать все это, и он последовал за ней по роскошным залам и комнатам особняка, где красивые люди бездельничали, смеялись и погружались в атмосферу декаданса."
                    ),
                    Article(
                        id = "11",
                        text = "Вечер был сплошным потоком музыки, напитков и танцев. Джек чувствовал, что все больше и больше опьяняется чувственной энергией вечеринки, его сдержанность исчезала, когда он потакал каждой прихоти и желанию."
                    ),
                    Article(
                        id = "12",
                        text = "Когда наступила глубокая ночь, он словно выпал из полудремы и обнаружил себя в тускло освещенном переулке, где его ждала женщина."
                    ),
                    Article(
                        id = "13",
                        text = "Ее губы прижались к его губам, ее руки лихорадочно исследовали каждый дюйм его тела. Он знал, что в опасности, но не мог остановиться, захваченный неотразимым очарованием ее прикосновения."
                    ),
                    Article(
                        id = "14",
                        text = "Внезапно лицо женщины исказилось, превратившись в гротескную маску."
                    ),
                    Article(
                        id = "15",
                        text = "Ее глаза приобрели глубокий кроваво-красный оттенок, а зубы стали длинными и острыми, как у злого хищника."
                    ),
                    Article(
                        id = "16",
                        text = "Джек слишком поздно понял, что попал в лапы суккуба, демонического существа, питавшегося жизненной силой людей."
                    ),
                    Article(
                        id = "17",
                        text = "Он изо всех сил пытался вырваться, но ее хватка была слишком сильной, ее влечение слишком сильным. Она высосала из него самую суть, его энергию и жизненные силы, пока он не рухнул кучей на землю."
                    ),
                    Article(
                        id = "18",
                        text = "Джек проснулся на следующий день, чувствуя себя слабым и истощенным, его память была размытой, а тело болело. Он знал, что что-то не так, но не мог вспомнить, что произошло."
                    ),
                    Article(
                        id = "19",
                        text = "Все, что он знал, это то, что он был поглощен обольстительной и ужасающей силой, порождением ночи, которое охотилось на его желания и оставило ему оболочку его прежнего «я»."
                    ),
                    Article(
                        id = "20",
                        text = "Следующие несколько дней Джек провел в тумане, пытаясь собрать воедино события той ночи, которую он провел с суккубом. Он пытался стряхнуть с себя чувство слабости и истощения, которые мучили его, но оно, казалось, цеплялось за него, как тяжелый плащ."
                    ),
                    Article(
                        id = "21",
                        text = "Шли дни, и Джек начал замечать в себе изменения. Он чувствовал ненасытный голод не только по еде, но и по чему-то более первобытному и сильному."
                    ),
                    Article(
                        id = "22",
                        text = "Его чувства обострились, и он мог видеть и слышать то, чего раньше никогда не мог. И он почувствовал, как внутри него шевелится странная сила, сила, которую он не мог ни понять, ни контролировать."
                    ),
                    Article(
                        id = "23",
                        text = "Джек начал опасаться, что он уже не совсем человек, что его испортило прикосновение суккуба. Он пытался сопротивляться притяжению тьмы, которая теперь, казалось, окружала его, но это было похоже на борьбу с приливной волной."
                    ),
                    Article(
                        id = "24",
                        text = "Отчаянно нуждаясь в ответах, Джек разыскал женщину, которая, как он слышал, была провидицей, мистиком, способным видеть за завесой реальности. Провидец выслушал его рассказ, ее темные глаза пристально смотрели в его собственные."
                    ),
                    Article(
                        id = "25",
                        remark = Remark(
                            remark = "Вы были отмечены.. Суккуб оставила на тебе свой отпечаток, и теперь ты связан с ней. Ты уже не совсем человек, но ты еще и не порождение ночи. Твоя судьба по-прежнему в твоих руках",
                            name = "Мистик"
                        )
                    ),
                    Article(
                        id = "26",
                        text = "Джек знал, что ему нужно действовать быстро, если он хочет вырваться из лап суккуба. Он начал исследовать все, что мог найти о ночных существах, поглощая книги и статьи о вампирах, оборотнях и других сверхъестественных существах."
                    ),
                    Article(
                        id = "27",
                        text = "Наконец он нашел то, что искал — ритуал, который мог разорвать связь между ним и суккубом. Он собрал все необходимые ингредиенты и с помощью провидца провел ритуал при свете полной луны."
                    ),
                    Article(
                        id = "28",
                        text = "Когда последние слова ритуала эхом раздались в ночи, Джек почувствовал внезапное облегчение, груз свалился с его плеч. Он знал, что ему удалось разорвать связь между собой и суккубом."
                    ),
                    Article(
                        id = "29",
                        text = "С вновь обретенным чувством цели Джек покинул город в поисках новой жизни вдали от искушений и опасностей ночи. Он знал, что никогда не забудет тот опыт, который изменил его навсегда, но он был полон решимости двигаться вперед и найти способ жить с тьмой, которая теперь скрывалась внутри него."
                    )
                )
            )
        ),
        currentPartId = "1",
        isRecommended = true
    )
    private val storyReal1 = Story(
        id = "sorceress_and_witch",
        pictureUrl = "https://i.ibb.co/LkYYqvZ/Lyra.png",
        name = "Волшебница и ведьма: Битва за лес",
        categories = listOf(
            Category.NEW,
            Category.HORROR,
            Category.ADVENTURE,
            Category.FANTASY
        ),
        storyParts = listOf(
            StoryPart(
                partId = "1",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Жители соседнего села стали жаловаться на странное поведение диких животных и испорченную колодезную воду, что вызывало лихорадку и бред. Дети просыпались от кошмаров, а охотники дрожали от страха от страшного воя, доносившегося из лесной чащи.\n" +
                                "Лира, юная волшебница, должна выяснить, что здесь происходит."
                    ),
                    Article(
                        id = "2",
                        text = "Пока она несет ответственность за этих людей, никто не может причинить им вред."
                    ),
                    Article(
                        id = "3",
                        text = "Войдя в лес, Лира начала чувствовать себя неловко, и ее инстинкты подсказывали ей, что что-то не так. Она углубилась в лес, и по мере ее продвижения признаки темной магии становились все сильнее."
                    ),
                    Article(
                        id = "4",
                        text = "Ветви деревьев, казалось, гнулись и корчились, словно живые, а воздух гудел от неестественной энергии.",
                        choices = listOf(
                            Choice(
                                title = "Что ожидает Лиру в чаще леса?",
                                nextStoryPartId = "2"
                            )
                        ),
                    ),
                )
            ),
            StoryPart(
                partId = "2",
                articles = listOf(
                    Article(
                        isOpen = true,
                        id = "1",
                        text = "Пока Лира шла, ветер доносил до нее странные шепотки, казалось, что за ней наблюдают. Обернувшись, Лира увидела убегающее от нее животное — оленя, глаза его были полны ужаса. Это было странно; обычно животные ее не боялись."
                    ),
                    Article(
                        id = "2",
                        text = "Все признаки указывали на то, что ведьма поселилась в этих окрестностях и практиковала темную магию, которая вызывала беспорядки. Их влияние отравляет все вокруг, и это неестественно для материального плана."
                    ),
                    Article(
                        id = "3",
                        text = "Пока Лира шла по тропе, она не могла избавиться от ощущения, что за ней наблюдают. Лира бросила взгляд через плечо, но не увидела ничего, кроме извивающихся деревьев и вездесущих теней."
                    ),
                    Article(
                        id = "4",
                        text = "За спиной громко хрустнула ветка, заставив ее подпрыгнуть. Лирп обернулась, поднимая руку, чтобы защитить себя, но там никого не было."
                    ),
                    Article(
                        id = "5",
                        choices = listOf(
                            Choice(
                                title = "Что же предпримет Лира?",
                                nextStoryPartId = "3"
                            )
                        ),
                        text = "Лира почувствовала, как по ее спине пробежал холодок. Она знала, что кто-то все еще был там, скрываясь в темноте. И она знала, что не будет в безопасности, пока они не будут изгнаны."
                    )
                ),
            ),
            StoryPart(
                partId = "3",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Лира знала, что ей нужно мыслить нестандартно, если она собирается найти ведьму. Когда Лира начала заклинание, она почувствовала, как сила разлилась по ее венам, участился пульс."
                    ),
                    Article(
                        id = "2",
                        text = "Магия начала светиться и мерцать в глазах Лиры, и яркий луч света вырвался из ее протянутой руки. Внезапно Лира почувствовала, что отрывается от земли, переносясь в разум лесных существ."
                    ),
                    Article(
                        id = "3",
                        text = "Она могла видеть их глазами, чувствовать их ощущения и слышать их мысли. Крылья птиц взмахивали в унисон, поднимая ее все выше и выше, пока она не увидела весь лес с высоты птичьего полета. Заклинание сработало, и с помощью существ Лира смогла обнаружить источник проклятия."
                    ),
                    Article(
                        id = "4",
                        text = "Она поблагодарила птиц и быстро направилась к своей цели, готовая расследовать и положить конец любой практике темной магии."
                    ),
                    Article(
                        id = "5",
                        text = "Пройдя несколько сотен метров, Лира почувствовала что-то другое. В воздухе витала новая энергия, по коже пробежали мурашки.\n" +
                                "Она следовала за чувством, ее сердце колотилось в груди. Тропинка вела ее глубже в лес, в самое сердце тьмы."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "С чем ей придется столкнуться?",
                                nextStoryPartId = "4"
                            )
                        ),
                        text = "Из глубины леса как будто доносились голоса, шепчущие темные и ужасные вещи. Она ускорила шаг, чувствуя нарастающий страх."
                    )
                ),
            ),
            StoryPart(
                partId = "4",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Выйдя на поляну посреди леса, Лира замерла на месте, увидев открывшееся перед ней ужасающее зрелище. Ведьма была пугающей."
                    ),
                    Article(
                        id = "2",
                        text = "Длинные спутанные волосы и скрученные рога, торчащие из головы. Ее кожа была болезненно бледной, а глаза темными и запавшими, как будто она заключила сделку с самим дьяволом."
                    ),
                    Article(
                        id = "3",
                        text = "Маленькие и большие сороконожки и другие насекомые, окружавшие ее, были столь же ужасны — их конечности отвратительно извивались, когда они ползали друг по другу, их острые шипы на хитиновых панцирях блестели в тусклом свете."
                    ),
                    Article(
                        id = "4",
                        text = "Но внимание Лиры привлек котел. Он был огромным, как минимум вдвое больше нее, и пузырился густой зеленоватой жидкостью."
                    ),
                    Article(
                        id = "5",
                        text = "Вонь, исходившая из котла, была тошнотворной, гнилой смесью гниющей плоти и чего-то еще более зловещего. Лира не могла не задаться вопросом, что за зелье варит ведьма в таком чудовищном сосуде."
                    ),
                    Article(
                        id = "6",
                        text = "Пока ведьма продолжала петь свою колыбельную, Лира заметила, что зелье начало менять цвет. Оно приобретал болезненно-фиолетовый оттенок, а черные шершни жужжали вокруг него яростнее, чем до этого."
                    ),
                    Article(
                        id = "7",
                        choices = listOf(
                            Choice(
                                title = "Нужен план...",
                                nextStoryPartId = "5"
                            )
                        ),
                        text = "Лира знала, что ей нужно действовать быстро, если она хочет остановить ведьму и положить конец любому зловещему заговору, который она замышляет."
                    )
                ),
            ),
            StoryPart(
                partId = "5",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Лира глубоко вздохнула и попыталась успокоить колотящееся сердце. Она знала, что ей нужно сосредоточиться и придумать план битвы, чтобы иметь шанс сразить ведьму. Но когда Лира взглянула на свою соперницу, то начала сомневаться в собственных силах."
                    ),
                    Article(
                        id = "2",
                        text = "Ведьма была могущественной волшебницей с многолетним опытом и знаниями. Лира, с другой стороны, была еще относительно новичком в мире магии. Как она могла надеяться победить кого-то столь искусного, как ведьма?"
                    ),
                    Article(
                        id = "3",
                        text = "Но потом Лира вспомнила, зачем она пришла сюда. Она боролась не только за себя, но и за безопасность всего леса. Она не могла позволить своим сомнениям взять верх над ней."
                    ),
                    Article(
                        id = "4",
                        text = "Сделав еще один глубокий вдох, Лира закрыла глаза и сосредоточилась на возможном плане, вспоминая все знания, которыми она обладала о чарах ведьмы и обычаях леса."
                    ),
                    Article(
                        id = "5",
                        text = "Лира открыла глаза, чувствуя вновь обретенное чувство решимости. Она решила сначала попытаться ослабить защиту ведьмы, используя серию ложных заклинаний. Если бы она смогла обмануть ведьму, то не оставила бы ей и шанса."
                    ),
                    Article(
                        id = "6",
                        text = "Но Лира знала, что ведьма коварна, и не могла позволить себе ослабить бдительность ни на мгновение. Ей придется быть начеку, готовой отразить любую атаку, которую ведьма может предпринять в ее сторону."
                    ),
                    Article(
                        id = "7",
                        choices = listOf(
                            Choice(
                                title = "К бою!",
                                nextStoryPartId = "6"
                            )
                        ),
                        text = "Быстро взвесив все за и против, Лира сделала шаг вперед, ее глаза встретились с глазами ведьмы. Две волшебницы стояли лицом друг к другу, каждая из них была готова бороться за свою жизнь. Воздух был пропитан магией."
                    )
                ),
            ),
            StoryPart(
                partId = "6",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Бой начался резко и яростно, оба противника прощупывали защиту друг друга и пытались обойти ее изощренными переплетениями. За цепочками молний последовали осколки от взрывающихся огненных шаров, которые подожгли траву и верхушки деревьев."
                    ),
                    Article(
                        id = "2",
                        text = "Проклятые существа обратились в пыль, когда по земле пронеслись разряды световой энергии, пытаясь поразить ведьму."
                    ),
                    Article(
                        id = "3",
                        text = "Каждый из бойцов пытался одержать верх."
                    ),
                    Article(
                        id = "4",
                        text = "Лира несколько раз была на грани поражения, едва избегая колдовских чар, которые, казалось, обрушивались на нее со всех сторон. Но ей удавалось сохранять концентрацию и оставаться начеку, уклоняясь и отражая удары собственной могущественной магией."
                    ),
                    Article(
                        id = "5",
                        text = "Ведьма была такой же свирепой, используя целый арсенал заклинаний, которых Лира никогда раньше не видела. Каждое заклинание было опаснее предыдущего, и мимо Лиры проносились черные клубы дыма, колдовского огня и осколков льда, угрожая лишить ее жизни."
                    ),
                    Article(
                        id = "6",
                        text = "Лира вкладывала всю свою энергию в каждое заклинание, напрягая разум и тело до предела. Она не могла позволить себе проиграть, не тогда, когда на карту были поставлены жизни людей."
                    ),
                    Article(
                        id = "7",
                        choices = listOf(
                            Choice(
                                title = "Где эта карга?..",
                                nextStoryPartId = "7"
                            )
                        ),
                        text = "Наконец, после очередной ослепляющей вспышки света, ведьма вскрикнула и исчезла в темноте. Лира не могла в это поверить. Она выиграла? Она огляделась, тяжело дыша, но ведьмы нигде не было видно."
                    )
                ),
            ),
            StoryPart(
                partId = "7",
                articles = listOf(
                    Article(
                        id = "1",
                        isOpen = true,
                        text = "Она не почувствовала эхо смерти ведьмы, что означало, что ведьма, вероятно, только что сбежала. Скорее всего, она забьется под корягу, чтобы снова собраться с силами, или, может быть, она покинет земной план, отправившись туда, где ей и место. По крайней мере, в ближайшие несколько месяцев она не появится в этой части леса."
                    ),
                    Article(
                        id = "2",
                        choices = listOf(
                            Choice(
                                title = "Конец"
                            )
                        ),
                        text = "Лира сделала еле заметный жест рукой, и огромный медный котел опрокинулся, расплескав колдовское зелье на землю."
                    )
                ),
            ),
        ),
        currentPartId = "1",
        isRecommended = true
    )

    private val story1 = Story(
        id = "1",
        pictureUrl = "https://www.emojiall.com/en/svg-to-png/twitter/1920/1f7e6.png",
        name = "Белый Бим",
        categories = listOf(
            Category.NEW,
            Category.COMEDY,
            Category.ADVENTURE
        ),
        storyParts = listOf(
            StoryPart(
                partId = "1",
                articles = listOf(
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        isOpen = true,
                        id = "1"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "2"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "3"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "4"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "5"
                    ),
                    Article(
                        text = "«Вы обратили внимание на совет Ланигана?»–" +
                                " Комиссар быстро отсчитал своими толстыми, коротенькими, напоминающими" +
                                " сардельки пальцами пять шиллингов и положил их на столешницу»",
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "Продолжить_2",
                                nextStoryPartId = "2"
                            ),
                            Choice(
                                title = "Продолжить_3",
                                nextStoryPartId = "3"
                            )
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "2",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "2"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "3"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "4"
                    ),
                    Article(
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(
                                title = "Продолжить_3",
                                nextStoryPartId = "3"
                            ),
                            Choice(
                                title = "Продолжить_4",
                                nextStoryPartId = "4"
                            ),
                            Choice(title = "Конец")
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "3",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "2"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "3"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "4"
                    ),
                    Article(
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(
                                title = "Продолжить_4",
                                nextStoryPartId = "4"
                            )
                        )
                    )
                ),
            ),
            StoryPart(
                partId = "4",
                articles = listOf(
                    Article(
                        id = "1",
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь",
                        isOpen = true
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "2"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "3"
                    ),
                    Article(
                        text = "«Что же, сэр Уинстон?»– Старик вопросительно изогнул бровь.\n– «Мистер О’Хара," +
                                " я вас попрошу… Присядьте вон там, у письменных принадлежностей," +
                                " и напишите расписку, что получили от меня крону за выполненную для полиции" +
                                " Дубровлина работу. Деньги – вот. Так что скажете, сэр Эндрю?»",
                        id = "4"
                    ),
                    Article(
                        id = "5",
                        text = "«Вы обратили внимание на совет Ланигана?»–",
                        choices = listOf(
                            Choice(title = "Конец")
                        )
                    )
                ),
            )
        ),
        currentPartId = "1"
    )

    private val story2 = story1.copy(
        id = "2",
        name = "Ведьмак",
        categories = listOf(
            Category.NEW,
            Category.FANTASY,
            Category.ADVENTURE
        ),
        isRecommended = true
    )

    private val story3 = story1.copy(
        id = "3",
        name = "Лето в пионерском галстуке",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.ROMANTIC
        ),
        isRecommended = true
    )

    private val story4 = story1.copy(
        id = "4",
        name = "Трус, Балбес и Бывалый",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.COMEDY
        )
    )

    private val story5 = story1.copy(
        id = "5",
        name = "Шерлок Холмс и Доктор Кто",
        categories = listOf(
            Category.NEW,
            Category.ADVENTURE,
            Category.DETECTIVE
        ),
        isRecommended = true
    )

    private val storiesWithContent = listOf(
        story1,
        story2,
        story3,
        story4,
        story5,
        storyReal1,
        storyReal2
    )

    private val stories = listOf(
        story1,
        story2,
        story3,
        story4,
        story5,
        storyReal1,
        storyReal2
    ).map {
        it.copy(
            storyParts = emptyList()
        )
    }

    suspend fun getStories(): List<Story> {
        return stories
    }

    suspend fun getStoryWithContent(storyId: String): Story {
        return storiesWithContent.first { it.id == storyId }
    }
}