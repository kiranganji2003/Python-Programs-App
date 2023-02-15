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

public class PythonPattern7 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern7);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 7");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Pattern 7";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "for i in range(1,11):\n" +
                "    for j in range(10,0,-1):\n" +
                "        if j<=i:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        else:\n" +
                "            print(end=\" \")\n" +
                "    print()";

        int[][] array_string_color = {{86,89},{94,98},{136,139}};
        int[][] array_keyword_color_1 = {{0,3},{6,8},{26,29},{32,34},{59,61},{108,112}};
        int[][] array_keyword_color_2 = {{9,14},{35,40},{80,85},{126,131},{145,150}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{90,93},{132,135}};
        int[][] array_number_color = {{15,16},{17,19},{41,43},{44,45},{47,48}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "         *  \n" +
                "        *  *  \n" +
                "       *  *  *  \n" +
                "      *  *  *  *  \n" +
                "     *  *  *  *  *  \n" +
                "    *  *  *  *  *  *  \n" +
                "   *  *  *  *  *  *  *  \n" +
                "  *  *  *  *  *  *  *  *  \n" +
                " *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern8.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern6.class);
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