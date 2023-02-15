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

public class FindTheRatioOfElementsThatArePositiveNegativeAndZero extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_ratio_of_elements_that_are_positive_negative_and_zero);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Given an integer array find the ratio of elements that are positive, negative, and zero";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array(\"i\",[])\n" +
                "size = int(input(\"Enter array size :- \"))\n" +
                "\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "for i in range(size):\n" +
                "    arr.append(int(input()))\n" +
                "\n" +
                "\n" +
                "positive,negative,zero = 0,0,0\n" +
                "\n" +
                "for i in arr:\n" +
                "    if i>0:\n" +
                "        positive += 1\n" +
                "    elif i<0:\n" +
                "        negative += 1\n" +
                "    else:\n" +
                "        zero += 1\n" +
                "\n" +
                "print(arr)\n" +
                "print(\"Positive elements ratio :-\",positive/size*100)\n" +
                "print(\"Negative elements ratio :-\",negative/size*100)\n" +
                "print(\"Zero elements ratio :-\",zero/size*100)";

        int[][] array_string_color = {{33,36},{58,80},{90,97},{103,113},{330,358},{384,412},{438,462}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{115,118},{121,123},{200,203},{206,208},{218,220},{252,256},{288,292}};
        int[][] array_keyword_color_2 = {{48,51},{52,57},{84,89},{124,129},{152,155},{156,161},{313,318},{324,329},{378,383},{432,437}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{193,194},{195,196},{197,198},{223,224},{246,247},{259,260},{282,283},{310,311},{373,376},{427,430},{473,476}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter array size :- 10\n" +
                "Enter 10 elements\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "0\n" +
                "-3\n" +
                "-5\n" +
                "-2\n" +
                "0\n" +
                "9\n" +
                "8\n" +
                "array('i', [4, 6, 8, 0, -3, -5, -2, 0, 9, 8])\n" +
                "Positive elements ratio :- 50.0\n" +
                "Negative elements ratio :- 30.0\n" +
                "Zero elements ratio :- 20.0";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),TimeConversion.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DiagonalDifferenceOfMatrix.class);
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