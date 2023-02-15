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

public class FindLCMOfTwoNumbers extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_lcmof_two_numbers);



        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find Least Common Multiple of two numbers";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "\n" +
                "greater = 0\n" +
                "\n" +
                "if num1>num2:\n" +
                "    greater = num1\n" +
                "elif num2>num1:\n" +
                "    greater = num2\n" +
                "else:\n" +
                "    greater = num1\n" +
                "\n" +
                "\n" +
                "while 1:\n" +
                "    if greater%num1==0 and greater%num2==0:\n" +
                "        print(\"\\nLCM of {} and {} is {}\".format(num1,num2,greater))\n" +
                "        break\n" +
                "    greater += 1";

        int[][] array_string_color = {{17,37},{57,77},{256,257},{259,282}};
        int[][] array_keyword_color_1 = {{94,96},{127,131},{162,166},{189,194},{202,204},{221,224},{257,259},{318,323}};
        int[][] array_keyword_color_2 = {{7,10},{11,16},{47,50},{51,56},{250,255}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{91,92},{195,196},{219,220},{239,240},{339,340}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter number 1 :- 35\n" +
                "Enter number 2 :- 25\n" +
                "\n" +
                "LCM of 35 and 25 is 175";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindLCMOfThreeNumbers.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindGCDOfThreeNumbers.class);
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