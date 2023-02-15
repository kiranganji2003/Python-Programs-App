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

public class FindThePairInArrayWhichHasMaximumSum extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_pair_in_array_which_has_maximum_sum);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find the pair in array which has maximum sum";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array(\"i\",[])\n" +
                "\n" +
                "def accept_array():\n" +
                "    global arr\n" +
                "    size = int(input(\"Enter the size of the array :- \"))\n" +
                "    print(\"Enter\",size,\"elements\")\n" +
                "    for i in range(size):\n" +
                "        arr.append(int(input()))\n" +
                "\n" +
                "\n" +
                "def find_pair(arr):\n" +
                "    sum = 0\n" +
                "    a,b = 0,0\n" +
                "    for i in range(len(arr)-1):\n" +
                "        for j in range(i+1,len(arr)):\n" +
                "            if (arr[i]+arr[j])>sum:\n" +
                "                sum = arr[i]+arr[j]\n" +
                "                a = arr[i]\n" +
                "                b = arr[j]\n" +
                "    return a,b\n" +
                "\n" +
                "\n" +
                "accept_array()\n" +
                "x,y = find_pair(arr)\n" +
                "\n" +
                "print(\"[{},{}] this pair has maximum sum\".format(x,y))";

        int[][] array_string_color = {{33,36},{98,131},{144,151},{157,167},{532,567}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{42,45},{66,72},{173,176},{179,181},{230,233},{280,283},{286,288},{316,319},{322,324},{358,360},{476,482}};
        int[][] array_keyword_color_2 = {{88,91},{92,97},{138,143},{182,187},{214,217},{218,223},{289,294},{295,298},{325,330},{335,338},{526,531}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{260,261},{272,273},{274,275},{304,305},{333,334}};
        int[][] array_function_name_color = {{46,58},{234,243}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the size of the array :- 10\n" +
                "Enter 10 elements\n" +
                "9\n" +
                "5\n" +
                "19\n" +
                "2\n" +
                "7\n" +
                "11\n" +
                "3\n" +
                "14\n" +
                "4\n" +
                "7\n" +
                "[19,14] this pair has maximum sum";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseTheNumber.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsPrimeOrNotNewMEthod.class);
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