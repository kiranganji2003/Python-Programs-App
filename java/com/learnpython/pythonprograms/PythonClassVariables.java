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

public class PythonClassVariables extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_class_variables);

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
        actionBar.setTitle("Python class variables");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class School:\n" +
                "\n" +
                "    school_name = \"XYZ School\"\n" +
                "\n" +
                "    def student(self,name,_class):\n" +
                "        self.name = name\n" +
                "        self._class = _class\n" +
                "\n" +
                "    def show(self):\n" +
                "        print(\"\\n\\n****************************\")\n" +
                "        print(\"School name   :-\",School.school_name)\n" +
                "        print(\"Student name  :-\",self.name)\n" +
                "        print(\"Student class :-\",self._class)\n" +
                "\n" +
                "\n" +
                "std1 = School()\n" +
                "std2 = School()\n" +
                "std3 = School()\n" +
                "std4 = School()\n" +
                "std5 = School()\n" +
                "\n" +
                "\n" +
                "std1.student(\"Ravi\",7)\n" +
                "std2.student(\"Kishor\",8)\n" +
                "std3.student(\"Bhuvan\",8)\n" +
                "std4.student(\"Rakesh\",6)\n" +
                "std5.student(\"Anjali\",7)\n" +
                "\n" +
                "std1.show()\n" +
                "std2.show()\n" +
                "std3.show()        \n" +
                "std4.show()\n" +
                "std5.show()        ";

        array_string_color = new int[][]{{33,45},{171,172},{176,205},{221,239},{274,292},{318,336},{447,453},{470,478},{495,503},{520,528},{545,553}};
        array_keyword_color_1 = new int[][]{{0,5},{51,54},{141,144},{172,176}};
        array_keyword_color_2 = new int[][]{{165,170},{215,220},{268,273},{312,317}};
        array_self_color = new int[][]{{63,67},{90,94},{115,119},{150,154},{293,297},{337,341}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{454,455},{479,480},{504,505},{529,530},{554,555}};
        array_function_name_color = new int[][]{{55,62},{145,149}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "\n" +
                "****************************\n" +
                "School name   :- XYZ School\n" +
                "Student name  :- Ravi\n" +
                "Student class :- 7\n" +
                "\n" +
                "\n" +
                "****************************\n" +
                "School name   :- XYZ School\n" +
                "Student name  :- Kishor\n" +
                "Student class :- 8\n" +
                "\n" +
                "\n" +
                "****************************\n" +
                "School name   :- XYZ School\n" +
                "Student name  :- Bhuvan\n" +
                "Student class :- 8\n" +
                "\n" +
                "\n" +
                "****************************\n" +
                "School name   :- XYZ School\n" +
                "Student name  :- Rakesh\n" +
                "Student class :- 6\n" +
                "\n" +
                "\n" +
                "****************************\n" +
                "School name   :- XYZ School\n" +
                "Student name  :- Anjali\n" +
                "Student class :- 7";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class Mobile:\n" +
                "\n" +
                "    manufacture_location = \"Asia\"\n" +
                "\n" +
                "    def __init__(self,mob_id,space,ram):\n" +
                "        self.mob_id = mob_id\n" +
                "        self.space = space\n" +
                "        self.ram = ram\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\n*********************************\")\n" +
                "        print(\"Manufacture location :-\",Mobile.manufacture_location)\n" +
                "        print(\"Mobile id            :-\",self.mob_id)\n" +
                "        print(\"Mobile space         :-\",self.space)\n" +
                "        print(\"Mobile ram           :-\",self.ram)\n" +
                "\n" +
                "mob1 = Mobile(111,32,3)\n" +
                "mob2 = Mobile(112,16,3)\n" +
                "mob3 = Mobile(113,64,4)\n" +
                "mob4 = Mobile(114,16,2)\n" +
                "\n" +
                "mob1.display()\n" +
                "mob2.display()\n" +
                "mob3.display()\n" +
                "mob4.display()\n" +
                "\n" +
                "print(\"\\n\\nAfter changing manufacture location\")\n" +
                "Mobile.manufacture_location = \"Europe\"\n" +
                "\n" +
                "mob1.display()\n" +
                "mob2.display()\n" +
                "mob3.display()\n" +
                "mob4.display()";

        array_string_color = new int[][]{{42,48},{208,209},{211,245},{261,286},{330,355},{383,408},{435,460},{636,637},{641,677},{709,717}};
        array_keyword_color_1 = new int[][]{{0,5},{54,57},{175,178},{209,211},{637,641}};
        array_keyword_color_2 = new int[][]{{202,207},{255,260},{324,329},{377,382},{429,434},{630,635}};
        array_self_color = new int[][]{{67,71},{99,103},{128,132},{155,159},{187,191},{356,360},{409,413},{461,465}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{486,489},{490,492},{493,494},{510,513},{514,516},{517,518},{534,537},{538,540},{541,542},{558,561},{562,564},{565,566}};
        array_function_name_color = new int[][]{{179,186}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{58,66}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "\n" +
                "*********************************\n" +
                "Manufacture location :- Asia\n" +
                "Mobile id            :- 111\n" +
                "Mobile space         :- 32\n" +
                "Mobile ram           :- 3\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Asia\n" +
                "Mobile id            :- 112\n" +
                "Mobile space         :- 16\n" +
                "Mobile ram           :- 3\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Asia\n" +
                "Mobile id            :- 113\n" +
                "Mobile space         :- 64\n" +
                "Mobile ram           :- 4\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Asia\n" +
                "Mobile id            :- 114\n" +
                "Mobile space         :- 16\n" +
                "Mobile ram           :- 2\n" +
                "\n" +
                "\n" +
                "After changing manufacture location\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Europe\n" +
                "Mobile id            :- 111\n" +
                "Mobile space         :- 32\n" +
                "Mobile ram           :- 3\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Europe\n" +
                "Mobile id            :- 112\n" +
                "Mobile space         :- 16\n" +
                "Mobile ram           :- 3\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Europe\n" +
                "Mobile id            :- 113\n" +
                "Mobile space         :- 64\n" +
                "Mobile ram           :- 4\n" +
                "\n" +
                "*********************************\n" +
                "Manufacture location :- Europe\n" +
                "Mobile id            :- 114\n" +
                "Mobile space         :- 16\n" +
                "Mobile ram           :- 2";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class Students:\n" +
                "    count = 0\n" +
                "    def accept(self):\n" +
                "        Students.count += 1\n" +
                "        print(\"\\nEnter student\",Students.count,\"details\")\n" +
                "        self.name = input(\"Enter name  :- \")\n" +
                "        self.marks = input(\"Enter marks :- \")\n" +
                "    def show(self):\n" +
                "        print(\"\\n***************\")\n" +
                "        print(\"Name  :-\",self.name)\n" +
                "        print(\"Marks :-\",self.marks)\n" +
                "\n" +
                "\n" +
                "list = []\n" +
                "size = int(input(\"Enter no. of students :- \"))\n" +
                "\n" +
                "for i in range(size):\n" +
                "    std = Students()\n" +
                "    std.accept()\n" +
                "    list.append(std)\n" +
                "\n" +
                "print(\"\\n\\nTotal students\",Students.count)\n" +
                "\n" +
                "for i in list:\n" +
                "    i.show()";

        array_string_color = new int[][]{{94,95},{97,111},{127,136},{164,181},{210,227},{263,264},{266,282},{298,308},{334,344},{386,413},{505,506},{510,525}};
        array_keyword_color_1 = new int[][]{{0,5},{34,37},{95,97},{233,236},{264,266},{417,420},{423,425},{506,510},{543,546},{549,551}};
        array_keyword_color_2 = new int[][]{{88,93},{158,163},{204,209},{257,262},{292,297},{328,333},{376,379},{380,385},{426,431},{499,504}};
        array_self_color = new int[][]{{45,49},{146,150},{191,195},{242,246},{309,313},{345,349}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{28,29},{78,79}};
        array_function_name_color = new int[][]{{38,44},{237,241}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Enter no. of students :- 3\n" +
                "\n" +
                "Enter student 1 details\n" +
                "Enter name  :- Veeru\n" +
                "Enter marks :- 65\n" +
                "\n" +
                "Enter student 2 details\n" +
                "Enter name  :- Lokesh\n" +
                "Enter marks :- 76\n" +
                "\n" +
                "Enter student 3 details\n" +
                "Enter name  :- Rahul\n" +
                "Enter marks :- 73\n" +
                "\n" +
                "\n" +
                "Total students 3\n" +
                "\n" +
                "***************\n" +
                "Name  :- Veeru\n" +
                "Marks :- 65\n" +
                "\n" +
                "***************\n" +
                "Name  :- Lokesh\n" +
                "Marks :- 76\n" +
                "\n" +
                "***************\n" +
                "Name  :- Rahul\n" +
                "Marks :- 73";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonTypesOfMethods.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPassingObjects.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python class variables");
            String shareMessage = "Python class variables" +
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