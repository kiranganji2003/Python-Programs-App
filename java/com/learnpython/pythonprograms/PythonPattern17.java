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

public class PythonPattern17 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern17);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 17");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 17";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = 9\n" +
                "for i in range(10):\n" +
                "    for j in range(10):\n" +
                "        if i==0 or i==10-1:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        elif j==0 or j==10-1:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        elif i==j:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        elif j==count:\n" +
                "            print(\"*\",end=\"  \")\n" +
                "        else:\n" +
                "            print(\" \",end=\"  \")\n" +
                "    count -= 1\n" +
                "    print()";

        int[][] array_string_color = {{100,103},{108,112},{162,165},{170,174},{213,216},{221,225},{268,271},{276,280},{314,317},{322,326}};
        int[][] array_keyword_color_1 = {{10,13},{16,18},{34,37},{40,42},{62,64},{70,72},{122,126},{132,134},{184,188},{235,239},{290,294}};
        int[][] array_keyword_color_2 = {{19,24},{43,48},{94,99},{156,161},{207,212},{262,267},{308,313},{347,352}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{104,107},{166,169},{217,220},{272,275},{318,321}};
        int[][] array_number_color = {{8,9},{25,27},{49,51},{68,69},{76,78},{79,80},{130,131},{138,140},{141,142},{341,342}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "*  *  *  *  *  *  *  *  *  *  \n" +
                "*  *                    *  *  \n" +
                "*     *              *     *  \n" +
                "*        *        *        *  \n" +
                "*           *  *           *  \n" +
                "*           *  *           *  \n" +
                "*        *        *        *  \n" +
                "*     *              *     *  \n" +
                "*  *                    *  *  \n" +
                "*  *  *  *  *  *  *  *  *  *  ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern18.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern16.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python pattern");
            String shareMessage = program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}