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

public class DisplayPerfectSquareNumbersFromOneToN extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_perfect_square_numbers_from_one_to_n);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Display perfect square numbers from 1 to N";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "N = int(input(\"Enter the value of N :- \"))\n" +
                "\n" +
                "num = 1\n" +
                "perfect_square = []\n" +
                "\n" +
                "while 1:\n" +
                "    square = num*num\n" +
                "    if square <= N:\n" +
                "        perfect_square.append(square)\n" +
                "    else:\n" +
                "        break\n" +
                "    num += 1\n" +
                "\n" +
                "print(\"Perfect square numbers from 1 to\",N,\"\\n\")\n" +
                "\n" +
                "for i in perfect_square:\n" +
                "    print(i)";
        int[][] array_string_color = {{14,40},{205,239},{242,243},{245,246}};
        int[][] array_keyword_color_1 = {{73,78},{107,109},{165,169},{179,184},{243,245},{249,252},{255,257}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{199,204},{278,283}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{50,51},{79,80},{196,197}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));       output1 = "Enter the value of N :- 1000\n" +
                "Perfect square numbers from 1 to 1000 \n" +
                "\n" +
                "1\n" +
                "4\n" +
                "9\n" +
                "16\n" +
                "25\n" +
                "36\n" +
                "49\n" +
                "64\n" +
                "81\n" +
                "100\n" +
                "121\n" +
                "144\n" +
                "169\n" +
                "196\n" +
                "225\n" +
                "256\n" +
                "289\n" +
                "324\n" +
                "361\n" +
                "400\n" +
                "441\n" +
                "484\n" +
                "529\n" +
                "576\n" +
                "625\n" +
                "676\n" +
                "729\n" +
                "784\n" +
                "841\n" +
                "900\n" +
                "961";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckPasswordIsStrongOrNot.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountAndSayNumbers.class);
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