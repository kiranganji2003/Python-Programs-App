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

public class PythonPattern14 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern14);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 14");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 14";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "for i in range(10):\n" +
                "    for j in range(10):\n" +
                "        if i==0 or i==10-1:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        elif j==0 or j==10-1:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        else:\n" +
                "            print(\" \",end=\"  \")            \n" +
                "    print()";

        int[][] array_string_color = {{90,93},{98,102},{152,155},{160,164},{198,201},{206,210}};
        int[][] array_keyword_color_1 = {{0,3},{6,8},{24,27},{30,32},{52,54},{60,62},{112,116},{122,124},{174,178}};
        int[][] array_keyword_color_2 = {{9,14},{33,38},{84,89},{146,151},{192,197},{228,233}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{94,97},{156,159},{202,205}};
        int[][] array_number_color = {{15,17},{39,41},{58,59},{66,68},{69,70},{120,121},{128,130},{131,132}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "*  *  *  *  *  *  *  *  *  *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*                          *  \n" +
                "*  *  *  *  *  *  *  *  *  *  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern15.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern13.class);
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