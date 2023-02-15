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

public class PythonConstructorsInInheritance extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_constructors_in_inheritance);

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
        actionBar.setTitle("Python constructors in inheritance");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class A:\n" +
                "    def __init__(self):\n" +
                "        print(\"class A constructor\")\n" +
                "\n" +
                "class B(A):\n" +
                "    pass\n" +
                "\n" +
                "objB = B()";

        array_string_color = new int[][]{{47,68}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{71,76},{87,91}};
        array_keyword_color_2 = new int[][]{{41,46}};
        array_self_color = new int[][]{{26,30}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{17,25}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "class A constructor";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class A:\n" +
                "    def __init__(self):\n" +
                "        print(\"class A constructor\")\n" +
                "\n" +
                "class B(A):\n" +
                "    def __init__(self):\n" +
                "        print(\"class B constructor\")\n" +
                "\n" +
                "objB = B()";

        array_string_color = new int[][]{{47,68},{121,142}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{71,76},{87,90}};
        array_keyword_color_2 = new int[][]{{41,46},{115,120}};
        array_self_color = new int[][]{{26,30},{100,104}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{17,25},{91,99}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "class B constructor";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class A:\n" +
                "    def __init__(self):\n" +
                "        print(\"class A constructor\")\n" +
                "\n" +
                "class B(A):\n" +
                "    def __init__(self):\n" +
                "        super().__init__()\n" +
                "        print(\"class B constructor\")\n" +
                "\n" +
                "objB = B()";

        array_string_color = new int[][]{{47,68},{148,169}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{71,76},{87,90}};
        array_keyword_color_2 = new int[][]{{41,46},{115,120},{142,147}};
        array_self_color = new int[][]{{26,30},{100,104}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{17,25},{91,99},{123,131}};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output3 = "class A constructor\n" +
                "class B constructor";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "class A:\n" +
                "    def __init__(self):\n" +
                "        print(\"class A constructor\")\n" +
                "\n" +
                "class B:\n" +
                "    def __init__(self):\n" +
                "        print(\"class B constructor\")\n" +
                "\n" +
                "class C(A,B):\n" +
                "    def __init__(self):\n" +
                "        super().__init__()\n" +
                "        print(\"class C constructor\")\n" +
                "\n" +
                "objC = C()";

        array_string_color = new int[][]{{47,68},{118,139},{221,242}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{71,76},{84,87},{142,147},{160,163}};
        array_keyword_color_2 = new int[][]{{41,46},{112,117},{188,193},{215,220}};
        array_self_color = new int[][]{{26,30},{97,101},{173,177}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{17,25},{88,96},{164,172},{196,204}};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output4 = "class A constructor\n" +
                "class C constructor";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPublicVariablesAndMethods.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonHybridInheritance.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python constructors in inheritance");
            String shareMessage = "Python constructors in inheritance" +
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