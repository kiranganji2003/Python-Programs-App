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

public class ConvertingTheDecimalNumberToBinaryManually extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converting_the_decimal_number_to_binary_manually);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Converting the decimal number to binary form manually";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num = int(input(\"Enter the number :- \"))\n" +
                "\n" +
                "def binary(num):\n" +
                "    binary_form = []\n" +
                "    while num>0:\n" +
                "        rem = num%2\n" +
                "        binary_form.append(rem)\n" +
                "        num = num//2\n" +
                "\n" +
                "    print(\"\\nBinary number :- \",end=\"\")\n" +
                "    length = len(binary_form)\n" +
                "\n" +
                "    if length%4==1:\n" +
                "        binary_form.append(0)\n" +
                "        binary_form.append(0)\n" +
                "        binary_form.append(0)\n" +
                "    elif length%4==2:\n" +
                "        binary_form.append(0)\n" +
                "        binary_form.append(0)\n" +
                "    elif length%4==3:\n" +
                "        binary_form.append(0)\n" +
                "    \n" +
                "    for i in range(len(binary_form)-1,-1,-1):\n" +
                "        print(binary_form[i],end=\"\")\n" +
                "        \n" +
                "\n" +
                "if num==0:\n" +
                "    print(\"\\nBinary number :- 0000\")\n" +
                "else:\n" +
                "    binary(num)";

        int[][] array_string_color = {{16,38},{181,182},{184,202},{207,209},{570,572},{605,606},{608,630}};
        int[][] array_keyword_color_1 = {{42,45},{84,89},{182,184},{246,248},{356,360},{438,442},{495,498},{501,503},{584,586},{606,608},{632,636}};
        int[][] array_keyword_color_2 = {{6,9},{10,15},{175,180},{224,227},{504,509},{510,513},{545,550},{599,604}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{203,206},{566,569}};
        int[][] array_number_color = {{94,95},{115,116},{168,169},{256,257},{259,260},{289,290},{319,320},{349,350},{368,369},{371,372},{401,402},{431,432},{450,451},{453,454},{483,484},{527,528},{530,531},{533,534},{592,593}};
        int[][] array_function_name_color = {{46,52}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number :- 25\n" +
                "\n" +
                "Binary number :- 00011001";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountingDigits.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindThePairsInListWhereSumOfThesePairsIsDivisibleByK.class);
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