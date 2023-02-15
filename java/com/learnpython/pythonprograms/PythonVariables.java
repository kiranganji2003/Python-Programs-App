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

public class PythonVariables extends AppCompatActivity {

    String example1,example2,example3,example4,example5,example6;
    String output1,output2,output3,output4,output5,output6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_variables);

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
        actionBar.setTitle("Python variables");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "x = 10\n" +
                "print(\"Value of variable x =\",x)";

        array_string_color = new int[][]{{13,36}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{7,12}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{4,6}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Value of variable x = 10";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "x = 12\n" +
                "y = 15\n" +
                "sum = x+y\n" +
                "print(\"Sum =\",sum)";

        array_string_color = new int[][]{{30,37}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{24,29}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{4,6},{11,13}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Sum = 27";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        example3 = "variable1, variable2 = 10, 12\n" +
                "multiplication = variable1*variable2\n" +
                "print(\"Multiplication is\",multiplication)";

        array_string_color = new int[][]{{73,92}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{67,72}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{23,25},{27,29}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Multiplication is 120";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "count = 10\n" +
                "print(count)\n" +
                "count = count+2\n" +
                "print(count)\n" +
                "count += 2\n" +
                "print(count)";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{11,16},{40,45},{64,69}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{8,10},{38,39},{62,63}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "10\n" +
                "12\n" +
                "14";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        example5 = "str1 = \"Hello \"\n" +
                "print(str1)\n" +
                "str2 = \"This is a string\"\n" +
                "print(str2)\n" +
                "str3 = str1+str2\n" +
                "print(str3)";

        array_string_color = new int[][]{{7,15},{35,53}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{16,21},{54,59},{83,88}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "Hello \n" +
                "This is a string\n" +
                "Hello This is a string";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        example6 = "string = \"This is string value\"\n" +
                "print(\"Length =\",len(string))\n" +
                "print(\"string[0] =\",string[0])\n" +
                "print(\"string[5] =\",string[5])\n" +
                "print(\"string[-1] =\",string[-1])\n" +
                "print(\"string[-2] =\",string[-2])\n" +
                "\n" +
                "length = len(string)\n" +
                "print(\"string[-length] =\",string[-length])\n" +
                "print(\"string[0:7] =\",string[0:7])\n" +
                "print(\"string[8:length] =\",string[8:length])\n" +
                "print(\"string[1:] =\",string[1:])\n" +
                "print(\"string[:14] =\",string[:14])\n" +
                "print(\"Hello\",string[8:14])";

        array_string_color = new int[][]{{9,31},{38,48},{68,81},{99,112},{130,144},{163,177},{218,237},{261,276},{296,316},{341,355},{374,389},{409,416}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{32,37},{49,52},{62,67},{93,98},{124,129},{157,162},{200,203},{212,217},{255,260},{290,295},{335,340},{368,373},{403,408}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{89,90},{120,121},{153,154},{186,187},{284,285},{286,287},{324,325},{363,364},{398,400},{424,425},{426,428}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.example6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(example6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output6 += "Length = 20\n" +
                "string[0] = T\n" +
                "string[5] = i\n" +
                "string[-1] = e\n" +
                "string[-2] = u\n" +
                "string[-length] = T\n" +
                "string[0:7] = This is\n" +
                "string[8:length] = string value\n" +
                "string[1:] = his is string value\n" +
                "string[:14] = This is string\n" +
                "Hello string";
        TextView t_out6 = findViewById(R.id.output6);
        t_out6.setText(output6);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonList.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python variables");
            String shareMessage = "Python variables" +
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