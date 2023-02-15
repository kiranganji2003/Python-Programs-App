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

public class FindNthEvenOrOddNumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_nth_even_or_odd_number);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find Nth even or odd number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def find(num,n):\n" +
                "    i = 0\n" +
                "    while i<n-1:\n" +
                "        num = num+2\n" +
                "        i = i+1\n" +
                "    if num%2==0:\n" +
                "        print(\"{}th even number is {}\".format(n,num))\n" +
                "    else:\n" +
                "        print(\"{}th odd number is {}\".format(n,num))\n" +
                "\n" +
                "print(\"1. Find nth even number\")\n" +
                "print(\"2. Find nth odd number\")\n" +
                "print()\n" +
                "ch = int(input(\"Choose your choice: \"))\n" +
                "n = int(input(\"Enter the value of n: \"))\n" +
                "if ch==1:\n" +
                "    find(0,n)\n" +
                "elif ch==2:\n" +
                "    find(1,n)\n" +
                "else:\n" +
                "    print(\"Invalid choice\")";

        int[][] array_string_color = {{111,135},{175,198},{221,246},{254,278},{303,325},{342,366},{435,451}};
        int[][] array_keyword_color_1 = {{0,3},{31,36},{84,86},{155,159},{369,371},{393,397},{419,423}};
        int[][] array_keyword_color_2 = {{105,110},{169,174},{215,220},{248,253},{280,285},{293,296},{297,302},{332,335},{336,341},{429,434}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{25,26},{41,42},{62,63},{78,79},{91,92},{94,95},{376,377},{388,389},{402,403},{414,415}};
        int[][] array_function_name_color = {{4,8}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "1. Find nth even number\n" +
                "2. Find nth odd number\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "Enter the value of n: 556\n" +
                "556th odd number is 1111";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNthEvenOrOddNumberWhichIsDivisibleByK.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsArmstrongOrNot.class);
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