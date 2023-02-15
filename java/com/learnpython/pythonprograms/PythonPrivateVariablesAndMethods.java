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

public class PythonPrivateVariablesAndMethods extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_private_variables_and_methods);

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
        actionBar.setTitle("Python private variables and methods");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"Private variables and methods can only be accessed from class where it has declared\")\n" +
                "print(\"Private variables and methods start from __ (double underscore)\")\n" +
                "\n" +
                "class Employee:\n" +
                "\n" +
                "    def accept(self):\n" +
                "        self.__id = input(\"\\nEnter employee id: \")\n" +
                "        self.__name = input(\"Enter employee name: \")\n" +
                "        self.__salary = int(input(\"Enter employee salary: \"))\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\nAccessing private variables from within class\")\n" +
                "        print(\"\\nEmployee details\")\n" +
                "        print(\"    ID :\",self.__id)\n" +
                "        print(\"  Name :\",self.__name)\n" +
                "        print(\"Salary :\",self.__salary)\n" +
                "\n" +
                "obj = Employee()\n" +
                "obj.accept()\n" +
                "obj.display()";

        array_string_color = new int[][]{{6,91},{99,164},{232,233},{235,255},{285,308},{344,369},{410,411},{413,459},{475,476},{478,495},{511,521},{547,557},{585,595}};
        array_keyword_color_1 = new int[][]{{167,172},{188,191},{233,235},{377,380},{411,413},{476,478}};
        array_keyword_color_2 = new int[][]{{0,5},{93,98},{226,231},{279,284},{334,337},{338,343},{404,409},{469,474},{505,510},{541,546},{579,584}};
        array_self_color = new int[][]{{199,203},{214,218},{265,269},{318,322},{389,393},{522,526},{558,562},{596,600}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{192,198},{381,388}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Private variables and methods can only be accessed from class where it has declared\n" +
                "Private variables and methods start from __ (double underscore)\n" +
                "\n" +
                "Enter employee id: EMP1565\n" +
                "Enter employee name: JMK\n" +
                "Enter employee salary: 35000\n" +
                "\n" +
                "Accessing private variables from within class\n" +
                "\n" +
                "Employee details\n" +
                "    ID : EMP1565\n" +
                "  Name : JMK\n" +
                "Salary : 35000";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class MyClass:\n" +
                "\n" +
                "    def __init__(self):\n" +
                "        self.__privateVariable = \"Private Variable\"\n" +
                "\n" +
                "    def __privateMethod(self):\n" +
                "        print(\"This is private method\")\n" +
                "\n" +
                "    def access(self):\n" +
                "        print(self.__privateVariable)\n" +
                "        self.__privateMethod()\n" +
                "\n" +
                "print(\"Accessing private variable and method indirectly from outside the class\")\n" +
                "obj = MyClass()\n" +
                "obj.access()";

        array_string_color = new int[][]{{73,91},{138,162},{263,336}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{97,100},{169,172}};
        array_keyword_color_2 = new int[][]{{132,137},{195,200},{257,262}};
        array_self_color = new int[][]{{33,37},{48,52},{117,121},{180,184},{201,205},{233,237}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{101,116},{173,179}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{24,32}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Accessing private variable and method indirectly from outside the class\n" +
                "Private Variable\n" +
                "This is private method";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class BaseClass:\n" +
                "    def __init__(self):\n" +
                "        self.__a = 10\n" +
                "\n" +
                "    def __show(self):\n" +
                "        print(\"a =\",self.__a)\n" +
                "\n" +
                "    def show(self):\n" +
                "        self.__show()\n" +
                "\n" +
                "class DerivedClass(BaseClass):\n" +
                "    def access(self):\n" +
                "        print(\"Accessing base class private variable and method from derived class\")\n" +
                "        super().__init__()\n" +
                "        self.show()\n" +
                "\n" +
                "obj = DerivedClass()\n" +
                "obj.access()";

        array_string_color = new int[][]{{100,105},{227,296}};
        array_keyword_color_1 = new int[][]{{0,5},{21,24},{68,71},{121,124},{160,165},{195,198}};
        array_keyword_color_2 = new int[][]{{94,99},{221,226},{306,311}};
        array_self_color = new int[][]{{34,38},{49,53},{79,83},{106,110},{130,134},{145,149},{206,210},{333,337}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{60,62}};
        array_function_name_color = new int[][]{{72,78},{125,129},{199,205}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{25,33},{314,322}};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output3 = "Accessing base class private variable and method from derived class\n" +
                "a = 10";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonProtectedVariablesAndMethods.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPublicVariablesAndMethods.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python private variables and methods");
            String shareMessage = "Python private variables and methods" +
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