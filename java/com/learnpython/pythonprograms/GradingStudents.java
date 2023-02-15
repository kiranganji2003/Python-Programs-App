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

public class GradingStudents extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grading_students);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "If the difference between the grade and next multiple of 5 is less than 3, round grade up to next multiple of 5. If the grade is less than 38 no rounding occurs";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "no = int(input(\"Enter no.of student :- \"))\n" +
                "grades = array(\"i\",[])\n" +
                "\n" +
                "print(\"\\nEnter\",no,\"students grades\")\n" +
                "for i in range(no):\n" +
                "    print(\"Enter student\",i+1,\"grade :- \",end=\"\")\n" +
                "    grades.append(int(input()))\n" +
                "\n" +
                "\n" +
                "final_grades = array(\"i\",[])\n" +
                "for i in range(no):\n" +
                "    if grades[i]>=40:\n" +
                "        if grades[i]%5==3:\n" +
                "            final_grades.append(grades[i]+2)\n" +
                "        elif grades[i]%5==4:\n" +
                "            final_grades.append(grades[i]+1)\n" +
                "        else:\n" +
                "            final_grades.append(grades[i])\n" +
                "    else:\n" +
                "        if grades[i]==38:\n" +
                "            final_grades.append(grades[i]+2)\n" +
                "        else:\n" +
                "            final_grades.append(grades[i])\n" +
                "\n" +
                "\n" +
                "print(\"\\nFinal grades\")\n" +
                "for i in range(no):\n" +
                "    print(\"Student 1 :-\",final_grades[i])";

        int[][] array_string_color = {{36,61},{79,82},{94,95},{97,103},{107,124},{156,171},{176,187},{192,194},{251,254},{650,651},{653,666},{698,712}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{95,97},{126,129},{132,134},{259,262},{265,267},{283,285},{309,311},{381,385},{455,459},{508,512},{522,524},{593,597},{651,653},{668,671},{674,676}};
        int[][] array_keyword_color_2 = {{26,29},{30,35},{88,93},{135,140},{150,155},{214,217},{218,223},{268,273},{644,649},{677,682},{692,697}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{188,191}};
        int[][] array_number_color = {{174,175},{297,299},{322,323},{325,326},{370,371},{396,397},{399,400},{444,445},{536,538},{582,583}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter no.of student :- 5\n" +
                "\n" +
                "Enter 5 students grades\n" +
                "Enter student 1 grade :- 41\n" +
                "Enter student 2 grade :- 48\n" +
                "Enter student 3 grade :- 83\n" +
                "Enter student 4 grade :- 79\n" +
                "Enter student 5 grade :- 23\n" +
                "\n" +
                "Final grades\n" +
                "Student 1 :- 41\n" +
                "Student 1 :- 50\n" +
                "Student 1 :- 85\n" +
                "Student 1 :- 80\n" +
                "Student 1 :- 23";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindThePairsInListWhereSumOfThesePairsIsDivisibleByK.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheStringIsPalindromOrNot.class);
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