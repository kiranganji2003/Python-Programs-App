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

public class CheckIfAStringIsSubstringOfAnother extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_if_astring_is_substring_of_another);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Check if a string is substring of another";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "str = input(\"Enter string :- \")\n" +
                "subStr = input(\"Enter substring :- \")\n" +
                "strLen = len(str)\n" +
                "subStrLen = len(subStr)\n" +
                "flag = 0\n" +
                "\n" +
                "for i in range(strLen-subStrLen+1):\n" +
                "    word = \"\"\n" +
                "    for j in range(i,i+subStrLen):\n" +
                "        word += str[j]\n" +
                "    if word==subStr:\n" +
                "        print(\"The substring \\\"{}\\\" is presents in a string \\\"{}\\\"\".format(subStr,str))\n" +
                "        flag = 1\n" +
                "        break\n" +
                "\n" +
                "if flag!=1:\n" +
                "        print(\"The substring \\\"{}\\\" is not presents in a string \\\"{}\\\"\".format(subStr,str))";

        int[][] array_string_color = {{12,30},{47,68},{169,171},{265,279},{282,284},{287,310},{313,315},{317,318},{371,372},{397,411},{414,416},{419,446},{449,451},{453,454}};
        int[][] array_keyword_color_1 = {{122,125},{128,130},{176,179},{182,184},{234,236},{280,282},{284,286},{311,313},{315,317},{364,369},{371,373},{412,414},{416,418},{447,449},{451,453}};
        int[][] array_keyword_color_2 = {{6,11},{41,46},{79,82},{100,103},{131,136},{185,190},{259,264},{391,396}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{119,120},{154,155},{354,355},{380,381}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter string :- Welcome Everyone\n" +
                "Enter substring :- very\n" +
                "The substring \"very\" is presents in a string \"Welcome Everyone\"";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddTwoDistancesGivenInKilometerMeter.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AcceptUniqueValuesInAnArray.class);
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