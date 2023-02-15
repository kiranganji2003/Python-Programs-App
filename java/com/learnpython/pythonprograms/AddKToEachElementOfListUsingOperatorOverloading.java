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

public class AddKToEachElementOfListUsingOperatorOverloading extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_kto_each_element_of_list_using_operator_overloading);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Add k to each element of list using operator overloading";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class List:\n" +
                "    def accept(self):\n" +
                "        self.list = []\n" +
                "        self.n = int(input(\"Enter no. of elements :- \"))\n" +
                "        print(\"Enter\",self.n,\"elements\")\n" +
                "        for i in range(self.n):\n" +
                "            self.list.append(int(input()))\n" +
                "    def __add__(self,num):\n" +
                "        for i in range(self.n):\n" +
                "            self.list[i] += num\n" +
                "\n" +
                "obj = List()\n" +
                "obj.accept()\n" +
                "print(\"\\nOriginal list\")\n" +
                "print(obj.list)\n" +
                "print()\n" +
                "k = int(input(\"Enter the value of k :- \"))\n" +
                "obj+k\n" +
                "print(\"\\nAfter adding\",k,\"to each element of list\")\n" +
                "print(obj.list)";

        int[][] array_string_color = {{84,111},{128,135},{143,153},{354,355},{357,371},{411,437},{452,453},{455,468},{471,496}};
        int[][] array_keyword_color_1 = {{0,5},{16,19},{163,166},{169,171},{234,237},{265,268},{271,273},{355,357},{453,455}};
        int[][] array_keyword_color_2 = {{74,77},{78,83},{122,127},{172,177},{216,219},{220,225},{274,279},{348,353},{373,378},{389,394},{401,404},{405,410},{446,451},{498,503}};
        int[][] array_self_color = {{27,31},{42,46},{65,69},{136,140},{178,182},{199,203},{246,250},{280,284},{301,305}};
        int[][] array_end_color = {};
        int[][] array_number_color = {};
        int[][] array_function_name_color = {{20,26}};
        int[][] array_comments = {};
        int[][] array_special_functions_color = {{238,245}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_functions_color));

        output1 = "Enter no. of elements :- 5\n" +
                "Enter 5 elements\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "\n" +
                "Original list\n" +
                "[1, 2, 3, 4, 5]\n" +
                "\n" +
                "Enter the value of k :- 10\n" +
                "\n" +
                "After adding 10 to each element of list\n" +
                "[11, 12, 13, 14, 15]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SeparateTheWordsOfSentence.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseTheWordsOfSentence.class);
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