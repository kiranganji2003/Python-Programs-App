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

public class PrimeNumbersBetween1ToN extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_numbers_between1_to_n);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Display prime numbers between 1 to N";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "N = int(input(\"Enter the value of N: \"))\n" +
                "count = 2\n" +
                "\n" +
                "print(\"Prime numbers between 1 to\",N)\n" +
                "\n" +
                "while count<=N:\n" +
                "    flag = 0\n" +
                "\n" +
                "    for i in range(2,(count//2)+1):\n" +
                "        if count%i==0:\n" +
                "            flag = 1\n" +
                "            break\n" +
                "\n" +
                "    if flag==0:\n" +
                "        print(count)\n" +
                "\n" +
                "    count += 1";

        int[][] array_string_color = {{14,38},{58,86}};
        int[][] array_keyword_color_1 = {{91,96},{125,128},{131,133},{165,167},{213,218},{224,226}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{52,57},{134,139},{244,249}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{49,50},{118,119},{140,141},{150,151},{153,154},{177,178},{199,200},{233,234},{271,272}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the value of N: 111\n" +
                "Prime numbers between 1 to 111\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "11\n" +
                "13\n" +
                "17\n" +
                "19\n" +
                "23\n" +
                "29\n" +
                "31\n" +
                "37\n" +
                "41\n" +
                "43\n" +
                "47\n" +
                "53\n" +
                "59\n" +
                "61\n" +
                "67\n" +
                "71\n" +
                "73\n" +
                "79\n" +
                "83\n" +
                "89\n" +
                "97\n" +
                "101\n" +
                "103\n" +
                "107\n" +
                "109";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNthPrimeNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNthLargestNumberFromList.class);
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