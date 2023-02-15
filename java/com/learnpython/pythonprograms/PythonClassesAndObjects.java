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

public class PythonClassesAndObjects extends AppCompatActivity {

    String example1,example2,example3,example4;
    String output1,output2,output3,output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_classes_and_objects);

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
        actionBar.setTitle("Python classes and objects");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class MyClass:\n" +
                "    def myMethod(self):\n" +
                "        print(\"Hello\")\n" +
                "        print(\"This is simple class example\")\n" +
                "\n" +
                "\n" +
                "class_object = MyClass()\n" +
                "class_object.myMethod()";

        array_string_color = new int[][]{{53,60},{76,106}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22}};
        array_keyword_color_2 = new int[][]{{47,52},{70,75}};
        array_self_color = new int[][]{{32,36}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{23,31}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Hello\n" +
                "This is simple class example";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class BookStore:\n" +
                "    def bookDetails(self):\n" +
                "        self.bookname = input(\"Enter the book name :- \")\n" +
                "        self.bookprice = int(input(\"Enter the book price :- \"))\n" +
                "\n" +
                "\n" +
                "bookObj = BookStore()\n" +
                "bookObj.bookDetails()\n" +
                "\n" +
                "print(\"\\nBook Details\")\n" +
                "print(\"Book name :-\",bookObj.bookname)\n" +
                "print(\"Book price :-\",bookObj.bookprice)";

        array_string_color = new int[][]{{74,99},{136,162},{218,219},{221,234},{242,256},{281,296}};
        array_keyword_color_1 = new int[][]{{0,5},{21,24},{219,221}};
        array_keyword_color_2 = new int[][]{{68,73},{126,129},{130,135},{212,217},{236,241},{275,280}};
        array_self_color = new int[][]{{37,41},{52,56},{109,113}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{25,36}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the book name :- Personal Finance\n" +
                "Enter the book price :- 755\n" +
                "\n" +
                "Book Details\n" +
                "Book name :- Personal Finance\n" +
                "Book price :- 755";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "class Employee:\n" +
                "\n" +
                "    def acceptDetails(self):\n" +
                "        self.name = input(\"Enter the employee name :- \")\n" +
                "        self.salary = int(input(\"Enter the salary :- \"))\n" +
                "\n" +
                "    def showDetails(self):\n" +
                "        print(\"\\nEmployee Details\")\n" +
                "        print(\"Name :-\",self.name)\n" +
                "        print(\"Salary :-\",self.salary)\n" +
                "        \n" +
                "\n" +
                "empObj = Employee()\n" +
                "empObj.acceptDetails()\n" +
                "empObj.showDetails()";

        array_string_color = new int[][]{{72,101},{135,157},{202,203},{205,222},{238,247},{273,284}};
        array_keyword_color_1 = new int[][]{{0,5},{21,24},{165,168},{203,205}};
        array_keyword_color_2 = new int[][]{{66,71},{125,128},{129,134},{196,201},{232,237},{267,272}};
        array_self_color = new int[][]{{39,43},{54,58},{111,115},{181,185},{248,252},{285,289}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{25,38},{169,180}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Enter the employee name :- Ravi Kumar\n" +
                "Enter the salary :- 85000\n" +
                "\n" +
                "Employee Details\n" +
                "Name :- Ravi Kumar\n" +
                "Salary :- 85000";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        example4 = "class Mobiles:\n" +
                "\n" +
                "    def details(self,name,ram,price):\n" +
                "        self.name = name\n" +
                "        self.ram = ram\n" +
                "        self.price = price\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\nName :-\",self.name)\n" +
                "        print(\"Ram :- {}GB\".format(self.ram))\n" +
                "        print(\"Price :-\",self.price)\n" +
                "\n" +
                "\n" +
                "mob1 = Mobiles()\n" +
                "mob2 = Mobiles()\n" +
                "mob3 = Mobiles()\n" +
                "mob4 = Mobiles()\n" +
                "\n" +
                "mob1.details(\"Redmi\",4,12000)\n" +
                "mob2.details(\"Samsung\",4,14000)\n" +
                "mob3.details(\"Vivo\",6,18000)\n" +
                "mob4.details(\"Oppo\",6,16000)\n" +
                "\n" +
                "mob1.display()\n" +
                "mob2.display()\n" +
                "mob3.display()\n" +
                "mob4.display()";

        array_string_color = new int[][]{{167,168},{170,178},{204,217},{250,260},{357,364},{387,396},{419,425},{448,454}};
        array_keyword_color_1 = new int[][]{{0,5},{20,23},{134,137},{168,170}};
        array_keyword_color_2 = new int[][]{{161,166},{198,203},{244,249}};
        array_self_color = new int[][]{{32,36},{62,66},{87,91},{110,114},{146,150},{179,183},{225,229},{261,265}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{365,366},{367,372},{397,398},{399,404},{426,427},{428,433},{455,456},{457,462}};
        array_function_name_color = new int[][]{{24,31},{138,145}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.example4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(example4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output4 = "\n" +
                "Name :- Redmi\n" +
                "Ram :- 4GB\n" +
                "Price :- 12000\n" +
                "\n" +
                "Name :- Samsung\n" +
                "Ram :- 4GB\n" +
                "Price :- 14000\n" +
                "\n" +
                "Name :- Vivo\n" +
                "Ram :- 6GB\n" +
                "Price :- 18000\n" +
                "\n" +
                "Name :- Oppo\n" +
                "Ram :- 6GB\n" +
                "Price :- 16000";
        TextView t_out4 = findViewById(R.id.output4);
        t_out4.setText(output4);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python classes and objects");
            String shareMessage = "Python classes and objects" +
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