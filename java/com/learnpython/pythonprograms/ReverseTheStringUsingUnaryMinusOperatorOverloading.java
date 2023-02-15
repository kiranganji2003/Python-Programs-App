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

public class ReverseTheStringUsingUnaryMinusOperatorOverloading extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_the_string_using_unary_minus_operator_overloading);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Reverse the string using unary minus operator overloading";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "class String:\n" +
                "    def __init__(self):\n" +
                "        self.str = input(\"Enter the string: \")\n" +
                "\n" +
                "    def __neg__(self):\n" +
                "        reverse = \"\"\n" +
                "        for i in range(len(self.str)-1,-1,-1):\n" +
                "            reverse += self.str[i]\n" +
                "        self.str = reverse\n" +
                "\n" +
                "    def __str__(self):\n" +
                "        return self.str\n" +
                "\n" +
                "    \n" +
                "\n" +
                "obj = String()\n" +
                "-obj\n" +
                "print(\"Reversed string:\",obj)";

        int[][] array_string_color = {{63,83},{127,129},{320,338}};
        int[][] array_keyword_color_1 = {{0,5},{18,21},{90,93},{138,141},{144,146},{244,247},{271,277}};
        int[][] array_keyword_color_2 = {{57,62},{147,152},{153,156},{314,319}};
        int[][] array_self_color = {{31,35},{46,50},{102,106},{157,161},{200,204},{256,260},{278,282}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{167,168},{170,171},{173,174}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{22,30},{94,101},{248,255}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter the string: Python\n" +
                "Reversed string: nohtyP";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayTheMessageNTimesUsingRecursion.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ShuffleTheElementsOfList.class);
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