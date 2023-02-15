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

public class PythonFinally extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_finally);

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
        actionBar.setTitle("Python finally");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "try:\n" +
                "    print(10/0)\n" +
                "    print(\"try clock executed\")\n" +
                "except:\n" +
                "    print(\"except block executed\")\n" +
                "finally:\n" +
                "    print(\"finally block executed\")";

        array_string_color = new int[][]{{31,51},{71,94},{115,139}};
        array_keyword_color_1 = new int[][]{{0,3},{53,59},{96,103}};
        array_keyword_color_2 = new int[][]{{9,14},{25,30},{65,70},{109,114}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{15,17},{18,19}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "except block executed\n" +
                "finally block executed";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "try:\n" +
                "    print(10/100)\n" +
                "    print(\"try clock executed\")\n" +
                "except:\n" +
                "    print(\"except block executed\")\n" +
                "finally:\n" +
                "    print(\"This block always executes\")";

        array_string_color = new int[][]{{33,53},{73,96},{117,145}};
        array_keyword_color_1 = new int[][]{{0,3},{55,61},{98,105}};
        array_keyword_color_2 = new int[][]{{9,14},{27,32},{67,72},{111,116}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{15,17},{18,21}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "0.1\n" +
                "try clock executed\n" +
                "This block always executes";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "rollno = 0\n" +
                "name = \"\"\n" +
                "flag = False\n" +
                "try:\n" +
                "    name = input(\"Enter the student name: \")\n" +
                "    rollno = int(input(\"Enter the student roll no: \"))\n" +
                "    flag = True\n" +
                "except:\n" +
                "    print(\"Invalid roll no\")\n" +
                "finally:\n" +
                "    if flag:\n" +
                "        print(\"Student data recorded\")\n" +
                "    else:\n" +
                "        print(\"Student data not recorded\")";

        array_string_color = new int[][]{{18,20},{56,82},{107,136},{173,190},{228,251},{277,304}};
        array_keyword_color_1 = new int[][]{{28,33},{34,37},{150,154},{155,161},{192,199},{205,207},{257,261}};
        array_keyword_color_2 = new int[][]{{50,55},{97,100},{101,106},{167,172},{222,227},{271,276}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{9,10}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Enter the student name: JOHN\n" +
                "Enter the student roll no: 344\n" +
                "Student data recorded";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "rollno = 0\n" +
                "name = input(\"Enter the student name: \")\n" +
                "flag = False\n" +
                "while(flag!=True):\n" +
                "    try:\n" +
                "        rollno = int(input(\"Enter the roll no: \"))\n" +
                "        flag = True\n" +
                "    except:\n" +
                "        print(\"Please enter valid roll no\")\n" +
                "    finally:\n" +
                "        if flag:\n" +
                "            print(\"Student data recorded\")";

        array_string_color = new int[][]{{24,50},{120,141},{190,218},{268,291}};
        array_keyword_color_1 = new int[][]{{59,64},{65,70},{77,81},{88,91},{159,163},{168,174},{224,231},{241,243}};
        array_keyword_color_2 = new int[][]{{18,23},{110,113},{114,119},{184,189},{262,267}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{9,10}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Enter the student name: Navin\n" +
                "Enter the roll no: xyz\n" +
                "Please enter valid roll no\n" +
                "Enter the roll no: abcd\n" +
                "Please enter valid roll no\n" +
                "Enter the roll no: 46\n" +
                "Student data recorded";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonExceptionHandlingRaise.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonExceptionHandlingElse.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python finally");
            String shareMessage = "Python finally" +
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