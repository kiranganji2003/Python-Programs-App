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

public class PythonExceptionHandlingElse extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_exception_handling_else);

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
        actionBar.setTitle("Python try except else");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "try:\n" +
                "    rollno = int(input(\"Enter the roll no: \"))\n" +
                "    name = input(\"Enter the name: \")\n" +
                "except:\n" +
                "    print(\"Invalid roll no\")\n" +
                "else:\n" +
                "    print(\"Successfully Executed\")";

        array_string_color = new int[][]{{28,49},{69,87},{107,124},{142,165}};
        array_keyword_color_1 = new int[][]{{0,3},{89,95},{126,130}};
        array_keyword_color_2 = new int[][]{{18,21},{22,27},{63,68},{101,106},{136,141}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the roll no: 87\n" +
                "Enter the name: Jayesh\n" +
                "Successfully Executed";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "flag = 0\n" +
                "try:\n" +
                "    rollno = int(input(\"Enter the roll no: \"))\n" +
                "    flag += 1\n" +
                "    name = input(\"Enter the name: \")\n" +
                "    percentage = float(input(\"Enter the percentage: \"))\n" +
                "except:\n" +
                "    if flag==0:\n" +
                "        print(\"Invalid roll no\")\n" +
                "    else:\n" +
                "        print(\"Invalid percentage\")\n" +
                "else:\n" +
                "    print(\"Successfully Executed\")";

        array_string_color = new int[][]{{37,58},{92,110},{141,165},{206,223},{249,269},{287,310}};
        array_keyword_color_1 = new int[][]{{9,12},{168,174},{180,182},{229,233},{271,275}};
        array_keyword_color_2 = new int[][]{{27,30},{31,36},{86,91},{129,134},{135,140},{200,205},{243,248},{281,286}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{7,8},{73,74},{189,190}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the roll no: 43\n" +
                "Enter the name: Nilesh\n" +
                "Enter the percentage: 54.80\n" +
                "Successfully Executed";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFinally.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultipleExceptionBlocks.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python exception handling else");
            String shareMessage = "Python exception handling else" +
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