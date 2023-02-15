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

public class PythonConstructors extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_constructors);

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
        actionBar.setTitle("Python constructors");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "class MyClass:\n" +
                "    def __init__(self):\n" +
                "        print(\"This is special method\")\n" +
                "        print(\"This is also called constructor\")\n" +
                "        print(\"This is method calls automatically after creating object\")\n" +
                "\n" +
                "obj = MyClass()";

        array_string_color = new int[][]{{53,77},{93,126},{142,200}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22}};
        array_keyword_color_2 = new int[][]{{47,52},{87,92},{136,141}};
        array_self_color = new int[][]{{32,36}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,31}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "This is special method\n" +
                "This is also called constructor\n" +
                "This is method calls automatically after creating object";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class MyClass:\n" +
                "    def __init__(self,mydata):\n" +
                "        self.mydata = mydata\n" +
                "\n" +
                "\n" +
                "obj = MyClass(\"Hello All\")\n" +
                "print(\"Object data :-\",obj.mydata)";

        array_string_color = new int[][]{{91,102},{110,126}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22}};
        array_keyword_color_2 = new int[][]{{104,109}};
        array_self_color = new int[][]{{32,36},{54,58}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,31}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Object data :- Hello All";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class Person:\n" +
                "    def __init__(self,name,age):\n" +
                "        self.name = name\n" +
                "        self.age = age\n" +
                "    def show(self):\n" +
                "        print()\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Age :-\",self.age)\n" +
                "\n" +
                "\n" +
                "obj = Person(input(\"Enter the name :- \"),int(input(\"Enter the age :- \")))\n" +
                "obj.show()";

        array_string_color = new int[][]{{145,154},{180,188},{220,240},{252,271}};
        array_keyword_color_1 = new int[][]{{0,5},{18,21},{99,102}};
        array_keyword_color_2 = new int[][]{{123,128},{139,144},{174,179},{214,219},{242,245},{246,251}};
        array_self_color = new int[][]{{31,35},{55,59},{80,84},{108,112},{155,159},{189,193}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{103,107}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{22,30}};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output3 = "Enter the name :- Kishor\n" +
                "Enter the age :- 16\n" +
                "\n" +
                "Name :- Kishor\n" +
                "Age :- 16";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "class MyClass:\n" +
                "    def __init__(self,number):\n" +
                "        print(\"This is object\",number)\n" +
                "\n" +
                "\n" +
                "for i in range(5):\n" +
                "    obj = MyClass(i+1)";

        array_string_color = new int[][]{{60,76}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22},{87,90},{93,95}};
        array_keyword_color_2 = new int[][]{{54,59},{96,101}};
        array_self_color = new int[][]{{32,36}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{102,103},{126,127}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,31}};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output4 = "This is object 1\n" +
                "This is object 2\n" +
                "This is object 3\n" +
                "This is object 4\n" +
                "This is object 5";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonPassingObjects.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonClassesAndObjects.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python constructors");
            String shareMessage = "Python constructors" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nExample 4:\n\n" + example4 +
                    "\n\nOutput :-\n\n" + output4 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}