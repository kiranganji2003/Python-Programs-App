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

public class DisplayArmstrongNumbersBetweenOneToN extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_armstrong_numbers_between_one_to_n);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Display armstrong numbers between 1 to N";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "n = int(input(\"Enter the value of N :- \"))\n" +
                "print(\"Armstrong numbers between 1 to\",n,\"\\n\")\n" +
                "\n" +
                "for i in range(1,n+1):\n" +
                "    j = i\n" +
                "    cube_of_digits = 0\n" +
                "    while j>0:\n" +
                "        rem = j%10\n" +
                "        cube_of_digits = cube_of_digits + rem*rem*rem    \n" +
                "        j = j//10\n" +
                "    if cube_of_digits==i:\n" +
                "        print(i)";

        int[][] array_string_color = {{14,40},{49,81},{84,85},{87,88}};
        int[][] array_keyword_color_1 = {{85,87},{91,94},{97,99},{151,156},{261,263}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{43,48},{100,105},{291,296}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{106,107},{110,111},{145,146},{159,160},{178,180},{254,256}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the value of N :- 1000\n" +
                "Armstrong numbers between 1 to 1000 \n" +
                "\n" +
                "1\n" +
                "153\n" +
                "370\n" +
                "371\n" +
                "407";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayFirstNumberWhoseSumOfDigitsIsEqualToK.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),KthSmallestElementInList.class);
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