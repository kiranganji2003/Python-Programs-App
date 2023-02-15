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

public class AcceptingParagraph extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accepting_paragraph);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Accepting the multiline paragraph in a string variable";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "paragraph = \"\"\n" +
                "\n" +
                "print(\"Enter STOP@# keyword to stop the accepting paragraph\")\n" +
                "print()\n" +
                "while 1:\n" +
                "    temp = input()\n" +
                "    if temp!=\"STOP@#\":\n" +
                "        paragraph += temp+\"\\n\"\n" +
                "    else:\n" +
                "        break\n" +
                "\n" +
                "\n" +
                "print(\"\\n\\nYour paragraph\\n\\n\",paragraph)";

        int[][] array_string_color = {{12,14},{22,76},{127,135},{163,164},{166,167},{200,201},{205,219},{223,224}};
        int[][] array_keyword_color_1 = {{86,91},{118,120},{164,166},{172,176},{186,191},{201,205},{219,223}};
        int[][] array_keyword_color_2 = {{16,21},{78,83},{106,111},{194,199}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{92,93}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter STOP@# keyword to stop the accepting paragraph\n" +
                "\n" +
                "Hello all welcome\n" +
                "This is my paragraph.\n" +
                "I can write as many as lines.\n" +
                "\tThank You!!!\n" +
                "STOP@#\n" +
                "\n" +
                "\n" +
                "Your paragraph\n" +
                "\n" +
                " Hello all welcome\n" +
                "This is my paragraph.\n" +
                "I can write as many as lines.\n" +
                "\tThank You!!!\n";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayAllTheDivisorsOfNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfArithmeticSequence.class);
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