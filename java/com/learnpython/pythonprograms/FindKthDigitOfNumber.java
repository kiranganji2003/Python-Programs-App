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

public class FindKthDigitOfNumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_kth_digit_of_number);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find the kth digit of a number from right";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num = int(input(\"Enter the number :- \"))\n" +
                "digit = -1\n" +
                "\n" +
                "k = int(input(\"Enter the value of k :- \"))\n" +
                "no = num\n" +
                "\n" +
                "if k>len(str(num)) or k<0:\n" +
                "    print(\"Invalid\")\n" +
                "else:\n" +
                "    i = 0\n" +
                "    while i<k:\n" +
                "        if i==k-1:\n" +
                "            digit = no%10\n" +
                "        no = no//10\n" +
                "        i += 1\n" +
                "\n" +
                "\n" +
                "    if digit!=-1:\n" +
                "        if k==1:\n" +
                "            print(\"{}st digit of {} is {}\".format(k,num,digit))\n" +
                "        elif k==2:\n" +
                "            print(\"{}nd digit of {} is {}\".format(k,num,digit))\n" +
                "        elif k==3:\n" +
                "            print(\"{}rd digit of {} is {}\".format(k,num,digit))\n" +
                "        else:\n" +
                "            print(\"{}th digit of {} is {}\".format(k,num,digit))\n" +
                "    else:\n" +
                "        print(\"Invalid\")";

        int[][] array_string_color = {{16,38},{67,93},{143,152},{320,344},{403,427},{486,510},{564,588},{634,643}};
        int[][] array_keyword_color_1 = {{106,108},{125,127},{154,158},{174,179},{193,195},{271,273},{293,295},{374,378},{457,461},{540,544},{614,618}};
        int[][] array_keyword_color_2 = {{6,9},{10,15},{57,60},{61,66},{111,114},{115,118},{137,142},{314,319},{397,402},{480,485},{558,563},{628,633}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{50,51},{130,131},{168,169},{201,202},{227,229},{247,249},{263,264},{282,283},{299,300},{382,383},{465,466}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number :- 4587\n" +
                "Enter the value of k :- 3\n" +
                "3rd digit of 4587 is 5";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayTheMonthAndNumberOfDays.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddTheNumbersUntilUserStops.class);
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