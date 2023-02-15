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

public class TimeConversion extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_conversion);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Given a time in 12-hour AM/PM format convert it to 24-hour time format";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "time = input(\"Enter the time :- \")\n" +
                "\n" +
                "hr = int(time[0:2])\n" +
                "mm = int(time[3:5])\n" +
                "ss = int(time[6:8])\n" +
                "format = time[9:11]\n" +
                "\n" +
                "\n" +
                "if hr>12 or hr<0 or mm>59 or mm<0 or ss>59 or ss<0:\n" +
                "    print(\"Invalid time\")\n" +
                "else:\n" +
                "    if format.lower()==\"am\":\n" +
                "        if hr==12:\n" +
                "            hr = 00\n" +
                "    elif format.lower()==\"pm\":\n" +
                "        if hr!=12:\n" +
                "            hr += 12\n" +
                "    else:\n" +
                "        print(\"Invalid format\")\n" +
                "\n" +
                "if hr!=0:\n" +
                "    if format.lower()==\"am\":\n" +
                "        print(\"Time in 24 hours format : {}:{}:{}\".format(time[0:2],time[3:5],time[6:8]))\n" +
                "    else:\n" +
                "        print(\"Time in 24 hours format : {}:{}:{}\".format(hr,time[3:5],time[6:8]))\n" +
                "else:\n" +
                "    print(\"Time in 24 hours format : 00:{}:{}\".format(time[3:5],time[6:8]))";

        int[][] array_string_color = {{13,33},{180,194},{225,229},{295,299},{365,381},{417,421},{437,473},{537,573},{622,658}};
        int[][] array_keyword_color_1 = {{118,120},{127,129},{135,137},{144,146},{152,154},{161,163},{196,200},{206,208},{239,241},{274,278},{309,311},{345,349},{384,386},{398,400},{517,521},{606,610}};
        int[][] array_keyword_color_2 = {{7,12},{41,44},{61,64},{81,84},{174,179},{359,364},{431,436},{531,536},{616,621}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{50,51},{52,53},{70,71},{72,73},{90,91},{92,93},{110,111},{112,114},{124,126},{133,134},{141,143},{150,151},{158,160},{167,168},{246,248},{267,269},{316,318},{338,340},{391,392},{486,487},{488,489},{496,497},{498,499},{506,507},{508,509},{589,590},{591,592},{599,600},{601,602},{671,672},{673,674},{681,682},{683,684}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the time :- 03:43:18:PM\n" +
                "Time in 24 hours format : 15:43:18";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheStringIsPalindromOrNot.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindTheRatioOfElementsThatArePositiveNegativeAndZero.class);
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