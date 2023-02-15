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

public class PythonLessThanOperatorOverloading extends AppCompatActivity {

    String example1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_less_than_operator_overloading);

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
        actionBar.setTitle("Python less than operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class Student:\n" +
                "    def __init__(self,s1,s2,s3):\n" +
                "        self.s1 = s1\n" +
                "        self.s2 = s2\n" +
                "        self.s3 = s3\n" +
                "    def __lt__(self,other):\n" +
                "        std1 = self.s1+self.s2+self.s3\n" +
                "        std2 = other.s1+other.s2+other.s3\n" +
                "        if std1<std2:\n" +
                "            return True\n" +
                "        else:\n" +
                "            return False\n" +
                "\n" +
                "std1 = Student(54,76,29)\n" +
                "std2 = Student(94,36,59)\n" +
                "\n" +
                "if std1<std2:\n" +
                "    print(\"Student 1 marks are less than Student 2\")\n" +
                "else:\n" +
                "    print(\"Student 2 marks are less than Student 1\")    ";

        array_string_color = new int[][]{{381,422},{440,481}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22},{115,118},{228,230},{254,265},{274,278},{292,304},{357,359},{424,428}};
        array_keyword_color_2 = new int[][]{{375,380},{434,439}};
        array_self_color = new int[][]{{32,36},{56,60},{77,81},{98,102},{126,130},{154,158},{162,166},{170,174}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{321,323},{324,326},{327,329},{346,348},{349,351},{352,354}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,31},{119,125}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Student 1 marks are less than Student 2";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonGreaterThanOperatorOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python less than operator overloading");
            String shareMessage = "Python less than operator overloading" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}