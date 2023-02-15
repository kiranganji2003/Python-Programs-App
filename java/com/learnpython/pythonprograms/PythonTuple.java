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

public class PythonTuple extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_tuple);

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
        actionBar.setTitle("Python tuple");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "'''  In python tuple is immutable\n" +
                "that means you cannot\n" +
                "change the value  '''\n" +
                "\n" +
                "subjects = (\"C\",\"C++\",\"Java\",\"Javascript\",\"Python\")\n" +
                "print(subjects)";

        array_string_color = new int[][]{{91,94},{95,100},{101,107},{108,120},{121,129}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{131,136}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{{0,77}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "('C', 'C++', 'Java', 'Javascript', 'Python')";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "tuple = (\"number 1\",\"number 2\",\"number 3\",\"number 4\",\"number 5\")\n" +
                "print(\"tuple[0] =\",tuple[0])\n" +
                "print(\"tuple[4] =\",tuple[4])\n" +
                "print(\"tuple[1:4] =\",tuple[1:4])\n" +
                "print(\"tuple[3:] =\",tuple[3:])\n" +
                "print(\"tuple[:4] =\",tuple[:4])\n" +
                "print(\"tuple[-1] =\",tuple[-1])\n" +
                "print(\"tuple[-3:-1] =\",tuple[-3:-1])";

        array_string_color = new int[][]{{9,19},{20,30},{31,41},{42,52},{53,63},{71,83},{100,112},{129,143},{162,175},{193,206},{224,237},{255,271}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{65,70},{94,99},{123,128},{156,161},{187,192},{218,223},{249,254}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{90,91},{119,120},{150,151},{152,153},{182,183},{214,215},{245,246},{279,280},{282,283}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "tuple[0] = number 1\n" +
                "tuple[4] = number 5\n" +
                "tuple[1:4] = ('number 2', 'number 3', 'number 4')\n" +
                "tuple[3:] = ('number 4', 'number 5')\n" +
                "tuple[:4] = ('number 1', 'number 2', 'number 3', 'number 4')\n" +
                "tuple[-1] = number 5\n" +
                "tuple[-3:-1] = ('number 3', 'number 4')";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        example3 = "numbers = (12,32,43,54,32,54,32,92,27)\n" +
                "\n" +
                "print(numbers.count(32))\n" +
                "print(numbers.index(92))";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{40,45},{65,70}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{11,13},{14,16},{17,19},{20,22},{23,25},{26,28},{29,31},{32,34},{35,37},{60,62},{85,87}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "3\n" +
                "7";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonSet.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonList.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python tuple");
            String shareMessage = "Python tuple" +
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