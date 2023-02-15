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

public class PythonModulesExample3 extends AppCompatActivity {

    String example1,example2;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_modules_example3);

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
        actionBar.setTitle("Python modules example 3");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "def user_input():\n" +
                "    num1 = int(input(\"Enter the number 1 :- \"))\n" +
                "    num2 = int(input(\"Enter the number 2 :- \"))\n" +
                "    return num1,num2\n" +
                "\n" +
                "def addition():\n" +
                "    num1,num2 = user_input()\n" +
                "    print(\"Addition :-\",num1+num2)\n" +
                "\n" +
                "def subtraction():\n" +
                "    num1,num2 = user_input()\n" +
                "    print(\"Subtraction :-\",num1-num2)\n" +
                "\n" +
                "def multiplication():\n" +
                "    num1,num2 = user_input()\n" +
                "    print(\"Multiplication :-\",num1*num2)\n" +
                "\n" +
                "def division():\n" +
                "    num1,num2 = user_input()\n" +
                "    print(\"Division :-\",num1//num2)";

        array_string_color = new int[][]{{39,63},{87,111},{191,204},{275,291},{365,384},{452,465}};
        array_keyword_color_1 = new int[][]{{0,3},{118,124},{136,139},{217,220},{304,307},{397,400}};
        array_keyword_color_2 = new int[][]{{29,32},{33,38},{77,80},{81,86},{185,190},{269,274},{359,364},{446,451}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,14},{140,148},{221,232},{308,322},{401,409}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        example2 = "from ArithmeticFunctions import *\n" +
                "\n" +
                "print(\"1. Addition\")\n" +
                "print(\"2. Subtraction\")\n" +
                "print(\"3. Multiplication\")\n" +
                "print(\"4. Division\")\n" +
                "choice = int(input(\"Choose your choice :- \"))\n" +
                "\n" +
                "if choice==1:\n" +
                "    addition()\n" +
                "elif choice==2:\n" +
                "    subtraction()\n" +
                "elif choice==3:\n" +
                "    multiplication()\n" +
                "elif choice==4:\n" +
                "    division()";

        array_string_color = new int[][]{{41,54},{62,78},{86,105},{113,126},{147,171}};
        array_keyword_color_1 = new int[][]{{0,4},{25,31},{175,177},{204,208},{238,242},{275,279}};
        array_keyword_color_2 = new int[][]{{35,40},{56,61},{80,85},{107,112},{137,140},{141,146}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{186,187},{217,218},{251,252},{288,289}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));


        output = "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "Choose your choice :- 3\n" +
                "Enter the number 1 :- 21\n" +
                "Enter the number 2 :- 4\n" +
                "Multiplication :- 84";
        TextView t_out = findViewById(R.id.output);
        t_out.setText(output);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample4.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample2.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python modules example 3");
            String shareMessage = "Python modules example 3" +
                    "\n\n\nArithmeticFunctions.py\n\n" + example1 +
                    "\n\n\nMain.py\n\n" + example2 +
                    "\n\n\nOutput :-\n\n" + output +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}