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

public class FindLCMOfThreeNumbers extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_lcmof_three_numbers);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find Least Common Multiple of three numbers";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "num3 = int(input(\"Enter number 3 :- \"))\n" +
                "greater = 0\n" +
                "\n" +
                "if num1>num2 and num1>num3:\n" +
                "    greater = num1\n" +
                "elif num2>num1 and num2>num3:\n" +
                "    greater = num2\n" +
                "elif num3>num1 and num3>num2:\n" +
                "    greater = num3\n" +
                "else:\n" +
                "    greater = num1\n" +
                "\n" +
                "\n" +
                "while 1:\n" +
                "    if greater%num1==0 and greater%num2==0 and greater%num3==0:\n" +
                "        print(\"\\nLCM of {}, {} and {} is {}\".format(num1,num2,num3,greater))\n" +
                "        break\n" +
                "    greater += 1";

        int[][] array_string_color = {{17,37},{57,77},{97,117},{392,393},{395,422}};
        int[][] array_keyword_color_1 = {{133,135},{146,149},{180,184},{195,198},{229,234},{244,247},{278,282},{305,310},{318,320},{337,340},{357,360},{393,395},{463,468}};
        int[][] array_keyword_color_2 = {{7,10},{11,16},{47,50},{51,56},{87,90},{91,96},{386,391}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{130,131},{311,312},{335,336},{355,356},{375,376},{484,485}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter number 1 :- 35\n" +
                "Enter number 2 :- 27\n" +
                "Enter number 3 :- 47\n" +
                "\n" +
                "LCM of 35, 27 and 47 is 44415";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfNumbersFromXToY.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindLCMOfTwoNumbers.class);
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