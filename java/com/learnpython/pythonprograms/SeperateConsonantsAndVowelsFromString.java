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

public class SeperateConsonantsAndVowelsFromString extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seperate_consonants_and_vowels_from_string);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Separate consonants and vowels from string";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "consonants = []\n" +
                "vowels = []\n" +
                "\n" +
                "string = input(\"Enter the string :- \")\n" +
                "\n" +
                "def separate_consonants_vowels(string):\n" +
                "    global consonants,vowels\n" +
                "    for i in string:\n" +
                "        if i=='a' or i=='e' or i=='i' or i=='o' or i=='u':\n" +
                "            vowels.append(i)\n" +
                "        else:\n" +
                "            consonants.append(i)\n" +
                "\n" +
                "separate_consonants_vowels(string.lower())\n" +
                "print(\"Consonants :-\",consonants)\n" +
                "print(\"Vowels :-\",vowels)";
        int[][] array_string_color = {{44,66},{173,176},{183,186},{193,196},{203,206},{213,216},{344,359},{378,389}};
        int[][] array_keyword_color_1 = {{69,72},{113,119},{142,145},{148,150},{167,169},{177,179},{187,189},{197,199},{207,209},{255,259}};
        int[][] array_keyword_color_2 = {{38,43},{338,343},{372,377}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {};
        int[][] array_function_name_color = {{73,99}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
        output1 = "Enter the string :- Programming\n" +
                "Consonants :- ['p', 'r', 'g', 'r', 'm', 'm', 'n', 'g']\n" +
                "Vowels :- ['o', 'a', 'i']";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);




        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountAndSayNumbers.class);
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