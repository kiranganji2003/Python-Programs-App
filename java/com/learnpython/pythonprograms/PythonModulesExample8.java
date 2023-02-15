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

public class PythonModulesExample8 extends AppCompatActivity {

    String example1,example2;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_modules_example8);

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
        actionBar.setTitle("Python modules example 8");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "print(\"In Module1.py\")\n" +
                "print(\"Module name :-\",__name__)\n" +
                "\n" +
                "if __name__==\"__main__\":\n" +
                "    print(\"Python Arithmetic Operations\")\n" +
                "    num1 = int(input(\"Enter number 1 :- \"))\n" +
                "    num2 = int(input(\"Enter number 2 :- \"))\n" +
                "    print(\"Addition :-\",(num1+num2))\n" +
                "    print(\"Subtraction :-\",(num1-num2))";

        array_string_color = new int[][]{{6,21},{29,45},{70,80},{92,122},{145,165},{189,209},{222,235},{259,275}};
        array_keyword_color_1 = new int[][]{{57,59}};
        array_keyword_color_2 = new int[][]{{0,5},{23,28},{86,91},{135,138},{139,144},{179,182},{183,188},{216,221},{253,258}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        example2 = "import Module1\n" +
                "\n" +
                "print(\"\\nThis is Module2\")\n" +
                "print(\"Module name :-\",__name__)";

        array_string_color = new int[][]{{22,23},{25,41},{49,65}};
        array_keyword_color_1 = new int[][]{{0,6},{23,25}};
        array_keyword_color_2 = new int[][]{{16,21},{43,48}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));


        output = "In Module1.py\n" +
                "Module name :- Module1\n" +
                "\n" +
                "This is Module2\n" +
                "Module name :- __main__";
        TextView t_out = findViewById(R.id.output);
        t_out.setText(output);


        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample7.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python modules example 1");
            String shareMessage = "Python modules example 1" +
                    "\n\n\nModule1.py\n\n" + example1 +
                    "\n\n\nModule2.py\n\n" + example2 +
                    "\n\n\nOutput :-\n\n" + output +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}