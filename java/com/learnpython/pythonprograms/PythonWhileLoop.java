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

public class PythonWhileLoop extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_while_loop);

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
        actionBar.setTitle("Python while loop");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "i = 1\n" +
                "\n" +
                "while i<=5:\n" +
                "    print(\"Welcome to python programming\")\n" +
                "    i += 1";

        array_string_color = new int[][]{{29,60}};
        array_keyword_color_1 = new int[][]{{7,12}};
        array_keyword_color_2 = new int[][]{{23,28}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{4,5},{16,17},{71,72}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Welcome to python programming\n" +
                "Welcome to python programming\n" +
                "Welcome to python programming\n" +
                "Welcome to python programming\n" +
                "Welcome to python programming";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"***  sum of digits of number program  ***\")\n" +
                "\n" +
                "number = int(input(\"Enter the number :- \"))\n" +
                "num = number\n" +
                "sum = 0\n" +
                "                   \n" +
                "while number>0:\n" +
                "    remainder = number%10\n" +
                "    sum += remainder\n" +
                "    number //= 10\n" +
                "\n" +
                "print(\"Sum of digits of\",num,\"is\",sum)";

        array_string_color = new int[][]{{6,49},{71,93},{225,243},{248,252}};
        array_keyword_color_1 = new int[][]{{137,142}};
        array_keyword_color_2 = new int[][]{{0,5},{61,64},{65,70},{219,224}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{115,116},{150,151},{176,178},{215,217}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "***  sum of digits of number program  ***\n" +
                "Enter the number :- 827\n" +
                "Sum of digits of 827 is 17";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"***  Printing 1 to 100 numbers  ***\")\n" +
                "\n" +
                "i = 1\n" +
                "\n" +
                "while i<=10:\n" +
                "    j = 1\n" +
                "    inc = i\n" +
                "    while j<=10:\n" +
                "        print(inc,end=\" \")\n" +
                "        inc += 10\n" +
                "        j += 1\n" +
                "    print()\n" +
                "    i += 1";

        array_string_color = new int[][]{{6,43},{127,130}};
        array_keyword_color_1 = new int[][]{{53,58},{92,97}};
        array_keyword_color_2 = new int[][]{{0,5},{113,118},{169,174}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{123,126}};
        array_number_color = new int[][]{{50,51},{62,64},{74,75},{101,103},{147,149},{163,164},{186,187}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "***  Printing 1 to 100 numbers  ***\n" +
                "1 11 21 31 41 51 61 71 81 91 \n" +
                "2 12 22 32 42 52 62 72 82 92 \n" +
                "3 13 23 33 43 53 63 73 83 93 \n" +
                "4 14 24 34 44 54 64 74 84 94 \n" +
                "5 15 25 35 45 55 65 75 85 95 \n" +
                "6 16 26 36 46 56 66 76 86 96 \n" +
                "7 17 27 37 47 57 67 77 87 97 \n" +
                "8 18 28 38 48 58 68 78 88 98 \n" +
                "9 19 29 39 49 59 69 79 89 99 \n" +
                "10 20 30 40 50 60 70 80 90 100 ";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"***  Printing 1 to 10 tables  ***\\n\")\n" +
                "\n" +
                "i = 1\n" +
                "\n" +
                "while i<=10:\n" +
                "    count = i\n" +
                "    j = 1\n" +
                "    while j<=10:\n" +
                "        print(count,end=\" \")\n" +
                "        count = count + i\n" +
                "        j += 1\n" +
                "    print()\n" +
                "    i += 1";

        array_string_color = new int[][]{{6,40},{42,43},{131,134}};
        array_keyword_color_1 = new int[][]{{40,42},{53,58},{94,99}};
        array_keyword_color_2 = new int[][]{{0,5},{115,120},{181,186}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{127,130}};
        array_number_color = new int[][]{{50,51},{62,64},{88,89},{103,105},{175,176},{198,199}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "***  Printing 1 to 10 tables  ***\n" +
                "\n" +
                "1 2 3 4 5 6 7 8 9 10 \n" +
                "2 4 6 8 10 12 14 16 18 20 \n" +
                "3 6 9 12 15 18 21 24 27 30 \n" +
                "4 8 12 16 20 24 28 32 36 40 \n" +
                "5 10 15 20 25 30 35 40 45 50 \n" +
                "6 12 18 24 30 36 42 48 54 60 \n" +
                "7 14 21 28 35 42 49 56 63 70 \n" +
                "8 16 24 32 40 48 56 64 72 80 \n" +
                "9 18 27 36 45 54 63 72 81 90 \n" +
                "10 20 30 40 50 60 70 80 90 100 ";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);




        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonForLoop.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonIfElse.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python while loop");
            String shareMessage = "Python while loop" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nExample 4:\n\n" + example4 +
                    "\n\nOutput :-\n\n" + output4 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }

        return super.onOptionsItemSelected(item);
    }
}