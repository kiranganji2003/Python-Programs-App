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

public class CountNumberOfOccurrenceOfDigitInANumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_number_of_occurrence_of_digit_in_anumber);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Count number of occurrence of digit in a number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "list = []\n" +
                "total = int(input(\"Enter total numbers: \"))\n" +
                "print(\"Enter\",total,\"elements\")\n" +
                "\n" +
                "for i in range(total):\n" +
                "    list.append(int(input()))\n" +
                "    \n" +
                "digit = int(input(\"Enter the digit: \"))\n" +
                "\n" +
                "for i in list:\n" +
                "    count = 0\n" +
                "    n = i\n" +
                "    while n>0:\n" +
                "        if n%10 == digit:\n" +
                "            count = count+1\n" +
                "        n = n//10\n" +
                "    print(i,\"=\",count)";

        int[][] array_string_color = {{28,51},{60,67},{74,84},{163,182},{324,327}};
        int[][] array_keyword_color_1 = {{87,90},{93,95},{186,189},{192,194},{229,234},{248,250}};
        int[][] array_keyword_color_2 = {{18,21},{22,27},{54,59},{96,101},{126,129},{130,135},{153,156},{157,162},{316,321}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{213,214},{237,238},{253,255},{292,293},{309,311}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter total numbers: 5\n" +
                "Enter 5 elements\n" +
                "9328\n" +
                "2334\n" +
                "3334\n" +
                "5482\n" +
                "3333\n" +
                "Enter the digit: 3\n" +
                "9328 = 1\n" +
                "2334 = 2\n" +
                "3334 = 3\n" +
                "5482 = 0\n" +
                "3333 = 4";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfFirstAndLastDigitOfNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RaiseTheExceptionWhenUserEnteresTheInvalidName.class);
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