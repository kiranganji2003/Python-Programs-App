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

public class ListOfObjects extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_objects);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Store the list of objects in list";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class Student:\n" +
                "    count = 0\n" +
                "    def accept(self):\n" +
                "        Student.count += 1\n" +
                "        print(\"\\nEnter student\",Student.count,end=\" \")\n" +
                "        self.name = input(\"name :- \")\n" +
                "        self.rollno = int(input(\"Enter student roll no :- \"))\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\n***************\")\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Rollno :-\",self.rollno)\n" +
                "                \n" +
                "\n" +
                "list = []\n" +
                "no = int(input(\"Enter no. of students :- \"))\n" +
                "print(\"Enter\",no,\"student details\")\n" +
                "\n" +
                "for i in range(no):\n" +
                "    obj = Student()\n" +
                "    obj.accept()\n" +
                "    list.append(obj)\n" +
                "\n" +
                "print(\"\\nStudent Details\")\n" +
                "    \n" +
                "for i in list:\n" +
                "    i.display()";

        int[][] array_string_color = {{92,93},{95,109},{128,131},{159,169},{203,230},{271,272},{274,290},{306,315},{341,352},{409,436},{445,452},{456,473},{561,562},{564,580}};
        int[][] array_keyword_color_1 = {{0,5},{33,36},{93,95},{238,241},{272,274},{476,479},{482,484},{562,564},{587,590},{593,595}};
        int[][] array_keyword_color_2 = {{86,91},{153,158},{193,196},{197,202},{265,271},{300,305},{335,340},{399,402},{403,408},{439,444},{485,490},{555,560}};
        int[][] array_self_color = {{44,48},{141,145},{179,183},{250,254},{316,320},{353,357}};
        int[][] array_end_color = {{124,127}};
        int[][] array_number_color = {{27,28},{76,77}};
        int[][] array_function_name_color = {{37,43},{242,249}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter no. of students :- 5\n" +
                "Enter 5 student details\n" +
                "\n" +
                "Enter student 1 name :- Abhi\n" +
                "Enter student roll no :- 10\n" +
                "\n" +
                "Enter student 2 name :- Akash\n" +
                "Enter student roll no :- 11\n" +
                "\n" +
                "Enter student 3 name :- Akshay\n" +
                "Enter student roll no :- 13\n" +
                "\n" +
                "Enter student 4 name :- Anand\n" +
                "Enter student roll no :- 14\n" +
                "\n" +
                "Enter student 5 name :- Anil\n" +
                "Enter student roll no :- 15\n" +
                "\n" +
                "Student Details\n" +
                "\n" +
                "***************\n" +
                "Name :- Abhi\n" +
                "Rollno :- 10\n" +
                "\n" +
                "***************\n" +
                "Name :- Akash\n" +
                "Rollno :- 11\n" +
                "\n" +
                "***************\n" +
                "Name :- Akshay\n" +
                "Rollno :- 13\n" +
                "\n" +
                "***************\n" +
                "Name :- Anand\n" +
                "Rollno :- 14\n" +
                "\n" +
                "***************\n" +
                "Name :- Anil\n" +
                "Rollno :- 15";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),KthSmallestElementInList.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ProductOfArrayExceptSelf.class);
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