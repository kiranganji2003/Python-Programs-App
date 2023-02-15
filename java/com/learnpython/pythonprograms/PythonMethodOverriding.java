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

public class PythonMethodOverriding extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_method_overriding);

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
        actionBar.setTitle("Python method overriding");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class A:\n" +
                "    def show(self):\n" +
                "        print(\"In class A\")\n" +
                "\n" +
                "class B(A):\n" +
                "    def show(self):\n" +
                "        print(\"In class B\")\n" +
                "\n" +
                "obj = B()\n" +
                "obj.show()";

        array_string_color = new int[][]{{43,55},{104,116}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{58,63},{74,77}};
        array_keyword_color_2 = new int[][]{{37,42},{98,103}};
        array_self_color = new int[][]{{22,26},{83,87}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{17,21},{78,82}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "In class B";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class A:\n" +
                "    def show(self):\n" +
                "        print(\"In class A\")\n" +
                "\n" +
                "class B(A):\n" +
                "    def show(self):\n" +
                "        super().show()\n" +
                "        print(\"In class B\")\n" +
                "\n" +
                "obj = B()\n" +
                "obj.show()";

        array_string_color = new int[][]{{43,55},{127,139}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{58,63},{74,77}};
        array_keyword_color_2 = new int[][]{{37,42},{98,103},{121,126}};
        array_self_color = new int[][]{{22,26},{83,87}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{17,21},{78,82}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "In class A\n" +
                "In class B";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class Triangle:\n" +
                "    def area(self,shape,base,height):\n" +
                "        print(\"Area of triangle is\",base*height//2)\n" +
                "\n" +
                "class Rectangle(Triangle):\n" +
                "    def area(self,shape,length,breadth):\n" +
                "        if shape==\"Triangle\":\n" +
                "            super().area(shape,length,breadth)\n" +
                "        else:\n" +
                "            print(\"Area of rectangle is\",length*breadth)\n" +
                "\n" +
                "obj = Rectangle()\n" +
                "obj.area(\"Rectangle\",25,48)\n" +
                "obj.area(\"Triangle\",20,30)";

        array_string_color = new int[][]{{68,89},{193,203},{284,306},{351,362},{379,389}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{107,112},{138,141},{183,185},{260,264}};
        array_keyword_color_2 = new int[][]{{62,67},{217,222},{278,283}};
        array_self_color = new int[][]{{29,33},{147,151}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{103,104},{363,365},{366,368},{390,392},{393,395}};
        array_function_name_color = new int[][]{{24,28},{142,146}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Area of rectangle is 1200\n" +
                "Area of triangle is 300";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonUnaryMinusOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMethodOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python method overriding");
            String shareMessage = "Python method overriding" +
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