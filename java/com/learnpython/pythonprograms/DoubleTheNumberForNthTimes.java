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

public class DoubleTheNumberForNthTimes extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_the_number_for_nth_times);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Double the number for nth times";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num = int(input(\"Enter the number :- \"))\n" +
                "n = int(input(\"Enter the value of n :- \"))\n" +
                "\n" +
                "cnt = 1\n" +
                "while cnt<=n:\n" +
                "    no = num\n" +
                "    num = num*2\n" +
                "    print(\"{}. {} * 2 = {}\".format(cnt,no,num))\n" +
                "    cnt += 1";

        int[][] array_string_color = {{16,38},{55,81},{146,163}};
        int[][] array_keyword_color_1 = {{93,98}};
        int[][] array_keyword_color_2 = {{6,9},{10,15},{45,48},{49,54},{140,145}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{91,92},{134,135},{195,196}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number :- 5\n" +
                "Enter the value of n :- 20\n" +
                "1. 5 * 2 = 10\n" +
                "2. 10 * 2 = 20\n" +
                "3. 20 * 2 = 40\n" +
                "4. 40 * 2 = 80\n" +
                "5. 80 * 2 = 160\n" +
                "6. 160 * 2 = 320\n" +
                "7. 320 * 2 = 640\n" +
                "8. 640 * 2 = 1280\n" +
                "9. 1280 * 2 = 2560\n" +
                "10. 2560 * 2 = 5120\n" +
                "11. 5120 * 2 = 10240\n" +
                "12. 10240 * 2 = 20480\n" +
                "13. 20480 * 2 = 40960\n" +
                "14. 40960 * 2 = 81920\n" +
                "15. 81920 * 2 = 163840\n" +
                "16. 163840 * 2 = 327680\n" +
                "17. 327680 * 2 = 655360\n" +
                "18. 655360 * 2 = 1310720\n" +
                "19. 1310720 * 2 = 2621440\n" +
                "20. 2621440 * 2 = 5242880";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ExpandedFormOfNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountNumberOfRepeatedLettersInString.class);
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