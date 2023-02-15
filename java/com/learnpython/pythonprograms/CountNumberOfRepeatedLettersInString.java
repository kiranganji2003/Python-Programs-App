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

public class CountNumberOfRepeatedLettersInString extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_number_of_repeated_letters_in_string);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Count number of repeated letters in a string";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "str = input(\"Enter any string :- \")\n" +
                "\n" +
                "count = 0\n" +
                "repeated_letters = []\n" +
                "\n" +
                "for i in range(len(str)-1):\n" +
                "    for j in range(i+1,len(str)):\n" +
                "        if str[i]==str[j] and str[i] not in repeated_letters:\n" +
                "            repeated_letters.append(str[i])\n" +
                "            count += 1\n" +
                "            break\n" +
                "\n" +
                "print(\"\\nRepeated letters :-\",repeated_letters)\n" +
                "print(\"\\nTotal {} repeated letters in string \\\"{}\\\"\".format(count,str))";

        int[][] array_string_color = {{12,34},{286,287},{289,309},{334,335},{337,372},{375,377},{379,380}};
        int[][] array_keyword_color_1 = {{70,73},{76,78},{102,105},{108,110},{140,142},{158,161},{169,175},{273,278},{287,289},{335,337},{373,375},{377,379}};
        int[][] array_keyword_color_2 = {{6,11},{79,84},{85,88},{111,116},{121,124},{280,285},{328,333}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{45,46},{94,95},{119,120},{259,260}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter any string :- HelloAllHii\n" +
                "\n" +
                "Repeated letters :- ['H', 'l', 'i']\n" +
                "\n" +
                "Total 3 repeated letters in string \"HelloAllHii\"";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DoubleTheNumberForNthTimes.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayTheNumberInWords.class);
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