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

public class PythonMultiplicationOperatorOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_multiplication_operator_overloading);

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
        actionBar.setTitle("Python multiplication operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class Price:\n" +
                "    def accept(self):\n" +
                "        self.price = int(input(\"Enter the product price :- \"))\n" +
                "    def __mul__(self,other):\n" +
                "        total = self.price*other.quantity\n" +
                "        print(\"Total :-\",total)\n" +
                "\n" +
                "class Quantity:\n" +
                "    def accept(self):\n" +
                "        self.quantity = int(input(\"Enter no. of quantity :- \"))\n" +
                "\n" +
                "pr = Price()\n" +
                "qty = Quantity()\n" +
                "pr.accept()\n" +
                "qty.accept()\n" +
                "pr*qty";

        array_string_color = new int[][]{{66,95},{183,193},{274,301}};
        array_keyword_color_1 = new int[][]{{0,5},{17,20},{102,105},{202,207},{222,225}};
        array_keyword_color_2 = new int[][]{{56,59},{60,65},{177,182},{264,267},{268,273}};
        array_self_color = new int[][]{{28,32},{43,47},{114,118},{143,147},{233,237},{248,252}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{21,27},{226,232}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{106,113}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter the product price :- 50\n" +
                "Enter no. of quantity :- 15\n" +
                "Total :- 750";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        example2 = "class List:\n" +
                "\n" +
                "    size = 0\n" +
                "\n" +
                "    def accept(self,name):\n" +
                "        self.name = name\n" +
                "        self.list = []\n" +
                "        print(\"Enter {} elements for {}\".format(List.size,name))\n" +
                "        for i in range(List.size):\n" +
                "            self.list.append(int(input()))\n" +
                "\n" +
                "    def __mul__(self,other):\n" +
                "        print(\"\\nMultiplication of {} * {}\".format(self.name,other.name))\n" +
                "        for i in range(List.size):\n" +
                "            print(\"{} * {} = {}\".format(self.list[i],other.list[i],self.list[i]*other.list[i]))\n" +
                "\n" +
                "List.size = int(input(\"Enter the size of list: \"))\n" +
                "\n" +
                "obj1 = List()\n" +
                "obj2 = List()\n" +
                "\n" +
                "obj1.accept(\"List1\")\n" +
                "obj2.accept(\"List2\")\n" +
                "\n" +
                "obj1*obj2";

        array_string_color = new int[][]{{116,142},{289,290},{292,318},{402,416},{503,529},{574,581},{595,602}};
        array_keyword_color_1 = new int[][]{{0,5},{31,34},{175,178},{181,183},{250,253},{290,292},{357,360},{363,365}};
        array_keyword_color_2 = new int[][]{{110,115},{184,189},{231,234},{235,240},{283,288},{366,371},{396,401},{493,496},{497,502}};
        array_self_color = new int[][]{{42,46},{62,66},{87,91},{214,218},{262,266},{326,330},{424,428},{451,455}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{24,25}};
        array_function_name_color = new int[][]{{35,41}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{254,261}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Enter the size of list: 3\n" +
                "Enter 3 elements for List1\n" +
                "23\n" +
                "25\n" +
                "14\n" +
                "Enter 3 elements for List2\n" +
                "2\n" +
                "7\n" +
                "4\n" +
                "\n" +
                "Multiplication of List1 * List2\n" +
                "23 * 2 = 46\n" +
                "25 * 7 = 175\n" +
                "14 * 4 = 56";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonDivisionOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonBinaryMinusOperatorOverloading.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python multiplication operator overloading");
            String shareMessage = "Python multiplication operator overloading" +
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