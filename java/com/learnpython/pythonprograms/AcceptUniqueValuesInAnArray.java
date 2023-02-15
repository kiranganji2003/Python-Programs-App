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

public class AcceptUniqueValuesInAnArray extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept_unique_values_in_an_array);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Accept unique roll numbers in an array";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "size = int(input(\"Enter no. of students :- \"))\n" +
                "print(\"Enter roll no.s of {} students\".format(size))\n" +
                "roll = array(\"i\",[])\n" +
                "count = 0\n" +
                "while 1:\n" +
                "    if count==size:\n" +
                "        break\n" +
                "    no = int(input())\n" +
                "    if no not in roll:\n" +
                "        count += 1\n" +
                "        roll.append(no)\n" +
                "    else:\n" +
                "        print(\"Roll no\",no,\"is already entered\")\n" +
                "print(\"\\nRoll no.s =\",roll)";

        int[][] array_string_color = {{38,65},{74,106},{134,137},{307,316},{320,340},{348,349},{351,363}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{152,157},{165,167},{189,194},{221,223},{227,233},{287,291},{349,351}};
        int[][] array_keyword_color_2 = {{28,31},{32,37},{68,73},{301,306},{342,347}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{150,151},{158,159},{257,258}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter no. of students :- 10\n" +
                "Enter roll no.s of 10 students\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "4\n" +
                "Roll no 4 is already entered\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "7\n" +
                "Roll no 7 is already entered\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "\n" +
                "Roll no.s = array('i', [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckIfAStringIsSubstringOfAnother.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfNumbersFromXToY.class);
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

