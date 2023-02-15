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

public class PythonModulesExample4 extends AppCompatActivity {

    String example1,example2;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_modules_example4);

        int[][] array_string_color;
        int[][] array_keyword_color_1;
        int[][] array_keyword_color_2;
        int[][] array_self_color;
        int[][] array_end_color;
        int[][] array_number_color;
        int[][] array_function_name_color;
        int[][] array_comments;
        int[][] array_special_function_color;

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python modules example 4");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class Prime:\n" +
                "    def __init__(self):\n" +
                "        self.num = int(input(\"Enter the number :- \"))\n" +
                "        self.check_prime()\n" +
                "    def check_prime(self):\n" +
                "        flag = 0 \n" +
                "        for i in range(2,self.num//2+1):\n" +
                "            if self.num%i==0:\n" +
                "                flag=1\n" +
                "                print(\"{} is not prime number\".format(self.num))\n" +
                "                break\n" +
                "        if flag==0:\n" +
                "            print(\"{} is prime number\".format(self.num))\n" +
                "\n" +
                "class Factorial:\n" +
                "    def __init__(self):\n" +
                "        self.num = int(input(\"Enter the number :- \"))\n" +
                "        self.find_fact()\n" +
                "    def find_fact(self):\n" +
                "        fact = 1\n" +
                "        for i in range(1,self.num+1):\n" +
                "            fact *= i\n" +
                "        print(\"Factorial of {} is {}\".format(self.num,fact))";

        array_string_color = new int[][]{{66,88},{279,303},{382,402},{492,514},{658,681}};
        array_keyword_color_1 = new int[][]{{0,5},{17,20},{122,125},{171,174},{177,179},{216,218},{338,343},{352,354},{422,427},{443,446},{546,549},{592,595},{598,600}};
        array_keyword_color_2 = new int[][]{{56,59},{60,65},{180,185},{273,278},{376,381},{482,485},{486,491},{601,606},{652,657}};
        array_self_color = new int[][]{{30,34},{45,49},{99,103},{138,142},{188,192},{219,223},{311,315},{410,414},{456,460},{471,475},{525,529},{560,564},{609,613},{689,693}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{160,161},{186,187},{198,199},{200,201},{231,232},{255,256},{361,362},{582,583},{607,608},{618,619}};
        array_function_name_color = new int[][]{{126,137},{550,559}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{21,29},{447,455}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        example2 = "from Programs import *\n" +
                "\n" +
                "print(\"1. Check the number is prime or not\")\n" +
                "print(\"2. Find factorial of a number\")\n" +
                "choice = int(input(\"Choose your choice :- \"))\n" +
                "\n" +
                "if choice==1:\n" +
                "    obj = Prime()\n" +
                "elif choice==2:\n" +
                "    obj = Factorial()";

        array_string_color = new int[][]{{30,67},{75,106},{127,151}};
        array_keyword_color_1 = new int[][]{{0,4},{14,20},{155,157},{187,191}};
        array_keyword_color_2 = new int[][]{{24,29},{69,74},{117,120},{121,126}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{166,167},{200,201}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));


        output = "1. Check the number is prime or not\n" +
                "2. Find factorial of a number\n" +
                "Choose your choice :- 1\n" +
                "Enter the number :- 59\n" +
                "59 is prime number";
        TextView t_out = findViewById(R.id.output);
        t_out.setText(output);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModuleExample5.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample3.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python modules example 4");
            String shareMessage = "Python modules example 4" +
                    "\n\n\nPrograms.py\n\n" + example1 +
                    "\n\n\nMain.py\n\n" + example2 +
                    "\n\n\nOutput :-\n\n" + output +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}