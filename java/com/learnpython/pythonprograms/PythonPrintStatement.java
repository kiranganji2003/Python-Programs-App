package com.learnpython.pythonprograms;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class PythonPrintStatement extends AppCompatActivity {
    String example1,example2,example3,example4,example5,example6,example7,example8,example9,example10;
    String output1,output2,output3,output4,output5,output6,output7,output8,output9,output10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_print_statement);

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
        actionBar.setTitle("Python print statement");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"Hello World!\")";

        array_string_color = new int[][]{{6,20}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Hello World!";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"print statement used to display messages on output screen\")";

        array_string_color = new int[][]{{6,65}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "print statement used to display messages on output screen";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Hello\")\n" +
                "print(\"This is new line\")\n" +
                "print(\"Hello\\nThis is new line\")";

        array_string_color = new int[][]{{6,13},{21,39},{47,53},{55,72}};
        array_keyword_color_1 = new int[][]{{53,55}};
        array_keyword_color_2 = new int[][]{{0,5},{15,20},{41,46}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Hello\n" +
                "This is new line\n" +
                "Hello\n" +
                "This is new line";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(5 * \"This line print 5 times\\n\")";

        array_string_color = new int[][]{{10,34},{36,37}};
        array_keyword_color_1 = new int[][]{{34,36}};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{6,7}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "This line print 5 times\n" +
                "This line print 5 times\n" +
                "This line print 5 times\n" +
                "This line print 5 times\n" +
                "This line print 5 times\n";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        example5 = "print(\"Hello \\t this is tabular space\")";

        array_string_color = new int[][]{{6,13},{15,38}};
        array_keyword_color_1 = new int[][]{{13,15}};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "Hello \t this is tabular space";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        example6 = "print(10+20)";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{6,8},{9,11}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.example6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(example6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output6 = "30";
        TextView t_out6 = findViewById(R.id.output6);
        t_out6.setText(output6);

        example7 = "print(\"10 + 5 * 4 =\",(10+5*4))";

        array_string_color = new int[][]{{6,20}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{22,24},{25,26},{27,28}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex7 = findViewById(R.id.example7);
        t_ex7.setText(ColouredProgramText.execute(new SpannableString(example7),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output7 = "10 + 5 * 4 = 30";
        TextView t_out7 = findViewById(R.id.output7);
        t_out7.setText(output7);

        example8 = "print(\"Addition: 35 + 10 =\",(35+10))\n" +
                "print(\"Subtraction: 35 - 10 =\",(35-10))\n" +
                "print(\"Multiplication: 35 * 10 =\",(35*10))\n" +
                "print(\"Floating division: 35 / 10 =\",(35/10))\n" +
                "print(\"Integer division: 35 // 10 =\",(35//10))\n" +
                "print(\"Module: 35 % 10 =\",(35%10))\n" +
                "print(\"Exponential: 2 ** 4 =\",(2**4))";

        array_string_color = new int[][]{{6,27},{43,67},{83,110},{126,156},{172,202},{219,238},{254,277}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5},{37,42},{77,82},{120,125},{166,171},{213,218},{248,253}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{29,31},{32,34},{69,71},{72,74},{112,114},{115,117},{158,160},{161,163},{204,206},{208,210},{240,242},{243,245},{279,280},{282,283}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex8 = findViewById(R.id.example8);
        t_ex8.setText(ColouredProgramText.execute(new SpannableString(example8),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output8 = "Addition: 35 + 10 = 45\n" +
                "Subtraction: 35 - 10 = 25\n" +
                "Multiplication: 35 * 10 = 350\n" +
                "Floating division: 35 / 10 = 3.5\n" +
                "Integer division: 35 // 10 = 3\n" +
                "Module: 35 % 10 = 5\n" +
                "Exponential: 2 ** 4 = 16";
        TextView t_out8 = findViewById(R.id.output8);
        t_out8.setText(output8);

        example9 = "print(\"Is 15 > 10 :\",(15>10))";

        array_string_color = new int[][]{{6,20}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{22,24},{25,27}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex9 = findViewById(R.id.example9);
        t_ex9.setText(ColouredProgramText.execute(new SpannableString(example9),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output9 = "Is 15 > 10 : True";
        TextView t_out9 = findViewById(R.id.output9);
        t_out9.setText(output9);

        example10 = "print(\"Is 15 > 25 :\",(15>25))";

        array_string_color = new int[][]{{6,20}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{22,24},{25,27}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex10 = findViewById(R.id.example10);
        t_ex10.setText(ColouredProgramText.execute(new SpannableString(example10),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output10 = "Is 15 > 25 : False";
        TextView t_out10 = findViewById(R.id.output10);
        t_out10.setText(output10);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonComments.class);
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
                    "\n\n\nExample 4:\n\n" + example4 +
                    "\n\nOutput :-\n\n" + output4 +
                    "\n\n\nExample 5:\n\n" + example5 +
                    "\n\nOutput :-\n\n" + output5 +
                    "\n\n\nExample 6:\n\n" + example6 +
                    "\n\nOutput :-\n\n" + output6 +
                    "\n\n\nExample 7:\n\n" + example7 +
                    "\n\nOutput :-\n\n" + output7 +
                    "\n\n\nExample 8:\n\n" + example8 +
                    "\n\nOutput :-\n\n" + output8 +
                    "\n\n\nExample 9:\n\n" + example9 +
                    "\n\nOutput :-\n\n" + output9 +
                    "\n\n\nExample 10:\n\n" + example10 +
                    "\n\nOutput :-\n\n" + output10 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}