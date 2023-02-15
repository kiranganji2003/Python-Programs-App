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

public class PythonModulesExample2 extends AppCompatActivity {

    String example1,example2,example3;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_modules_example2);

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
        actionBar.setTitle("Python modules example 2");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "def function1():\n" +
                "    print(\"This is Module1's function\")";

        array_string_color = new int[][]{{27,55}};
        array_keyword_color_1 = new int[][]{{0,3}};
        array_keyword_color_2 = new int[][]{{21,26}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,13}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        example2 = "def function2():\n" +
                "    print(\"This is Module2's function\")";

        array_string_color = new int[][]{{27,55}};
        array_keyword_color_1 = new int[][]{{0,3}};
        array_keyword_color_2 = new int[][]{{21,26}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,13}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        example3 = "from Module1 import function1\n" +
                "from Module2 import function2\n" +
                "\n" +
                "print(\"Calling functions without module name\")\n" +
                "function1()\n" +
                "function2()";

        array_string_color = new int[][]{{67,106}};
        array_keyword_color_1 = new int[][]{{0,4},{13,19},{30,34},{43,49}};
        array_keyword_color_2 = new int[][]{{61,66}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output = "Calling functions without module name\n" +
                "This is Module1's function\n" +
                "This is Module2's function";
        TextView t_out = findViewById(R.id.output);
        t_out.setText(output);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample3.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample1.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python modules example 2");
            String shareMessage = "Python modules example 2" +
                    "\n\n\nModule1.py\n\n" + example1 +
                    "\n\n\nModule2.py\n\n" + example2 +
                    "\n\n\nExecutableFile.py\n\n" + example3 +
                    "\n\n\nOutput :-\n\n" + output +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}