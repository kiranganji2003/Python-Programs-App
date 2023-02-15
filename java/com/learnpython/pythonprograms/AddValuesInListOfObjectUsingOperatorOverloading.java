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

public class AddValuesInListOfObjectUsingOperatorOverloading extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_values_in_list_of_object_using_operator_overloading);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Add values in list of object using operator overloading";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class MyList:\n" +
                "    def __init__(self):\n" +
                "        self.list = []\n" +
                "    def __add__(self,value):\n" +
                "        self.list.append(value)\n" +
                "\n" +
                "values = MyList()\n" +
                "values + \"Satish\"\n" +
                "values + \"Ramesh\"\n" +
                "values + \"Ravi\"\n" +
                "values + \"Akshita\"\n" +
                "print(values.list)\n" +
                "values + \"Ramika\"\n" +
                "values + \"Navin\"\n" +
                "print(values.list)";

        int[][] array_string_color = {{150,158},{168,176},{186,192},{202,211},{240,248},{258,265}};
        int[][] array_keyword_color_1 = {{0,5},{18,21},{65,68}};
        int[][] array_keyword_color_2 = {{212,217},{266,271}};
        int[][] array_self_color = {{31,35},{46,50},{77,81},{98,102}};
        int[][] array_end_color = {};
        int[][] array_number_color = {};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{22,30},{69,76}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "['Satish', 'Ramesh', 'Ravi', 'Akshita']\n" +
                "['Satish', 'Ramesh', 'Ravi', 'Akshita', 'Ramika', 'Navin']";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RemoveTheCharactersXFromTheString.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SortTheValuesOfListWhileAccepting.class);
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