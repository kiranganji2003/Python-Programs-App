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

public class SumOfNumbersFromXToY extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_numbers_from_xto_y);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Sum of numbers from x to y";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def Sum_From_X_To_Y(x,y):\n" +
                "    sum = 0\n" +
                "    for i in range(x,y+1):\n" +
                "        sum = sum + i\n" +
                "    return sum\n" +
                "\n" +
                "\n" +
                "x = int(input(\"Enter the value of x :- \"))\n" +
                "y = int(input(\"Enter the value of y :- \"))\n" +
                "\n" +
                "Total = Sum_From_X_To_Y(x,y)\n" +
                "print(\"Sum of numbers from {} to {} is {}\".format(x,y,Total))";

        int[][] array_string_color = {{118,144},{161,187},{226,262}};
        int[][] array_keyword_color_1 = {{0,3},{42,45},{48,50},{91,97}};
        int[][] array_keyword_color_2 = {{51,56},{108,111},{112,117},{151,154},{155,160},{220,225}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{36,37},{61,62}};
        int[][] array_function_name_color = {{4,19}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the value of x :- 687\n" +
                "Enter the value of y :- 973\n" +
                "Sum of numbers from 687 to 973 is 238210";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AcceptUniqueValuesInAnArray.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindLCMOfThreeNumbers.class);
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