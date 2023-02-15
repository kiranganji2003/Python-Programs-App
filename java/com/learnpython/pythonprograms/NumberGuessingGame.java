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

public class NumberGuessingGame extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_guessing_game);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Number Guessing Game");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "from random import randint\n" +
                "\n" +
                "print(\"NUMBER GUESSING GAME\")\n" +
                "print()\n" +
                "\n" +
                "starting_number = int(input(\"Enter starting number: \"))\n" +
                "ending_number = int(input(\"Enter ending number: \"))\n" +
                "\n" +
                "number = randint(starting_number,ending_number)\n" +
                "chances = -1\n" +
                "answer = -1\n" +
                "\n" +
                "while answer!=number:\n" +
                "    print()\n" +
                "    answer = int(input(\"Enter your answer: \"))\n" +
                "    chances += 1\n" +
                "    if answer<number:\n" +
                "        print(\"\\nHint: Number is greater than\",answer)\n" +
                "    elif answer>number:\n" +
                "        print(\"\\nHint: Number is less than\",answer)\n" +
                "    else:\n" +
                "        print(\"\\nCORRECT ANSWER\")\n" +
                "\n" +
                "print(\"\\nYOU GUESSED THE NUMBER USING\",chances,\"CHANCES\")\n" +
                "print(\"\\nYOUR SCORE: {} OUT OF 100\".format(100-chances))";

        int[][] array_string_color = {{34,56},{95,120},{149,172},{307,328},{384,385},{387,416},{463,464},{466,492},{525,526},{528,543},{552,553},{555,584},{593,602},{610,611},{613,639}};
        int[][] array_keyword_color_1 = {{0,4},{12,18},{250,255},{352,354},{385,387},{429,433},{464,466},{505,509},{526,528},{553,555},{611,613}};
        int[][] array_keyword_color_2 = {{28,33},{58,63},{85,88},{89,94},{139,142},{143,148},{276,281},{297,300},{301,306},{378,383},{457,462},{519,524},{546,551},{604,609}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{235,236},{247,248},{346,347},{647,650}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        int[][] array_special_function_color = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "NUMBER GUESSING GAME\n" +
                "\n" +
                "Enter starting number: 1\n" +
                "Enter ending number: 100\n" +
                "\n" +
                "Enter your answer: 50\n" +
                "\n" +
                "Hint: Number is less than 50\n" +
                "\n" +
                "Enter your answer: 25\n" +
                "\n" +
                "Hint: Number is less than 25\n" +
                "\n" +
                "Enter your answer: 10\n" +
                "\n" +
                "Hint: Number is greater than 10\n" +
                "\n" +
                "Enter your answer: 17\n" +
                "\n" +
                "Hint: Number is greater than 17\n" +
                "\n" +
                "Enter your answer: 21\n" +
                "\n" +
                "Hint: Number is greater than 21\n" +
                "\n" +
                "Enter your answer: 23\n" +
                "\n" +
                "CORRECT ANSWER\n" +
                "\n" +
                "YOU GUESSED THE NUMBER USING 5 CHANCES\n" +
                "\n" +
                "YOUR SCORE: 95 OUT OF 100";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),GenerateRandomStrings.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python Project");
            String shareMessage = "Project :- Number Guessing Game" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}