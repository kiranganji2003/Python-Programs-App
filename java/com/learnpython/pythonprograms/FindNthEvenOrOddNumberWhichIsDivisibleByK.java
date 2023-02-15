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

public class FindNthEvenOrOddNumberWhichIsDivisibleByK extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_nth_even_or_odd_number_which_is_divisible_by_k);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Find Nth even or odd number which is divisible by K";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def find(num,n,k):\n" +
                "    i = 0\n" +
                "    while i<n-1:\n" +
                "        num = num+2\n" +
                "        if num%k==0:\n" +
                "            i = i+1\n" +
                "    if num%2==0:\n" +
                "        print(\"{}th even number which is divisible by {} is {}\".format(n,k,num))\n" +
                "    else:\n" +
                "        print(\"{}th odd number which is divisible by {} is {}\".format(n,k,num))\n" +
                "\n" +
                "print(\"1. Find nth even number divisible by k\")\n" +
                "print(\"2. Find nth odd number divisible by k\")\n" +
                "print()\n" +
                "ch = int(input(\"Choose your choice: \"))\n" +
                "n = int(input(\"Enter the value of n: \"))\n" +
                "k = int(input(\"Enter the value of k: \"))\n" +
                "if ch==1:\n" +
                "    find(0,n,k)\n" +
                "elif ch==2:\n" +
                "    find(1,n,k)\n" +
                "else:\n" +
                "    print(\"Invalid choice\")";

        int[][] array_string_color = {{138,187},{229,277},{302,342},{350,389},{414,436},{453,477},{494,518},{591,607}};
        int[][] array_keyword_color_1 = {{0,3},{33,38},{74,76},{111,113},{209,214},{521,523},{547,551},{575,579}};
        int[][] array_keyword_color_2 = {{132,137},{223,228},{296,301},{344,349},{391,396},{404,407},{408,413},{443,446},{447,452},{484,487},{488,493},{585,590}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{27,28},{43,44},{64,65},{84,85},{105,106},{118,119},{121,122},{528,529},{540,541},{556,557},{568,569}};
        int[][] array_function_name_color = {{4,8}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "1. Find nth even number divisible by k\n" +
                "2. Find nth odd number divisible by k\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "Enter the value of n: 10\n" +
                "Enter the value of k: 3\n" +
                "10th odd number which is divisible by 3 is 51";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseTheStringUsingRecursion.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNthEvenOrOddNumber.class);
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