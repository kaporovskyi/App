package com.kap.mood_app_v1_1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText enterYourName;
    public Button buttonGo;
    public String getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        enterYourName = (EditText) findViewById(R.id.editText);
        buttonGo = (Button) findViewById(R.id.buttonGo);
        getName = enterYourName.getText().toString();

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        buttonGo.setTypeface(custom_font);
        enterYourName.setTypeface(custom_font);

        buttonGo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, MainActivityTwo.class);
        intent.putExtra("name", enterYourName.getText().toString());
        startActivity(intent);
    }
}
