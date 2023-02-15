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

public class SwapTwoObjects extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap_two_objects);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Swapping two objects";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class MyClass:\n" +
                "    def __init__(self,number,string,details):\n" +
                "        self.details = details\n" +
                "        self.number = number\n" +
                "        self.string = string\n" +
                "    def show(self):\n" +
                "        print(\"\\nDetails :\",self.details)\n" +
                "        print(\"Number :\",self.number)\n" +
                "        print(\"String :\",self.string)\n" +
                "\n" +
                "obj1 = MyClass(123,\"String 1\",\"Object 1\")\n" +
                "obj2 = MyClass(456,\"String 2\",\"Object 2\")\n" +
                "\n" +
                "print(\"Objects before swapping\")\n" +
                "obj1.show()\n" +
                "obj2.show()\n" +
                "\n" +
                "temp = obj1\n" +
                "obj1 = obj2\n" +
                "obj2 = temp\n" +
                "\n" +
                "print(\"\\nObjects after swapping\")\n" +
                "obj1.show()\n" +
                "obj2.show()";

        int[][] array_string_color = {{184,185},{187,197},{226,236},{264,274},{308,318},{319,329},{350,360},{361,371},{380,405},{475,476},{478,501}};
        int[][] array_keyword_color_1 = {{0,5},{19,22},{154,157},{185,187},{476,478}};
        int[][] array_keyword_color_2 = {{178,183},{220,225},{258,263},{374,379},{469,474}};
        int[][] array_self_color = {{32,36},{69,73},{100,104},{129,133},{163,167},{198,202},{237,241},{275,279}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{304,307},{346,349}};
        int[][] array_function_name_color = {{158,162}};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{23,31}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Objects before swapping\n" +
                "\n" +
                "Details : Object 1\n" +
                "Number : 123\n" +
                "String : String 1\n" +
                "\n" +
                "Details : Object 2\n" +
                "Number : 456\n" +
                "String : String 2\n" +
                "\n" +
                "Objects after swapping\n" +
                "\n" +
                "Details : Object 2\n" +
                "Number : 456\n" +
                "String : String 2\n" +
                "\n" +
                "Details : Object 1\n" +
                "Number : 123\n" +
                "String : String 1";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheListHasOrderedValuesOrNot.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindExponentialOfANumberUsingRecursion.class);
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