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

public class CheckTheNumberIsPalindromOrNot extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_the_number_is_palindrom_or_not);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Check the number is palindrome or not";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "number = int(input(\"Enter the number: \"))\n" +
                "temp = number\n" +
                "\n" +
                "digits = 0\n" +
                "while temp>0:\n" +
                "    digits += 1\n" +
                "    temp = temp//10\n" +
                "    \n" +
                "multiply = 0\n" +
                "for i in range(digits):\n" +
                "    if i==0:\n" +
                "        multiply = 1\n" +
                "        continue\n" +
                "    multiply = multiply*10\n" +
                "\n" +
                "reverse = 0\n" +
                "temp = number\n" +
                "while temp>0:\n" +
                "    remainder = temp%10\n" +
                "    reverse = reverse+(multiply*remainder)\n" +
                "    multiply = multiply//10\n" +
                "    temp = temp//10\n" +
                "\n" +
                "if number==reverse:\n" +
                "    print(\"The Number\",number,\"is palindrome\")\n" +
                "else:\n" +
                "    print(\"The Number\",number,\"is not palindrome\")";

        int[][] array_string_color = {{19,39},{425,437},{445,460},{478,490},{498,517}};
        int[][] array_keyword_color_1 = {{68,73},{136,139},{142,144},{164,166},{202,210},{265,270},{395,397},{462,466}};
        int[][] array_keyword_color_2 = {{9,12},{13,18},{145,150},{419,424},{472,477}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{66,67},{79,80},{96,97},{115,117},{134,135},{170,171},{192,193},{235,237},{249,250},{276,277},{300,302},{371,373},{391,393}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number: 67376\n" +
                "The Number 67376 is palindrome";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindSecondLargestAmongThreeNumbers.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfFirstAndLastDigitOfNumber.class);
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