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

public class PythonRecursion extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_recursion);

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
        actionBar.setTitle("Python recursion");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "print(\"Calling a function itself 5 times\\n\")\n" +
                "\n" +
                "count = 0\n" +
                "\n" +
                "def call_function():\n" +
                "    global count\n" +
                "    count = count + 1\n" +
                "    print(\"Hello\",count)\n" +
                "    if count==5:\n" +
                "        return\n" +
                "    call_function()\n" +
                "\n" +
                "call_function()";

        array_string_color = new int[][]{{6,40},{42,43},{127,134}};
        array_keyword_color_1 = new int[][]{{40,42},{57,60},{82,88},{146,148},{167,173}};
        array_keyword_color_2 = new int[][]{{0,5},{121,126}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{54,55},{115,116},{156,157}};
        array_function_name_color = new int[][]{{61,74}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Calling a function itself 5 times\n" +
                "\n" +
                "Hello 1\n" +
                "Hello 2\n" +
                "Hello 3\n" +
                "Hello 4\n" +
                "Hello 5";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Sum of 1 to N numbers using recursion\\n\")\n" +
                "\n" +
                "sum = 0\n" +
                "\n" +
                "def summation(n):\n" +
                "    global sum\n" +
                "    sum = sum + n\n" +
                "    if n==1:\n" +
                "        return \n" +
                "    summation(n-1)\n" +
                "\n" +
                "n = int(input(\"Enter the value of N :- \"))\n" +
                "summation(n)\n" +
                "\n" +
                "print(\"Sum of 1 to\",n,\"numbers =\",sum)";

        array_string_color = new int[][]{{6,44},{46,47},{173,199},{222,235},{238,249}};
        array_keyword_color_1 = new int[][]{{44,46},{59,62},{81,87},{114,116},{131,137}};
        array_keyword_color_2 = new int[][]{{0,5},{163,166},{167,172},{216,221}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{56,57},{120,121},{155,156}};
        array_function_name_color = new int[][]{{63,72}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Sum of 1 to N numbers using recursion\n" +
                "\n" +
                "Enter the value of N :- 100\n" +
                "Sum of 1 to 100 numbers = 5050";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Count no. of consonants in string\\n\")\n" +
                "\n" +
                "count = 0\n" +
                "index = 0\n" +
                "consonants = []\n" +
                "\n" +
                "def consonants_count(str):\n" +
                "    global index\n" +
                "    if not(str[index]=='a' or str[index]=='e' or str[index]=='i' or str[index]=='o' or str[index]=='u'):\n" +
                "        global count\n" +
                "        count += 1\n" +
                "        consonants.append(str[index])\n" +
                "    index += 1\n" +
                "    if index==len(str):\n" +
                "        return\n" +
                "    consonants_count(str)\n" +
                "\n" +
                "\n" +
                "consonants_count(input(\"Enter the string :- \"))\n" +
                "print(\"Total consonants =\",count)\n" +
                "print(\"Consonants =\",consonants)";

        array_string_color = new int[][]{{6,40},{42,43},{150,153},{169,172},{188,191},{207,210},{226,229},{415,437},{446,466},{480,494}};
        array_keyword_color_1 = new int[][]{{40,42},{83,86},{114,120},{131,137},{154,156},{173,175},{192,194},{211,213},{240,246},{329,331},{357,363}};
        array_keyword_color_2 = new int[][]{{0,5},{339,342},{409,414},{440,445},{474,479}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{54,55},{64,65},{270,271},{323,324}};
        array_function_name_color = new int[][]{{87,103}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Count no. of consonants in string\n" +
                "\n" +
                "Enter the string :- Hundred\n" +
                "Total consonants = 5\n" +
                "Consonants = ['H', 'n', 'd', 'r', 'd']";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"Factorial of number using recursion\\n\")\n" +
                "\n" +
                "def factorial(num):\n" +
                "    if num==1:\n" +
                "        return 1\n" +
                "    return num*factorial(num-1)\n" +
                "\n" +
                "\n" +
                "print(\"Factorial =\",factorial(int(input(\"Enter the number :- \"))))";

        array_string_color = new int[][]{{6,42},{44,45},{140,153},{174,196}};
        array_keyword_color_1 = new int[][]{{42,44},{48,51},{72,74},{91,97},{104,110}};
        array_keyword_color_2 = new int[][]{{0,5},{134,139},{164,167},{168,173}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{80,81},{98,99},{129,130}};
        array_function_name_color = new int[][]{{52,61}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Factorial of number using recursion\n" +
                "\n" +
                "Enter the number :- 6\n" +
                "Factorial = 720";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonLambdaFunction.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonGlobalAndLocalVariables.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python recursion");
            String shareMessage = "Python recursion" +
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