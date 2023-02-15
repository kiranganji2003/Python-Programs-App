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

public class PythonFunctionsPart2 extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_functions_part2);

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
        actionBar.setTitle("Python functions part 2");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "print(\"** Passing list in function **\")\n" +
                "print(\"Check no. of even and odd numbers in a list\")\n" +
                "\n" +
                "list = [43,65,89,24,98,45,27,72]\n" +
                "\n" +
                "def check_even_odd(lst):\n" +
                "    even,odd = 0,0\n" +
                "    \n" +
                "    for i in lst:\n" +
                "        if i%2==0:\n" +
                "            even += 1\n" +
                "        else:\n" +
                "            odd += 1\n" +
                "\n" +
                "    print(\"\\nTotal even no.s :-\",even)\n" +
                "    print(\"Total odd no.s :-\",odd)\n" +
                "\n" +
                "\n" +
                "check_even_odd(list)";

        array_string_color = new int[][]{{6,38},{46,91},{282,283},{285,304},{321,340}};
        array_keyword_color_1 = new int[][]{{128,131},{181,184},{187,189},{203,205},{244,248},{283,285}};
        array_keyword_color_2 = new int[][]{{0,5},{40,45},{276,281},{315,320}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{102,104},{105,107},{108,110},{111,113},{114,116},{117,119},{120,122},{123,125},{168,169},{170,171},{208,209},{211,212},{234,235},{269,270}};
        array_function_name_color = new int[][]{{132,146}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "** Passing list in function **\n" +
                "Check no. of even and odd numbers in a list\n" +
                "\n" +
                "Total even no.s :- 3\n" +
                "Total odd no.s :- 5";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Squaring each element of list\")\n" +
                "\n" +
                "list = [12,8,9,14,7,17,19]\n" +
                "\n" +
                "def squaring(square):\n" +
                "    count = 0\n" +
                "    for i in square:\n" +
                "        square[count] = i*i\n" +
                "        count += 1\n" +
                "\n" +
                "print(\"\\nOriginal list\")\n" +
                "print(list)\n" +
                "\n" +
                "squaring(list)\n" +
                "\n" +
                "print(\"\\nAfter squaring\")\n" +
                "print(list)";

        array_string_color = new int[][]{{6,37},{179,180},{182,196},{233,234},{236,251}};
        array_keyword_color_1 = new int[][]{{68,71},{108,111},{114,116},{180,182},{234,236}};
        array_keyword_color_2 = new int[][]{{0,5},{173,178},{198,203},{227,232},{253,258}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{48,50},{51,52},{53,54},{55,57},{58,59},{60,62},{63,65},{102,103},{170,171}};
        array_function_name_color = new int[][]{{72,80}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Squaring each element of list\n" +
                "\n" +
                "Original list\n" +
                "[12, 8, 9, 14, 7, 17, 19]\n" +
                "\n" +
                "After squaring\n" +
                "[144, 64, 81, 196, 49, 289, 361]";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Passing dictionary in function\")\n" +
                "\n" +
                "numbers = { 0:\"Zero\",1:\"One\",2:\"Two\",3:\"Three\",4:\"Four\",\n" +
                "            5:\"Five\",6:\"Six\",7:\"Seven\",8:\"Eight\",9:\"Nine\" }\n" +
                "\n" +
                "\n" +
                "def display(dict):\n" +
                "    for i,j in dict.items():\n" +
                "        print(i,\":-\",j)\n" +
                "\n" +
                "\n" +
                "display(numbers)";

        array_string_color = new int[][]{{6,38},{55,61},{64,69},{72,77},{80,87},{90,96},{112,118},{121,126},{129,136},{139,146},{149,155},{224,228}};
        array_keyword_color_1 = new int[][]{{160,163},{183,186},{191,193}};
        array_keyword_color_2 = new int[][]{{0,5},{216,221}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{53,54},{62,63},{70,71},{78,79},{88,89},{110,111},{119,120},{127,128},{137,138},{147,148}};
        array_function_name_color = new int[][]{{164,171}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Passing dictionary in function\n" +
                "0 :- Zero\n" +
                "1 :- One\n" +
                "2 :- Two\n" +
                "3 :- Three\n" +
                "4 :- Four\n" +
                "5 :- Five\n" +
                "6 :- Six\n" +
                "7 :- Seven\n" +
                "8 :- Eight\n" +
                "9 :- Nine";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTypesOfFunctionArguments.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFunctions.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python functions part 2");
            String shareMessage = "Python functions part 2" +
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