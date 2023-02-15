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

public class FormLargestNumberFromGivenArray extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_largest_number_from_given_array);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Accept the array of non negative integer numbers arrange them such that they form the largest number";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array('i',[])\n" +
                "size = int(input(\"Enter array size :- \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "for i in range(size):\n" +
                "    arr.append(int(input()))\n" +
                "\n" +
                "nums = []\n" +
                "\n" +
                "for i in arr:\n" +
                "    while i>0:\n" +
                "        rem = i%10\n" +
                "        nums.append(rem)\n" +
                "        i = i//10\n" +
                "\n" +
                "nums.sort()\n" +
                "print(\"Largest number from array :- \",end=\"\")\n" +
                "\n" +
                "for i in range(len(nums)-1,-1,-1):\n" +
                "    print(nums[i],end=\"\")";

        int[][] array_string_color = {{33,36},{58,80},{89,96},{102,112},{288,319},{324,326},{386,388}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{115,118},{121,123},{178,181},{184,186},{196,201},{329,332},{335,337}};
        int[][] array_keyword_color_2 = {{48,51},{52,57},{83,88},{124,129},{152,155},{156,161},{282,287},{338,343},{344,347},{368,373}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{320,323},{382,385}};
        int[][] array_number_color = {{204,205},{223,225},{266,268},{354,355},{357,358},{360,361}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter array size :- 3\n" +
                "Enter 3 elements\n" +
                "32\n" +
                "76\n" +
                "38\n" +
                "Largest number from array :- 876332";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ProductOfArrayExceptSelf.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheArrayHasUniqueValuesOrNot.class);
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