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

public class RotateArray extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_array);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Rotate the array to the right by k steps";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "from array import *\n" +
                "\n" +
                "arr = array('i',[])\n" +
                "size = int(input(\"Enter array size :- \"))\n" +
                "print(\"Enter\",size,\"elements\")\n" +
                "\n" +
                "for i in range(size):\n" +
                "    arr.append(int(input()))\n" +
                "\n" +
                "k = int(input(\"\\nEnter no. of steps to rotate :- \"))\n" +
                "\n" +
                "if k==0:\n" +
                "    print(\"After step 0 :-\",arr)\n" +
                "elif k<0:\n" +
                "    print(\"Enter valid steps\")\n" +
                "else:\n" +
                "    for i in range(k):\n" +
                "        last = arr[len(arr)-1]\n" +
                "        for j in range(len(arr)-2,-1,-1):\n" +
                "            arr[j+1] = arr[j]\n" +
                "        arr[0] = last\n" +
                "        print(\"After step\",i+1,\":-\",arr)";

        int[][] array_string_color = {{33,36},{58,80},{89,96},{102,112},{181,182},{184,217},{240,257},{283,302},{472,484},{489,493}};
        int[][] array_keyword_color_1 = {{0,4},{11,17},{115,118},{121,123},{182,184},{221,223},{263,267},{304,308},{314,317},{320,322},{372,375},{378,380}};
        int[][] array_keyword_color_2 = {{48,51},{52,57},{83,88},{124,129},{152,155},{156,161},{171,174},{175,180},{234,239},{277,282},{323,328},{352,355},{381,386},{387,390},{466,471}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{227,228},{270,271},{361,362},{396,397},{399,400},{402,403},{424,425},{448,449},{487,488}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter array size :- 7\n" +
                "Enter 7 elements\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "\n" +
                "Enter no. of steps to rotate :- 4\n" +
                "After step 1 :- array('i', [7, 1, 2, 3, 4, 5, 6])\n" +
                "After step 2 :- array('i', [6, 7, 1, 2, 3, 4, 5])\n" +
                "After step 3 :- array('i', [5, 6, 7, 1, 2, 3, 4])\n" +
                "After step 4 :- array('i', [4, 5, 6, 7, 1, 2, 3])";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheArrayHasUniqueValuesOrNot.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckPasswordIsStrongOrNot.class);
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