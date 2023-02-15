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

public class RemoveTheCharactersXFromTheString extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_the_characters_xfrom_the_string);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Remove the characters X from the string";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def remove_chars(string,char):\n" +
                "    newString = \"\"\n" +
                "    for i in string:\n" +
                "        if i!=char:\n" +
                "            newString += i\n" +
                "    print(\"\\nNew String:\",newString)\n" +
                "\n" +
                "print(\"Remove the characters X from the string\")\n" +
                "string = input(\"Enter the string: \")\n" +
                "char = input(\"Enter the character: \")[0]\n" +
                "remove_chars(string,char)";

        int[][] array_string_color = {{47,49},{128,129},{131,143},{162,203},{220,240},{255,278}};
        int[][] array_keyword_color_1 = {{0,3},{54,57},{60,62},{79,81},{129,131}};
        int[][] array_keyword_color_2 = {{122,127},{156,161},{214,219},{249,254}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{280,281}};
        int[][] array_function_name_color = {{4,16}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Remove the characters X from the string\n" +
                "Enter the string: Good blood, bad blood\n" +
                "Enter the character: o\n" +
                "\n" +
                "New String: Gd bld, bad bld";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountNumberOfOccuranceOfCharactersFromString.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddValuesInListOfObjectUsingOperatorOverloading.class);
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