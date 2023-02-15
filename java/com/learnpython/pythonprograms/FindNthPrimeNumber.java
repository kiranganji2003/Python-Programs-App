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

public class FindNthPrimeNumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_nth_prime_number);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find nth prime number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "n = int(input(\"Enter the value of n: \"))\n" +
                "count = 2\n" +
                "prime = 0\n" +
                "i = 0\n" +
                "\n" +
                "while i<n:\n" +
                "    flag = 0\n" +
                "\n" +
                "    for j in range(2,(count//2)+1):\n" +
                "        if count%j==0:\n" +
                "            flag = 1\n" +
                "            break\n" +
                "\n" +
                "    if flag==0:\n" +
                "        prime = count\n" +
                "        i += 1\n" +
                "\n" +
                "    count += 1\n" +
                "\n" +
                "print(\"{}th prime number is {}\".format(n,prime))";

        int[][] array_string_color = {{14,38},{268,293}};
        int[][] array_keyword_color_1 = {{68,73},{97,100},{103,105},{137,139},{185,190},{196,198}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{106,111},{262,267}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{49,50},{59,60},{65,66},{90,91},{112,113},{122,123},{125,126},{149,150},{171,172},{205,206},{243,244},{259,260}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the value of n: 25\n" +
                "25th prime number is 97";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CallingSuperClassConstructorAndMethods.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PrimeNumbersBetween1ToN.class);
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