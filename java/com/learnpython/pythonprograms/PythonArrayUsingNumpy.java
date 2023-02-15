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

public class PythonArrayUsingNumpy extends AppCompatActivity {

    String example1,example2,example3,example4,example5,example6;
    String output1,output2,output3,output4,output5,output6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_array_using_numpy);

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
        actionBar.setTitle("Python array using numpy");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "from numpy import *\n" +
                "\n" +
                "animals = array([\"Tiger\",\"Lion\",\"Elephant\",\"Deer\",\"Monkey\"])\n" +
                "\n" +
                "for i in animals:\n" +
                "    print(i)\n" +
                "\n" +
                "print(\"\\nSorting array elements\")\n" +
                "animals.sort()\n" +
                "\n" +
                "for i in animals:\n" +
                "    print(i)";

        array_string_color = new int[][]{{38,45},{46,51},{53,63},{64,70},{71,79},{121,122},{124,147}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{83,87},{89,91},{122,124},{165,168},{171,173}};
        array_keyword_color_2 = new int[][]{{105,110},{115,120},{187,192}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Tiger\n" +
                "Lion\n" +
                "Elephant\n" +
                "Deer\n" +
                "Monkey\n" +
                "\n" +
                "Sorting array elements\n" +
                "Deer\n" +
                "Elephant\n" +
                "Lion\n" +
                "Monkey\n" +
                "Tiger";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "from numpy import *\n" +
                "\n" +
                "print(\"Numpy linespace function\\n\")\n" +
                "\n" +
                "start = 0\n" +
                "end = 50\n" +
                "steps = 10\n" +
                "\n" +
                "arr = linspace(start,end,steps)\n" +
                "\n" +
                "for i in arr:\n" +
                "    print(i)";

        array_string_color = new int[][]{{27,52},{54,55}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{52,54},{122,125},{128,130}};
        array_keyword_color_2 = new int[][]{{21,26},{140,145}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{66,67},{74,76},{85,87}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Numpy linespace function\n" +
                "\n" +
                "0.0\n" +
                "5.555555555555555\n" +
                "11.11111111111111\n" +
                "16.666666666666664\n" +
                "22.22222222222222\n" +
                "27.77777777777778\n" +
                "33.33333333333333\n" +
                "38.888888888888886\n" +
                "44.44444444444444\n" +
                "50.0";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "from numpy import *\n" +
                "\n" +
                "print(\"Numpy arange function\\n\")\n" +
                "\n" +
                "start = 1\n" +
                "end = 100\n" +
                "steps = 8\n" +
                "\n" +
                "arr = arange(start,end,steps)\n" +
                "\n" +
                "for i in arr:\n" +
                "    print(i)";

        array_string_color = new int[][]{{27,49},{51,52}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{49,51},{117,120},{123,125}};
        array_keyword_color_2 = new int[][]{{21,26},{135,140}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{63,64},{71,74},{83,84}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Numpy arange function\n" +
                "\n" +
                "1\n" +
                "9\n" +
                "17\n" +
                "25\n" +
                "33\n" +
                "41\n" +
                "49\n" +
                "57\n" +
                "65\n" +
                "73\n" +
                "81\n" +
                "89\n" +
                "97";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "from numpy import *\n" +
                "\n" +
                "print(\"Numpy logspace function\\n\")\n" +
                "\n" +
                "start = 1\n" +
                "end = 10\n" +
                "steps = 4\n" +
                "\n" +
                "arr = logspace(start,end,steps)\n" +
                "\n" +
                "for i in arr:\n" +
                "    print(i)";

        array_string_color = new int[][]{{27,51},{53,54}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{51,53},{120,123},{126,128}};
        array_keyword_color_2 = new int[][]{{21,26},{138,143}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{65,66},{73,75},{84,85}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Numpy logspace function\n" +
                "\n" +
                "10.0\n" +
                "10000.0\n" +
                "10000000.0\n" +
                "10000000000.0";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        example5 = "from numpy import *\n" +
                "\n" +
                "print(\"Numpy zeros function\\n\")\n" +
                "\n" +
                "total = 5\n" +
                "arr = zeros(total,int)\n" +
                "\n" +
                "for i in arr:\n" +
                "    print(i)";

        array_string_color = new int[][]{{27,48},{50,51}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{48,50},{88,91},{94,96}};
        array_keyword_color_2 = new int[][]{{21,26},{82,85},{106,111}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{62,63}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "Numpy zeros function\n" +
                "\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "0";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        example6 = "from numpy import *\n" +
                "\n" +
                "print(\"Numpy ones function\\n\")\n" +
                "\n" +
                "total = 5\n" +
                "arr = ones(total,int)\n" +
                "\n" +
                "for i in arr:\n" +
                "    print(i)";

        array_string_color = new int[][]{{27,47},{49,50}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{47,49},{86,89},{92,94}};
        array_keyword_color_2 = new int[][]{{21,26},{80,83},{104,109}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{61,62}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.example6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(example6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output6 = "Numpy ones function\n" +
                "\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1";
        TextView t_out6 = findViewById(R.id.output6);
        t_out6.setText(output6);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultidimenstionalArray.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonArray.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python array using numpy");
            String shareMessage = "Python array using numpy" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nExample 4:\n\n" + example4 +
                    "\n\nOutput :-\n\n" + output4 +
                    "\n\n\nExample 5:\n\n" + example5 +
                    "\n\nOutput :-\n\n" + output5 +
                    "\n\n\nExample 6:\n\n" + example6 +
                    "\n\nOutput :-\n\n" + output6 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}