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

public class PythonMultipleInheritance extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_multiple_inheritance);

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
        actionBar.setTitle("Python multiple inheritance");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class A:\n" +
                "    def showA(self):\n" +
                "        print(\"class A\")\n" +
                "    \n" +
                "class B:\n" +
                "    def showB(self):\n" +
                "        print(\"class B\")\n" +
                "\n" +
                "class C:\n" +
                "    def showC(self):\n" +
                "        print(\"class C\")\n" +
                "\n" +
                "class DerivedClass(A,B,C):\n" +
                "    def show(self):\n" +
                "        print(\"Derived class\")\n" +
                "\n" +
                "obj = DerivedClass()\n" +
                "obj.showA()\n" +
                "obj.showB()\n" +
                "obj.showC()\n" +
                "obj.show()";

        array_string_color = new int[][]{{44,53},{104,113},{160,169},{233,248}};
        array_keyword_color_1 = new int[][]{{0,5},{13,16},{60,65},{73,76},{116,121},{129,132},{172,177},{203,206}};
        array_keyword_color_2 = new int[][]{{38,43},{98,103},{154,159},{227,232}};
        array_self_color = new int[][]{{23,27},{83,87},{139,143},{212,216}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{17,22},{77,82},{133,138},{207,211}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "class A\n" +
                "class B\n" +
                "class C\n" +
                "Derived class";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        example2 = "class Dimensions:\n" +
                "    def dimen(self):\n" +
                "        self.length = int(input(\"Enter the length of rectangle :- \"))\n" +
                "        self.breadth = int(input(\"Enter the breadth of rectangle :- \"))\n" +
                "\n" +
                "class Area:\n" +
                "    def area(self,l,b):\n" +
                "        print(\"\\nArea of rectangle :-\",l*b)\n" +
                "\n" +
                "class Perimeter:\n" +
                "    def perimeter(self,l,b):\n" +
                "        print(\"Perimeter of rectangle :-\",2*l+2*b)\n" +
                "\n" +
                "class Rectangle(Dimensions,Area,Perimeter):\n" +
                "    def calculate(self):\n" +
                "        self.dimen()\n" +
                "        self.area(self.length,self.breadth)\n" +
                "        self.perimeter(self.length,self.breadth)\n" +
                "\n" +
                "rect = Rectangle()\n" +
                "rect.calculate()";

        array_string_color = new int[][]{{71,106},{142,178},{232,233},{235,256},{323,350}};
        array_keyword_color_1 = new int[][]{{0,5},{22,25},{182,187},{198,201},{233,235},{263,268},{284,287},{361,366},{409,412}};
        array_keyword_color_2 = new int[][]{{61,64},{65,70},{132,135},{136,141},{226,231},{317,322}};
        array_self_color = new int[][]{{32,36},{47,51},{117,121},{207,211},{298,302},{423,427},{438,442},{459,463},{469,473},{481,485},{503,507},{518,522},{530,534}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{351,352},{355,356}};
        array_function_name_color = new int[][]{{26,31},{202,206},{288,297},{413,422}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Enter the length of rectangle :- 40\n" +
                "Enter the breadth of rectangle :- 30\n" +
                "\n" +
                "Area of rectangle :- 1200\n" +
                "Perimeter of rectangle :- 140";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonHybridInheritance.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMultiLevelInheritance.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python multiple inheritance");
            String shareMessage = "Python multiple inheritance" +
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