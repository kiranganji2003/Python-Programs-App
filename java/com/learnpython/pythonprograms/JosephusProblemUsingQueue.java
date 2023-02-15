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

public class JosephusProblemUsingQueue extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_josephus_problem_using_queue);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Josephus problem using queue");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "class Queue:\n" +
                "    def __init__(self):\n" +
                "        self.queue = []\n" +
                "    def dequeue(self):\n" +
                "        x = self.queue[0]\n" +
                "        del self.queue[0]\n" +
                "        return x\n" +
                "    def enqueue(self,n):\n" +
                "        self.queue.append(n)\n" +
                "    def main(self):\n" +
                "        total_children = int(input(\"Enter number of children: \"))\n" +
                "        lucky_number = int(input(\"Enter the lucky number: \"))\n" +
                "        for i in range(1,total_children+1):\n" +
                "            self.enqueue(i)\n" +
                "        for i in range(1,total_children):\n" +
                "            for j in range(1,lucky_number):\n" +
                "                x = self.dequeue()\n" +
                "                self.enqueue(x)\n" +
                "            x = self.dequeue()\n" +
                "            print(\"\\nAfter pass\",i,self.queue)\n" +
                "            print(\"Eliminated children:\",x)\n" +
                "        print(\"\\nWinner :-\",self.dequeue())\n" +
                "\n" +
                "obj = Queue()\n" +
                "obj.main()";

        int[][] array_string_color = {{262,290},{326,352},{629,630},{632,643},{676,698},{716,717},{719,729}};
        int[][] array_keyword_color_1 = {{0,5},{17,20},{65,68},{118,121},{144,150},{157,160},{211,214},{363,366},{369,371},{435,438},{441,443},{481,484},{487,489},{630,632},{717,719}};
        int[][] array_keyword_color_2 = {{252,255},{256,261},{316,319},{320,325},{372,377},{444,449},{490,495},{623,628},{670,675},{710,715}};
        int[][] array_self_color = {{30,34},{45,49},{77,81},{96,100},{122,126},{169,173},{186,190},{220,224},{411,415},{533,537},{564,568},{596,600},{646,650},{730,734}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{107,108},{133,134},{378,379},{395,396},{450,451},{496,497}};
        int[][] array_function_name_color = {{69,76},{161,168},{215,219}};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{21,29}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter number of children: 12\n" +
                "Enter the lucky number: 3\n" +
                "\n" +
                "After pass 1 [4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2]\n" +
                "Eliminated children: 3\n" +
                "\n" +
                "After pass 2 [7, 8, 9, 10, 11, 12, 1, 2, 4, 5]\n" +
                "Eliminated children: 6\n" +
                "\n" +
                "After pass 3 [10, 11, 12, 1, 2, 4, 5, 7, 8]\n" +
                "Eliminated children: 9\n" +
                "\n" +
                "After pass 4 [1, 2, 4, 5, 7, 8, 10, 11]\n" +
                "Eliminated children: 12\n" +
                "\n" +
                "After pass 5 [5, 7, 8, 10, 11, 1, 2]\n" +
                "Eliminated children: 4\n" +
                "\n" +
                "After pass 6 [10, 11, 1, 2, 5, 7]\n" +
                "Eliminated children: 8\n" +
                "\n" +
                "After pass 7 [2, 5, 7, 10, 11]\n" +
                "Eliminated children: 1\n" +
                "\n" +
                "After pass 8 [10, 11, 2, 5]\n" +
                "Eliminated children: 7\n" +
                "\n" +
                "After pass 9 [5, 10, 11]\n" +
                "Eliminated children: 2\n" +
                "\n" +
                "After pass 10 [5, 10]\n" +
                "Eliminated children: 11\n" +
                "\n" +
                "After pass 11 [10]\n" +
                "Eliminated children: 5\n" +
                "\n" +
                "Winner :- 10";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
                Intent intent = new Intent(getApplicationContext(),BirthdaySaverApplication.class);
                startActivity(intent);
                finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayingDataInTabularFormat.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python Project");
            String shareMessage = "Project :- Josephus problem using queue" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}