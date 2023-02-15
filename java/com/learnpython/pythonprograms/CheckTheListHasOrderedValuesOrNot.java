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

public class CheckTheListHasOrderedValuesOrNot extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_the_list_has_ordered_values_or_not);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Check the list has ordered values or not";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def check(list):\n" +
                "    ascending = False\n" +
                "    descending = False\n" +
                "    for i in range(len(list)-1):        \n" +
                "        if list[i]<list[i+1]:\n" +
                "            ascending = True\n" +
                "        else:\n" +
                "            ascending = False\n" +
                "            break\n" +
                "    for i in range(len(list)-1):\n" +
                "        if list[i]>list[i+1]:\n" +
                "            descending = True\n" +
                "        else:\n" +
                "            descending = False\n" +
                "            break\n" +
                "    if ascending==True:\n" +
                "        return \"List is in ascending order\"\n" +
                "    elif descending==True:\n" +
                "        return \"List is in descending order\"\n" +
                "    else:\n" +
                "        return \"List is not in order\"\n" +
                "\n" +
                "list1 = [1,22,333,4444,55555]\n" +
                "print(check(list1))\n" +
                "\n" +
                "list2 = [55555,4444,333,22,1]\n" +
                "print(check(list2))\n" +
                "\n" +
                "list3 = [555,4444,777,666,11]\n" +
                "print(check(list3))";

        int[][] array_string_color = {{419,447},{490,519},{545,567}};
        int[][] array_keyword_color_1 = {{0,3},{33,38},{56,61},{66,69},{72,74},{111,113},{157,161},{170,174},{200,205},{218,223},{228,231},{234,236},{265,267},{312,316},{325,329},{356,361},{374,379},{384,386},{398,402},{412,418},{452,456},{469,473},{483,489},{524,528},{538,544}};
        int[][] array_keyword_color_2 = {{75,80},{81,84},{237,242},{243,246},{599,604},{650,655},{701,706}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{91,92},{129,130},{253,254},{283,284},{578,579},{580,582},{583,586},{587,591},{592,597},{629,634},{635,639},{640,643},{644,646},{647,648},{680,683},{684,688},{689,692},{693,696},{697,699}};
        int[][] array_function_name_color = {{4,9}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "List is in ascending order\n" +
                "List is in descending order\n" +
                "List is not in order";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNumberOfDigitsInSmallestAndLargestNumberOfList.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SwapTwoObjects.class);
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