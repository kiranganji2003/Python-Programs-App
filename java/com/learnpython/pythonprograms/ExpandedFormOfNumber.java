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

public class ExpandedFormOfNumber extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_form_of_number);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Expanded form of number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "num = int(input(\"Enter the number :- \"))\n" +
                "expanded_form = []\n" +
                "\n" +
                "no = num\n" +
                "cnt = 1\n" +
                "while no>0:\n" +
                "    rem = no%10\n" +
                "    expanded_form.append(rem*cnt)\n" +
                "    cnt = cnt*10\n" +
                "    no = no//10\n" +
                "\n" +
                "print(num,\"=\",end=\" \")\n" +
                "for i in range(len(expanded_form)-1,-1,-1):\n" +
                "    if i==0:\n" +
                "        print(expanded_form[i])\n" +
                "        continue\n" +
                "    print(expanded_form[i],\"+\",end=\" \")";

        int[][] array_string_color = {{16,38},{184,187},{192,195},{330,333},{338,341}};
        int[][] array_keyword_color_1 = {{78,83},{197,200},{203,205},{245,247},{294,302}};
        int[][] array_keyword_color_2 = {{6,9},{10,15},{174,179},{206,211},{212,215},{262,267},{307,312}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{188,191},{334,337}};
        int[][] array_number_color = {{76,77},{87,88},{103,105},{154,156},{170,172},{231,232},{234,235},{237,238},{251,252}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the number :- 15378\n" +
                "15378 = 10000 + 5000 + 300 + 70 + 8";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SumOfArithmeticSequence.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DoubleTheNumberForNthTimes.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python program");
            String shareMessage = "Program :- " + program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}