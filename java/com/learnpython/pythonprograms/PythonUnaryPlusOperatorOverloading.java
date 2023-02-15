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

public class PythonUnaryPlusOperatorOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_unary_plus_operator_overloading);

        int[][] array_string_color;
        int[][] array_keyword_color_1;
        int[][] array_keyword_color_2;
        int[][] array_self_color;
        int[][] array_end_color;
        int[][] array_number_color;
        int[][] array_function_name_color;
        int[][] array_comments;
        int[][] array_special_function_color;

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python unary plus operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class MyClass:\n" +
                "    def __pos__(self):\n" +
                "        print(\"After executing +obj this method is invoked\")\n" +
                "\n" +
                "obj = MyClass()\n" +
                "+obj";

        array_string_color = new int[][]{{52,97}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22}};
        array_keyword_color_2 = new int[][]{{46,51}};
        array_self_color = new int[][]{{31,35}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,30}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "After executing +obj this method is invoked";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Incrementing marks of subjects by one using operator overloading\")\n" +
                "\n" +
                "class Subjects:\n" +
                "    def __init__(self,s1,s2,s3):\n" +
                "        self.s1 = s1\n" +
                "        self.s2 = s2\n" +
                "        self.s3 = s3\n" +
                "    def __pos__(self):\n" +
                "        self.s1 += 1\n" +
                "        self.s2 += 1\n" +
                "        self.s3 += 1\n" +
                "    def show(self):\n" +
                "        print(\"Subject 1 :-\",self.s1)\n" +
                "        print(\"Subject 2 :-\",self.s2)\n" +
                "        print(\"Subject 3 :-\",self.s3)\n" +
                "\n" +
                "sub = Subjects(76,53,47)\n" +
                "print(\"\\nBefore incrementing marks\")\n" +
                "sub.show()\n" +
                "+sub\n" +
                "print(\"\\nAfter incrementing marks\")\n" +
                "sub.show()";

        array_string_color = new int[][]{{6,72},{307,321},{345,359},{383,397},{439,440},{442,468},{492,493},{495,520}};
        array_keyword_color_1 = new int[][]{{75,80},{95,98},{191,194},{277,280},{440,442},{493,495}};
        array_keyword_color_2 = new int[][]{{0,5},{301,306},{339,344},{377,382},{433,438},{486,491}};
        array_self_color = new int[][]{{108,112},{132,136},{153,157},{174,178},{203,207},{218,222},{239,243},{260,264},{286,290},{322,326},{360,364},{398,402}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{229,230},{250,251},{271,272},{423,425},{426,428},{429,431}};
        array_function_name_color = new int[][]{{281,285}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{99,107},{195,202}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Incrementing marks of subjects by one using operator overloading\n" +
                "\n" +
                "Before incrementing marks\n" +
                "Subject 1 :- 76\n" +
                "Subject 2 :- 53\n" +
                "Subject 3 :- 47\n" +
                "\n" +
                "After incrementing marks\n" +
                "Subject 1 :- 77\n" +
                "Subject 2 :- 54\n" +
                "Subject 3 :- 48";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBinaryPlusOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonUnaryMinusOperatorOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python unary plus operator overloading");
            String shareMessage = "Python unary plus operator overloading" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}