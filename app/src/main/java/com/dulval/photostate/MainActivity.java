package com.dulval.photostate;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnAddPhoto, titlePage, subtitlePage;
    Button btnPagePhoto, btnPageChat;
    View dotMenu;
    ImageView icStates;
    Animation bt, btTwo, imgbBounce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = AnimationUtils.loadAnimation(this, R.anim.bt);
        btTwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        imgbBounce = AnimationUtils.loadAnimation(this, R.anim.imgbounce);

        btnAddPhoto = findViewById(R.id.btnaddphoto);
        btnAddPhoto.setPaintFlags(btnAddPhoto.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        titlePage = findViewById(R.id.titlepage);
        subtitlePage = findViewById(R.id.subtitlepage);

        btnPagePhoto = findViewById(R.id.btnpagephoto);
        btnPageChat = findViewById(R.id.btnpagechat);

        dotMenu = findViewById(R.id.dotmenu);

        icStates = findViewById(R.id.icstates);

        btnPageChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icStates.setBackgroundResource(R.drawable.icchat);
                titlePage.setText("No One Chat");
                subtitlePage.setText("Build a circle that impact society");

                btnAddPhoto.setText("Add Friend");
                btnAddPhoto.setTextColor(Color.parseColor("#0F5F7D"));
                //pass animation here
                icStates.startAnimation(imgbBounce);
                titlePage.startAnimation(bt);
                subtitlePage.startAnimation(bt);
                btnAddPhoto.startAnimation(btTwo);

                //outra animaçao + image
                btnPageChat.setBackgroundResource(R.drawable.icmsgan);
                btnPagePhoto.setBackgroundResource(R.drawable.iccamun);

                btnPagePhoto.animate().scaleY(0.7f).scaleX(0.7f).setDuration(350).start();
                btnPageChat.animate().scaleY(1).scaleX(1).setDuration(350).start();
                dotMenu.animate().translationX(580).setDuration(350).setStartDelay(100).start();

            }
        });


        btnPagePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icStates.setBackgroundResource(R.drawable.icphotos);
                titlePage.setText("No Photo");
                subtitlePage.setText("Add a picture for you circle");

                btnAddPhoto.setText("Add Photo");
                btnAddPhoto.setTextColor(Color.parseColor("#706AC9"));
                //pass animation here
                icStates.startAnimation(imgbBounce);
                titlePage.startAnimation(bt);
                subtitlePage.startAnimation(bt);
                btnAddPhoto.startAnimation(btTwo);

                btnPageChat.setBackgroundResource(R.drawable.icmsgun);
                btnPagePhoto.setBackgroundResource(R.drawable.iccaman);

                btnPageChat.animate().scaleY(0.7f).scaleX(0.7f).setDuration(350).start();
                btnPagePhoto.animate().scaleY(1).scaleX(1).setDuration(350).start();
                dotMenu.animate().translationX(0).setDuration(350).setStartDelay(100).start();

            }
        });

    }
}
