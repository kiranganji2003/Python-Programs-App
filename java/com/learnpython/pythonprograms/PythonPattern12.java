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

public class PythonPattern12 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern12);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 12");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 12";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "for i in range(10):\n" +
                "    count = 0\n" +
                "    for j in range(10):\n" +
                "        if i<=j:\n" +
                "            count += 1\n" +
                "            print(count,end=\"  \")\n" +
                "        else:\n" +
                "            print(\" \",end=\"  \")\n" +
                "    print()";

        int[][] array_string_color = {{126,130},{164,167},{172,176}};
        int[][] array_keyword_color_1 = {{0,3},{6,8},{38,41},{44,46},{66,68},{140,144}};
        int[][] array_keyword_color_2 = {{9,14},{47,52},{110,115},{158,163},{182,187}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{122,125},{168,171}};
        int[][] array_number_color = {{15,17},{32,33},{53,55},{96,97}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "1  2  3  4  5  6  7  8  9  10  \n" +
                "   1  2  3  4  5  6  7  8  9  \n" +
                "      1  2  3  4  5  6  7  8  \n" +
                "         1  2  3  4  5  6  7  \n" +
                "            1  2  3  4  5  6  \n" +
                "               1  2  3  4  5  \n" +
                "                  1  2  3  4  \n" +
                "                     1  2  3  \n" +
                "                        1  2  \n" +
                "                           1  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern13.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern11.class);
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