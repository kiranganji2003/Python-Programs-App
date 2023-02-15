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

public class DisplayTheMonthAndNumberOfDays extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_the_month_and_number_of_days);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Accept the month in number and display the month name and number of days";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "months = {\n" +
                "    1:{\"January\":\"31 days\"},\n" +
                "    2:{\"February\":\"28 or 29 days\"},\n" +
                "    3:{\"March\":\"31 days\"},\n" +
                "    4:{\"April\":\"30 days\"},\n" +
                "    5:{\"May\":\"31 days\"},\n" +
                "    6:{\"June\":\"30 days\"},\n" +
                "    7:{\"July\":\"31 days\"},\n" +
                "    8:{\"August\":\"31 days\"},\n" +
                "    9:{\"September\":\"30 days\"},\n" +
                "    10:{\"October\":\"31 days\"},\n" +
                "    11:{\"November\":\"30 days\"},\n" +
                "    12:{\"December\":\"31 days\"}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "month_no = int(input(\"Enter the month in number :- \"))\n" +
                "\n" +
                "flag = 0\n" +
                "for i,j in months.items():\n" +
                "    if i==month_no:\n" +
                "        flag = 1\n" +
                "        for mon,day in j.items():\n" +
                "            print(\"Month :-\",mon)\n" +
                "            print(\"Days :-\",day)\n" +
                "        break\n" +
                "\n" +
                "if flag!=1:\n" +
                "    print(\"Invalid\")";

        int[][] array_string_color = {{18,27},{28,37},{47,57},{58,73},{83,90},{91,100},{110,117},{118,127},{137,142},{143,152},{162,168},{169,178},{188,194},{195,204},{214,222},{223,232},{242,253},{254,263},{274,283},{284,293},{304,314},{315,324},{335,345},{346,355},{382,413},{542,552},{576,585},{628,637}};
        int[][] array_keyword_color_1 = {{426,429},{434,436},{457,459},{498,501},{510,512},{599,604},{606,608}};
        int[][] array_keyword_color_2 = {{372,375},{376,381},{536,541},{570,575},{622,627}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{15,16},{44,45},{80,81},{107,108},{134,135},{159,160},{185,186},{211,212},{239,240},{270,272},{300,302},{331,333},{424,425},{488,489},{615,616}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the month in number :- 4\n" +
                "Month :- April\n" +
                "Days :- 30 days";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ConvertTheBinaryNumberIntoDecimal.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindKthDigitOfNumber.class);
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