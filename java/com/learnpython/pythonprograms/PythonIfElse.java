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

public class PythonIfElse extends AppCompatActivity {

    String example1,example2,example3,example4,example5,example6;
    String output1,output2,output3,output4,output5,output6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_if_else);

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
        actionBar.setTitle("Python if else");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "name1 = \"Abhijeet\"\n" +
                "name2 = \"Abhijeet\"\n" +
                "\n" +
                "if(name1 == name2):\n" +
                "    print(\"Equal value\")";

        array_string_color = new int[][]{{8,18},{27,37},{69,82}};
        array_keyword_color_1 = new int[][]{{39,41}};
        array_keyword_color_2 = new int[][]{{63,68}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Equal value";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "number = int(input(\"Enter any number :- \"))\n" +
                "\n" +
                "if number%2==0:\n" +
                "    print(number,\"is even number\")\n" +
                "else:\n" +
                "    print(number,\"is odd number\")";

        array_string_color = new int[][]{{19,41},{78,94},{119,134}};
        array_keyword_color_1 = new int[][]{{45,47},{96,100}};
        array_keyword_color_2 = new int[][]{{9,12},{13,18},{65,70},{106,111}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{55,56},{58,59}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter any number :- 89\n" +
                "89 is odd number";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"**** Profit Loss Program ****\")\n" +
                "purchased_price = int(input(\"Enter purchased price :- \"))\n" +
                "selling_price = int(input(\"Enter selling price :- \"))\n" +
                "\n" +
                "\n" +
                "if purchased_price > selling_price:\n" +
                "    print(\"Loss of\",(purchased_price-selling_price))\n" +
                "elif selling_price > purchased_price:\n" +
                "    print(\"Profit of\",(selling_price-purchased_price))\n" +
                "else:\n" +
                "    print(\"No profit No loss\")";

        array_string_color = new int[][]{{6,37},{67,94},{123,148},{199,208},{290,301},{351,370}};
        array_keyword_color_1 = new int[][]{{153,155},{242,246},{335,339}};
        array_keyword_color_2 = new int[][]{{0,5},{57,60},{61,66},{113,116},{117,122},{193,198},{284,289},{345,350}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "**** Profit Loss Program ****\n" +
                "Enter purchased price :- 500\n" +
                "Enter selling price :- 350\n" +
                "Loss of 150";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"**** Positive Negative Program ****\")\n" +
                "num = int(input(\"Enter any number :- \"))\n" +
                "\n" +
                "\n" +
                "if num > 0:\n" +
                "    print(num,\"is positive number\")\n" +
                "elif num < 0:\n" +
                "    print(num,\"is negative number\")\n" +
                "else:\n" +
                "    print(\"The number is zero\")";

        array_string_color = new int[][]{{6,43},{61,83},{114,134},{164,184},{202,222}};
        array_keyword_color_1 = new int[][]{{88,90},{136,140},{186,190}};
        array_keyword_color_2 = new int[][]{{0,5},{51,54},{55,60},{104,109},{154,159},{196,201}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{97,98},{147,148}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "**** Positive Negative Program ****\n" +
                "Enter any number :- 543\n" +
                "543 is positive number";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        example5 = "print(\"** 3 employees salary compare program **\")\n" +
                "\n" +
                "emp1 = int(input(\"Enter employee 1 salary :- \"))\n" +
                "emp2 = int(input(\"Enter employee 2 salary :- \"))\n" +
                "emp3 = int(input(\"Enter employee 3 salary :- \"))\n" +
                "\n" +
                "if(emp1>emp2 and emp1>emp3):\n" +
                "    print(\"Employee 1 salary is greater\")\n" +
                "elif (emp2>emp1 and emp2>emp3):\n" +
                "    print(\"Employee 2 salary is greater\")\n" +
                "elif (emp3>emp1 and emp3>emp2):\n" +
                "    print(\"Employee 3 salary is greater\")\n" +
                "else:\n" +
                "    print(\"Equal salary to all employees\")";

        array_string_color = new int[][]{{6,48},{68,97},{117,146},{166,195},{238,268},{312,342},{386,416},{434,465}};
        array_keyword_color_1 = new int[][]{{199,201},{212,215},{270,274},{286,289},{344,348},{360,363},{418,422}};
        array_keyword_color_2 = new int[][]{{0,5},{58,61},{62,67},{107,110},{111,116},{156,159},{160,165},{232,237},{306,311},{380,385},{428,433}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "** 3 employees salary compare program **\n" +
                "Enter employee 1 salary :- 2000\n" +
                "Enter employee 2 salary :- 10000\n" +
                "Enter employee 3 salary :- 7500\n" +
                "Employee 2 salary is greater";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        example6 = "print(\"** Nested if else example **\")\n" +
                "\n" +
                "num = int(input(\"Enter any number :- \"))\n" +
                "\n" +
                "if(num > 0):\n" +
                "    if(num>100):\n" +
                "        print(num,\"is positive number and greater than 100\")\n" +
                "    else:\n" +
                "        print(num,\"is positive number and less than 100\")\n" +
                "elif(num<0):\n" +
                "    print(num,\"is negative number\")\n" +
                "else:\n" +
                "    print(\"The number is zero\")";

        array_string_color = new int[][]{{6,36},{55,77},{129,170},{200,238},{267,287},{305,325}};
        array_keyword_color_1 = new int[][]{{81,83},{98,100},{176,180},{240,244},{289,293}};
        array_keyword_color_2 = new int[][]{{0,5},{45,48},{49,54},{119,124},{190,195},{257,262},{299,304}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{90,91},{105,108},{249,250}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.example6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(example6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output6 = "Enter any number :- 80\n" +
                "80 is positive number and less than 100";
        TextView t_out6 = findViewById(R.id.output6);
        t_out6.setText(output6);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonWhileLoop.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonInput.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python if else");
            String shareMessage = "Python if else" +
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