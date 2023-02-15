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

public class PythonPattern30 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern30);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 30");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 30";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = 8\n" +
                "for i in range(10):\n" +
                "    for j in range(10):\n" +
                "        if i==0 or i==9:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        elif j==count:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "            count -= 1\n" +
                "        else:\n" +
                "            print(\" \",end=\"  \")\n" +
                "    print()";

        int[][] array_string_color = {{97,100},{105,109},{152,155},{160,164},{221,224},{229,233}};
        int[][] array_keyword_color_1 = {{10,13},{16,18},{34,37},{40,42},{62,64},{70,72},{119,123},{197,201}};
        int[][] array_keyword_color_2 = {{19,24},{43,48},{91,96},{146,151},{215,220},{239,244}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{101,104},{156,159},{225,228}};
        int[][] array_number_color = {{8,9},{25,27},{49,51},{68,69},{76,77},{187,188}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "*  *  *  *  *  *  *  *  *  *  \n" +
                "                        *     \n" +
                "                     *        \n" +
                "                  *           \n" +
                "               *              \n" +
                "            *                 \n" +
                "         *                    \n" +
                "      *                       \n" +
                "   *                          \n" +
                "*  *  *  *  *  *  *  *  *  *  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern31.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern29.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python pattern");
            String shareMessage = program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}