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

public class DetermineTheTypeOfTriangleBySide extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determine_the_type_of_triangle_by_side);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Determine the type of triangle by sides";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "s1 = int(input(\"Enter side 1 :- \"))\n" +
                "s2 = int(input(\"Enter side 2 :- \"))\n" +
                "s3 = int(input(\"Enter side 3 :- \"))\n" +
                "\n" +
                "if s1==s2 and s2==s3:\n" +
                "    print(\"The triangle is equilateral triangle\")\n" +
                "elif s1==s2 or s2==s3 or s1==s3:\n" +
                "    print(\"The triangle is isosceles triangle\")\n" +
                "else:\n" +
                "    print(\"The triangle is scalene triangle\")";

        int[][] array_string_color = {{15,33},{51,69},{87,105},{141,179},{224,260},{278,312}};
        int[][] array_keyword_color_1 = {{109,111},{119,122},{181,185},{193,195},{203,205},{262,266}};
        int[][] array_keyword_color_2 = {{5,8},{9,14},{41,44},{45,50},{77,80},{81,86},{135,140},{218,223},{272,277}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter side 1 :- 10\n" +
                "Enter side 2 :- 20\n" +
                "Enter side 3 :- 10\n" +
                "The triangle is isosceles triangle";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseTheWordsOfSentence.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddTwoDistancesGivenInKilometerMeter.class);
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