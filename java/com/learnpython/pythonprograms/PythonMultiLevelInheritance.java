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

public class PythonMultiLevelInheritance extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_multi_level_inheritance);

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
        actionBar.setTitle("Python multi level inheritance");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class A:\n" +
                "    def showA(self):\n" +
                "        print(\"Class A\")\n" +
                "\n" +
                "class B(A):\n" +
                "    def showB(self):\n" +
                "        print(\"Class B\")\n" +
                "\n" +
                "class C(B):\n" +
                "    def showC(self):\n" +
                "        print(\"Class C\")\n" +
                "\n" +
                "obj = C()\n" +
                "obj.showA()\n" +
                "obj.showB()\n" +
                "obj.showC()";

        array_string_color = new int[][]{{44,53},{103,112},{162,171}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{56,61},{72,75},{115,120},{131,134}};
        array_keyword_color_2 = new int[][]{{38,43},{97,102},{156,161}};
        array_self_color = new int[][]{{23,27},{82,86},{141,145}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{17,22},{76,81},{135,140}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Class A\n" +
                "Class B\n" +
                "Class C";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        example2 = "class Person:\n" +
                "    def acceptPerson(self):\n" +
                "        self.name = input(\"Enter the name :- \")\n" +
                "        self.gender = input(\"Enter the gender :- \")\n" +
                "        self.age = int(input(\"Enter the age :- \"))\n" +
                "\n" +
                "class Employee(Person):\n" +
                "    def acceptEmployee(self):\n" +
                "        self.emp_id = input(\"Enter the employee id :- \")\n" +
                "        self.company = input(\"Enter the employee company :- \")\n" +
                "        self.salary = int(input(\"Enter the employee salary :- \"))\n" +
                "\n" +
                "class Programmer(Employee):\n" +
                "     def acceptProgrammer(self):\n" +
                "        self.count_lang = int(input(\"Enter no. of programming languages known :- \"))\n" +
                "     def show(self):\n" +
                "         print(\"\\n    Programmer Details\")\n" +
                "         print(\"Name :-\",self.name)\n" +
                "         print(\"Gender :-\",self.gender)\n" +
                "         print(\"Age :-\",self.age)\n" +
                "         print(\"Employee id :-\",self.emp_id)\n" +
                "         print(\"Employee company :-\",self.company)\n" +
                "         print(\"Employee salary :-\",self.salary)\n" +
                "         print(\"Programming languages known :-\",self.count_lang)\n" +
                "\n" +
                "prog = Programmer()\n" +
                "prog.acceptPerson()\n" +
                "prog.acceptEmployee()\n" +
                "prog.acceptProgrammer()\n" +
                "prog.show()";

        array_string_color = new int[][]{{68,88},{118,140},{171,190},{276,303},{334,366},{400,431},{532,578},{617,618},{620,643},{660,669},{696,707},{736,744},{770,786},{815,836},{866,886},{915,947}};
        array_keyword_color_1 = new int[][]{{0,5},{18,21},{194,199},{222,225},{435,440},{468,471},{586,589},{618,620}};
        array_keyword_color_2 = new int[][]{{62,67},{112,117},{161,164},{165,170},{270,275},{328,333},{390,393},{394,399},{522,525},{526,531},{611,616},{654,659},{690,695},{730,735},{764,769},{809,814},{860,865},{909,914}};
        array_self_color = new int[][]{{35,39},{50,54},{98,102},{150,154},{241,245},{256,260},{313,317},{376,380},{489,493},{504,508},{595,599},{670,674},{708,712},{745,749},{787,791},{837,841},{887,891},{948,952}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{22,34},{226,240},{472,488},{590,594}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the name :- Raj\n" +
                "Enter the gender :- Male\n" +
                "Enter the age :- 34\n" +
                "Enter the employee id :- Emp223\n" +
                "Enter the employee company :- Softlogy\n" +
                "Enter the employee salary :- 35000\n" +
                "Enter no. of programming languages known :- 5\n" +
                "\n" +
                "    Programmer Details\n" +
                "Name :- Raj\n" +
                "Gender :- Male\n" +
                "Age :- 34\n" +
                "Employee id :- Emp223\n" +
                "Employee company :- Softlogy\n" +
                "Employee salary :- 35000\n" +
                "Programming languages known :- 5";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultipleInheritance.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonSingleInheritence.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python multi level inheritance");
            String shareMessage = "Python multi level inheritance" +
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