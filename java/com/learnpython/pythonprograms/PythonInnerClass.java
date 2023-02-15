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

public class PythonInnerClass extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_inner_class);

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
        actionBar.setTitle("Python inner class");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class Employee:\n" +
                "    def __init__(self):\n" +
                "        print(\"Enter employee details\")\n" +
                "        self.name = input(\"Enter employee name :- \")\n" +
                "        self.salary = int(input(\"Enter employee salary :- \"))\n" +
                "        self.laptop_obj = self.Laptop()\n" +
                "\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\nEmployee details\")\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Salary :-\",self.salary)\n" +
                "        self.laptop_obj.display()\n" +
                "\n" +
                "    class Laptop:\n" +
                "        def __init__(self):\n" +
                "            print(\"\\nEnter employee laptop details\")\n" +
                "            self.brand = input(\"Enter brand name :- \")\n" +
                "            self.ram = input(\"Enter ram :- \")\n" +
                "\n" +
                "        def display(self):\n" +
                "            print(\"Laptop brand :-\",self.brand)\n" +
                "            print(\"Laptop ram :-\",self.ram)\n" +
                "\n" +
                "\n" +
                "\n" +
                "emp = Employee()\n" +
                "emp.display()";

        array_string_color = new int[][]{{54,78},{106,131},{165,192},{274,275},{277,294},{310,319},{345,356},{469,470},{472,502},{535,557},{588,603},{651,668},{699,714}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{241,244},{275,277},{409,414},{431,434},{470,472},{614,617}};
        array_keyword_color_2 = new int[][]{{48,53},{100,105},{155,158},{159,164},{268,273},{304,309},{339,344},{463,468},{529,534},{582,587},{645,650},{693,698}};
        array_self_color = new int[][]{{33,37},{88,92},{141,145},{203,207},{221,225},{253,257},{320,324},{357,361},{378,382},{444,448},{516,520},{571,575},{626,630},{669,673},{715,719}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{245,252},{618,625}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{24,32},{435,443}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter employee details\n" +
                "Enter employee name :- Mahesh\n" +
                "Enter employee salary :- 48000\n" +
                "\n" +
                "Enter employee laptop details\n" +
                "Enter brand name :- Dell\n" +
                "Enter ram :- 4GB\n" +
                "\n" +
                "Employee details\n" +
                "Name :- Mahesh\n" +
                "Salary :- 48000\n" +
                "Laptop brand :- Dell\n" +
                "Laptop ram :- 4GB";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        example2 = "print(\"Accessing inner classes from outer class\")\n" +
                "\n" +
                "class A:\n" +
                "    def a(self):\n" +
                "        print(\"Class A\")\n" +
                "        obj = self.B()\n" +
                "        obj.b()\n" +
                "\n" +
                "    class B:\n" +
                "        def b(self):\n" +
                "            print(\"Class B\")\n" +
                "            obj = self.C()\n" +
                "            obj.c()\n" +
                "\n" +
                "        class C:\n" +
                "            def c(self):\n" +
                "                print(\"Class C\")\n" +
                "\n" +
                "obj = A()\n" +
                "obj.a()";

        array_string_color = new int[][]{{6,48},{91,100},{194,203},{317,326}};
        array_keyword_color_1 = new int[][]{{51,56},{64,69},{146,151},{163,166},{261,266},{282,285}};
        array_keyword_color_2 = new int[][]{{0,5},{85,90},{188,193},{311,316}};
        array_self_color = new int[][]{{70,74},{116,120},{169,173},{223,227},{288,292}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{68,69},{167,168},{286,287}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Accessing inner classes from outer class\n" +
                "Class A\n" +
                "Class B\n" +
                "Class C";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Accessing inner classes from outside\")\n" +
                "\n" +
                "class A:\n" +
                "    def a(self):\n" +
                "        print(\"Class A\")\n" +
                "\n" +
                "    class B:\n" +
                "        def b(self):\n" +
                "            print(\"Class B\")\n" +
                "\n" +
                "        class C:\n" +
                "            def c(self):\n" +
                "                print(\"Class C\")\n" +
                "\n" +
                "obj1 = A()\n" +
                "obj2 = A.B()\n" +
                "obj3 = A.B.C()\n" +
                "\n" +
                "obj1.a()\n" +
                "obj2.b()\n" +
                "obj3.c()";

        array_string_color = new int[][]{{6,44},{87,96},{151,160},{227,236}};
        array_keyword_color_1 = new int[][]{{47,52},{60,63},{103,108},{120,123},{171,176},{192,195}};
        array_keyword_color_2 = new int[][]{{0,5},{81,86},{145,150},{221,226}};
        array_self_color = new int[][]{{66,70},{126,130},{198,202}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{64,65},{124,125},{196,197}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Accessing inner classes from outside\n" +
                "Class A\n" +
                "Class B\n" +
                "Class C";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonSingleInheritence.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTypesOfMethods.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python inner class");
            String shareMessage = "Python inner class" +
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