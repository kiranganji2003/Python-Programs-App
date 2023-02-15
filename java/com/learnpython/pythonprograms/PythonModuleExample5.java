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

public class PythonModuleExample5 extends AppCompatActivity {

    String example1,example2,example3;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_module_example5);

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
        actionBar.setTitle("Python modules example 5");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class Employee:\n" +
                "    def accept(self):\n" +
                "        self.id = int(input(\"Enter the employee id :- \"))\n" +
                "        self.name = input(\"Enter the employee name :- \")\n" +
                "        self.salary = int(input(\"Enter employee salary :- \"))\n" +
                "    def display(self):\n" +
                "        print(\"\\nId :-\",self.id)\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Salary :-\",self.salary)";

        array_string_color = new int[][]{{66,93},{122,151},{185,212},{252,253},{255,261},{285,294},{320,331}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{219,222},{253,255}};
        array_keyword_color_2 = new int[][]{{56,59},{60,65},{116,121},{175,178},{179,184},{246,251},{279,284},{314,319}};
        array_self_color = new int[][]{{31,35},{46,50},{104,108},{161,165},{231,235},{262,266},{295,299},{332,336}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{24,30},{223,230}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        example2 = "from Employee import *\n" +
                "\n" +
                "class Record:\n" +
                "    def __init__(self):\n" +
                "        self.list = []\n" +
                "    def banner(self):\n" +
                "        print(\"\\n1. Add employee\")\n" +
                "        print(\"2. Display employees\")\n" +
                "        print(\"3. Exit\")\n" +
                "        choice = int(input(\"choose your choice :- \"))\n" +
                "        self.navigate(choice)\n" +
                "        return choice\n" +
                "    def navigate(self,ch):\n" +
                "        if ch==1:\n" +
                "            obj = Employee()\n" +
                "            obj.accept()\n" +
                "            self.list.append(obj)\n" +
                "        elif ch==2:\n" +
                "            for i in self.list:\n" +
                "                i.display()";

        array_string_color = new int[][]{{121,122},{124,140},{156,178},{194,203},{232,256}};
        array_keyword_color_1 = new int[][]{{0,4},{14,20},{24,29},{42,45},{89,92},{122,124},{297,303},{315,318},{346,348},{452,456},{476,479},{482,484}};
        array_keyword_color_2 = new int[][]{{115,120},{150,155},{188,193},{222,225},{226,231}};
        array_self_color = new int[][]{{55,59},{70,74},{100,104},{267,271},{328,332},{422,426},{485,489}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{353,354},{461,462}};
        array_function_name_color = new int[][]{{93,99},{319,327}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{46,54}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        example3 = "from Record import *\n" +
                "\n" +
                "choice = 0\n" +
                "obj = Record()\n" +
                "while choice!=3:\n" +
                "    choice = obj.banner()";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{{0,4},{12,18},{48,53}};
        array_keyword_color_2 = new int[][]{};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{31,32},{62,63}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));


        output = "\n" +
                "1. Add employee\n" +
                "2. Display employees\n" +
                "3. Exit\n" +
                "choose your choice :- 1\n" +
                "Enter the employee id :- 1\n" +
                "Enter the employee name :- Rohan\n" +
                "Enter employee salary :- 24000\n" +
                "\n" +
                "1. Add employee\n" +
                "2. Display employees\n" +
                "3. Exit\n" +
                "choose your choice :- 1\n" +
                "Enter the employee id :- 2\n" +
                "Enter the employee name :- John\n" +
                "Enter employee salary :- 44500\n" +
                "\n" +
                "1. Add employee\n" +
                "2. Display employees\n" +
                "3. Exit\n" +
                "choose your choice :- 2\n" +
                "\n" +
                "Id :- 1\n" +
                "Name :- Rohan\n" +
                "Salary :- 24000\n" +
                "\n" +
                "Id :- 2\n" +
                "Name :- John\n" +
                "Salary :- 44500\n" +
                "\n" +
                "1. Add employee\n" +
                "2. Display employees\n" +
                "3. Exit\n" +
                "choose your choice :- 3";
        TextView t_out = findViewById(R.id.output);
        t_out.setText(output);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
                Intent intent = new Intent(getApplicationContext(),PythonModulesExample6.class);
                startActivity(intent);
                finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonModulesExample4.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python modules example 5");
            String shareMessage = "Python modules example 5" +
                    "\n\n\nEmployee.py\n\n" + example1 +
                    "\n\n\nRecord.py\n\n" + example2 +
                    "\n\n\nMain.py\n\n" + example3 +
                    "\n\n\nOutput :-\n\n" + output +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}