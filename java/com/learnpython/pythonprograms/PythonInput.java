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

public class PythonInput extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_input);

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
        actionBar.setTitle("Python input");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"**** Student Info ****\")\n" +
                "\n" +
                "name = input(\"Enter student name :- \")\n" +
                "rollno = int(input(\"Enter student roll no. :- \"))\n" +
                "age = int(input(\"Enter student age :- \"))\n" +
                "\n" +
                "print(\"\\n**** Student Info ****\")\n" +
                "print(\"Name :- \",name)\n" +
                "print(\"Roll no. :- \",rollno)\n" +
                "print(\"Age :- \",age)";

        array_string_color = new int[][]{{6,30},{46,70},{91,119},{138,161},{171,172},{174,197},{205,215},{228,242},{257,266}};
        array_keyword_color_1 = new int[][]{{172,174}};
        array_keyword_color_2 = new int[][]{{0,5},{40,45},{81,84},{85,90},{128,131},{132,137},{165,170},{199,204},{222,227},{251,256}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "**** Student Info ****\n" +
                "Enter student name :- John Doe\n" +
                "Enter student roll no. :- 8\n" +
                "Enter student age :- 14\n" +
                "\n" +
                "**** Student Info ****\n" +
                "Name :-  John Doe\n" +
                "Roll no. :-  8\n" +
                "Age :-  14";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"**** Addition Program ****\")\n" +
                "\n" +
                "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "\n" +
                "result = num1 + num2\n" +
                "print(\"Addition =\",result)";

        array_string_color = new int[][]{{6,34},{54,74},{94,114},{145,157}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{0,5},{44,47},{48,53},{84,87},{88,93},{139,144}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "**** Addition Program ****\n" +
                "Enter number 1 :- 65\n" +
                "Enter number 2 :- 26\n" +
                "Addition = 91";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        example3 = "char = input(\"Enter any character :- \")[0]\n" +
                "print(\"You entered character :-\",char)";

        array_string_color = new int[][]{{13,38},{49,75}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{7,12},{43,48}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Enter any character :- S\n" +
                "You entered character :- S";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);



        example4 = "expr = input(\"Enter expression :- \")\n" +
                "result = eval(expr)\n" +
                "print(\"Result of\",expr,\" =\",result)\n" +
                "\n" +
                "num1 = int(input(\"Enter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "num3 = int(input(\"Enter number 3 :- \"))\n" +
                "\n" +
                "print(\"Minimum number :- \",min(num1,num2,num3))\n" +
                "print(\"Maximum number :- \",max(num1,num2,num3))";

        array_string_color = new int[][]{{13,35},{63,74},{80,84},{111,131},{151,171},{191,211},{221,241},{269,289}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{7,12},{46,50},{57,62},{101,104},{105,110},{141,144},{145,150},{181,184},{185,190},{215,220},{242,245},{263,268},{290,293}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Enter expression :- 2+9*5-10\n" +
                "Result of 2+9*5-10  = 37\n" +
                "Enter number 1 :- 43\n" +
                "Enter number 2 :- 54\n" +
                "Enter number 3 :- 49\n" +
                "Minimum number :-  43\n" +
                "Maximum number :-  54";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonIfElse.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonDictionary.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python input");
            String shareMessage = "Python input" +
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