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

public class PythonFunctions extends AppCompatActivity {

    String example1,example2,example3,example4,example5;
    String output1,output2,output3,output4,output5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_functions);

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
        actionBar.setTitle("Python functions");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "def my_function():\n" +
                "    print(\"Hello\")\n" +
                "    print(\"This is my function\")\n" +
                "\n" +
                "my_function()";

        array_string_color = new int[][]{{29,36},{48,69}};
        array_keyword_color_1 = new int[][]{{0,3}};
        array_keyword_color_2 = new int[][]{{23,28},{42,47}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,15}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Hello\n" +
                "This is my function";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "def prime():\n" +
                "    num = int(input(\"Enter the number :- \"))\n" +
                "    flag = 0\n" +
                "\n" +
                "    for i in range(2,num):\n" +
                "        if num%i==0:\n" +
                "            flag = 1\n" +
                "            break\n" +
                "\n" +
                "    if flag==0:\n" +
                "        print(num,\"is prime number\")\n" +
                "    else:\n" +
                "        print(num,\"is not prime number\")\n" +
                "\n" +
                "\n" +
                "prime()";

        array_string_color = new int[][]{{33,55},{194,211},{241,262}};
        array_keyword_color_1 = new int[][]{{0,3},{76,79},{82,84},{107,109},{153,158},{164,166},{217,221}};
        array_keyword_color_2 = new int[][]{{23,26},{27,32},{85,90},{184,189},{231,236}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{69,70},{91,92},{117,118},{139,140},{173,174}};
        array_function_name_color = new int[][]{{4,9}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the number :- 47\n" +
                "47 is prime number";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"** Function with parameters **\")\n" +
                "print(\"Check distinct values in string\")\n" +
                "\n" +
                "def check_distinct_chars(str):\n" +
                "    distinct = []\n" +
                "    for i in str:\n" +
                "        if i not in distinct:\n" +
                "            distinct.append(i)\n" +
                "    print(\"\\nTotal distinct values :-\",len(distinct))\n" +
                "    for i in distinct:\n" +
                "        print(i,end=\"  \")\n" +
                "\n" +
                "\n" +
                "\n" +
                "str = input(\"\\nEnter the string :- \")\n" +
                "check_distinct_chars(str)";

        array_string_color = new int[][]{{6,38},{46,79},{220,221},{223,248},{307,311},{328,329},{331,352}};
        array_keyword_color_1 = new int[][]{{82,85},{135,138},{141,143},{157,159},{162,168},{221,223},{268,271},{274,276},{329,331}};
        array_keyword_color_2 = new int[][]{{0,5},{40,45},{214,219},{249,252},{295,300},{322,327}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{303,306}};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{86,106}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "** Function with parameters **\n" +
                "Check distinct values in string\n" +
                "\n" +
                "Enter the string :- Programming\n" +
                "\n" +
                "Total distinct values :- 8\n" +
                "P  r  o  g  a  m  i  n ";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"** Function with return value **\")\n" +
                "print(\"Reverse the user entered string\")\n" +
                "\n" +
                "def reverse_string(str):\n" +
                "    reverseString = \"\"\n" +
                "    for i in range(len(str)-1,-1,-1):\n" +
                "        reverseString += str[i]\n" +
                "        \n" +
                "    return reverseString\n" +
                "\n" +
                "\n" +
                "str = input(\"\\nEnter the string :- \")\n" +
                "output = reverse_string(str)\n" +
                "print(\"\\nOutput :-\",output)";

        array_string_color = new int[][]{{6,40},{48,81},{129,131},{250,251},{253,274},{311,312},{314,324}};
        array_keyword_color_1 = new int[][]{{84,87},{136,139},{142,144},{215,221},{251,253},{312,314}};
        array_keyword_color_2 = new int[][]{{0,5},{42,47},{145,150},{151,154},{244,249},{305,310}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{160,161},{163,164},{166,167}};
        array_function_name_color = new int[][]{{88,102}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "** Function with return value **\n" +
                "Reverse the user entered string\n" +
                "\n" +
                "Enter the string :- Hello, World!\n" +
                "\n" +
                "Output :- !dlroW ,olleH";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        example5 = "print(\"** Function with 2 return values **\")\n" +
                "print(\"addition and subtraction program\")\n" +
                "\n" +
                "def add_sub(num1,num2):\n" +
                "    add = num1+num2\n" +
                "    sub = num1-num2\n" +
                "    return add,sub\n" +
                "\n" +
                "\n" +
                "num1 = int(input(\"\\nEnter number 1 :- \"))\n" +
                "num2 = int(input(\"Enter number 2 :- \"))\n" +
                "add,sub = add_sub(num1,num2)\n" +
                "print(\"\\nAddition =\",add)\n" +
                "print(\"Subtraction =\",sub)";

        array_string_color = new int[][]{{6,43},{51,85},{190,191},{193,212},{232,252},{290,291},{293,304},{316,331}};
        array_keyword_color_1 = new int[][]{{88,91},{156,162},{191,193},{291,293}};
        array_keyword_color_2 = new int[][]{{0,5},{45,50},{180,183},{184,189},{222,225},{226,231},{284,289},{310,315}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{92,99}};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "** Function with 2 return values **\n" +
                "addition and subtraction program\n" +
                "\n" +
                "Enter number 1 :- 10\n" +
                "Enter number 2 :- 20\n" +
                "\n" +
                "Addition = 30\n" +
                "Subtraction = -10";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python functions");
            String shareMessage = "Python functions" +
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
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }

}