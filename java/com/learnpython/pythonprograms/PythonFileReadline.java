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

public class PythonFileReadline extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_file_readline);

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
        actionBar.setTitle("Python file readline");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"Student info\")\n" +
                "name = input(\"Enter student name: \")\n" +
                "roll = int(input(\"Enter student roll no: \"))\n" +
                "percentage = float(input(\"Enter student percentage: \"))\n" +
                "\n" +
                "file = open(\"student.txt\",\"w\")\n" +
                "file.write(name)\n" +
                "file.write(\"\\n\")\n" +
                "file.write(str(roll))\n" +
                "file.write(\"\\n\")\n" +
                "file.write(str(percentage))\n" +
                "file.close()\n" +
                "\n" +
                "print(\"Student Info\")\n" +
                "file = open(\"student.txt\",\"r\")\n" +
                "print(\"Student name:\",file.readline(),end=\"\")\n" +
                "print(\"Student roll no:\",file.readline(),end=\"\")\n" +
                "print(\"Student percentage:\",file.readline(),end=\"\")";

        array_string_color = new int[][]{{6,20},{35,57},{76,101},{129,157},{173,186},{187,190},{220,221},{223,224},{259,260},{262,263},{313,327},{341,354},{355,358},{366,381},{402,404},{412,430},{451,453},{461,482},{503,505}};
        array_keyword_color_1 = new int[][]{{221,223},{260,262}};
        array_keyword_color_2 = new int[][]{{0,5},{29,34},{66,69},{70,75},{117,122},{123,128},{168,172},{237,240},{276,279},{307,312},{336,340},{360,365},{406,411},{455,460}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{398,401},{447,450},{499,502}};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Student info\n" +
                "Enter student name: Ramesh\n" +
                "Enter student roll no: 365\n" +
                "Enter student percentage: 78.29\n" +
                "Student Info\n" +
                "Student name: Ramesh\n" +
                "Student roll no: 365\n" +
                "Student percentage: 78.29";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "def add_employee_record():\n" +
                "    getline()\n" +
                "    emp_id = int(input(\"Enter employee id: \"))\n" +
                "    emp_name = input(\"Enter employee name: \")\n" +
                "    emp_salary = int(input(\"Enter employee salary: \"))\n" +
                "    file = open(\"Employee data.txt\",\"a\")\n" +
                "    file.write(str(emp_id))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.write(str(emp_name))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.write(str(emp_salary))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.close()\n" +
                "    getline()\n" +
                "\n" +
                "def display_employee_record():\n" +
                "    file = open(\"Employee data.txt\",\"r\")\n" +
                "    num = 0\n" +
                "    while True:\n" +
                "        data = file.readline()\n" +
                "        if data!=\"\":\n" +
                "            if num==0:\n" +
                "                getline()\n" +
                "                print(\"Employee id    :\",data,end=\"\")\n" +
                "                num = 1\n" +
                "            elif num==1:\n" +
                "                print(\"Employee name  :\",data,end=\"\")\n" +
                "                num = 2\n" +
                "            elif num==2:\n" +
                "                print(\"Employee Salary:\",data,end=\"\")\n" +
                "                num = 0\n" +
                "        else:\n" +
                "            break\n" +
                "    getline()\n" +
                "\n" +
                "def main():\n" +
                "    while True:\n" +
                "        print(\"1. Add employee record\")\n" +
                "        print(\"2. Display employee records\")\n" +
                "        print(\"3. Exit\")\n" +
                "        getline()\n" +
                "        ch = int(input(\"Choose your choice: \"))\n" +
                "        if ch==1:\n" +
                "            add_employee_record()\n" +
                "        elif ch==2:\n" +
                "            display_employee_record()\n" +
                "        elif ch==3:\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"Invalid choice\")\n" +
                "\n" +
                "def getline():\n" +
                "    print()\n" +
                "\n" +
                "try:\n" +
                "    main()\n" +
                "except FileNotFoundError:\n" +
                "    print(\"File not found\")\n" +
                "except Exception:\n" +
                "    print(\"Exception occurs\")";

        array_string_color = new int[][]{{64,85},{109,132},{161,186},{205,224},{225,228},{273,274},{276,277},{324,325},{327,328},{377,378},{380,381},{462,481},{482,485},{563,565},{638,656},{666,668},{741,759},{769,771},{844,862},{872,874},{989,1013},{1029,1058},{1074,1083},{1126,1148},{1331,1347},{1430,1446},{1476,1494}};
        array_keyword_color_1 = new int[][]{{0,3},{274,276},{325,327},{378,380},{415,418},{503,513},{554,556},{579,581},{706,710},{809,813},{908,912},{926,931},{947,950},{963,973},{1159,1161},{1211,1215},{1269,1273},{1293,1298},{1307,1311},{1350,1353},{1378,1381},{1394,1400},{1448,1454}};
        array_keyword_color_2 = new int[][]{{54,57},{58,63},{103,108},{151,154},{155,160},{200,204},{245,248},{294,297},{345,348},{457,461},{632,637},{735,740},{838,843},{983,988},{1023,1028},{1068,1073},{1116,1119},{1120,1125},{1325,1330},{1369,1374},{1401,1418},{1424,1429},{1455,1464},{1470,1475}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{662,665},{765,768},{868,871}};
        array_number_color = new int[][]{{497,498},{587,588},{692,693},{716,717},{795,796},{819,820},{898,899},{1166,1167},{1220,1221},{1278,1279}};
        array_function_name_color = new int[][]{{4,23},{419,442},{951,955},{1354,1361}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter employee id: 1210\n" +
                "Enter employee name: Jay Krish\n" +
                "Enter employee salary: 70000\n" +
                "\n" +
                "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter employee id: 1211\n" +
                "Enter employee name: John Doe\n" +
                "Enter employee salary: 75000\n" +
                "\n" +
                "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Employee id    : 1210\n" +
                "Employee name  : Jay Krish\n" +
                "Employee Salary: 70000\n" +
                "\n" +
                "Employee id    : 1211\n" +
                "Employee name  : John Doe\n" +
                "Employee Salary: 75000\n" +
                "\n" +
                "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter employee id: 1212\n" +
                "Enter employee name: Rakesh Kumar\n" +
                "Enter employee salary: 85500\n" +
                "\n" +
                "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Employee id    : 1210\n" +
                "Employee name  : Jay Krish\n" +
                "Employee Salary: 70000\n" +
                "\n" +
                "Employee id    : 1211\n" +
                "Employee name  : John Doe\n" +
                "Employee Salary: 75000\n" +
                "\n" +
                "Employee id    : 1212\n" +
                "Employee name  : Rakesh Kumar\n" +
                "Employee Salary: 85500\n" +
                "\n" +
                "1. Add employee record\n" +
                "2. Display employee records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 3";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonReadFileUsingForLoop.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFileRead.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python file readline");
            String shareMessage = "Python file readline" +
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