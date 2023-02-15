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

public class FindDifferenceOfDigitsOfNumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_difference_of_digits_of_number);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find difference between addition and subtraction of all digits of a number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num = int(input(\"Enter the number: \"))\n" +
                "num_in_string = str(num)\n" +
                "\n" +
                "addition = 0\n" +
                "subtraction = 0\n" +
                "count = 0\n" +
                "\n" +
                "for no in num_in_string:\n" +
                "    addition += int(no)\n" +
                "    if count==0:\n" +
                "        subtraction = int(no)\n" +
                "        count = 1\n" +
                "    else:\n" +
                "        subtraction -= int(no)\n" +
                "\n" +
                "print(\"Addition: \",end=\"\")\n" +
                "for no in num_in_string:\n" +
                "    count += 1\n" +
                "    if count==len(num_in_string)+1:\n" +
                "        print(\"{} = {}\".format(no,addition))\n" +
                "        count = 1\n" +
                "    else:\n" +
                "        print(\"{} + \".format(no),end=\"\")\n" +
                "\n" +
                "print(\"Subtraction: \",end=\"\")\n" +
                "for no in num_in_string:\n" +
                "    count += 1\n" +
                "    if count==len(num_in_string)+1:\n" +
                "        print(\"{} = {}\".format(no,subtraction))\n" +
                "    else:\n" +
                "        print(\"{} - \".format(no),end=\"\")\n" +
                "\n" +
                "difference = addition-subtraction\n" +
                "print(\"Difference:\",difference)";

        int[][] array_string_color = {{16,36},{267,279},{284,286},{378,387},{451,458},{474,476},{485,500},{505,507},{599,608},{657,664},{680,682},{725,738}};
        int[][] array_keyword_color_1 = {{105,108},{112,114},{158,160},{223,227},{288,291},{295,297},{332,334},{431,436},{509,512},{516,518},{553,555},{637,641}};
        int[][] array_keyword_color_2 = {{6,9},{10,15},{55,58},{146,149},{193,196},{252,255},{261,266},{342,345},{372,377},{445,450},{479,484},{563,566},{593,598},{651,656},{719,724}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{280,283},{470,473},{501,504},{676,679}};
        int[][] array_number_color = {{76,77},{92,93},{102,103},{168,169},{217,218},{326,327},{361,362},{425,426},{547,548},{582,583}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number: 8436\n" +
                "Addition: 8 + 4 + 3 + 6 = 21\n" +
                "Subtraction: 8 - 4 - 3 - 6 = -5\n" +
                "Difference: 26";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RemoveTheDigitFromNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindTheNextElementThatIsDivisibleByKOfAGivenNumber.class);
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