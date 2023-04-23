package com.example.stories.android.feature.common.data.datasource.remote

import com.example.stories.android.feature.category.domain.model.Category
import com.example.stories.android.feature.common.data.datasource.remote.response.BaseResponse
import com.example.stories.android.feature.common.model.ResponseStory
import com.example.stories.android.feature.common.model.ResponseStoryContent
import com.example.stories.android.feature.common.model.Story
import com.example.stories.android.feature.process.domain.model.Article
import com.example.stories.android.feature.process.domain.model.Choice
import com.example.stories.android.feature.process.domain.model.StoryPart

internal class Service {

    private val storyReal1 = Story(
        id = "7",
        pictureUrl = "https://i.ibb.co/LkYYqvZ/Lyra.png",
        name = "Волшебница и ведьма: Битва за лес",
        categories = listOf(
            Category.NEW,
            Category.HORROR,
            Category.ADVENTURE,
            Category.FANTASY,
        ),
        storyParts = listOf(
            StoryPart(
                partId = "0",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Жители соседнего села стали жаловаться на странное поведение диких животных и испорченную колодезную воду, что вызывало лихорадку и бред. Дети просыпались от кошмаров, а охотники дрожали от страха от страшного воя, доносившегося из лесной чащи.\n" +
                                "Лира, юная волшебница, должна выяснить, что здесь происходит."
                    ),
                    Article(
                        id = "1",
                        text = "Пока она несет ответственность за этих людей, никто не может причинить им вред."
                    ),
                    Article(
                        id = "2",
                        text = "Войдя в лес, Лира начала чувствовать себя неловко, и ее инстинкты подсказывали ей, что что-то не так. Она углубилась в лес, и по мере ее продвижения признаки темной магии становились все сильнее."
                    ),
                    Article(
                        id = "3",
                        text = "Ветви деревьев, казалось, гнулись и корчились, словно живые, а воздух гудел от неестественной энергии.",
                        choices = listOf(
                            Choice(
                                title = "Что ожидает Лиру в чаще леса?",
                                nextStoryPartId = "1"
                            )
                        ),
                    ),
                )
            ),
            StoryPart(
                partId = "1",
                articles = listOf(
                    Article(
                        isOpen = true,
                        id = "0",
                        text = "Пока Лира шла, ветер доносил до нее странные шепотки, казалось, что за ней наблюдают. Обернувшись, Лира увидела убегающее от нее животное — оленя, глаза его были полны ужаса. Это было странно; обычно животные ее не боялись."
                    ),
                    Article(
                        id = "1",
                        text = "Все признаки указывали на то, что ведьма поселилась в этих окрестностях и практиковала темную магию, которая вызывала беспорядки. Их влияние отравляет все вокруг, и это неестественно для материального плана."
                    ),
                    Article(
                        id = "2",
                        text = "Пока Лира шла по тропе, она не могла избавиться от ощущения, что за ней наблюдают. Лира бросила взгляд через плечо, но не увидела ничего, кроме извивающихся деревьев и вездесущих теней."
                    ),
                    Article(
                        id = "3",
                        text = "За спиной громко хрустнула ветка, заставив ее подпрыгнуть. Лирп обернулась, поднимая руку, чтобы защитить себя, но там никого не было."
                    ),
                    Article(
                        id = "4",
                        choices = listOf(
                            Choice(
                                title = "Что же предпримет Лира?",
                                nextStoryPartId = "2"
                            )
                        ),
                        text = "Лира почувствовала, как по ее спине пробежал холодок. Она знала, что кто-то все еще был там, скрываясь в темноте. И она знала, что не будет в безопасности, пока они не будут изгнаны."
                    )
                ),
            ),
            StoryPart(
                partId = "2",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Лира знала, что ей нужно мыслить нестандартно, если она собирается найти ведьму. Когда Лира начала заклинание, она почувствовала, как сила разлилась по ее венам, участился пульс."
                    ),
                    Article(
                        id = "1",
                        text = "Магия начала светиться и мерцать в глазах Лиры, и яркий луч света вырвался из ее протянутой руки. Внезапно Лира почувствовала, что отрывается от земли, переносясь в разум лесных существ."
                    ),
                    Article(
                        id = "2",
                        text = "Она могла видеть их глазами, чувствовать их ощущения и слышать их мысли. Крылья птиц взмахивали в унисон, поднимая ее все выше и выше, пока она не увидела весь лес с высоты птичьего полета. Заклинание сработало, и с помощью существ Лира смогла обнаружить источник проклятия."
                    ),
                    Article(
                        id = "3",
                        text = "Она поблагодарила птиц и быстро направилась к своей цели, готовая расследовать и положить конец любой практике темной магии."
                    ),
                    Article(
                        id = "4",
                        text = "Пройдя несколько сотен метров, Лира почувствовала что-то другое. В воздухе витала новая энергия, по коже пробежали мурашки.\n" +
                                "Она следовала за чувством, ее сердце колотилось в груди. Тропинка вела ее глубже в лес, в самое сердце тьмы."
                    ),
                    Article(
                        id = "5",
                        choices = listOf(
                            Choice(
                                title = "С чем ей придется столкнуться?",
                                nextStoryPartId = "3"
                            )
                        ),
                        text = "Из глубины леса как будто доносились голоса, шепчущие темные и ужасные вещи. Она ускорила шаг, чувствуя нарастающий страх."
                    )
                ),
            ),
            StoryPart(
                partId = "3",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Выйдя на поляну посреди леса, Лира замерла на месте, увидев открывшееся перед ней ужасающее зрелище. Ведьма была пугающей."
                    ),
                    Article(
                        id = "1",
                        text = "Длинные спутанные волосы и скрученные рога, торчащие из головы. Ее кожа была болезненно бледной, а глаза темными и запавшими, как будто она заключила сделку с самим дьяволом."
                    ),
                    Article(
                        id = "2",
                        text = "Маленькие и большие сороконожки и другие насекомые, окружавшие ее, были столь же ужасны — их конечности отвратительно извивались, когда они ползали друг по другу, их острые шипы на хитиновых панцирях блестели в тусклом свете."
                    ),
                    Article(
                        id = "3",
                        text = "Но внимание Лиры привлек котел. Он был огромным, как минимум вдвое больше нее, и пузырился густой зеленоватой жидкостью."
                    ),
                    Article(
                        id = "4",
                        text = "Вонь, исходившая из котла, была тошнотворной, гнилой смесью гниющей плоти и чего-то еще более зловещего. Лира не могла не задаться вопросом, что за зелье варит ведьма в таком чудовищном сосуде."
                    ),
                    Article(
                        id = "5",
                        text = "Пока ведьма продолжала петь свою колыбельную, Лира заметила, что зелье начало менять цвет. Оно приобретал болезненно-фиолетовый оттенок, а черные шершни жужжали вокруг него яростнее, чем до этого."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "Нужен план...",
                                nextStoryPartId = "4"
                            )
                        ),
                        text = "Лира знала, что ей нужно действовать быстро, если она хочет остановить ведьму и положить конец любому зловещему заговору, который она замышляет."
                    )
                ),
            ),
            StoryPart(
                partId = "4",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Лира глубоко вздохнула и попыталась успокоить колотящееся сердце. Она знала, что ей нужно сосредоточиться и придумать план битвы, чтобы иметь шанс сразить ведьму. Но когда Лира взглянула на свою соперницу, то начала сомневаться в собственных силах."
                    ),
                    Article(
                        id = "1",
                        text = "Ведьма была могущественной волшебницей с многолетним опытом и знаниями. Лира, с другой стороны, была еще относительно новичком в мире магии. Как она могла надеяться победить кого-то столь искусного, как ведьма?"
                    ),
                    Article(
                        id = "2",
                        text = "Но потом Лира вспомнила, зачем она пришла сюда. Она боролась не только за себя, но и за безопасность всего леса. Она не могла позволить своим сомнениям взять верх над ней."
                    ),
                    Article(
                        id = "3",
                        text = "Сделав еще один глубокий вдох, Лира закрыла глаза и сосредоточилась на возможном плане, вспоминая все знания, которыми она обладала о чарах ведьмы и обычаях леса."
                    ),
                    Article(
                        id = "4",
                        text = "Лира открыла глаза, чувствуя вновь обретенное чувство решимости. Она решила сначала попытаться ослабить защиту ведьмы, используя серию ложных заклинаний. Если бы она смогла обмануть ведьму, то не оставила бы ей и шанса."
                    ),
                    Article(
                        id = "5",
                        text = "Но Лира знала, что ведьма коварна, и не могла позволить себе ослабить бдительность ни на мгновение. Ей придется быть начеку, готовой отразить любую атаку, которую ведьма может предпринять в ее сторону."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "К бою!",
                                nextStoryPartId = "5"
                            )
                        ),
                        text = "Быстро взвесив все за и против, Лира сделала шаг вперед, ее глаза встретились с глазами ведьмы. Две волшебницы стояли лицом друг к другу, каждая из них была готова бороться за свою жизнь. Воздух был пропитан магией."
                    )
                ),
            ),
            StoryPart(
                partId = "5",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Бой начался резко и яростно, оба противника прощупывали защиту друг друга и пытались обойти ее изощренными переплетениями. За цепочками молний последовали осколки от взрывающихся огненных шаров, которые подожгли траву и верхушки деревьев."
                    ),
                    Article(
                        id = "1",
                        text = "Проклятые существа обратились в пыль, когда по земле пронеслись разряды световой энергии, пытаясь поразить ведьму."
                    ),
                    Article(
                        id = "2",
                        text = "Каждый из бойцов пытался одержать верх."
                    ),
                    Article(
                        id = "3",
                        text = "Лира несколько раз была на грани поражения, едва избегая колдовских чар, которые, казалось, обрушивались на нее со всех сторон. Но ей удавалось сохранять концентрацию и оставаться начеку, уклоняясь и отражая удары собственной могущественной магией."
                    ),
                    Article(
                        id = "4",
                        text = "Ведьма была такой же свирепой, используя целый арсенал заклинаний, которых Лира никогда раньше не видела. Каждое заклинание было опаснее предыдущего, и мимо Лиры проносились черные клубы дыма, колдовского огня и осколков льда, угрожая лишить ее жизни."
                    ),
                    Article(
                        id = "5",
                        text = "Лира вкладывала всю свою энергию в каждое заклинание, напрягая разум и тело до предела. Она не могла позволить себе проиграть, не тогда, когда на карту были поставлены жизни людей."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "Где эта карга?..",
                                nextStoryPartId = "6"
                            )
                        ),
                        text = "Наконец, после очередной ослепляющей вспышки света, ведьма вскрикнула и исчезла в темноте. Лира не могла в это поверить. Она выиграла? Она огляделась, тяжело дыша, но ведьмы нигде не было видно."
                    )
                ),
            ),
            StoryPart(
                partId = "6",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Она не почувствовала эхо смерти ведьмы, что означало, что ведьма, вероятно, только что сбежала. Скорее всего, она забьется под корягу, чтобы снова собраться с силами, или, может быть, она покинет земной план, отправившись туда, где ей и место. По крайней мере, в ближайшие несколько месяцев она не появится в этой части леса."
                    ),
                    Article(
                        id = "1",
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
        currentPartId = "0",
        isRecommended = true
    )

    private val storyRealEn1 = Story(
        id = "7",
        pictureUrl = "https://i.ibb.co/LkYYqvZ/Lyra.png",
        name = "The Sorceress and the Witch: The Battle for the Forest",
        categories = listOf(
            Category.NEW,
            Category.HORROR,
            Category.ADVENTURE,
            Category.FANTASY,
        ),
        storyParts = listOf(
            StoryPart(
                partId = "0",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Residents of a neighboring village began to complain about the strange behavior of wild animals and spoiled well water, which caused fever and delirium. Children woke up from nightmares, and hunters trembled with fear from the terrible howling coming from the forest thicket.\n"+
                                "Lyra, the young sorceress, must find out what is going on here."
                    ),
                    Article(
                        id = "1",
                        text = "As long as she is responsible for these people, no one can harm them."
                    ),
                    Article(
                        id = "2",
                        text = "Entering the forest, Lyra began to feel uncomfortable, and her instincts told her that something was wrong. She went deeper into the forest, and as she progressed, the signs of dark magic became stronger."
                    ),
                    Article(
                        id = "3",
                        text = "The branches of the trees seemed to bend and writhe as if alive, and the air hummed with unnatural energy.",
                        choices = listOf(
                            Choice(
                                title = "What awaits Lyra in the thicket of the forest?",
                                nextStoryPartId = "1"
                            )
                        ),
                    ),
                )
            ),
            StoryPart(
                partId = "1",
                articles = listOf(
                    Article(
                        isOpen = true,
                        id = "0",
                        text = "While Lyra was walking, the wind carried strange whispers to her, it seemed that she was being watched. Turning around, Lyra saw an animal running away from her — a deer, his eyes were full of horror. It was strange; animals weren't usually afraid of her."
                    ),
                    Article(
                        id = "1",
                        text = "All signs pointed to the fact that the witch had settled in these surroundings and practiced dark magic, which caused riots. Their influence poisons everything around, and this is unnatural for the material plane."
                    ),
                    Article(
                        id = "2",
                        text = "While Lyra was walking along the trail, she could not get rid of the feeling that she was being watched. Lyra glanced over her shoulder, but saw nothing but twisting trees and ubiquitous shadows."
                    ),
                    Article(
                        id = "3",
                        text = "A branch cracked loudly behind her, making her jump. Lirp turned around, raising her hand to protect herself, but there was no one there."
                    ),
                    Article(
                        id = "4",
                        choices = listOf(
                            Choice(
                                title = "What will Lyra do?",
                                nextStoryPartId = "2"
                            )
                        ),
                        text = "Lyra felt a chill run down her spine. She knew that someone was still there, hiding in the dark. And she knew she wouldn't be safe until they were banished."
                    )
                ),
            ),
            StoryPart(
                partId = "2",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Lyra knew she needed to think outside the box if she was going to find a witch. When Lyra began the spell, she felt the power spread through her veins, her pulse quickened."
                    ),
                    Article(
                        id = "1",
                        text = "Magic began to glow and flicker in Lyra's eyes, and a bright ray of light burst out of her outstretched hand. Suddenly Lyra felt that she was lifting off the ground, being transported into the mind of forest creatures."
                    ),
                    Article(
                        id = "2",
                        text = "She could see through their eyes, feel their feelings and hear their thoughts. The wings of the birds flapped in unison, lifting her higher and higher, until she saw the whole forest from a bird's-eye view. The spell worked, and with the help of the creatures, Lyra was able to discover the source of the curse."
                    ),
                    Article(
                        id = "3",
                        text = "She thanked the birds and quickly headed for her goal, ready to investigate and put an end to any practice of dark magic."
                    ),
                    Article(
                        id = "4",
                        text = "After walking a few hundred meters, Lyra felt something different. There was a new energy in the air, goosebumps ran through my skin.\n"+
                                " She followed the feeling, her heart was pounding in her chest. The path led her deeper into the forest, into the heart of darkness."
                    ),
                    Article(
                        id = "5",
                        choices = listOf(
                            Choice(
                                title = "What will she have to face?",
                                nextStoryPartId = "3"
                            )
                        ),
                        text = "Voices seemed to come from the depths of the forest, whispering dark and terrible things. She quickened her pace, feeling a growing fear."
                    )
                ),
            ),
            StoryPart(
                partId = "3",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Coming out into a clearing in the middle of the forest, Lyra froze in place when she saw the terrifying sight that opened before her. The witch was frightening."
                    ),
                    Article(
                        id = "1",
                        text = "Long matted hair and twisted horns sticking out of the head. Her skin was painfully pale, and her eyes were dark and sunken, as if she had made a deal with the devil himself."
                    ),
                    Article(
                        id = "2",
                        text = "The small and large centipedes and other insects surrounding her were just as terrifying—their limbs wriggled hideously as they crawled over each other, their sharp spikes on chitinous shells glistening in the dim light."
                    ),
                    Article(
                        id = "3",
                        text = "But Lyra's attention was drawn to the cauldron. It was huge, at least twice her size, and bubbled with a thick greenish liquid."
                    ),
                    Article(
                        id = "4",
                        text = "The stench coming from the cauldron was a sickening, rotten mixture of rotting flesh and something even more sinister. Lyra couldn't help but wonder what kind of potion the witch was brewing in such a monstrous vessel."
                    ),
                    Article(
                        id = "5",
                        text = "While the witch continued to sing her lullaby, Lyra noticed that the potion began to change color. It was turning a sickly purple hue, and the black hornets were buzzing around it more fiercely than before."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "Need a plan...",
                                nextStoryPartId = "4"
                            )
                        ),
                        text = "Lyra knew she needed to act quickly if she wanted to stop the witch and put an end to any sinister plot she was plotting."
                    )
                ),
            ),
            StoryPart(
                partId = "4",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "Lyra took a deep breath and tried to calm her pounding heart. She knew that she needed to focus and come up with a battle plan to have a chance to defeat the witch. But when Lyra looked at her rival, she began to doubt her own abilities."
                    ),
                    Article(
                        id = "1",
                        text = "The witch was a powerful sorceress with many years of experience and knowledge. Lyra, on the other hand, was still relatively new to the world of magic. How could she hope to defeat someone as skilled as a witch?"
                    ),
                    Article(
                        id = "2",
                        text = "But then Lyra remembered why she came here. She fought not only for herself, but also for the safety of the entire forest. She couldn't let her doubts get the better of her."
                    ),
                    Article(
                        id = "3",
                        text = "Taking another deep breath, Lyra closed her eyes and focused on a possible plan, recalling all the knowledge she possessed about the witch's charms and the customs of the forest."
                    ),
                    Article(
                        id = "4",
                        text = "Lyra opened her eyes, feeling a newfound sense of determination. She decided to first try to weaken the witch's defenses by using a series of false spells. If she could deceive the witch, she wouldn't give her a chance."
                    ),
                    Article(
                        id = "5",
                        text = "But Lyra knew that the witch was insidious, and could not afford to relax her vigilance for a moment. She will have to be alert, ready to repel any attack that the witch may take in her direction."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "To fight!",
                                nextStoryPartId = "5"
                            )
                        ),
                        text = "After quickly weighing the pros and cons, Lyra took a step forward, her eyes met the witch's eyes. The two sorceresses were facing each other, each of them was ready to fight for their lives. The air was saturated with magic."
                    )
                ),
            ),
            StoryPart(
                partId = "5",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "The fight started abruptly and violently, both opponents probed each other's defense and tried to circumvent it with sophisticated weaves. The chains of lightning were followed by fragments from exploding fireballs that set fire to grass and tree tops."
                    ),
                    Article(
                        id = "1",
                        text = "The cursed creatures turned to dust when discharges of light energy swept across the earth, trying to hit the witch."
                    ),
                    Article(
                        id = "2",
                        text = "Each of the fighters tried to gain the upper hand."
                    ),
                    Article(
                        id = "3",
                        text = "Lyra was on the verge of defeat several times, barely avoiding the witchcraft spells that seemed to be falling on her from all sides. But she managed to keep her concentration and stay alert, dodging and deflecting blows with her own powerful magic."
                    ),
                    Article(
                        id = "4",
                        text = "The witch was just as ferocious, using a whole arsenal of spells that Lyra had never seen before. Each spell was more dangerous than the previous one, and black clouds of smoke, witch fire and ice fragments swept past Lyra, threatening to take her life."
                    ),
                    Article(
                        id = "5",
                        text = "Lyra put all her energy into each spell, straining her mind and body to the limit. She couldn't afford to lose, not when people's lives were at stake."
                    ),
                    Article(
                        id = "6",
                        choices = listOf(
                            Choice(
                                title = "Where is this hag?..",
                                nextStoryPartId = "6"
                            )
                        ),
                        text = "Finally, after another blinding flash of light, the witch screamed and disappeared into the darkness. Lyra couldn't believe it. Did she win? She looked around, breathing heavily, but the witch was nowhere to be seen."
                    )
                ),
            ),
            StoryPart(
                partId = "6",
                articles = listOf(
                    Article(
                        id = "0",
                        isOpen = true,
                        text = "She didn't feel the echo of the witch's death, which meant that the witch had probably just escaped. Most likely, she will hide under a snag to gather her strength again, or maybe she will leave the earth plane, going to where she belongs. At least, she won't appear in this part of the forest for the next few months."
                    ),
                    Article(
                        id = "1",
                        choices = listOf(
                            Choice(
                                title = "End"
                            )
                        ),
                        text = "Lyra made a barely noticeable gesture with her hand, and the huge copper cauldron tipped over, spilling the magic potion on the ground."
                    )
                ),
            ),
        ),
        currentPartId = "0",
        isRecommended = true
    )

    val storiesWithContentEn = listOf(
        storyElenaEn1,
        storyJoEn1,
        storyWillBeForgottenEn1,
        storySpaceEn1,
        storyLoveStoryEn1,
        storyNightRoadEn1,
        storyWildWestEn1,
        storyWithTheMundaneEn1,
        storyRealEn1
    )

    val storiesWithContentRu = listOf(
        storyJoRu1,
        storySpaceRu1,
        storyWildWestRu1,
        storyLoveStoryRu1,
        storyElenaRu1,
        storyWillBeForgottenRu1,
        storyNightRoadRu1,
        storyWithTheMundaneRu1,
        storyReal1
    )

    private val storiesRu = storiesWithContentRu.map { it.copy(storyParts = emptyList()) }

    private val storiesEn = storiesWithContentEn.map { it.copy(storyParts = emptyList()) }

    suspend fun getStories(): BaseResponse<List<ResponseStory>> {
        return BaseResponse(
            data = storiesRu.map {
                ResponseStory(
                    id = it.id,
                    pictureUrl = it.pictureUrl,
                    name = it.name,
                    categories = it.categories,
                    storyParts = it.storyParts,
                    isRecommended = it.isRecommended
                )
            },
            message = "Mock",
            localCode = 0
        )
    }

    suspend fun getStoryById(storyId: String): BaseResponse<ResponseStoryContent> {
        return BaseResponse(
            data = storiesWithContentRu.first { it.id == storyId }.let {
                ResponseStoryContent(
                    id = it.id,
                    pictureUrl = it.pictureUrl,
                    name = it.name,
                    categories = it.categories,
                    storyParts = it.storyParts,
                    isRecommended = it.isRecommended
                )
            },
            message = "Mock",
            localCode = 0
        )
    }
}