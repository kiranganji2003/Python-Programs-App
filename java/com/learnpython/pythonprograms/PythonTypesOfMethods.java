package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class PythonTypesOfMethods extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_types_of_methods);

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
        actionBar.setTitle("Python types of methods");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "import math\n" +
                "\n" +
                "print(\"Class Method Example\\n\")\n" +
                "class Factorial:\n" +
                "    number = 0\n" +
                "    @classmethod\n" +
                "    def calculate(cls):\n" +
                "        print(math.factorial(Factorial.number))\n" +
                "\n" +
                "\n" +
                "Factorial.number = int(input(\"Enter the number :- \"))\n" +
                "Factorial.calculate()        ";

        array_string_color = new int[][]{{19,40},{42,43},{197,219}};
        array_keyword_color_1 = new int[][]{{0,6},{40,42},{45,50},{98,101}};
        array_keyword_color_2 = new int[][]{{13,18},{126,131},{187,190},{191,196}};
        array_self_color = new int[][]{{112,115}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{75,76}};
        array_function_name_color = new int[][]{{102,111}};
        array_comments = new int[][]{};
        SpannableString spannableString = ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments);
        spannableString.setSpan(new ForegroundColorSpan(Color.rgb(182,139,0)), 81, 93, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(spannableString);

        output1 = "Class Method Example\n" +
                "\n" +
                "Enter the number :- 7\n" +
                "5040";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Static Method Example\\n\")\n" +
                "\n" +
                "class MyClass:\n" +
                "    @staticmethod\n" +
                "    def method():\n" +
                "        print(\"This is static method\")\n" +
                "        print(\"Object is not required to call static methods\")\n" +
                "\n" +
                "\n" +
                "MyClass.method()";

        array_string_color = new int[][]{{6,28},{30,31},{99,122},{138,185}};
        array_keyword_color_1 = new int[][]{{28,30},{34,39},{71,74}};
        array_keyword_color_2 = new int[][]{{0,5},{93,98},{132,137}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{75,81}};
        array_comments = new int[][]{};
        spannableString = ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments);
        spannableString.setSpan(new ForegroundColorSpan(Color.rgb(182,139,0)), 53, 66, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(spannableString);

        output2 = "Static Method Example\n" +
                "\n" +
                "This is static method\n" +
                "Object is not required to call static methods";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonInnerClass.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonClassVariables.class);
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
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}