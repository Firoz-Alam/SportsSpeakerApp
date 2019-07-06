package com.example.lenovo.sportsspeakerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing,imgKickBoxing,imgJudo,imgKarate,imgAikido,imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);
    }

    @Override
    public void onClick(View imgButtonView) {
        switch (imgButtonView.getId()){

            case R.id.imgBoxing:
                playSportsName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportsName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportsName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportsName(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido:
                playSportsName(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportsName(imgTaekwondo.getTag().toString());
                break;
        }
    }

    private void playSportsName(String sportName){
        MediaPlayer sportPlayer = MediaPlayer.create(this,getResources().getIdentifier
                (sportName,"raw",getPackageName()));

        sportPlayer.start();
    }
}
