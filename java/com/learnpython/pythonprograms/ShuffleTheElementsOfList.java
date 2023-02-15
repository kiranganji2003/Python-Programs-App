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

public class ShuffleTheElementsOfList extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle_the_elements_of_list);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Shuffle the elements of list";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);

        program1 = "from random import random\n" +
                "\n" +
                "def shuffle_list(list):\n" +
                "    random_index = []\n" +
                "    while True:\n" +
                "        index = int(random()*size)\n" +
                "        if index not in random_index:\n" +
                "            random_index.append(index)\n" +
                "        if len(random_index)==size:\n" +
                "            break\n" +
                "\n" +
                "    shuffle_list = []\n" +
                "    for i in range(size):\n" +
                "        shuffle_list.append(list[random_index[i]])\n" +
                "\n" +
                "    return shuffle_list\n" +
                "\n" +
                "size = int(input(\"Enter the size of list: \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "list,original = [],[]\n" +
                "for i in range(size):\n" +
                "    list.append(int(input()))\n" +
                "\n" +
                "original = list\n" +
                "if size<=1:\n" +
                "    print(\"Original list:\",original)\n" +
                "    print(\"Shuffled list:\",list)\n" +
                "else:\n" +
                "    while True:\n" +
                "        output = shuffle_list(list)\n" +
                "        if output!=list:\n" +
                "            list = output\n" +
                "            break\n" +
                "    print(\"Original list:\",original)\n" +
                "    print(\"Shuffled list:\",list)";

        int[][] array_string_color = {{398,424},{433,440},{446,456},{572,588},{609,625},{769,785},{806,822}};
        int[][] array_keyword_color_1 = {{0,4},{12,18},{27,30},{77,87},{132,134},{141,147},{209,211},{249,254},{282,285},{288,290},{360,366},{481,484},{487,489},{550,552},{632,636},{642,652},{698,700},{753,758}};
        int[][] array_keyword_color_2 = {{105,108},{212,215},{291,296},{388,391},{392,397},{427,432},{490,495},{519,522},{523,528},{566,571},{603,608},{763,768},{800,805}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{559,560}};
        int[][] array_function_name_color = {{31,43}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the size of list: 8\n" +
                "Enter 8 elements\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "Original list: [1, 2, 3, 4, 5, 6, 7, 8]\n" +
                "Shuffled list: [3, 8, 7, 1, 5, 4, 6, 2]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseTheStringUsingUnaryMinusOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),GenerateRandomOTP.class);
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