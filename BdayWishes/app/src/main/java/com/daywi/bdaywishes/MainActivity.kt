package com.daywi.bdaywishes

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.daywi.bdaywishes.ConstantsForInfo.INFO_ID_EXTRA
import com.daywi.bdaywishes.ConstantsForInfo.infoList
import com.daywi.bdaywishes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),ClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Man 1 Women 2
        when(intent.getIntExtra("GVM-mode", 0)) {
            1 -> informalMen()
            2 -> informalWomen()
            else ->  Log.d(TAG, "Intent Gender No available")
        }

        // 1 Formal 2 Informal
        when(intent.getIntExtra("GVM-type", 0)) {
            1 -> informalMen()
            2 -> informalWomen()
            else ->  Log.d(TAG, "Intent Style No available")
        }
        //descriptionInfo()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(infoList, mainActivity)
        }
    }

    override fun onClick(info: Info) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(INFO_ID_EXTRA, info.id)
        startActivity(intent)
    }

    private fun informalMen() {
        val manWishes1 = Info(
            R.drawable.confetti,
            "В прозе ",
            "В этот день хочу пожелать, чтобы ты был счастлив!",
            "В этот день хочу пожелать, чтобы ты был счастлив! Чтобы вокруг тебя были те люди, которые тебя уважают, ценят, которые всегда смогут поддержать тебя и помочь." +
                    " Чтобы работа и твое дело приносило удовольствие и, конечно, много денег. Чтобы ты находил время для себя. Чтобы жизнь была полна эмоциями. Живи, люби, рискуй. С днем рождения!\n" +
                    "\n"
        )
        val manWishes2 = Info(
            R.drawable.balloon,
            "В прозе ",
            "С днем рождения! Крепкого здоровья тебе, успехов",
            "С днем рождения! Крепкого здоровья тебе, успехов, оставайся всегда на волне позитиве. " +
                    "Пусть каждый новый день приносит интересные эмоции, желаю чудесных моментов, исполнения мечты! " +
                    "Достатка, независимости и мирного неба!\n" + "\n"
        )
        val manWishes3 = Info(
            R.drawable.balloons,
            "В прозе ",
            "Дружище, с днем рождения тебя!",
            "Дружище, с днем рождения тебя! Будь всегда на позитиве. Радуйся каждый день, наслаждайся мелочами, " +
                    "стремись к своим мечтам и всегда дари добро. Пусть у тебя будет порядок в делах и лад в личной жизни. " +
                    "Достатка, независимости и крепкого здоровья!\n"
        )
        val manWishes4 = Info(
            R.drawable.birthday,
            "В прозе ",
            "\"От всей души поздравляю тебя с днем рождения!",
            "От всей души поздравляю тебя с днем рождения! Пусть твой личный праздник принесет удачу, счастье и здоровье!" +
                    " Желаю, чтобы тебя окружали только достойные люди, все цели достигались и финансы росли!\n" +
                    "\n"
        )
        val manWishes5 = Info(
            R.drawable.birthdaycake,
            "В прозе ",
            "С днем рождения, дружище!",
            "С днем рождения, дружище! Счастья, здоровья, терпения, целеустремленности, чудесного настроения. " +
                    "Пусть удача всегда будет на твоей стороне. Деньги греби лопатой, ломай все преграды на пути к цели. " +
                    "Оставайся всегда таким же веселым и хорошим другом.\n" +
                    "\n"
        )
        val manWishes6 = Info(
            R.drawable.cake,
            "В прозе ",
            "Не обращай внимание на внешний стресс, будь сильным, стабильным",
            "Не обращай внимание на внешний стресс, будь сильным, стабильным и счастливым человеком, со своей " +
                    "изюминкой и смыслом жизни. Покори все вершины, исполни все мечты, добейся всех целей и будь на одной " +
                    "волне с самим собой.\n"
        )
        val manWishes7 = Info(
            R.drawable.confetti,
            "В прозе ",
            "Другу",
            "Поздравляю тебя с днем рождения, хочу пожелать тебе счастья, веселых встреч, крепкого здоровья." +
                    " Пусть удача сопутствует тебе и все складывается в твою пользу.\n" +
                    "\n"
        )
        val manWishes8 = Info(
            R.drawable.balloon,
            "В прозе ",
            "В твой день рождения хочу пожелать тебе здоровья",
            "В твой день рождения хочу пожелать тебе здоровья, финансового благополучия, любви, счастья и свободы" +
                    " в твоих мечтаниях. Вечной молодости, оригинальных идей и большого успеха во всем, что ты делаешь! " +
                    "Будь счастлив и оставайся собой, что бы ни случилось.\n" +
                    "\n"
        )
        val manWishes9 = Info(
            R.drawable.confetti,
            "В прозе ",
            "Я желаю тебе достичь всего, чего захочешь.",
            "Я желаю тебе достичь всего, чего захочешь. И пусть тебе на осуществление всех желаний хватит здоровья, денег и удачи!\n"
        )
        infoList.add(manWishes1)
        infoList.add(manWishes2)
        infoList.add(manWishes3)
        infoList.add(manWishes4)
        infoList.add(manWishes5)
        infoList.add(manWishes6)
        infoList.add(manWishes7)
        infoList.add(manWishes8)
        infoList.add(manWishes9)
    }

    private fun informalWomen() {
        val womenWishes1 = Info(
            R.drawable.balloon,
            "Подруге",
            "Моя дорогая, искренне поздравляю тебя с днем рождения.",
            "Моя дорогая, искренне поздравляю тебя с днем рождения. Будь счастлива, с годами только хорошей, всегда чувствуй себя нужной. Пусть тебя окружает любовь, внимание и забота. Желаю крепкого здоровья, много улыбок, энергии, невероятных событий и светлых воспоминаний. Этот день только твой!\n"
        )
        val womenWishes2 = Info(
            R.drawable.balloons,
            "Подруге",
            "Дорогая моя, с праздником тебя, с днем рождения!",
            "Дорогая моя, с праздником тебя, с днем рождения! Оставайся таким же ярким, общительным и чутким человеком. Пусть жизнь твоя будет полна любви, заботы, невероятных приключений и чудесных эмоций. Будь счастлива!"
        )
        val womenWishes3 = Info(
            R.drawable.birthday,
            "Подруге",
            "Ну что, моя хорошая, вот и настал тот день",
            "Ну что, моя хорошая, вот и настал тот день, в который ты когда-то появилась на свет. Пусть праздник будет не только сегодня, но и каждый день. Радуйся, люби и будь любима, наслаждайся каждым днем, каждым моментом. Будь самой счастливой на этой планете. Пусть все боли, обиды, негатив обходят тебя стороной. С днем рождения, подруга!"
        )
        val womenWishes4 = Info(
            R.drawable.birthdaycake,
            "Подруге",
            "Моя любимая подруга, поздравляю тебя с днем рождения!",
            "Моя любимая подруга, поздравляю тебя с днем рождения! Для тебя я желаю только самого лучшего. Пусть у тебя в жизни будет всё, что ты пожелаешь, и будут достигнуты все поставленные цели. Большого тебе счастья и самого крепкого здоровья."
        )
        val womenWishes5 = Info(
            R.drawable.cake,
            "Подруге",
            "Дорогая, поздравляю тебя с днем рождения!",
            "Дорогая, поздравляю тебя с днем рождения! В этот праздник желаю тебе здоровья, красоты, истинного женского счастья и пусть удача следует за тобой по пятам. Оставайся всегда таким же прекрасным человеком. Будь счастлива!\n"
        )
        val womenWishes6 = Info(
            R.drawable.confetti,
            "Подруге",
            "Дорогая, поздравляю тебя с днем рождения!",
            "Дорогая, поздравляю тебя с днем рождения! В этот праздник желаю тебе здоровья, красоты, истинного женского счастья и пусть удача следует за тобой по пятам. Оставайся всегда таким же прекрасным человеком. Будь счастлива!\n"
        )
        val womenWishes7 = Info(
            R.drawable.balloons,
            "Подруге",
            "Дорогая моя подруга, поздравляю тебя с днем рождения!",
            "Дорогая моя подруга, поздравляю тебя с днем рождения! Желаю, чтоб все твои мечты обязательно исполнялись, а в жизни было много поводов для веселья и радости. Пусть каждый день будет счастливым и особенным, в душе царит гармония, а в сердце господствует любовь!\n"
        )

        infoList.add(womenWishes1)
        infoList.add(womenWishes2)
        infoList.add(womenWishes3)
        infoList.add(womenWishes4)
        infoList.add(womenWishes5)
        infoList.add(womenWishes6)
        infoList.add(womenWishes7)
    }
}