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

public class PythonExceptionHandlingRaise extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_exception_handling_raise);

        int[][] array_string_color;
        int[][] array_keyword_color_1;
        int[][] array_keyword_color_2;
        int[][] array_self_color;
        int[][] array_end_color;
        int[][] array_number_color;
        int[][] array_function_name_color;
        int[][] array_comments;

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python exception handling raise");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "age = int(input(\"Enter the age: \"))\n" +
                "if age>0:\n" +
                "        print(\"Valid age\")\n" +
                "else:\n" +
                "    raise ValueError(\"age should not be negative\")";

        array_string_color = new int[][]{{16,33},{60,71},{100,128}};
        array_keyword_color_1 = new int[][]{{36,38},{73,77},{83,88}};
        array_keyword_color_2 = new int[][]{{6,9},{10,15},{54,59},{89,99}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{43,44}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the age: -23\n" +
                "Traceback (most recent call last):\n" +
                "  File \"C:\\Users\\Admin\\AppData\\Local\\Programs\\Python\\Python39\\temp.py\", line 5, in <module>\n" +
                "    raise ValueError(\"age should not be negative\")\n" +
                "ValueError: age should not be negative";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "percentage = float(input(\"Enter the percentage: \"))\n" +
                "if percentage>=0 and percentage<=100:\n" +
                "        print(\"Valid percentage\")\n" +
                "else:\n" +
                "    raise Exception(\"Invalid percentage\")";

        array_string_color = new int[][]{{25,49},{104,122},{150,170}};
        array_keyword_color_1 = new int[][]{{52,54},{69,72},{124,128},{134,139}};
        array_keyword_color_2 = new int[][]{{13,18},{19,24},{98,103},{140,149}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{67,68},{85,88}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the percentage: 90.29\n" +
                "Valid percentage";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Division\")\n" +
                "a = int(input(\"Enter the value of a: \"))\n" +
                "b = int(input(\"Enter the value of b: \"))\n" +
                "if b!=0:\n" +
                "    print(\"a/b:\",a//b)\n" +
                "else:\n" +
                "    raise ZeroDivisionError(\"Cannot divide by zero\")";

        array_string_color = new int[][]{{6,16},{32,56},{73,97},{119,125},{166,189}};
        array_keyword_color_1 = new int[][]{{100,102},{132,136},{142,147}};
        array_keyword_color_2 = new int[][]{{0,5},{22,25},{26,31},{63,66},{67,72},{113,118},{148,165}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{106,107}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Division\n" +
                "Enter the value of a: 43\n" +
                "Enter the value of b: 0\n" +
                "Traceback (most recent call last):\n" +
                "  File \"C:\\Users\\Admin\\AppData\\Local\\Programs\\Python\\Python39\\temp.py\", line 7, in <module>\n" +
                "    raise ZeroDivisionError(\"Cannot divide by zero\")\n" +
                "ZeroDivisionError: Cannot divide by zero";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFinally.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python print statement");
            String shareMessage = "Python print statement" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}