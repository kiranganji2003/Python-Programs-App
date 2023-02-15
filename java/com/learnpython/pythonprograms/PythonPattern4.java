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

public class PythonPattern4 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern4);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 4");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Pattern 4";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "for i in range(10):\n" +
                "    if i%2==1:\n" +
                "        for j in range(10-(i-1)):\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        print()\n" +
                "    else:\n" +
                "        for j in range(10-i):\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        print()";

        int[][] array_string_color = {{87,90},{95,99},{175,178},{183,187}};
        int[][] array_keyword_color_1 = {{0,3},{6,8},{24,26},{43,46},{49,51},{121,125},{135,138},{141,143}};
        int[][] array_keyword_color_2 = {{9,14},{52,57},{81,86},{109,114},{144,149},{169,174},{197,202}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{91,94},{179,182}};
        int[][] array_number_color = {{15,17},{29,30},{32,33},{58,60},{64,65},{150,152}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  \n" +
                "*  *  *  *  *  *  \n" +
                "*  *  *  *  \n" +
                "*  *  *  *  \n" +
                "*  *  \n" +
                "*  *";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern5.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern3.class);
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