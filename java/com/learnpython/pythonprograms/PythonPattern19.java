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

public class PythonPattern19 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern19);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 19");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 19";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = 9\n" +
                "for i in range(9):\n" +
                "    for j in range(10):\n" +
                "        if j<count:\n" +
                "            print(end=\"  \")\n" +
                "        else:\n" +
                "            print(i+1,end=\"   \")\n" +
                "    count -= 1\n" +
                "    print()";

        int[][] array_string_color = {{95,99},{141,146}};
        int[][] array_keyword_color_1 = {{10,13},{16,18},{33,36},{39,41},{61,63},{109,113}};
        int[][] array_keyword_color_2 = {{19,24},{42,47},{85,90},{127,132},{167,172}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{91,94},{137,140}};
        int[][] array_number_color = {{8,9},{25,26},{48,50},{135,136},{161,162}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "                  1   \n" +
                "                2   2   \n" +
                "              3   3   3   \n" +
                "            4   4   4   4   \n" +
                "          5   5   5   5   5   \n" +
                "        6   6   6   6   6   6   \n" +
                "      7   7   7   7   7   7   7   \n" +
                "    8   8   8   8   8   8   8   8   \n" +
                "  9   9   9   9   9   9   9   9   9   ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern20.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern18.class);
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