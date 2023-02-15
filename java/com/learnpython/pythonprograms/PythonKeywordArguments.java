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

public class PythonKeywordArguments extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_keyword_arguments);

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
        actionBar.setTitle("Python keyword arguments");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"Function with no keyword arguments\\n\")\n" +
                "\n" +
                "def info(*details):\n" +
                "    for i in details:\n" +
                "        print(i)\n" +
                "\n" +
                "\n" +
                "info(\"Shyam\",23,81.26)";

        array_string_color = new int[][]{{6,41},{43,44},{113,120}};
        array_keyword_color_1 = new int[][]{{41,43},{47,50},{71,74},{77,79}};
        array_keyword_color_2 = new int[][]{{0,5},{97,102}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{121,123},{124,129}};
        array_function_name_color = new int[][]{{51,55}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Function with no keyword arguments\n" +
                "\n" +
                "Shyam\n" +
                "23\n" +
                "81.26";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Function with no keyword arguments\\n\")\n" +
                "\n" +
                "def info(person,*details):\n" +
                "    print(person,\"Details\")\n" +
                "    for i in details:\n" +
                "        print(i)\n" +
                "\n" +
                "\n" +
                "info(\"Student\",\"Shyam\",23,81.26)";

        array_string_color = new int[][]{{6,41},{43,44},{91,100},{148,157},{158,165}};
        array_keyword_color_1 = new int[][]{{41,43},{47,50},{106,109},{112,114}};
        array_keyword_color_2 = new int[][]{{0,5},{78,83},{132,137}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{166,168},{169,174}};
        array_function_name_color = new int[][]{{51,55}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Function with no keyword arguments\n" +
                "\n" +
                "Student Details\n" +
                "Shyam\n" +
                "23\n" +
                "81.26";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Function with keyword arguments\\n\")\n" +
                "\n" +
                "def info(**details):\n" +
                "    for key,value in details.items():\n" +
                "        print(key,\":-\",value)\n" +
                "\n" +
                "\n" +
                "info(name=\"Mahendra\",employee_id=439,salary=23000)";

        array_string_color = new int[][]{{6,38},{40,41},{121,125},{145,155}};
        array_keyword_color_1 = new int[][]{{38,40},{44,47},{69,72},{83,85}};
        array_keyword_color_2 = new int[][]{{0,5},{111,116}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{140,144},{156,167},{172,178}};
        array_number_color = new int[][]{{168,171},{179,184}};
        array_function_name_color = new int[][]{{48,52}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Function with keyword arguments\n" +
                "\n" +
                "name :- Mahendra\n" +
                "employee_id :- 439\n" +
                "salary :- 23000";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "print(\"Function with keyword arguments\\n\")\n" +
                "\n" +
                "def info(person,**details):\n" +
                "    print(person,\"Details\")\n" +
                "    for key,value in details.items():\n" +
                "        print(key,\":-\",value)\n" +
                "\n" +
                "\n" +
                "info(\"Employee\",name=\"Mahendra\",employee_id=439,salary=23000)";

        array_string_color = new int[][]{{6,38},{40,41},{89,98},{156,160},{175,185},{191,201}};
        array_keyword_color_1 = new int[][]{{38,40},{44,47},{104,107},{118,120}};
        array_keyword_color_2 = new int[][]{{0,5},{76,81},{146,151}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{186,190},{202,213},{218,224}};
        array_number_color = new int[][]{{214,217},{225,230}};
        array_function_name_color = new int[][]{{48,52}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Function with keyword arguments\n" +
                "\n" +
                "Employee Details\n" +
                "name :- Mahendra\n" +
                "employee_id :- 439\n" +
                "salary :- 23000";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonGlobalAndLocalVariables.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTypesOfFunctionArguments.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python keyword arguments");
            String shareMessage = "Python keyword arguments" +
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