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

public class PythonForLoop extends AppCompatActivity {

    String example1,example2,example3,example4,example5;
    String output1,output2,output3,output4,output5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_for_loop);

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
        actionBar.setTitle("Python for loop");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"***  Printing list using for loop  ***\\n\")\n" +
                "\n" +
                "list = [23,54,87,83,18,27]\n" +
                "\n" +
                "for i in list:\n" +
                "    print(i)";

        array_string_color = new int[][]{{6,45},{47,48}};
        array_keyword_color_1 = new int[][]{{45,47},{79,82},{85,87}};
        array_keyword_color_2 = new int[][]{{0,5},{98,103}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{59,61},{62,64},{65,67},{68,70},{71,73},{74,76}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "***  Printing list using for loop  ***\n" +
                "\n" +
                "23\n" +
                "54\n" +
                "87\n" +
                "83\n" +
                "18\n" +
                "27";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"***  Printing chars of string using for loop  ***\\n\")\n" +
                "\n" +
                "name = input(\"Enter your name :- \")\n" +
                "i = 0\n" +
                "for char in name:\n" +
                "    i += 1\n" +
                "    print(\"char\",i,\":-\\t\",char)";

        array_string_color = new int[][]{{6,56},{58,59},{75,96},{143,149},{152,155},{157,158}};
        array_keyword_color_1 = new int[][]{{56,58},{104,107},{113,115},{155,157}};
        array_keyword_color_2 = new int[][]{{0,5},{69,74},{137,142}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{102,103},{131,132}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "***  Printing chars of string using for loop  ***\n" +
                "\n" +
                "Enter your name :- John\n" +
                "char 1 :-\t J\n" +
                "char 2 :-\t o\n" +
                "char 3 :-\t h\n" +
                "char 4 :-\t n";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"***  Printing numbers using range function  ***\\n\")\n" +
                "\n" +
                "for num in range(10):\n" +
                "    print(num)";

        array_string_color = new int[][]{{6,54},{56,57}};
        array_keyword_color_1 = new int[][]{{54,56},{60,63},{68,70}};
        array_keyword_color_2 = new int[][]{{0,5},{71,76},{86,91}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{77,79}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "***  Printing numbers using range function  ***\n" +
                "\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"***  Printing table of user entered number using for loop  ***\\n\")\n" +
                "\n" +
                "print(\"**  Method 1  **\")\n" +
                "num = int(input(\"Enter any number :- \"))\n" +
                "count = 0\n" +
                "for i in range(num,num*10+1):\n" +
                "    if i%num==0:\n" +
                "        count += 1\n" +
                "        print(num,\"*\",count,\"=\",i)\n" +
                "\n" +
                "\n" +
                "print(\"\\n**  Method 2  **\")\n" +
                "num2 = int(input(\"Enter any number :- \"))\n" +
                "count2 = 0\n" +
                "for i in range(num2,num2*10+1,num2):\n" +
                "        count2 += 1\n" +
                "        print(num2,\"*\",count2,\"=\",i)";

        array_string_color = new int[][]{{6,69},{71,72},{81,99},{117,139},{236,239},{246,249},{261,262},{264,281},{300,322},{412,415},{423,426}};
        array_keyword_color_1 = new int[][]{{69,71},{152,155},{158,160},{186,188},{262,264},{336,339},{342,344}};
        array_keyword_color_2 = new int[][]{{0,5},{75,80},{107,110},{111,116},{161,166},{226,231},{255,260},{290,293},{294,299},{345,350},{401,406}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{150,151},{175,177},{178,179},{196,197},{216,217},{334,335},{361,363},{364,365},{391,392}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "***  Printing table of user entered number using for loop  ***\n" +
                "\n" +
                "**  Method 1  **\n" +
                "Enter any number :- 12\n" +
                "12 * 1 = 12\n" +
                "12 * 2 = 24\n" +
                "12 * 3 = 36\n" +
                "12 * 4 = 48\n" +
                "12 * 5 = 60\n" +
                "12 * 6 = 72\n" +
                "12 * 7 = 84\n" +
                "12 * 8 = 96\n" +
                "12 * 9 = 108\n" +
                "12 * 10 = 120\n" +
                "\n" +
                "**  Method 2  **\n" +
                "Enter any number :- 15\n" +
                "15 * 1 = 15\n" +
                "15 * 2 = 30\n" +
                "15 * 3 = 45\n" +
                "15 * 4 = 60\n" +
                "15 * 5 = 75\n" +
                "15 * 6 = 90\n" +
                "15 * 7 = 105\n" +
                "15 * 8 = 120\n" +
                "15 * 9 = 135\n" +
                "15 * 10 = 150";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        example5 = "print(\"***  Printing table in reverse order using for loop  ***\\n\")\n" +
                "\n" +
                "for i in range(10,0,-1):\n" +
                "    for j in range(10,0,-1):\n" +
                "        print(i*j,end=\" \")\n" +
                "    print()";

        array_string_color = new int[][]{{6,63},{65,66},{145,148}};
        array_keyword_color_1 = new int[][]{{63,65},{69,72},{75,77},{98,101},{104,106}};
        array_keyword_color_2 = new int[][]{{0,5},{78,83},{107,112},{131,136},{154,159}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{141,144}};
        array_number_color = new int[][]{{84,86},{87,88},{90,91},{113,115},{116,117},{119,120}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "***  Printing table in reverse order using for loop  ***\n" +
                "\n" +
                "100 90 80 70 60 50 40 30 20 10 \n" +
                "90 81 72 63 54 45 36 27 18 9 \n" +
                "80 72 64 56 48 40 32 24 16 8 \n" +
                "70 63 56 49 42 35 28 21 14 7 \n" +
                "60 54 48 42 36 30 24 18 12 6 \n" +
                "50 45 40 35 30 25 20 15 10 5 \n" +
                "40 36 32 28 24 20 16 12 8 4 \n" +
                "30 27 24 21 18 15 12 9 6 3 \n" +
                "20 18 16 14 12 10 8 6 4 2 \n" +
                "10 9 8 7 6 5 4 3 2 1 ";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBreakKeyword.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonWhileLoop.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python for loop");
            String shareMessage = "Python for loop" +
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