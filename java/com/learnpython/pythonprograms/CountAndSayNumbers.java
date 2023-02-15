package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class CountAndSayNumbers extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_and_say_numbers);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Count no. of each digits in a array";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array('i',[])\n" +
                "size = int(input(\"Enter the size of the array :- \"))\n" +
                "print(\"Enter\",size,\"digits\")\n" +
                "\n" +
                "for i in range(size):\n" +
                "    inp = int(input()[0])\n" +
                "    arr.append(inp)\n" +
                "\n" +
                "one,two,three,four,five = 0,0,0,0,0\n" +
                "six,seven,eight,nine,zero = 0,0,0,0,0\n" +
                "\n" +
                "for i in arr:\n" +
                "    if i==1:\n" +
                "        one += 1\n" +
                "    elif i==2:\n" +
                "        two += 1\n" +
                "    elif i==3:\n" +
                "        three += 1\n" +
                "    elif i==4:\n" +
                "        four += 1\n" +
                "    elif i==5:\n" +
                "        five += 1\n" +
                "    elif i==6:\n" +
                "        six += 1\n" +
                "    elif i==7:\n" +
                "        seven += 1\n" +
                "    elif i==8:\n" +
                "        eight += 1\n" +
                "    elif i==9:\n" +
                "        nine += 1\n" +
                "    elif i==0:\n" +
                "         zero += 1\n" +
                "\n" +
                "\n" +
                "if one>0:\n" +
                "    print(\"One's :\",one)\n" +
                "if two>0:\n" +
                "    print(\"Two's :\",two)\n" +
                "if three>0:\n" +
                "    print(\"Three's :\",three)\n" +
                "if four>0:\n" +
                "    print(\"Four's :\",four)\n" +
                "if five>0:\n" +
                "    print(\"Five's :\",five)\n" +
                "if six>0:\n" +
                "    print(\"Six's :\",six)\n" +
                "if seven>0:\n" +
                "    print(\"Seven's :\",seven)\n" +
                "if eight>0:\n" +
                "    print(\"Eight's :\",eight)\n" +
                "if nine>0:\n" +
                "    print(\"Nine's :\",nine)\n" +
                "if zero>0:\n" +
                "    print(\"Zero's :\",zero)";

        int[][] array_string_color = {{33,36},{58,91},{100,107},{113,121},{633,642},{668,677},{705,716},{745,755},{783,793},{820,829},{857,868},{898,909},{938,948},{976,986}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{124,127},{130,132},{268,271},{274,276},{286,288},{316,320},{348,352},{382,386},{415,419},{448,452},{480,484},{514,518},{548,552},{581,585},{613,615},{648,650},{683,685},{724,726},{762,764},{800,802},{835,837},{876,878},{917,919},{955,957}};
        int[][] array_keyword_color_2 = {{48,51},{52,57},{94,99},{133,138},{156,159},{160,165},{627,632},{662,667},{699,704},{739,744},{777,782},{814,819},{851,856},{892,897},{932,937},{970,975}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{168,169},{219,220},{221,222},{223,224},{225,226},{227,228},{257,258},{259,260},{261,262},{263,264},{265,266},{292,293},{310,311},{324,325},{342,343},{356,357},{376,377},{390,391},{409,410},{423,424},{442,443},{456,457},{474,475},{488,489},{508,509},{522,523},{542,543},{556,557},{575,576},{589,590},{609,610},{620,621},{655,656},{692,693},{732,733},{770,771},{807,808},{844,845},{885,886},{925,926},{963,964}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
        output1 = "Enter the size of the array :- 10\n" +
                "Enter 10 digits\n" +
                "8\n" +
                "5\n" +
                "3\n" +
                "8\n" +
                "8\n" +
                "2\n" +
                "3\n" +
                "0\n" +
                "2\n" +
                "1\n" +
                "One's : 1\n" +
                "Two's : 2\n" +
                "Three's : 2\n" +
                "Five's : 1\n" +
                "Eight's : 3\n" +
                "Zero's : 1";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayPerfectSquareNumbersFromOneToN.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SeperateConsonantsAndVowelsFromString.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.share,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        if (item.getItemId() == R.id.share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python program");
            String shareMessage = "Program :- " + program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}