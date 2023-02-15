package com.learnpython.pythonprograms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;


import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class

MainActivity extends AppCompatActivity {

    Animation anim1,anim2,anim3,anim4,anim5,anim6,anim7,anim8,anim9,anim10,anim11,anim12,anim13,anim14;
    private static final int TIME_INTERVAL = 2000;
    private long backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        CardView card1 = findViewById(R.id.cardview1);
        CardView card2 = findViewById(R.id.cardview2);
        CardView card3 = findViewById(R.id.cardview3);
        CardView card4 = findViewById(R.id.cardview4);
        CardView card5 = findViewById(R.id.cardview5);
        CardView card6 = findViewById(R.id.cardview6);
        CardView card7 = findViewById(R.id.cardview7);
        CardView card8 = findViewById(R.id.cardview8);
        CardView card9 = findViewById(R.id.cardview9);
        CardView card10 = findViewById(R.id.cardview10);
        CardView card11 = findViewById(R.id.cardview11);
        CardView card12 = findViewById(R.id.cardview12);
        CardView card13 = findViewById(R.id.cardview13);
        CardView card14 = findViewById(R.id.cardview14);

        anim1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim6 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim7 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim8 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim9 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim10 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim11 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim12 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim13 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
        anim14 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);

        card1.setOnClickListener(v -> {
            card1.startAnimation(anim1);
            Intent i = new Intent(getApplicationContext(),PythonBasics.class);
            startActivity(i);
        });
        card2.setOnClickListener(v -> {
            card2.startAnimation(anim2);
            Intent i = new Intent(getApplicationContext(),PythonFunctionsBanner.class);
            startActivity(i);
        });
        card3.setOnClickListener(v -> {
            card3.startAnimation(anim3);
            Intent i = new Intent(getApplicationContext(),ClassesAndObjectsBanner.class);
            startActivity(i);
        });
        card4.setOnClickListener(v -> {
            card4.startAnimation(anim4);
            Intent i = new Intent(getApplicationContext(),ModulesBanner.class);
            startActivity(i);
        });
        card5.setOnClickListener(v -> {
            card5.startAnimation(anim5);
            Intent i = new Intent(getApplicationContext(),PythonExceptionHandlingBanner.class);
            startActivity(i);
        });
        card6.setOnClickListener(v -> {
            card6.startAnimation(anim6);
            Intent i = new Intent(getApplicationContext(),PythonFileHandlingBanner.class);
            startActivity(i);
        });
        card7.setOnClickListener(v -> {
            card7.startAnimation(anim7);
            Intent i = new Intent(getApplicationContext(),ProgramsBanner.class);
            startActivity(i);
        });
        card8.setOnClickListener(v -> {
            card8.startAnimation(anim8);
            Intent i = new Intent(getApplicationContext(),PythonPatternsBanner.class);
            startActivity(i);
        });
        card9.setOnClickListener(v -> {
            card9.startAnimation(anim9);
            Intent i = new Intent(getApplicationContext(),ProjectsBanner.class);
            startActivity(i);
        });
        card10.setOnClickListener(v -> {
            card10.startAnimation(anim10);
            Intent intent = new Intent(getApplicationContext(),QuizBanner.class);
            startActivity(intent);
        });
        card11.setOnClickListener(v -> {
            card11.startAnimation(anim11);
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        });
        card12.setOnClickListener(v -> {
            card12.startAnimation(anim12);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:infopythonprograms@gmail.com"));
            startActivity(intent);
        });
        card13.setOnClickListener(v -> {
            card13.startAnimation(anim13);
            Intent i = new Intent(getApplicationContext(),PrivacyPolicy.class);
            startActivity(i);
        });
        card14.setOnClickListener(v -> {
            card14.startAnimation(anim14);
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,"Download Python Programming App");
            String shareMessage = "Download this Python programming app\n" +
                    "\n" +
                    "Features of this Python programming app \n" +
                    "\n* 250+ Python programs\n" +
                    "* Provides python projects\n" +
                    "* Enhance skills with python quizzes\n" +
                    "* Search programs and projects\n" +
                    "* Share programs and projects\n" +
                    "* Improve logical thinking by python patterns\n"+
                    "* Simple UI (User Interface)\n"+
                    "\nGet it from Google Play Store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share app via"));
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed(){
        if (backPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
        }
        else {
            Toast.makeText(this, "Press Back Again to Exit", Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();
    }
}