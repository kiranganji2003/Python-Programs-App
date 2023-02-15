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

public class FindSecondLargestAmongThreeNumbers extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_second_largest_among_three_numbers);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find second largest element among three numbers";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "nums = array(\"i\",[])\n" +
                "print(\"Enter three numbers\")\n" +
                "\n" +
                "for i in range(3):\n" +
                "    nums.append(int(input()))\n" +
                "\n" +
                "for i in range(2):\n" +
                "    for j in range(i+1,3):\n" +
                "        if nums[i]>nums[j]:\n" +
                "            temp = nums[i]\n" +
                "            nums[i] = nums[j]\n" +
                "            nums[j] = temp\n" +
                "\n" +
                "print(\"Second largest number:\",nums[1])";

        int[][] array_string_color = {{34,37},{48,69},{287,311}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{72,75},{78,80},{122,125},{128,130},{145,148},{151,153},{176,178}};
        int[][] array_keyword_color_2 = {{42,47},{81,86},{107,110},{111,116},{131,136},{154,159},{281,286}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{87,88},{137,138},{162,163},{164,165},{317,318}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter three numbers\n" +
                "18\n" +
                "32\n" +
                "13\n" +
                "Second largest number: 18";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsArmstrongOrNot.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsPalindromOrNot.class);
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