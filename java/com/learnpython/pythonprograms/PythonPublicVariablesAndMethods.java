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

public class PythonPublicVariablesAndMethods extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_public_variables_and_methods);

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
        actionBar.setTitle("Python public variables and methods");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class MyClass:\n" +
                "\n" +
                "    def __init__(self):\n" +
                "        print(\"Public variables and methods can be accessed from anywhere in the program\")\n" +
                "\n" +
                "    def message(self,msg):\n" +
                "        self.msg = msg\n" +
                "\n" +
                "    def public_method(self):\n" +
                "        self.message(\"Hello\")\n" +
                "        print(self.msg)\n" +
                "        print(\"Public variables and methods can be accessed from class\")\n" +
                "\n" +
                "\n" +
                "obj = MyClass()\n" +
                "obj.public_method()";

        array_string_color = new int[][]{{54,129},{233,240},{280,337}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{136,139},{187,190}};
        array_keyword_color_2 = new int[][]{{48,53},{250,255},{274,279}};
        array_self_color = new int[][]{{33,37},{148,152},{167,171},{205,209},{220,224},{256,260}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{140,147},{191,204}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{24,32}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Public variables and methods can be accessed from anywhere in the program\n" +
                "Hello\n" +
                "Public variables and methods can be accessed from class";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class Person:\n" +
                "    def __init__(self,name,age):\n" +
                "        self.personName = name\n" +
                "        self.personAge = age\n" +
                "\n" +
                "print(\"Public variables and methods can be accessed from outside the class\")\n" +
                "p = Person(\"Mike\",15)\n" +
                "print(\"Person name:\",p.personName)\n" +
                "print(\"Person age:\",p.personAge)";

        array_string_color = new int[][]{{114,183},{196,202},{213,227},{248,261}};
        array_keyword_color_1 = new int[][]{{0,5},{18,21}};
        array_keyword_color_2 = new int[][]{{108,113},{207,212},{242,247}};
        array_self_color = new int[][]{{31,35},{55,59},{86,90}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{203,205}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{22,30}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Public variables and methods can be accessed from outside the class\n" +
                "Person name: Mike\n" +
                "Person age: 15";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class Student:\n" +
                "    def accept(self):\n" +
                "        self.roll = input(\"Enter student roll no: \")\n" +
                "        self.name = input(\"Enter student name: \")\n" +
                "\n" +
                "class Display(Student):\n" +
                "    def show(self):\n" +
                "        print(\"Public variables and methods can be accessed from derived class\")\n" +
                "        self.accept()\n" +
                "        print(\"Student Roll:\",self.roll)\n" +
                "        print(\"Student Name:\",self.name)\n" +
                "\n" +
                "obj = Display()\n" +
                "obj.show()";

        array_string_color = new int[][]{{63,88},{116,138},{199,264},{302,317},{343,358}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22},{141,146},{169,172}};
        array_keyword_color_2 = new int[][]{{57,62},{110,115},{193,198},{296,301},{337,342}};
        array_self_color = new int[][]{{30,34},{45,49},{98,102},{178,182},{274,278},{318,322},{359,363}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{23,29},{173,177}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Public variables and methods can be accessed from derived class\n" +
                "Enter student roll no: 17032\n" +
                "Enter student name: RJ21\n" +
                "Student Roll: 17032\n" +
                "Student Name: RJ21";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPrivateVariablesAndMethods.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonConstructorsInInheritance.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python public variables and methods");
            String shareMessage = "Python public variables and methods" +
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