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

public class SortTheValuesOfListWhileAccepting extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_the_values_of_list_while_accepting);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Sort the values of list while accepting";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def sort(list):\n" +
                "    n = len(list)\n" +
                "    for i in range(1,n):\n" +
                "        for j in range(0,n-i):\n" +
                "            if list[j]>list[j+1]:\n" +
                "                temp = list[j]\n" +
                "                list[j] = list[j+1]\n" +
                "                list[j+1] = temp\n" +
                "                \n" +
                "list = []\n" +
                "while True:\n" +
                "    print()\n" +
                "    print(\"1. Insert\")\n" +
                "    print(\"2. Display\")\n" +
                "    print(\"3. Exit\")\n" +
                "    print()\n" +
                "    ch = int(input(\"Choose your choice :- \"))\n" +
                "    if ch==1:\n" +
                "        num = int(input(\"Enter the number :- \"))\n" +
                "        list.append(num)\n" +
                "        sort(list)\n" +
                "    elif ch==2:\n" +
                "        print()\n" +
                "        print(list)\n" +
                "    elif ch==3:\n" +
                "        break";

        int[][] array_string_color = {{285,296},{308,320},{332,341},{374,398},{439,461}};
        int[][] array_keyword_color_1 = {{0,3},{38,41},{44,46},{67,70},{73,75},{102,104},{251,256},{257,261},{405,407},{512,516},{564,568},{584,589}};
        int[][] array_keyword_color_2 = {{24,27},{47,52},{76,81},{267,272},{279,284},{302,307},{326,331},{347,352},{364,367},{368,373},{429,432},{433,438},{532,537},{548,553}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{53,54},{82,83},{120,121},{188,189},{214,215},{412,413},{521,522},{573,574}};
        int[][] array_function_name_color = {{4,8}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "Enter the number :- 40\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "[40]\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "Enter the number :- 25\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "[25, 40]\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "Enter the number :- 32\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "[25, 32, 40]\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "Enter the number :- 78\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "[25, 32, 40, 78]\n" +
                "\n" +
                "1. Insert\n" +
                "2. Display\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice :- 3";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AddValuesInListOfObjectUsingOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SeparateTheWordsOfSentence.class);
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