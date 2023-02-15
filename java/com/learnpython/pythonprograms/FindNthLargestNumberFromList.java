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

public class FindNthLargestNumberFromList extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_nth_largest_number_from_list);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find nth largest number from list";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "size = int(input(\"Enter the size of list: \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "list = []\n" +
                "for i in range(size):\n" +
                "    list.append(int(input()))\n" +
                "\n" +
                "list.sort()\n" +
                "list.reverse()\n" +
                "\n" +
                "n = int(input(\"Enter the value of n: \"))\n" +
                "\n" +
                "if n<=len(list) and n>=1:\n" +
                "    if n==1:\n" +
                "        print(\"1st largest number is\",list[0])\n" +
                "    elif n==2:\n" +
                "        print(\"2nd largest number is\",list[1])\n" +
                "    elif n==3:\n" +
                "        print(\"3rd largest number is\",list[2])\n" +
                "    else:\n" +
                "        print(\"{}th largest number is {}\".format(n,list[n-1]))\n" +
                "else:\n" +
                "    print(\"Value of n is out of range\")";

        int[][] array_string_color = {{17,43},{52,59},{65,75},{183,207},{264,287},{326,349},{388,411},{445,472},{510,538}};
        int[][] array_keyword_color_1 = {{88,91},{94,96},{211,213},{227,230},{241,243},{301,305},{363,367},{425,429},{494,498}};
        int[][] array_keyword_color_2 = {{7,10},{11,16},{46,51},{97,102},{126,129},{130,135},{173,176},{177,182},{217,220},{258,263},{320,325},{382,387},{439,444},{504,509}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{234,235},{247,248},{293,294},{309,310},{355,356},{371,372},{417,418},{489,490}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "47\n" +
                "237\n" +
                "34\n" +
                "58\n" +
                "25\n" +
                "Enter the value of n: 3\n" +
                "3rd largest number is 47";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PrimeNumbersBetween1ToN.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RemoveTheDigitFromNumber.class);
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