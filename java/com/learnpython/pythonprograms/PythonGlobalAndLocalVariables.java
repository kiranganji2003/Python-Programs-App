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

public class PythonGlobalAndLocalVariables extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_global_and_local_variables);

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
        actionBar.setTitle("Python local and global variables");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "data = 100\n" +
                "print(\"Data =\",data)\n" +
                "\n" +
                "\n" +
                "def let_me_change_value(value):    \n" +
                "    print(\"\\nAccessing global variable inside function\")\n" +
                "    global data\n" +
                "    data = value\n" +
                "    print(\"\\nAfter changing value\")\n" +
                "    print(\"Inside function: Data =\",data)\n" +
                "\n" +
                "\n" +
                "let_me_change_value(400)\n" +
                "print(\"Outside function: Data =\",data)";

        array_string_color = new int[][]{{17,25},{80,81},{83,125},{170,171},{173,194},{206,231},{271,297}};
        array_keyword_color_1 = new int[][]{{34,37},{81,83},{131,137},{171,173}};
        array_keyword_color_2 = new int[][]{{11,16},{74,79},{164,169},{200,205},{265,270}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{7,10},{260,263}};
        array_function_name_color = new int[][]{{38,57}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Data = 100\n" +
                "\n" +
                "Accessing global variable inside function\n" +
                "\n" +
                "After changing value\n" +
                "Inside function: Data = 400\n" +
                "Outside function: Data = 400";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "def Greater():\n" +
                "    global num1,num2\n" +
                "    if num1>num2:\n" +
                "        print(num1,\"is greater\")\n" +
                "    elif num2>num1:\n" +
                "        print(num2,\"is greater\")\n" +
                "    else:\n" +
                "        print(\"Both are equal\")\n" +
                "\n" +
                "\n" +
                "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "Greater()";

        array_string_color = new int[][]{{73,85},{126,138},{164,180},{201,221},{241,261}};
        array_keyword_color_1 = new int[][]{{0,3},{19,25},{40,42},{91,95},{144,148}};
        array_keyword_color_2 = new int[][]{{62,67},{115,120},{158,163},{191,194},{195,200},{231,234},{235,240}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,11}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter number 1 :- 65\n" +
                "Enter number 2 :- 35\n" +
                "65 is greater";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Accessing local and global variable of same name inside function\")\n" +
                "\n" +
                "my_data = 500\n" +
                "print(\"\\nGlobal variable: my_data =\",my_data)\n" +
                "\n" +
                "\n" +
                "def function():\n" +
                "    my_data = globals()['my_data']\n" +
                "    my_data = my_data*2\n" +
                "    print(\"Local variable: my_data =\",my_data)\n" +
                "\n" +
                "\n" +
                "function()\n" +
                "print(\"Global variable: my_data =\",my_data)";

        array_string_color = new int[][]{{6,72},{95,96},{98,125},{177,186},{222,249},{278,306}};
        array_keyword_color_1 = new int[][]{{96,98},{137,140}};
        array_keyword_color_2 = new int[][]{{0,5},{89,94},{167,174},{216,221},{272,277}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{85,88},{210,211}};
        array_function_name_color = new int[][]{{141,149}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Accessing local and global variable of same name inside function\n" +
                "\n" +
                "Global variable: my_data = 500\n" +
                "Local variable: my_data = 1000\n" +
                "Global variable: my_data = 500";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonRecursion.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonKeywordArguments.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python local and global variables");
            String shareMessage = "Python local and global variables" +
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