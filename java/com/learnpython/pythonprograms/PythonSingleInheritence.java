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

public class PythonSingleInheritence extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_single_inheritence);

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
        actionBar.setTitle("Python single level inheritance");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class ParentClass:\n" +
                "    def showParent(self):\n" +
                "        print(\"Parent Class\")\n" +
                "\n" +
                "class BaseClass(ParentClass):\n" +
                "    def showBase(self):\n" +
                "        print(\"Base Class\")\n" +
                "\n" +
                "obj = BaseClass()\n" +
                "obj.showParent()\n" +
                "obj.showBase()";

        array_string_color = new int[][]{{59,73},{144,156}};
        array_keyword_color_1 = new int[][]{{0,5},{23,26},{76,81},{110,113}};
        array_keyword_color_2 = new int[][]{{53,58},{138,143}};
        array_self_color = new int[][]{{38,42},{123,127}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{27,37},{114,122}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Parent Class\n" +
                "Base Class";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        example2 = "class Student:\n" +
                "    def acceptStudent(self):\n" +
                "        self.rollno = int(input(\"Enter the roll no :- \"))\n" +
                "        self.name = input(\"Enter the name :- \")\n" +
                "\n" +
                "class Marks(Student):\n" +
                "    def acceptMarks(self):\n" +
                "        self.m1 = int(input(\"Enter marks1 :- \"))\n" +
                "        self.m2 = int(input(\"Enter marks2 :- \"))\n" +
                "        self.m3 = int(input(\"Enter marks3 :- \"))\n" +
                "        self.total = self.m1+self.m2+self.m3\n" +
                "        self.average = self.total//3\n" +
                "    def showDetails(self):\n" +
                "        print(\"\\nStudent Details\")\n" +
                "        print(\"Roll no :-\",self.rollno)\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Total :-\",self.total)\n" +
                "        print(\"Average :-\",self.average)\n" +
                "\n" +
                "std = Marks()\n" +
                "std.acceptStudent()\n" +
                "std.acceptMarks()\n" +
                "std.showDetails()";

        array_string_color = new int[][]{{76,99},{128,148},{228,246},{277,295},{326,344},{470,471},{473,489},{505,517},{545,554},{580,590},{617,629}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22},{151,156},{177,180},{433,436},{471,473}};
        array_keyword_color_2 = new int[][]{{66,69},{70,75},{122,127},{218,221},{222,227},{267,270},{271,276},{316,319},{320,325},{464,469},{499,504},{539,544},{574,579},{611,616}};
        array_self_color = new int[][]{{37,41},{52,56},{110,114},{193,197},{208,212},{257,261},{306,310},{355,359},{368,372},{376,380},{384,388},{400,405},{415,419},{449,453},{518,522},{555,559},{591,595},{630,634}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{427,428}};
        array_function_name_color = new int[][]{{23,36},{181,192},{437,448}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the roll no :- 1\n" +
                "Enter the name :- Manish\n" +
                "Enter marks1 :- 78\n" +
                "Enter marks2 :- 65\n" +
                "Enter marks3 :- 69\n" +
                "\n" +
                "Student Details\n" +
                "Roll no :- 1\n" +
                "Name :- Manish\n" +
                "Total :- 212\n" +
                "Average :- 70";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultiLevelInheritance.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonInnerClass.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python single level inheritance");
            String shareMessage = "Python single level inheritance" +
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