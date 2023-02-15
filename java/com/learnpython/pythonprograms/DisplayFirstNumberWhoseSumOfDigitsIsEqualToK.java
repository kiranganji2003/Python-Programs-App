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

public class DisplayFirstNumberWhoseSumOfDigitsIsEqualToK extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_first_number_whose_sum_of_digits_is_equal_to_k);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Display first number whose sum of digits is equal to K";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "k = int(input(\"Enter value of K :- \"))\n" +
                "\n" +
                "num = 1\n" +
                "\n" +
                "if k!=0:\n" +
                "    while 1:\n" +
                "        sum = 0\n" +
                "        count = num\n" +
                "        while count>0:\n" +
                "            rem = count%10\n" +
                "            sum += rem\n" +
                "            count = count//10\n" +
                "        if sum==k:\n" +
                "            print(\"{} is first number whose sum of digits is equal to {}\".format(num,k))\n" +
                "            break\n" +
                "        num += 1\n" +
                "else:\n" +
                "    print(\"Answer :- 0\")";

        int[][] array_string_color = {{14,36},{247,302},{369,382}};
        int[][] array_keyword_color_1 = {{49,51},{62,67},{115,120},{218,220},{330,335},{353,357}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{241,246},{363,368}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{46,47},{55,56},{68,69},{85,86},{127,128},{154,156},{207,209},{351,352}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter value of K :- 20\n" +
                "299 is first number whose sum of digits is equal to 20";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DiagonalDifferenceOfMatrix.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayArmstrongNumbersBetweenOneToN.class);
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