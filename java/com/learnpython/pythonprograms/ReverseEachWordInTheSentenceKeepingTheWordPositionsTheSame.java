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

public class ReverseEachWordInTheSentenceKeepingTheWordPositionsTheSame extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_each_word_in_the_sentence_keeping_the_word_positions_the_same);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Reverse each word in the sentence, keeping the word positions the same";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "def reverse(x):\n" +
                "    return x[::-1]     # Reverse the string \n" +
                "\n" +
                "print(\"Enter the string: \")\n" +
                "string = input(\"\")\n" +
                "string_list = string.split()    # The split() method splits a string into a list.\n" +
                "for item in string_list:\n" +
                "    print(reverse(item),end=\" \")";

        int[][] array_string_color = {{68,88},{105,107},{244,247}};
        int[][] array_keyword_color_1 = {{0,3},{20,26},{191,194},{200,202}};
        int[][] array_keyword_color_2 = {{62,67},{99,104},{220,225}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{240,243}};
        int[][] array_number_color = {{32,33}};
        int[][] array_function_name_color = {{4,11}};
        int[][] array_comments = {{39,59},{141,190}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the string: \n" +
                "The house is very big\n" +
                "ehT esuoh si yrev gib ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNumberOfDigitsInSmallestAndLargestNumberOfList.class);
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