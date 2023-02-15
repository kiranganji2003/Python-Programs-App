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

public class CheckTheArrayHasUniqueValuesOrNot extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_the_array_has_unique_values_or_not);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Check the array has unique values or not";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array('i',[])\n" +
                "size = int(input(\"Enter array size :- \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "for i in range(size):\n" +
                "    arr.append(int(input()))\n" +
                "\n" +
                "flag = 0\n" +
                "\n" +
                "for i in range(size-1):\n" +
                "    for j in range(i+1,size):\n" +
                "        if arr[i]==arr[j]:\n" +
                "            flag = 1\n" +
                "\n" +
                "\n" +
                "if flag==0:\n" +
                "    print(\"Array has unique values\")\n" +
                "else:\n" +
                "    print(\"Array has not unique values\")";

        int[][] array_string_color = {{33,36},{58,80},{89,96},{102,112},{303,328},{346,375}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{115,118},{121,123},{177,180},{183,185},{205,208},{211,213},{239,241},{281,283},{330,334}};
        int[][] array_keyword_color_2 = {{48,51},{52,57},{83,88},{124,129},{152,155},{156,161},{186,191},{214,219},{297,302},{340,345}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{174,175},{197,198},{222,223},{277,278},{290,291}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter array size :- 5\n" +
                "Enter 5 elements\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "5\n" +
                "Array has not unique values";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FormLargestNumberFromGivenArray.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RotateArray.class);
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