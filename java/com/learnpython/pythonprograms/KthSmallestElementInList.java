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

public class KthSmallestElementInList extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kth_smallest_element_in_list);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find the Kth smallest element in list";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "n = int(input(\"Enter no. of elements in list :- \"))\n" +
                "print(\"Enter\",n,\"elements\")\n" +
                "\n" +
                "list = []\n" +
                "\n" +
                "for i in range(n):\n" +
                "    list.append(int(input()))\n" +
                "\n" +
                "list.sort()\n" +
                "\n" +
                "k = int(input(\"Enter the value of K :- \"))\n" +
                "\n" +
                "for i in range(k):\n" +
                "    if i==k-1:\n" +
                "        print(\"{}th smallest element in list is {}\".format(k,list[i]))";

        int[][] array_string_color = {{14,49},{58,65},{68,78},{169,195},{247,284}};
        int[][] array_keyword_color_1 = {{92,95},{98,100},{199,202},{205,207},{222,224}};
        int[][] array_keyword_color_2 = {{4,7},{8,13},{52,57},{101,106},{127,130},{131,136},{159,162},{163,168},{208,213},{241,246}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{230,231}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter no. of elements in list :- 10\n" +
                "Enter 10 elements\n" +
                "43\n" +
                "65\n" +
                "89\n" +
                "23\n" +
                "12\n" +
                "10\n" +
                "38\n" +
                "74\n" +
                "36\n" +
                "84\n" +
                "Enter the value of K :- 5\n" +
                "5th smallest element in list is 38";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayArmstrongNumbersBetweenOneToN.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ListOfObjects.class);
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