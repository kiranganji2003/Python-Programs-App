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

public class DiagonalDifferenceOfMatrix extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonal_difference_of_matrix);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find diagonal difference of matrix";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "matrix = []\n" +
                "\n" +
                "print(\"Enter n*n matrix\")\n" +
                "n = int(input(\"Enter value of n :- \"))\n" +
                "\n" +
                "print(\"Enter {}*{} matrix elements\".format(n,n))\n" +
                "for i in range(n):\n" +
                "    row = []\n" +
                "    for j in range(n):\n" +
                "        row.append(int(input()))\n" +
                "    matrix.append(row)\n" +
                "\n" +
                "\n" +
                "diagonal1 = 0\n" +
                "for i in range(n):\n" +
                "    diagonal1 += matrix[i][i]\n" +
                "\n" +
                "diagonal2 = 0\n" +
                "count = 0\n" +
                "for i in range(n-1,-1,-1):\n" +
                "    diagonal2 += matrix[i][count]\n" +
                "    count += 1\n" +
                "\n" +
                "print()\n" +
                "for i in range(n):\n" +
                "    for j in range(n):\n" +
                "        print(matrix[i][j],end=\" \")\n" +
                "    print()\n" +
                "    \n" +
                "print(\"\\nDifference =\",diagonal1-diagonal2)";

        int[][] array_string_color = {{19,37},{53,75},{85,114},{487,490},{515,516},{518,531}};
        int[][] array_keyword_color_1 = {{128,131},{134,136},{164,167},{170,172},{255,258},{261,263},{329,332},{335,337},{414,417},{420,422},{437,440},{443,445},{516,518}};
        int[][] array_keyword_color_2 = {{13,18},{43,46},{47,52},{79,84},{137,142},{173,178},{202,205},{206,211},{264,269},{338,343},{406,411},{423,428},{446,451},{464,469},{496,501},{509,514}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{483,486}};
        int[][] array_number_color = {{253,254},{317,318},{327,328},{346,347},{349,350},{352,353},{403,404}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter n*n matrix\n" +
                "Enter value of n :- 3\n" +
                "Enter 3*3 matrix elements\n" +
                "9\n" +
                "4\n" +
                "6\n" +
                "3\n" +
                "8\n" +
                "7\n" +
                "2\n" +
                "4\n" +
                "5\n" +
                "\n" +
                "9 4 6 \n" +
                "3 8 7 \n" +
                "2 4 5 \n" +
                "\n" +
                "Difference = 6";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindTheRatioOfElementsThatArePositiveNegativeAndZero.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayFirstNumberWhoseSumOfDigitsIsEqualToK.class);
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