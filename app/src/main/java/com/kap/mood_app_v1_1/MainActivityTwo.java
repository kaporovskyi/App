package com.kap.mood_app_v1_1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button buttonBack;
    public TextView resultView;
    String[] wishes = {"если у тебя высокое содержание сахара в крови, помни, загорая на пляже, ты можешь слегка забродить.", "слишком долго выбирая пельмени в супермаркете можно обморозить себе лицо.", "регулярно занимайтесь сексом на природе, в кустах, есть шанс, потихоньку научиться фотосинтезировать", "делая фото-сессию в воде, следите, что бы именно в этот момент лосось не пошел нерест.", "если ты став на весы одной ногой, не имеешь возможности поставить на них вторую - пересмотри свой рацион.", "в Индии, если у девушки на лбу точка - то она замужем, или у снайпера ровное дыхание.", "на 90 лет подарите себе любимому огромный шерстяной ковер, шаркая по нему тапками можно подзаряжать свой кардиостимулятор.", "быть ребенком, как быть в тряпку пьяным. Все помнят что ты делал, а ты ничего. Кстати, дети - цветы жизни.", "сколько на человека не кричи, всё равно, ё@#уть — как-то надёжнее.", "ничто не удлиняет женские ножки так как дыба.", "пересекая границу, насыпьте немного чая в целлофан от пачки сигарет. Внеси лёгкий сумбур в обыденную жизнь таможни.", "вероятность выиграша в лотерею незначительно увеличится, если купить себе лотерейный билет.", "хочешь иметь стройное, красивое тело - оплати своей половинке фитнес.", "неси чушь бережно, стараясь не расплескать. Хороша только полная чушь.", "если советы не приносят тебе пользу - значит, ты не умеешь их давать.", "если у тебя на работе нет друзей, выбери самых талантливых сотрудников и начни над ними издеваться. Друзья не замедлят появиться.", "если не можешь иметь то, что хочешь — научись хотеть то, что имеешь.", "чтобы у любимого человека было много денег, перестаньте у него их отбирать.","у тебя сегодня все будет круто!", "ты ввел свое имя в ожидании того, что я тебе что-то отвечу?)", "да прибудет с тобой сила!", "хватит маяться дурью, сделай что-то полезное сегодня!", "возможно, ты скоро поимеешь чемодан бабла!", "у тебя неприятности на работе? А кому сейчас легко?)", "следи за сахаром, не переедай, занимайся спортом!", "чтобы не случилось в твоей жизни - запомни главное: не трухай и все делай уверенно!", "тебе тоже постоянно кажется, что за тобой наблюдают??? Выброси немедленно смартфон!", "не кури... Вообще не кури! Если куришь - брось! И не бухай! Так, выпивай... изредка)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_two);

        resultView = (TextView) findViewById(R.id.resultView);

        buttonBack = (Button) findViewById(R.id.buttonBack);

        assert buttonBack != null;
        buttonBack.setOnClickListener(this);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        buttonBack.setTypeface(custom_font);
        resultView.setTypeface(custom_font);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        String element = wishes[new Random().nextInt(wishes.length)];
        new Random().nextInt(wishes.length);


        if (name.equals("")){
            resultView.setText("ВАРАЮВОНАКИЛМИ?!");
        } else {
            resultView.setText(name + ", " + element);
        }
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonBack:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
