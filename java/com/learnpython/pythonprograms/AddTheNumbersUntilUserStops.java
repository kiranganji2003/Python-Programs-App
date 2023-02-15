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

public class AddTheNumbersUntilUserStops extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_the_numbers_until_user_stops);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Add the numbers until user enter stop";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "print(\"Enter stop to stop the input\\n\")\n" +
                "\n" +
                "sum = 0\n" +
                "\n" +
                "while 1:\n" +
                "    inp = input()\n" +
                "    if inp.isnumeric():\n" +
                "        sum += int(inp)\n" +
                "    elif inp.lower()==\"stop\":\n" +
                "        print(\"Total sum :-\",sum)\n" +
                "        break\n" +
                "    else:\n" +
                "        print(\"Enter valid input\")";

        int[][] array_string_color = {{6,35},{37,38},{147,153},{169,183},{227,246}};
        int[][] array_keyword_color_1 = {{35,37},{50,55},{81,83},{129,133},{197,202},{207,211}};
        int[][] array_keyword_color_2 = {{0,5},{69,74},{116,119},{163,168},{221,226}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{47,48},{56,57}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter stop to stop the input\n" +
                "\n" +
                "40\n" +
                "45\n" +
                "15\n" +
                "17\n" +
                "23\n" +
                "20\n" +
                "stop\n" +
                "Total sum :- 160";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindKthDigitOfNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountingDigits.class);
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