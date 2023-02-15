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

public class PythonTypesOfFunctionArguments extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_types_of_function_arguments);

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
        actionBar.setTitle("Python types of function arguments");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"Default arguments\")\n" +
                "\n" +
                "def Employee(name,salary=10000):\n" +
                "    print(\"Name :-\",name)\n" +
                "    print(\"Salary :-\",salary)\n" +
                "\n" +
                "\n" +
                "print(\"\\nPassing two parameters to function\")\n" +
                "Employee(\"Ankit\",17000)\n" +
                "\n" +
                "print(\"\\nPassing one parameter to function\")\n" +
                "Employee(\"Rakesh\")";

        array_string_color = new int[][]{{6,25},{71,80},{97,108},{125,126},{128,163},{174,181},{196,197},{199,233},{244,252}};
        array_keyword_color_1 = new int[][]{{28,31},{126,128},{197,199}};
        array_keyword_color_2 = new int[][]{{0,5},{65,70},{91,96},{119,124},{190,195}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{53,58},{182,187}};
        array_function_name_color = new int[][]{{32,40}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Default arguments\n" +
                "\n" +
                "Passing two parameters to function\n" +
                "Name :- Ankit\n" +
                "Salary :- 17000\n" +
                "\n" +
                "Passing one parameter to function\n" +
                "Name :- Rakesh\n" +
                "Salary :- 10000";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Positional arguments\")\n" +
                "\n" +
                "def Employee(name,salary=10000):\n" +
                "    print(\"Name :-\",name)\n" +
                "    print(\"Salary :-\",salary)\n" +
                "\n" +
                "\n" +
                "print(\"\\nCalling function without positional arguments\")\n" +
                "Employee(17000,\"Sameer\")\n" +
                "\n" +
                "print(\"\\nCalling function with positional arguments\")\n" +
                "Employee(salary=17000,name=\"Sameer\")";

        array_string_color = new int[][]{{6,28},{74,83},{100,111},{128,129},{131,177},{194,202},{211,212},{214,257},{286,294}};
        array_keyword_color_1 = new int[][]{{31,34},{129,131},{212,214}};
        array_keyword_color_2 = new int[][]{{0,5},{68,73},{94,99},{122,127},{205,210}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{268,274},{281,285}};
        array_number_color = new int[][]{{56,61},{188,193},{275,280}};
        array_function_name_color = new int[][]{{35,43}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Positional arguments\n" +
                "\n" +
                "Calling function without positional arguments\n" +
                "Name :- 17000\n" +
                "Salary :- Sameer\n" +
                "\n" +
                "Calling function with positional arguments\n" +
                "Name :- Sameer\n" +
                "Salary :- 17000";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Variable length arguments\\n\")\n" +
                "\n" +
                "def My_Tasks(*list):\n" +
                "    print(\"Yours Tasks\")\n" +
                "    for i in list:\n" +
                "        print(i)\n" +
                "        \n" +
                "\n" +
                "My_Tasks(\"Writing assignments\",\"Going to gym\",\"Taking shower\",\"Shopping\")";

        array_string_color = new int[][]{{6,32},{34,35},{69,82},{139,160},{161,175},{176,191},{192,202}};
        array_keyword_color_1 = new int[][]{{32,34},{38,41},{88,91},{94,96}};
        array_keyword_color_2 = new int[][]{{0,5},{63,68},{111,116}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{42,50}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Variable length arguments\n" +
                "\n" +
                "Yours Tasks\n" +
                "Writing assignments\n" +
                "Going to gym\n" +
                "Taking shower\n" +
                "Shopping";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonKeywordArguments.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFunctionsPart2.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python types of function arguments");
            String shareMessage = "Python types of function arguments" +
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