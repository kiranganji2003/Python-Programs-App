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

public class PythonLambdaFunction extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_lambda_function);

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
        actionBar.setTitle("Python lambda function");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"lambda function to return square of number\\n\")\n" +
                "\n" +
                "sqr = lambda a:a*a\n" +
                "\n" +
                "num = int(input(\"Enter the number :- \"))\n" +
                "result = sqr(num)\n" +
                "print(\"Square of\",num,\"is\",result)";

        array_string_color = new int[][]{{6,49},{51,52},{91,113},{140,151},{156,160}};
        array_keyword_color_1 = new int[][]{{49,51},{61,67}};
        array_keyword_color_2 = new int[][]{{0,5},{81,84},{85,90},{134,139}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "lambda function to return square of number\n" +
                "\n" +
                "Enter the number :- 45\n" +
                "Square of 45 is 2025";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"lambda function to return cube of number\\n\")\n" +
                "\n" +
                "cube = lambda a:a*a*a\n" +
                "\n" +
                "num = int(input(\"Enter the number :- \"))\n" +
                "result = cube(num)\n" +
                "print(\"Cube of\",num,\"is\",result)";

        array_string_color = new int[][]{{6,47},{49,50},{92,114},{142,151},{156,160}};
        array_keyword_color_1 = new int[][]{{47,49},{60,66}};
        array_keyword_color_2 = new int[][]{{0,5},{82,85},{86,91},{136,141}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "lambda function to return cube of number\n" +
                "\n" +
                "Enter the number :- 10\n" +
                "Cube of 10 is 1000";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"lambda function to return sum of 3 number\\n\")\n" +
                "\n" +
                "sum = lambda a,b,c:a+b+c\n" +
                "\n" +
                "result = sum(int(input(\"Enter the number1 :- \")),int(input(\"Enter the number2 :- \")),int(input(\"Enter the number3 :- \")))\n" +
                "\n" +
                "print(\"Sum =\",result)";

        array_string_color = new int[][]{{6,48},{50,51},{103,126},{139,162},{175,198},{209,216}};
        array_keyword_color_1 = new int[][]{{48,50},{60,66}};
        array_keyword_color_2 = new int[][]{{0,5},{89,92},{93,96},{97,102},{129,132},{133,138},{165,168},{169,174},{203,208}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "lambda function to return sum of 3 number\n" +
                "\n" +
                "Enter the number1 :- 17\n" +
                "Enter the number2 :- 18\n" +
                "Enter the number3 :- 19\n" +
                "Sum = 54";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"lambda function to return the result of formula\")\n" +
                "print(\"(a+b)^2 = a^2+b^2+2*a*b\\n\")\n" +
                "\n" +
                "formula = lambda a,b : a*a+b*b+2*a*b\n" +
                "\n" +
                "a = int(input(\"Enter the value of a :- \"))\n" +
                "b = int(input(\"Enter the value of b :- \"))\n" +
                "result = formula(a,b)\n" +
                "\n" +
                "print(\"({}+{})^2 = {}\".format(a,b,result))";

        array_string_color = new int[][]{{6,55},{63,87},{89,90},{145,171},{188,214},{246,262}};
        array_keyword_color_1 = new int[][]{{87,89},{103,109}};
        array_keyword_color_2 = new int[][]{{0,5},{57,62},{135,138},{139,144},{178,181},{182,187},{240,245}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{124,125}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "lambda function to return the result of formula\n" +
                "(a+b)^2 = a^2+b^2+2*a*b\n" +
                "\n" +
                "Enter the value of a :- 9\n" +
                "Enter the value of b :- 6\n" +
                "(9+6)^2 = 225";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonRecursion.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python lambda function");
            String shareMessage = "Python lambda function" +
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