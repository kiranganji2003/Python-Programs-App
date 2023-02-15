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

public class FindGCDOfThreeNumbers extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_gcdof_three_numbers);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find Greatest Common Divisor of three numbers";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "num3 = int(input(\"Enter number 3 :- \"))\n" +
                "smaller = 0\n" +
                "\n" +
                "if num1<num2 and num1<num3:\n" +
                "    smaller = num1\n" +
                "elif num2<num1 and num2<num3:\n" +
                "    smaller = num2\n" +
                "elif num3<num1 and num3<num2:\n" +
                "    smaller = num3\n" +
                "else:\n" +
                "    smaller = num1\n" +
                "\n" +
                "\n" +
                "for i in range(smaller,0,-1):\n" +
                "    if num1%i==0 and num2%i==0 and num3%i==0:\n" +
                "        print(\"\\nGCD of {}, {} and {} is {}\".format(num1,num2,num3,i))\n" +
                "        break";

        int[][] array_string_color = {{17,37},{57,77},{97,117},{395,396},{398,425}};
        int[][] array_keyword_color_1 = {{133,135},{146,149},{180,184},{195,198},{229,233},{244,247},{278,282},{305,308},{311,313},{339,341},{352,355},{366,369},{396,398},{460,465}};
        int[][] array_keyword_color_2 = {{7,10},{11,16},{47,50},{51,56},{87,90},{91,96},{314,319},{389,394}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{130,131},{328,329},{331,332},{350,351},{364,365},{378,379}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter number 1 :- 350\n" +
                "Enter number 2 :- 140\n" +
                "Enter number 3 :- 210\n" +
                "\n" +
                "GCD of 350, 140 and 210 is 70";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindLCMOfTwoNumbers.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindGCDOfTwoNumbers.class);
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