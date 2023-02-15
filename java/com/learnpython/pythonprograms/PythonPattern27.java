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

public class PythonPattern27 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern27);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 27");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 27";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = 3\n" +
                "for i in range(1,13):\n" +
                "    for j in range(1,12):\n" +
                "        if j%count==1 or j%count==2:\n" +
                "            print(\"\",end=\"  \")\n" +
                "        else:\n" +
                "            print(\"*\",end=\" \")\n" +
                "    count -= 1\n" +
                "    if count==0:\n" +
                "        count = 3\n" +
                "    print()";

        int[][] array_string_color = {{113,115},{120,124},{158,161},{166,169}};
        int[][] array_keyword_color_1 = {{10,13},{16,18},{36,39},{42,44},{66,68},{80,82},{134,138},{190,192}};
        int[][] array_keyword_color_2 = {{19,24},{45,50},{107,112},{152,157},{225,230}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{116,119},{162,165}};
        int[][] array_number_color = {{8,9},{25,26},{27,29},{51,52},{53,55},{78,79},{92,93},{184,185},{200,201},{219,220}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "    *     *     *     \n" +
                "  *   *   *   *   *   \n" +
                "* * * * * * * * * * * \n" +
                "    *     *     *     \n" +
                "  *   *   *   *   *   \n" +
                "* * * * * * * * * * * \n" +
                "    *     *     *     \n" +
                "  *   *   *   *   *   \n" +
                "* * * * * * * * * * * \n" +
                "    *     *     *     \n" +
                "  *   *   *   *   *   \n" +
                "* * * * * * * * * * * ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern28.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern26.class);
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