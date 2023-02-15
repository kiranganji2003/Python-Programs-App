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

public class PythonList extends AppCompatActivity {

    String example1,example2,example3,example4,example5;
    String output1,output2,output3,output4,output5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_list);

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
        actionBar.setTitle("Python list");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "list = [13,89,29,54,72,23]\n" +
                "print(list)";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{27,32}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{8,10},{11,13},{14,16},{17,19},{20,22},{23,25}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "[13, 89, 29, 54, 72, 23]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "list = [11,22,33,44,55,66,77,88,99,110]\n" +
                "\n" +
                "print(\"list[0] =\",list[0])\n" +
                "print(\"list[4] =\",list[4])\n" +
                "print(\"list[3:9] =\",list[3:9])\n" +
                "print(\"list[5:] =\",list[5:])\n" +
                "print(\"list[:6] =\",list[:6])\n" +
                "print(\"list[-1] =\",list[-1])\n" +
                "print(\"list[-5:-1] =\",list[-5:-1])";

        array_string_color = new int[][]{{47,58},{74,85},{101,114},{132,144},{161,173},{190,202},{219,234}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{41,46},{68,73},{95,100},{126,131},{155,160},{184,189},{213,218}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{8,10},{11,13},{14,16},{17,19},{20,22},{23,25},{26,28},{29,31},{32,34},{35,38},{64,65},{91,92},{120,121},{122,123},{150,151},{180,181},{209,210},{241,242},{244,245}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "list[0] = 11\n" +
                "list[4] = 55\n" +
                "list[3:9] = [44, 55, 66, 77, 88, 99]\n" +
                "list[5:] = [66, 77, 88, 99, 110]\n" +
                "list[:6] = [11, 22, 33, 44, 55, 66]\n" +
                "list[-1] = 110\n" +
                "list[-5:-1] = [66, 77, 88, 99]";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        example3 = "names = ['jay','john','mike','rahul','jenny']\n" +
                "print(names)";

        array_string_color = new int[][]{{9,14},{15,21},{22,28},{29,36},{37,44}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{46,51}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "['jay', 'john', 'mike', 'rahul', 'jenny']";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "values = [32, 78.83, \"This is string\"]\n" +
                "print(values)\n" +
                "\n" +
                "list1 = [\"Group 1\",\"Group 2\"]\n" +
                "list2 = [\"Group 3\",\"Group 4\"]\n" +
                "\n" +
                "list3 = [list1,list2]\n" +
                "print(list3)";

        array_string_color = new int[][]{{21,37},{63,72},{73,82},{93,102},{103,112}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{39,44},{137,142}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{10,12},{14,19}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "[32, 78.83, 'This is string']\n" +
                "[['Group 1', 'Group 2'], ['Group 3', 'Group 4']]";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        example5 = "nums = [10,20,30,40,50,60,70,80,90,100]\n" +
                "print(nums)\n" +
                "nums.append(200)\n" +
                "print(nums)\n" +
                "index_value = 2\n" +
                "nums.insert(index_value,25)\n" +
                "print(nums)\n" +
                "nums.remove(60)\n" +
                "print(nums)\n" +
                "\n" +
                "nums.pop(index_value)\n" +
                "print(nums)\n" +
                "nums.pop()\n" +
                "print(nums)\n" +
                "print(min(nums))\n" +
                "print(max(nums))\n" +
                "print(sum(nums))";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{40,45},{69,74},{125,130},{153,158},{188,193},{211,216},{223,228},{229,232},{240,245},{246,249},{257,262},{263,266}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{8,10},{11,13},{14,16},{17,19},{20,22},{23,25},{26,28},{29,31},{32,34},{35,38},{64,67},{95,96},{121,123},{149,151}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.example5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(example5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output5 = "[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]\n" +
                "[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200]\n" +
                "[10, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 200]\n" +
                "[10, 20, 25, 30, 40, 50, 70, 80, 90, 100, 200]\n" +
                "[10, 20, 30, 40, 50, 70, 80, 90, 100, 200]\n" +
                "[10, 20, 30, 40, 50, 70, 80, 90, 100]\n" +
                "10\n" +
                "100\n" +
                "490";
        TextView t_out5 = findViewById(R.id.output5);
        t_out5.setText(output5);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTuple.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonVariables.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python list");
            String shareMessage = "Python list" +
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