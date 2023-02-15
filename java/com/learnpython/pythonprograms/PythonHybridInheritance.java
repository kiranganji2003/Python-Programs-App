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

public class PythonHybridInheritance extends AppCompatActivity {

    String example1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_hybrid_inheritance);

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
        actionBar.setTitle("Python hybrid inheritance");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class A:\n" +
                "    def showA(self):\n" +
                "        print(\"In class A\")\n" +
                "\n" +
                "class B:\n" +
                "    def showB(self):\n" +
                "        print(\"In class B\")\n" +
                "\n" +
                "class C(A):\n" +
                "    def showC(self):\n" +
                "        self.showA()\n" +
                "        print(\"In class C\")\n" +
                "\n" +
                "class D(B):\n" +
                "    def showD(self):\n" +
                "        self.showB()\n" +
                "        print(\"In class D\")\n" +
                "\n" +
                "class MyClass(C,D):\n" +
                "    def showMyClass(self):\n" +
                "        self.showC()\n" +
                "        self.showD()\n" +
                "        print(\"In class MyClass\")\n" +
                "\n" +
                "obj = MyClass()\n" +
                "obj.showMyClass()";

        array_string_color = new int[][]{{44,56},{103,115},{186,198},{269,281},{387,405}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{59,64},{72,75},{118,123},{134,137},{201,206},{217,220},{284,289},{308,311}};
        array_keyword_color_2 = new int[][]{{38,43},{97,102},{180,185},{263,268},{381,386}};
        array_self_color = new int[][]{{23,27},{82,86},{144,148},{159,163},{227,231},{242,246},{324,328},{339,343},{360,364}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{17,22},{76,81},{138,143},{221,226},{312,323}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "In class A\n" +
                "In class C\n" +
                "In class B\n" +
                "In class D\n" +
                "In class MyClass";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonConstructorsInInheritance.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultipleInheritance.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python hybrid inheritance");
            String shareMessage = "Python hybrid inheritance" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}