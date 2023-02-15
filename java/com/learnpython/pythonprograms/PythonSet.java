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

public class PythonSet extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_set);

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
        actionBar.setTitle("Python set");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "'''  Set is collection of unique values.\n" +
                "Set never follows sequence.\n" +
                "Set does not support indexed value.  '''\n" +
                "\n" +
                "set1 = {12,43,64,89,32,87}\n" +
                "print(\"set1 =\",set1)\n" +
                "set2 = {\"Rahul\",\"Ramesh\",\"Rakesh\",\"Ramesh\",\"Rohit\"}\n" +
                "print(\"set2 =\",set2)";

        array_string_color = new int[][]{{144,152},{167,174},{175,183},{184,192},{193,201},{202,209},{217,225}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{138,143},{211,216}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{119,121},{122,124},{125,127},{128,130},{131,133},{134,136}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{{0,109}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "set1 = {64, 32, 87, 89, 43, 12}\n" +
                "set2 = {'Rahul', 'Ramesh', 'Rohit', 'Rakesh'}";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "books = {'Physics','C language','Java','Python'}\n" +
                "print(books)\n" +
                "books.remove('Physics')\n" +
                "print(books)\n" +
                "\n" +
                "set = {1,2,3,4,5}\n" +
                "set.pop()\n" +
                "print(set)";

        array_string_color = new int[][]{{9,18},{19,31},{32,38},{39,47},{75,84}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{49,54},{86,91},{128,133}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{107,108},{109,110},{111,112},{113,114},{115,116}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "{'Java', 'Python', 'Physics', 'C language'}\n" +
                "{'Java', 'Python', 'C language'}\n" +
                "{2, 3, 4, 5}";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonDictionary.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTuple.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python set");
            String shareMessage = "Python set" +
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