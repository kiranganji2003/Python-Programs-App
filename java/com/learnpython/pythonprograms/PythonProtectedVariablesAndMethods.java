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

public class PythonProtectedVariablesAndMethods extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_protected_variables_and_methods);

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
        actionBar.setTitle("Python protected variables and methods");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "print(\"Protected variables can only be accessed from the within class and from derived class\")\n" +
                "print(\"Protected variables and methods starts from _ (single underscore)\")\n" +
                "\n" +
                "\n" +
                "class Employee:\n" +
                "\n" +
                "    def __init__(self,name,salary):\n" +
                "        self._name = name\n" +
                "        self._salary = salary\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\nAccessing protected variables from within class\")\n" +
                "        print(\"\\n  Employee Name:\",self._name)\n" +
                "        print(\"Employee Salary:\",self._salary)\n" +
                "\n" +
                "\n" +
                "emp = Employee(\"R.F.K\",45000)\n" +
                "emp.display()";

        array_string_color = new int[][]{{6,93},{101,168},{319,320},{322,370},{386,387},{389,406},{433,451},{483,490}};
        array_keyword_color_1 = new int[][]{{172,177},{193,196},{286,289},{320,322},{387,389}};
        array_keyword_color_2 = new int[][]{{0,5},{95,100},{313,318},{380,385},{427,432}};
        array_self_color = new int[][]{{206,210},{233,237},{259,263},{298,302},{407,411},{452,456}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{491,496}};
        array_function_name_color = new int[][]{{290,297}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{197,205}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Protected variables can only be accessed from the within class and from derived class\n" +
                "Protected variables and methods starts from _ (single underscore)\n" +
                "\n" +
                "Accessing protected variables from within class\n" +
                "\n" +
                "  Employee Name: R.F.K\n" +
                "Employee Salary: 45000";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class BaseClass:\n" +
                "    \n" +
                "    def _initialize(self):\n" +
                "        self._x = 123\n" +
                "\n" +
                "\n" +
                "class DerivedClass(BaseClass):\n" +
                "\n" +
                "    def show(self):\n" +
                "        print(\"Accessing protected variable and method from derived class\")\n" +
                "        self._initialize()\n" +
                "        print(\"x = \",self._x)\n" +
                "\n" +
                "\n" +
                "obj = DerivedClass()\n" +
                "obj.show()";

        array_string_color = new int[][]{{139,199},{242,248}};
        array_keyword_color_1 = new int[][]{{0,5},{26,29},{73,78},{109,112}};
        array_keyword_color_2 = new int[][]{{133,138},{236,241}};
        array_self_color = new int[][]{{42,46},{57,61},{118,122},{209,213},{249,253}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{30,41},{113,117}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Accessing protected variable and method from derived class\n" +
                "x =  123";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMethodOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPrivateVariablesAndMethods.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python protected variables and methods");
            String shareMessage = "Python protected variables and methods" +
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