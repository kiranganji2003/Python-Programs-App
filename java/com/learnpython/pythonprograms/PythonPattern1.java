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

public class PythonPattern1 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern1);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 1");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Pattern 1";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "for i in range(10):\n" +
                "    for j in range(10):\n" +
                "        print(\"*\",end=\"  \")\n" +
                "    print()";

        int[][] array_string_color = {{58,61},{66,70}};
        int[][] array_keyword_color_1 = {{0,3},{6,8},{24,27},{30,32}};
        int[][] array_keyword_color_2 = {{9,14},{33,38},{52,57},{76,81}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{62,65}};
        int[][] array_number_color = {{15,17},{39,41}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);




        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern2.class);
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