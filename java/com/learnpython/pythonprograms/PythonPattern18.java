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

public class PythonPattern18 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern18);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 18");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 18";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = 9\n" +
                "for i in range(10):\n" +
                "    for j in range(10):\n" +
                "        if j<count:\n" +
                "            print(end=\"  \")\n" +
                "        else:\n" +
                "            print(\"* \",end=\"  \")\n" +
                "    count -= 1\n" +
                "    print()";

        int[][] array_string_color = {{96,100},{134,138},{143,147}};
        int[][] array_keyword_color_1 = {{10,13},{16,18},{34,37},{40,42},{62,64},{110,114}};
        int[][] array_keyword_color_2 = {{19,24},{43,48},{86,91},{128,133},{168,173}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{92,95},{139,142}};
        int[][] array_number_color = {{8,9},{25,27},{49,51},{162,163}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "                  *   \n" +
                "                *   *   \n" +
                "              *   *   *   \n" +
                "            *   *   *   *   \n" +
                "          *   *   *   *   *   \n" +
                "        *   *   *   *   *   *   \n" +
                "      *   *   *   *   *   *   *   \n" +
                "    *   *   *   *   *   *   *   *   \n" +
                "  *   *   *   *   *   *   *   *   *   \n" +
                "*   *   *   *   *   *   *   *   *   *   ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern19.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern17.class);
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