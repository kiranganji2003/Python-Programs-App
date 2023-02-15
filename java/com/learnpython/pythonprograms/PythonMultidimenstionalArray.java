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

public class PythonMultidimenstionalArray extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_multidimenstional_array);

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
        actionBar.setTitle("Python multidimenstional array");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "from numpy import *\n" +
                "\n" +
                "print(\"2D array\\n\")\n" +
                "\n" +
                "arr = array([\n" +
                "\n" +
                "    [1,2,3],\n" +
                "    [4,5,6],\n" +
                "    [7,8,9]\n" +
                "\n" +
                "    ])\n" +
                "\n" +
                "\n" +
                "print(arr)";

        array_string_color = new int[][]{{27,36},{38,39}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{36,38}};
        array_keyword_color_2 = new int[][]{{21,26},{105,110}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{62,63},{64,65},{66,67},{75,76},{77,78},{79,80},{88,89},{90,91},{92,93}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "2D array\n" +
                "\n" +
                "[[1 2 3]\n" +
                " [4 5 6]\n" +
                " [7 8 9]]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "from numpy import *\n" +
                "\n" +
                "print(\"Matrix program\\n\")\n" +
                "\n" +
                "rows = int(input(\"\\nEnter no. of rows :- \"))\n" +
                "columns = int(input(\"Enter no. of columns :- \"))\n" +
                "\n" +
                "print(\"\\nEnter\",rows,\"*\",columns,\"elements\")\n" +
                "\n" +
                "matrix = []\n" +
                "\n" +
                "for i in range(rows):\n" +
                "    data = []\n" +
                "    for j in range(columns):\n" +
                "        data.append(input())\n" +
                "    matrix.append(data)\n" +
                "\n" +
                "print(\"Matrix elements\\n\")\n" +
                "\n" +
                "for i in range(rows):\n" +
                "    for j in range(columns):\n" +
                "        print(matrix[i][j],end=\"\\t\")\n" +
                "    print()";

        array_string_color = new int[][]{{27,42},{44,45},{65,66},{68,90},{113,139},{149,150},{152,158},{164,167},{176,186},{327,343},{345,346},{431,432},{434,435}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{42,44},{66,68},{150,152},{202,205},{208,210},{242,245},{248,250},{343,345},{349,352},{355,357},{375,378},{381,383},{432,434}};
        array_keyword_color_2 = new int[][]{{21,26},{55,58},{59,64},{103,106},{107,112},{143,148},{211,216},{251,256},{287,292},{321,326},{358,363},{384,389},{408,413},{441,446}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{427,430}};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Matrix program\n" +
                "\n" +
                "\n" +
                "Enter no. of rows :- 3\n" +
                "Enter no. of columns :- 4\n" +
                "\n" +
                "Enter 3 * 4 elements\n" +
                "21\n" +
                "43\n" +
                "65\n" +
                "89\n" +
                "83\n" +
                "37\n" +
                "92\n" +
                "38\n" +
                "63\n" +
                "84\n" +
                "31\n" +
                "18\n" +
                "Matrix elements\n" +
                "\n" +
                "21\t43\t65\t89\t\n" +
                "83\t37\t92\t38\t\n" +
                "63\t84\t31\t18\t";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "from numpy import *\n" +
                "\n" +
                "print(\"3D array\\n\")\n" +
                "\n" +
                "arr = array([\n" +
                "\n" +
                "    [\n" +
                "     [1,2,3],\n" +
                "     [4,5,6]\n" +
                "        ],\n" +
                "    [\n" +
                "     [7,8,9],\n" +
                "     [10,11,12]\n" +
                "        ]\n" +
                "\n" +
                "    ])\n" +
                "\n" +
                "\n" +
                "print(arr)";

        array_string_color = new int[][]{{27,36},{38,39}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{36,38}};
        array_keyword_color_2 = new int[][]{{21,26},{157,162}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{69,70},{71,72},{73,74},{83,84},{85,86},{87,88},{113,114},{115,116},{117,118},{127,129},{130,132},{133,135}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "3D array\n" +
                "\n" +
                "[[[ 1  2  3]\n" +
                "  [ 4  5  6]]\n" +
                "\n" +
                " [[ 7  8  9]\n" +
                "  [10 11 12]]]";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);



        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonArrayUsingNumpy.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python multidimenstional array");
            String shareMessage = "Python multidimenstional array" +
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