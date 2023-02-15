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

public class PythonInnerClassProgram extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_inner_class_program);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Python inner class program";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class College:\n" +
                "    def __init__(self):\n" +
                "        self.name = \"Imperial College of Engineering\"\n" +
                "        print(\"College Name:\",self.name)\n" +
                "        obj1 = self.Department1()\n" +
                "        obj2 = self.Department2()\n" +
                "\n" +
                "    class Department1:\n" +
                "        def __init__(self):\n" +
                "            self.name = \"Computer Department\"\n" +
                "            print(\"\\n************************************\")\n" +
                "            print(\"Department Name:\",self.name)\n" +
                "            obj = self.Labs()\n" +
                "\n" +
                "        class Labs:\n" +
                "            def __init__(self):\n" +
                "                self.total_labs = 2\n" +
                "                self.lab1 = \"OS Lab\"\n" +
                "                self.lab2 = \"Programming Lab\"\n" +
                "                print(\"     Total Labs:\",self.total_labs)\n" +
                "                print(\"          Lab 1:\",self.lab1)\n" +
                "                print(\"          Lab 2:\",self.lab2)\n" +
                "                print(\"************************************\")\n" +
                "\n" +
                "    class Department2:\n" +
                "        def __init__(self):\n" +
                "            self.name = \"IT Department\"\n" +
                "            print(\"\\n************************************\")\n" +
                "            print(\"Department Name:\",self.name)\n" +
                "            obj = self.Labs()\n" +
                "\n" +
                "        class Labs:\n" +
                "            def __init__(self):\n" +
                "                self.total_labs = 2\n" +
                "                self.lab1 = \"Linux Lab\"\n" +
                "                self.lab2 = \"Unix Lab\"\n" +
                "                print(\"     Total Labs:\",self.total_labs)\n" +
                "                print(\"          Lab 1:\",self.lab1)\n" +
                "                print(\"          Lab 2:\",self.lab2)\n" +
                "                print(\"************************************\")\n" +
                "\n" +
                "obj = College()";

        int[][] array_string_color = {{59,92},{107,122},{278,299},{318,319},{321,358},{378,396},{555,563},{592,609},{632,650},{690,708},{742,760},{794,832},{910,925},{944,945},{947,984},{1004,1022},{1181,1192},{1221,1231},{1254,1272},{1312,1330},{1364,1382},{1416,1454}};
        int[][] array_keyword_color_1 = {{0,5},{19,22},{207,212},{234,237},{319,321},{447,452},{471,474},{839,844},{866,869},{945,947},{1073,1078},{1097,1100}};
        int[][] array_keyword_color_2 = {{101,106},{312,317},{372,377},{626,631},{684,689},{736,741},{788,793},{938,943},{998,1003},{1248,1253},{1306,1311},{1358,1363},{1410,1415}};
        int[][] array_self_color = {{32,36},{47,51},{123,127},{149,153},{183,187},{247,251},{266,270},{397,401},{426,430},{484,488},{507,511},{543,547},{580,584},{651,655},{709,713},{761,765},{879,883},{898,902},{1023,1027},{1052,1056},{1110,1114},{1133,1137},{1169,1173},{1209,1213},{1273,1277},{1331,1335},{1383,1387}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{525,526},{1151,1152}};
        int[][] array_function_name_color = {};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{23,31},{238,246},{475,483},{870,878},{1101,1109}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "College Name: Imperial College of Engineering\n" +
                "\n" +
                "************************************\n" +
                "Department Name: Computer Department\n" +
                "     Total Labs: 2\n" +
                "          Lab 1: OS Lab\n" +
                "          Lab 2: Programming Lab\n" +
                "************************************\n" +
                "\n" +
                "************************************\n" +
                "Department Name: IT Department\n" +
                "     Total Labs: 2\n" +
                "          Lab 1: Linux Lab\n" +
                "          Lab 2: Unix Lab\n" +
                "************************************";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),GenerateRandomOTP.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CallingSuperClassConstructorAndMethods.class);
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