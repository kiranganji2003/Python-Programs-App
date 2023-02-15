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

public class PythonBinaryMinusOperatorOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_binary_minus_operator_overloading);

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
        actionBar.setTitle("Python binary minus operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class Number:\n" +
                "    def __init__(self,num):\n" +
                "        self.number = num\n" +
                "    def show(self):\n" +
                "        print(\"Number :-\",self.number)\n" +
                "    def __sub__(self,other):\n" +
                "        self.number -= other\n" +
                "\n" +
                "no = Number(100)\n" +
                "no.show()\n" +
                "no-15\n" +
                "no.show()";

        array_string_color = new int[][]{{102,113}};
        array_keyword_color_1 = new int[][]{{0,5},{18,21},{72,75},{131,134}};
        array_keyword_color_2 = new int[][]{{96,101}};
        array_self_color = new int[][]{{31,35},{50,54},{81,85},{114,118},{143,147},{164,168}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{198,201},{216,218}};
        array_function_name_color = new int[][]{{76,80}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{22,30},{135,142}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Number :- 100\n" +
                "Number :- 85";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Subtracting distance of one object from another using operator overloading\")\n" +
                "\n" +
                "class Distance:\n" +
                "    def __init__(self,km,m):\n" +
                "        self.km = km\n" +
                "        self.m = m\n" +
                "    def __sub__(self,other):\n" +
                "        dist1 = self.km*1000+self.m\n" +
                "        dist2 = other.km*1000+other.m\n" +
                "        km = (dist1-dist2)//1000\n" +
                "        m = (dist1-dist2)%1000\n" +
                "        obj = Distance(km,m)\n" +
                "        return obj\n" +
                "    def show(self,info):\n" +
                "        print()\n" +
                "        print(info)\n" +
                "        print(\"{} Kilometer and {} Meter\".format(self.km,self.m))\n" +
                "\n" +
                "dist1 = Distance(6,300)\n" +
                "dist2 = Distance(2,700)\n" +
                "dist1.show(\"Distance 1\")\n" +
                "dist2.show(\"Distance 2\")\n" +
                "result = dist1-dist2\n" +
                "result.show(\"Subtract distance 2 from 1\")";

        array_string_color = new int[][]{{6,82},{460,487},{572,584},{597,609},{644,672}};
        array_keyword_color_1 = new int[][]{{85,90},{105,108},{174,177},{374,380},{389,392}};
        array_keyword_color_2 = new int[][]{{0,5},{418,423},{434,439},{454,459}};
        array_self_color = new int[][]{{118,122},{138,142},{159,163},{186,200},{215,219},{228,232},{398,402},{495,499},{503,507}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{223,227},{260,264},{301,305},{332,336},{530,531},{532,535},{554,555},{556,559}};
        array_function_name_color = new int[][]{{393,397}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{109,117},{178,185}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Subtracting distance of one object from another using operator overloading\n" +
                "\n" +
                "Distance 1\n" +
                "6 Kilometer and 300 Meter\n" +
                "\n" +
                "Distance 2\n" +
                "2 Kilometer and 700 Meter\n" +
                "\n" +
                "Subtract distance 2 from 1\n" +
                "3 Kilometer and 600 Meter";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultiplicationOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBinaryPlusOperatorOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python binary minus operator overloading");
            String shareMessage = "Python binary minus operator overloading" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}