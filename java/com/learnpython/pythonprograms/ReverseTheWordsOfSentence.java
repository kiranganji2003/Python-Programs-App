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

public class ReverseTheWordsOfSentence extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_the_words_of_sentence);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Reverse the words of sentence";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "sentence = input(\"Enter the sentence :- \")\n" +
                "reverse = []\n" +
                "word = \"\"\n" +
                "for i in range(len(sentence)-1,-1,-1):\n" +
                "    if i==0:\n" +
                "        word += sentence[i]\n" +
                "    if sentence[i]==\" \" or i==0:\n" +
                "        temp = \"\"\n" +
                "        for j in range(len(word)-1,-1,-1):\n" +
                "            temp += word[j]\n" +
                "        reverse.append(temp)\n" +
                "        word = \"\"\n" +
                "        continue\n" +
                "    word += sentence[i]\n" +
                "    \n" +
                "print(\"Reverse of sentence\")\n" +
                "for i in reverse:\n" +
                "    print(i,end=\" \")";

        int[][] array_string_color = {{17,41},{63,65},{166,169},{194,196},{312,314},{367,388},{424,427}};
        int[][] array_keyword_color_1 = {{66,69},{72,74},{109,111},{150,152},{170,172},{205,208},{211,213},{323,331},{390,393},{396,398}};
        int[][] array_keyword_color_2 = {{11,16},{75,80},{81,84},{214,219},{220,223},{361,366},{412,417}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{420,423}};
        int[][] array_number_color = {{95,96},{98,99},{101,102},{115,116},{176,177},{230,231},{233,234},{236,237}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the sentence :- This is my sentence\n" +
                "Reverse of sentence\n" +
                "sentence my is This";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddKToEachElementOfListUsingOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DetermineTheTypeOfTriangleBySide.class);
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