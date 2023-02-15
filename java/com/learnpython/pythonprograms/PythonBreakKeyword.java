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

public class PythonBreakKeyword extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_break_keyword);

        int[][] array_string_color;
        int[][] array_keyword_color_1;
        int[][] array_keyword_color_2;
        int[][] array_self_color;
        int[][] array_end_color;
        int[][] array_number_color;
        int[][] array_function_name_color;
        int[][] array_comments;

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python break keyword");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"The controls exits out of the loop when value of number becomes 5\\n\")\n" +
                "\n" +
                "for number in range(10):\n" +
                "    if number==5:\n" +
                "        print(\"Exit...\")\n" +
                "        break\n" +
                "    print(\"Number\",number)";

        array_string_color = new int[][]{{6,72},{74,75},{135,144},{170,178}};
        array_keyword_color_1 = new int[][]{{72,74},{78,81},{89,91},{107,109},{154,159}};
        array_keyword_color_2 = new int[][]{{0,5},{92,97},{129,134},{164,169}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{98,100},{118,119}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "The controls exits out of the loop when value of number becomes 5\n" +
                "\n" +
                "Number 0\n" +
                "Number 1\n" +
                "Number 2\n" +
                "Number 3\n" +
                "Number 4\n" +
                "Exit...";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"The controls exits out of the program when user try to divide a number by zero\")\n" +
                "\n" +
                "i = 0\n" +
                "while 1:\n" +
                "    i += 1\n" +
                "    print(\"\\nDivision\",i)\n" +
                "    num1 = int(input(\"Enter number 1 :- \"))\n" +
                "    num2 = int(input(\"Enter number 2 :- \"))\n" +
                "\n" +
                "    if num2==0:\n" +
                "        print(\"Cannot divide by zero\")\n" +
                "        break\n" +
                "    else:\n" +
                "        print(\"Result =\",(num1//num2))";

        array_string_color = new int[][]{{6,86},{125,126},{128,137},{162,182},{206,226},{260,283},{323,333}};
        array_keyword_color_1 = new int[][]{{95,100},{126,128},{234,236},{293,298},{303,307}};
        array_keyword_color_2 = new int[][]{{0,5},{119,124},{152,155},{156,161},{196,199},{200,205},{254,259},{317,322}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{93,94},{101,102},{113,114},{243,244}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "The controls exits out of the program when user try to divide a number by zero\n" +
                "\n" +
                "Division 1\n" +
                "Enter number 1 :- 12\n" +
                "Enter number 2 :- 5\n" +
                "Result = 2\n" +
                "\n" +
                "Division 2\n" +
                "Enter number 1 :- 78\n" +
                "Enter number 2 :- 3\n" +
                "Result = 26\n" +
                "\n" +
                "Division 3\n" +
                "Enter number 1 :- 237\n" +
                "Enter number 2 :- 45\n" +
                "Result = 5\n" +
                "\n" +
                "Division 4\n" +
                "Enter number 1 :- 5\n" +
                "Enter number 2 :- 0\n" +
                "Cannot divide by zero";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Simple calci\")\n" +
                "\n" +
                "while 1:\n" +
                "    print(\"\\n1. Addition\")\n" +
                "    print(\"2. Subtraction\")\n" +
                "    print(\"3. Multiplication\")\n" +
                "    print(\"4. Division\")\n" +
                "    print(\"5. Exit from program\")\n" +
                "    choice = int(input(\"choose your option :- \"))\n" +
                "\n" +
                "    if choice<=4 and choice>=1:\n" +
                "        num1 = int(input(\"Enter number 1 :- \"))\n" +
                "        num2 = int(input(\"Enter number 2 :- \"))\n" +
                "        if choice == 1:\n" +
                "            print(\"Addition =\",(num1+num2))\n" +
                "        elif choice == 2:\n" +
                "            print(\"Subtraction =\",(num1-num2))\n" +
                "        elif choice == 3:\n" +
                "            print(\"Multiplication =\",(num1*num2))\n" +
                "        elif choice == 4:\n" +
                "            print(\"Division =\",(num1/num2))\n" +
                "    elif choice==5:\n" +
                "        print(\"closing program\")\n" +
                "        break\n" +
                "    else:\n" +
                "        print(\"Invalid choice\")";

        array_string_color = new int[][]{{6,20},{42,43},{45,57},{69,85},{97,116},{128,141},{153,175},{200,224},{285,305},{333,353},{398,410},{468,483},{541,559},{617,629},{677,694},{734,750}};
        array_keyword_color_1 = new int[][]{{23,28},{43,45},{232,234},{245,248},{364,366},{432,436},{505,509},{581,585},{647,651},{704,709},{714,718}};
        array_keyword_color_2 = new int[][]{{0,5},{36,41},{63,68},{91,96},{122,127},{147,152},{190,193},{194,199},{275,278},{279,284},{323,326},{327,332},{392,397},{462,467},{535,540},{611,616},{671,676},{728,733}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{29,30},{243,244},{257,258},{377,378},{447,448},{520,521},{596,597},{660,661}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Simple calci\n" +
                "\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit from program\n" +
                "choose your option :- 1\n" +
                "Enter number 1 :- 32\n" +
                "Enter number 2 :- 54\n" +
                "Addition = 86\n" +
                "\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit from program\n" +
                "choose your option :- 4\n" +
                "Enter number 1 :- 289\n" +
                "Enter number 2 :- 4\n" +
                "Division = 72.25\n" +
                "\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit from program\n" +
                "choose your option :- 34\n" +
                "Invalid choice\n" +
                "\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit from program\n" +
                "choose your option :- 5\n" +
                "closing program";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonContinueKeyword.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonForLoop.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python break keyword");
            String shareMessage = "Python break keyword" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }

        return super.onOptionsItemSelected(item);
    }
}