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

public class PythonPassingObjects extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_passing_objects);

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
        actionBar.setTitle("Python passing objects");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"Creating copy of object\")\n" +
                "\n" +
                "class MyClass:\n" +
                "    def accept(self):\n" +
                "        self.data = input(\"Enter the data for object 1 :- \")\n" +
                "\n" +
                "    def show(self,num):\n" +
                "        print(\"Object\",num,\"data :- \",self.data)\n" +
                "\n" +
                "    def assign(self,obj):\n" +
                "        self.data = obj.data\n" +
                "\n" +
                "\n" +
                "object1 = MyClass()\n" +
                "object1.accept()\n" +
                "object1.show(1)\n" +
                "\n" +
                "object2 = MyClass()\n" +
                "object2.assign(object1)\n" +
                "object2.show(2)";

        array_string_color = new int[][]{{6,31},{97,130},{171,179},{184,194}};
        array_keyword_color_1 = new int[][]{{34,39},{53,56},{137,140},{211,214}};
        array_keyword_color_2 = new int[][]{{0,5},{91,96},{165,170}};
        array_self_color = new int[][]{{64,68},{79,83},{146,150},{195,199},{222,226},{241,245}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{314,315},{375,376}};
        array_function_name_color = new int[][]{{57,63},{141,145},{215,221}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Creating copy of object\n" +
                "Enter the data for object 1 :- My Info\n" +
                "Object 1 data :-  My Info\n" +
                "Object 2 data :-  My Info";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Comparing two objects\\n\")\n" +
                "\n" +
                "class Student:\n" +
                "    def __init__(self):\n" +
                "        self.name = input(\"Enter name :- \")\n" +
                "        self.marks = int(input(\"Enter marks :- \"))\n" +
                "    def greater(self,other_obj):\n" +
                "        if self.marks > other_obj.marks:\n" +
                "            return self\n" +
                "        else:\n" +
                "            return other_obj\n" +
                "    def show(self):\n" +
                "        print(\"Student name :-\",self.name)\n" +
                "        print(\"Student marks :-\",self.marks)\n" +
                "        \n" +
                "\n" +
                "print(\"Enter student 1 details\")\n" +
                "std1 = Student()\n" +
                "\n" +
                "print(\"Enter student 2 details\")\n" +
                "std2 = Student()\n" +
                "\n" +
                "print(\"\\nStudent with greater marks details\")\n" +
                "std3 = std1.greater(std2)\n" +
                "std3.show()";

        array_string_color = new int[][]{{6,28},{30,31},{99,115},{148,165},{343,360},{386,404},{433,458},{484,509},{535,536},{538,573}};
        array_keyword_color_1 = new int[][]{{28,30},{34,39},{53,56},{172,175},{209,211},{254,260},{274,278},{292,298},{313,316},{536,538}};
        array_keyword_color_2 = new int[][]{{0,5},{93,98},{138,141},{142,147},{337,342},{380,385},{427,432},{478,483},{529,534}};
        array_self_color = new int[][]{{66,70},{81,85},{125,129},{184,188},{212,216},{261,265},{322,326},{361,365},{405,409}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{176,183},{317,321}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{57,65}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Comparing two objects\n" +
                "\n" +
                "Enter student 1 details\n" +
                "Enter name :- Ravi\n" +
                "Enter marks :- 78\n" +
                "Enter student 2 details\n" +
                "Enter name :- Kiran\n" +
                "Enter marks :- 90\n" +
                "\n" +
                "Student with greater marks details\n" +
                "Student name :- Kiran\n" +
                "Student marks :- 90";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Passing objects\\n\")\n" +
                "\n" +
                "class MyClass:\n" +
                "    def __init__(self,obj_name):\n" +
                "        self.name = obj_name\n" +
                "    def show(self,other):\n" +
                "        print(\"\\nCalled object :-\",self.name)\n" +
                "        print(\"Passed object :-\",other.name)\n" +
                "        \n" +
                "\n" +
                "object1 = MyClass(\"Object 1\")\n" +
                "object2 = MyClass(\"Object 2\")\n" +
                "\n" +
                "object1.show(object2)\n" +
                "object2.show(object1)";

        array_string_color = new int[][]{{6,22},{24,25},{145,146},{148,165},{191,209},{250,260},{280,289}};
        array_keyword_color_1 = new int[][]{{22,24},{28,33},{47,50},{109,112},{146,148}};
        array_keyword_color_2 = new int[][]{{0,5},{139,144},{185,190}};
        array_self_color = new int[][]{{60,64},{84,88},{118,122},{166,170}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{113,117}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{51,59}};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output3 = "Passing objects\n" +
                "\n" +
                "\n" +
                "Called object :- Object 1\n" +
                "Passed object :- Object 2\n" +
                "\n" +
                "Called object :- Object 2\n" +
                "Passed object :- Object 1";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonClassVariables.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonConstructors.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python passing objects");
            String shareMessage = "Python passing objects" +
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