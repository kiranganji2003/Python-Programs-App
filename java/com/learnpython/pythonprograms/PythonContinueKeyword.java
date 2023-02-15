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

public class PythonContinueKeyword extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_continue_keyword);

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
        actionBar.setTitle("Python continue keyword");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"Printing 1 to 10 numbers except 5\\n\")\n" +
                "\n" +
                "for number in range(1,11):\n" +
                "    if number==5:\n" +
                "        print(\"Skipping number\")\n" +
                "        continue      \n" +
                "    print(\"Number\",number)";

        array_string_color = new int[][]{{6,40},{42,43},{105,122},{157,165}};
        array_keyword_color_1 = new int[][]{{40,42},{46,49},{57,59},{77,79},{132,140}};
        array_keyword_color_2 = new int[][]{{0,5},{60,65},{99,104},{151,156}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{66,67},{68,70},{88,89}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Printing 1 to 10 numbers except 5\n" +
                "\n" +
                "Number 1\n" +
                "Number 2\n" +
                "Number 3\n" +
                "Number 4\n" +
                "Skipping number\n" +
                "Number 6\n" +
                "Number 7\n" +
                "Number 8\n" +
                "Number 9\n" +
                "Number 10";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Printing odd numbers between 1 to 20\\n\")\n" +
                "\n" +
                "for number in range(1,21):\n" +
                "    if number%2==0:\n" +
                "        continue      \n" +
                "    print(number)";

        array_string_color = new int[][]{{6,43},{45,46}};
        array_keyword_color_1 = new int[][]{{43,45},{49,52},{60,62},{80,82},{104,112}};
        array_keyword_color_2 = new int[][]{{0,5},{63,68},{123,128}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{69,70},{71,73},{90,91},{93,94}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Printing odd numbers between 1 to 20\n" +
                "\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "9\n" +
                "11\n" +
                "13\n" +
                "15\n" +
                "17\n" +
                "19";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Printing first 10 even fibonacci numbers\\n\")\n" +
                "\n" +
                "count = 0\n" +
                "a = 1\n" +
                "b = 2\n" +
                "print(\"2\")\n" +
                "\n" +
                "while count<10:\n" +
                "    c = a+b\n" +
                "    a = b\n" +
                "    b = c\n" +
                "\n" +
                "    if c%2==1:\n" +
                "        continue\n" +
                "\n" +
                "    count += 1\n" +
                "    print(c)";

        array_string_color = new int[][]{{6,47},{49,50},{81,84}};
        array_keyword_color_1 = new int[][]{{47,49},{87,92},{140,142},{159,167}};
        array_keyword_color_2 = new int[][]{{0,5},{75,80},{188,193}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{61,62},{67,68},{73,74},{99,101},{145,146},{148,149},{182,183}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Printing first 10 even fibonacci numbers\n" +
                "\n" +
                "2\n" +
                "8\n" +
                "34\n" +
                "144\n" +
                "610\n" +
                "2584\n" +
                "10946\n" +
                "46368\n" +
                "196418\n" +
                "832040\n" +
                "3524578";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonArray.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBreakKeyword.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python continue keyword");
            String shareMessage = "Python continue keyword" +
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