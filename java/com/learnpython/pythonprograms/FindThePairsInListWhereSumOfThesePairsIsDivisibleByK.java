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

public class FindThePairsInListWhereSumOfThesePairsIsDivisibleByK extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_pairs_in_list_where_sum_of_these_pairs_is_divisible_by_k);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find the pairs in list where the sum of these pairs is divisible by k";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "size = int(input(\"Enter the size of list :- \"))\n" +
                "list = []\n" +
                "\n" +
                "print(\"Enter\",size,\"Elements\")\n" +
                "for i in range(size):\n" +
                "    list.append(int(input()))\n" +
                "\n" +
                "\n" +
                "k = int(input(\"Enter the value of K :- \"))\n" +
                "\n" +
                "count = 0\n" +
                "print()\n" +
                "for i in range(size-1):\n" +
                "    for j in range(i+1,size):\n" +
                "        if (list[i]+list[j])%k==0:\n" +
                "            count += 1\n" +
                "\n" +
                "print(\"Total\",count,\"pairs whose sum is divisible by\",k)\n" +
                "count = 0\n" +
                "print()\n" +
                "for i in range(size-1):\n" +
                "    for j in range(i+1,size):\n" +
                "        if (list[i]+list[j])%k==0:\n" +
                "            count += 1\n" +
                "            print(\"Pair {} :- [{},{}]\".format(count,list[i],list[j]))";

        int[][] array_string_color = {{17,45},{65,72},{78,88},{158,184},{325,332},{339,372},{524,544}};
        int[][] array_keyword_color_1 = {{90,93},{96,98},{206,209},{212,214},{234,237},{240,242},{268,270},{394,397},{400,402},{422,425},{428,430},{456,458}};
        int[][] array_keyword_color_2 = {{7,10},{11,16},{59,64},{99,104},{128,131},{132,137},{148,151},{152,157},{198,203},{215,220},{243,248},{319,324},{386,391},{403,408},{431,436},{518,523}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{196,197},{226,227},{251,252},{292,293},{216,217},{316,317},{384,385},{414,415},{439,440},{480,481},{504,505}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the size of list :- 5\n" +
                "Enter 5 Elements\n" +
                "4\n" +
                "8\n" +
                "3\n" +
                "9\n" +
                "1\n" +
                "Enter the value of K :- 3\n" +
                "\n" +
                "Total 3 pairs whose sum is divisible by 3\n" +
                "\n" +
                "Pair 1 :- [4,8]\n" +
                "Pair 2 :- [8,1]\n" +
                "Pair 3 :- [3,9]";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ConvertingTheDecimalNumberToBinaryManually.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),GradingStudents.class);
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