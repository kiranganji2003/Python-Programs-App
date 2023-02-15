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

public class CountNumberOfOccuranceOfCharactersFromString extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_number_of_occurance_of_characters_from_string);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Count number of occurrence of characters from string";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def count(string):\n" +
                "    checked = []\n" +
                "    for i in string:\n" +
                "        count = 0\n" +
                "        if i not in checked:\n" +
                "            checked.append(i)\n" +
                "            for j in string:\n" +
                "                if i==j:\n" +
                "                    count += 1\n" +
                "        if count!=0:\n" +
                "            print(i,\"occurred\",count,\"time\")\n" +
                "                    \n" +
                "string = input(\"Enter the string: \")\n" +
                "count(string)";

        int[][] array_string_color = {{260,270},{277,283},{321,341}};
        int[][] array_keyword_color_1 = {{0,3},{40,43},{46,48},{83,85},{88,94},{146,149},{152,154},{179,181},{227,229}};
        int[][] array_keyword_color_2 = {{252,257},{315,320}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{73,74},{217,218},{237,238}};
        int[][] array_function_name_color = {{4,9}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the string: This is beautiful garden\n" +
                "T occurred 1 time\n" +
                "h occurred 1 time\n" +
                "i occurred 3 time\n" +
                "s occurred 2 time\n" +
                "  occurred 3 time\n" +
                "b occurred 1 time\n" +
                "e occurred 2 time\n" +
                "a occurred 2 time\n" +
                "u occurred 2 time\n" +
                "t occurred 1 time\n" +
                "f occurred 1 time\n" +
                "l occurred 1 time\n" +
                "g occurred 1 time\n" +
                "r occurred 1 time\n" +
                "d occurred 1 time\n" +
                "n occurred 1 time";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RaiseTheExceptionWhenUserEnteresTheInvalidName.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RemoveTheCharactersXFromTheString.class);
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