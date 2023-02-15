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

public class PythonArray extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_array);

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
        actionBar.setTitle("Python array");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "from array import *\n" +
                "\n" +
                "nums = array(\"i\",[433,544,785,896,834])\n" +
                "\n" +
                "print(\"Displaying array elements\")\n" +
                "\n" +
                "print(\"\\nMethod 1\")\n" +
                "print(nums)\n" +
                "\n" +
                "print(\"\\nMethod 2\")\n" +
                "for i in nums:\n" +
                "    print(i)\n" +
                "\n" +
                "print(\"\\nMethod 3\")\n" +
                "for i in range(5):\n" +
                "    print(nums[i])";

        array_string_color = new int[][]{{34,37},{68,95},{104,105},{107,116},{137,138},{140,149},{186,187},{189,198}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{105,107},{138,140},{151,154},{157,159},{187,189},{200,203},{206,208}};
        array_keyword_color_2 = new int[][]{{62,67},{98,103},{118,123},{131,136},{170,175},{180,185},{209,214},{223,228}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{39,42},{43,46},{47,50},{51,54},{55,58},{215,216}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Displaying array elements\n" +
                "\n" +
                "Method 1\n" +
                "array('i', [433, 544, 785, 896, 834])\n" +
                "\n" +
                "Method 2\n" +
                "433\n" +
                "544\n" +
                "785\n" +
                "896\n" +
                "834\n" +
                "\n" +
                "Method 3\n" +
                "433\n" +
                "544\n" +
                "785\n" +
                "896\n" +
                "834";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "from array import *\n" +
                "\n" +
                "chars = array(\"u\",[\"a\",\"e\",\"i\",\"o\",\"u\"])\n" +
                "\n" +
                "for i in range(5):\n" +
                "    print(\"char\",i+1,\":-\",chars[i])";

        array_string_color = new int[][]{{35,38},{40,43},{44,47},{48,51},{52,55},{56,59},{92,98},{103,107}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{63,66},{69,71}};
        array_keyword_color_2 = new int[][]{{72,77},{86,91}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{78,79},{101,102}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "char 1 :- a\n" +
                "char 2 :- e\n" +
                "char 3 :- i\n" +
                "char 4 :- o\n" +
                "char 5 :- u";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "from array import *\n" +
                "\n" +
                "print(\"**  Operations on array  **\")\n" +
                "\n" +
                "arr = array(\"i\",[])\n" +
                "\n" +
                "while 1:\n" +
                "    print(\"\\n1. Insert element in array\")\n" +
                "    print(\"2. Search element in array\")\n" +
                "    print(\"3. Display array elements\")\n" +
                "    print(\"4. Exit\")\n" +
                "    choice = int(input(\"\\nchoose your choice :- \"))\n" +
                "\n" +
                "    if choice<=3 and choice>=1:\n" +
                "        if choice == 1:\n" +
                "            num = int(input(\"\\nEnter the number :- \"))\n" +
                "            arr.append(num)\n" +
                "        elif choice == 2:\n" +
                "            number = int(input(\"\\nEnter the number to be search :- \"))\n" +
                "            index = 0\n" +
                "            for i in arr:\n" +
                "                if i==number:\n" +
                "                    print(\"\\n\",number,\"found at index\",index)\n" +
                "                    break\n" +
                "                index += 1\n" +
                "            if index == len(arr):\n" +
                "                print(\"\\nElement not found\")\n" +
                "        else:\n" +
                "            print(\"\\nArray elements\")\n" +
                "            for i in range(len(arr)):\n" +
                "                  print(\"Element\",i+1,\":-\",arr[i])\n" +
                "            \n" +
                "    elif choice == 4:\n" +
                "        break\n" +
                "    \n" +
                "    else:\n" +
                "        print(\"\\nInvalid choice\")";

        array_string_color = new int[][]{{27,56},{71,74},{99,100},{102,129},{141,169},{181,208},{220,229},{254,255},{257,280},{368,369},{371,392},{480,481},{483,517},{624,625},{627,628},{636,652},{769,770},{772,790},{824,825},{827,842},{906,915},{920,924},{1011,1012},{1014,1029}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{80,85},{100,102},{255,257},{288,290},{301,304},{324,326},{369,371},{431,435},{481,483},{554,557},{560,562},{584,586},{625,627},{680,685},{725,727},{770,772},{800,804},{825,827},{856,859},{862,864},{950,954},{976,981},{991,995},{1012,1014}};
        array_keyword_color_2 = new int[][]{{21,26},{93,98},{135,140},{175,180},{214,219},{244,247},{248,253},{358,361},{362,367},{470,473},{474,479},{618,623},{737,740},{763,768},{818,823},{865,870},{871,874},{900,905},{1005,1010}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{86,87},{299,300},{313,314},{337,338},{446,447},{540,541},{711,712},{918,919},{965,966}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "**  Operations on array  **\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 1\n" +
                "\n" +
                "Enter the number :- 12\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 1\n" +
                "\n" +
                "Enter the number :- 13\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 1\n" +
                "\n" +
                "Enter the number :- 14\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 3\n" +
                "\n" +
                "Array elements\n" +
                "Element 1 :- 12\n" +
                "Element 2 :- 13\n" +
                "Element 3 :- 14\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 2\n" +
                "\n" +
                "Enter the number to be search :- 14\n" +
                "\n" +
                " 14 found at index 2\n" +
                "\n" +
                "1. Insert element in array\n" +
                "2. Search element in array\n" +
                "3. Display array elements\n" +
                "4. Exit\n" +
                "\n" +
                "choose your choice :- 4";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "from array import *\n" +
                "\n" +
                "print(\"Displaying array elements in reverse order\\n\")\n" +
                "\n" +
                "arr = array(\"i\",[])\n" +
                "size = int(input(\"Enter the size of an array :- \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "for i in range(size):\n" +
                "    print(\"Enter element\",i+1,end=\" :- \")\n" +
                "    arr.append(int(input()))\n" +
                "\n" +
                "print(\"\\nArray elements in reverse order\\n\")\n" +
                "\n" +
                "for i in range(size-1,-1,-1):\n" +
                "    print(arr[i])";

        array_string_color = new int[][]{{27,70},{72,73},{88,91},{113,145},{154,161},{167,177},{212,227},{236,242},{280,281},{283,314},{316,317}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{70,72},{180,183},{186,188},{281,283},{314,316},{320,323},{326,328}};
        array_keyword_color_2 = new int[][]{{21,26},{103,106},{107,112},{148,153},{189,194},{206,211},{259,262},{263,268},{274,279},{329,334},{354,359}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{232,235}};
        array_number_color = new int[][]{{230,231},{340,341},{343,344},{346,347}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "Displaying array elements in reverse order\n" +
                "\n" +
                "Enter the size of an array :- 5\n" +
                "Enter 5 elements\n" +
                "Enter element 1 :- 43\n" +
                "Enter element 2 :- 65\n" +
                "Enter element 3 :- 89\n" +
                "Enter element 4 :- 34\n" +
                "Enter element 5 :- 74\n" +
                "\n" +
                "Array elements in reverse order\n" +
                "\n" +
                "74\n" +
                "34\n" +
                "89\n" +
                "65\n" +
                "43";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonArrayUsingNumpy.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonContinueKeyword.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python array");
            String shareMessage = "Python array" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nExample 4:\n\n" + example4 +
                    "\n\nOutput :-\n\n" + output4 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}