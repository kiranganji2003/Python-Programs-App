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

public class PythonBinaryPlusOperatorOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_binary_plus_operator_overloading);

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
        actionBar.setTitle("Python binary plus operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "print(\"Adding lists of two objects using operator overloading\")\n" +
                "\n" +
                "class Lists:\n" +
                "    def __init__(self,list):\n" +
                "        self.list = list\n" +
                "    def __add__(self,other):\n" +
                "        result = []\n" +
                "        for i in range(len(self.list)):\n" +
                "            res = self.list[i]+other.list[i]\n" +
                "            result.append(res)\n" +
                "        print(result)\n" +
                "\n" +
                "list1 = Lists([2,3,5,9,3])\n" +
                "list2 = Lists([8,9,1,7,2])\n" +
                "print(list1.list)\n" +
                "print(list2.list)\n" +
                "print(\"\\nAddition of list1 and list2\")\n" +
                "list1+list2";

        array_string_color = new int[][]{{6,62},{416,417},{419,447}};
        array_keyword_color_1 = new int[][]{{65,70},{82,85},{136,139},{189,192},{195,197},{417,419}};
        array_keyword_color_2 = new int[][]{{0,5},{198,203},{204,207},{305,310},{374,379},{392,397},{410,415}};
        array_self_color = new int[][]{{95,99},{115,119},{148,152},{208,212},{239,243}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{335,336},{337,338},{339,340},{341,342},{343,344},{362,363},{364,365},{366,367},{368,369},{370,371}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{86,94},{140,147}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Adding lists of two objects using operator overloading\n" +
                "[2, 3, 5, 9, 3]\n" +
                "[8, 9, 1, 7, 2]\n" +
                "\n" +
                "Addition of list1 and list2\n" +
                "[10, 12, 6, 16, 5]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Adding distances of two objects using operator overloading\")\n" +
                "\n" +
                "class Distance:\n" +
                "    def __init__(self,km,m):\n" +
                "        self.km = km\n" +
                "        self.m = m\n" +
                "    def __add__(self,other):\n" +
                "        dist1 = self.km*1000+self.m\n" +
                "        dist2 = other.km*1000+other.m\n" +
                "        km = (dist1+dist2)//1000\n" +
                "        m = (dist1+dist2)%1000\n" +
                "        obj = Distance(km,m)\n" +
                "        return obj\n" +
                "    def show(self,info):\n" +
                "        print()\n" +
                "        print(info)\n" +
                "        print(\"{} Kilometer and {} Meter\".format(self.km,self.m))\n" +
                "\n" +
                "dist1 = Distance(7,300)\n" +
                "dist2 = Distance(2,900)\n" +
                "dist1.show(\"Distance 1\")\n" +
                "dist2.show(\"Distance 2\")\n" +
                "total = dist1+dist2\n" +
                "total.show(\"Sum of distance 1 and distance 2\")";

        array_string_color = new int[][]{{6,66},{444,471},{556,568},{581,593},{626,660}};
        array_keyword_color_1 = new int[][]{{69,74},{89,92},{158,161},{358,364},{373,376}};
        array_keyword_color_2 = new int[][]{{0,5},{402,407},{418,423},{438,443}};
        array_self_color = new int[][]{{102,106},{122,126},{143,147},{170,174},{199,203},{212,216},{382,386},{479,483},{487,491}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{207,211},{244,248},{285,289},{316,320},{514,515},{516,519},{538,539},{540,543}};
        array_function_name_color = new int[][]{{377,381}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{93,101},{162,169}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Adding distances of two objects using operator overloading\n" +
                "\n" +
                "Distance 1\n" +
                "7 Kilometer and 300 Meter\n" +
                "\n" +
                "Distance 2\n" +
                "2 Kilometer and 900 Meter\n" +
                "\n" +
                "Sum of distance 1 and distance 2\n" +
                "10 Kilometer and 200 Meter";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBinaryMinusOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonUnaryPlusOperatorOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python binary plus operator overloading");
            String shareMessage = "Python binary plus operator overloading" +
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