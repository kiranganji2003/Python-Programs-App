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

public class AddTwoDistancesGivenInKilometerMeter extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_two_distances_given_in_kilometer_meter);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Add two distances given in kilometer-meter";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class Distance:\n" +
                "    def __init__(self):\n" +
                "        self.km = int(input(\"Enter kilometer :- \"))\n" +
                "        self.m = int(input(\"Enter meter :- \"))\n" +
                "    def add(self,dist):\n" +
                "        km = self.km+dist.km\n" +
                "        m = self.m+dist.m\n" +
                "        if m>=1000:\n" +
                "            km += 1\n" +
                "            m = m-1000\n" +
                "        print(\"\\nAddition of distances\")\n" +
                "        print(\"{} Kilometer and {} Meter\".format(km,m))\n" +
                "    \n" +
                "print(\"Enter distance 1\")\n" +
                "d1 = Distance()\n" +
                "print(\"Enter distance 2\")\n" +
                "d2 = Distance()\n" +
                "d1.add(d2)";

        int[][] array_string_color = {{68,89},{119,136},{295,296},{298,320},{336,363},{389,407},{431,449}};
        int[][] array_keyword_color_1 = {{0,5},{20,23},{143,146},{226,228},{296,298}};
        int[][] array_keyword_color_2 = {{58,61},{62,67},{109,112},{113,118},{289,294},{330,335},{383,388},{425,430}};
        int[][] array_self_color = {{33,37},{48,52},{100,104},{151,155},{176,180},{204,208}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{232,236},{256,257},{276,280}};
        int[][] array_function_name_color = {{147,150}};
        int[][] array_comments = {};
        int[][] array_special_functions_color = {{24,32}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_functions_color));

        output1 = "Enter distance 1\n" +
                "Enter kilometer :- 5\n" +
                "Enter meter :- 800\n" +
                "Enter distance 2\n" +
                "Enter kilometer :- 4\n" +
                "Enter meter :- 500\n" +
                "\n" +
                "Addition of distances\n" +
                "10 Kilometer and 300 Meter";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DetermineTheTypeOfTriangleBySide.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckIfAStringIsSubstringOfAnother.class);
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