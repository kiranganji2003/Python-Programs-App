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

public class PythonPattern31 extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_pattern31);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python pattern 31");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Pattern 31";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "count = -1\n" +
                "for row in range(9):\n" +
                "    if row<5:\n" +
                "        count += 1\n" +
                "    else:\n" +
                "        count -= 1\n" +
                "    for space in range(count):\n" +
                "            print(\"  \",end=\"\")\n" +
                "    for column in range(10):\n" +
                "        print(\"* \",end=\"\")\n" +
                "    print(\"\\n\")";

        int[][] array_string_color = {{143,147},{152,154},{199,203},{208,210},{222,223},{225,226}};
        int[][] array_keyword_color_1 = {{11,14},{19,21},{36,38},{69,73},{98,101},{108,110},{160,163},{171,173},{223,225}};
        int[][] array_keyword_color_2 = {{22,27},{111,116},{137,142},{174,179},{193,198},{216,221}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{148,151},{204,207}};
        int[][] array_number_color = {{9,10},{28,29},{43,44},{63,64},{92,93},{130,132}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "* * * * * * * * * * \n" +
                "\n" +
                "  * * * * * * * * * * \n" +
                "\n" +
                "    * * * * * * * * * * \n" +
                "\n" +
                "      * * * * * * * * * * \n" +
                "\n" +
                "        * * * * * * * * * * \n" +
                "\n" +
                "      * * * * * * * * * * \n" +
                "\n" +
                "    * * * * * * * * * * \n" +
                "\n" +
                "  * * * * * * * * * * \n" +
                "\n" +
                "* * * * * * * * * * ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPattern30.class);
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