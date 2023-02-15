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

public class PythonMethodOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_method_overloading);

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
        actionBar.setTitle("Python method overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);



        example1 = "class Overloading:\n" +
                "    def method(self,one=None,two=None,three=None):\n" +
                "        args = 0\n" +
                "        if one!=None:\n" +
                "            args += 1\n" +
                "        if two!=None:\n" +
                "            args += 1\n" +
                "        if three!=None:\n" +
                "            args += 1\n" +
                "        print(\"{} arguments method invoked\".format(args))\n" +
                "\n" +
                "obj = Overloading()\n" +
                "obj.method()\n" +
                "obj.method(1)\n" +
                "obj.method(1,2)\n" +
                "obj.method(1,2,3)";

        array_string_color = new int[][]{{235,264}};
        array_keyword_color_1 = new int[][]{{0,5},{23,26},{43,47},{52,56},{63,67},{95,97},{103,107},{139,141},{147,151},{183,185},{193,197}};
        array_keyword_color_2 = new int[][]{{229,234}};
        array_self_color = new int[][]{{34,38}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{85,86},{129,130},{173,174},{219,220},{324,325},{338,339},{340,341},{354,355},{356,357},{358,359}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "0 arguments method invoked\n" +
                "1 arguments method invoked\n" +
                "2 arguments method invoked\n" +
                "3 arguments method invoked";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class Shape:\n" +
                "    def find(self,s1=None,s2=None,s3=None):\n" +
                "        if s1!=None and s2!=None and s3!=None:\n" +
                "            print(\"\\nCuboid dimensions\")\n" +
                "            print(\"l = {}\\nb = {}\\nh = {}\".format(s1,s2,s3))\n" +
                "            print(\"Volume of cuboid is\",(s1*s2*s3))\n" +
                "        elif s1!=None and s2!=None:\n" +
                "            print(\"\\nRectangle dimensions\")\n" +
                "            print(\"l = {}\\nb = {}\".format(s1,s2))\n" +
                "            print(\"Area of rectangle\",(s1*s2))\n" +
                "        else:\n" +
                "            print(\"\\nCircle dimensions\")\n" +
                "            print(\"r = {}\".format(s1))\n" +
                "            print(\"Area of circle is\",(3.14*s1*s1))\n" +
                "\n" +
                "obj = Shape()\n" +
                "obj.find(10)\n" +
                "obj.find(10,20)\n" +
                "obj.find(10,20,30)";

        array_string_color = new int[][]{{122,123},{125,143},{163,170},{172,178},{180,187},{224,245},{312,313},{315,336},{356,363},{365,372},{406,425},{467,468},{470,488},{508,516},{547,566}};
        array_keyword_color_1 = new int[][]{{0,5},{17,20},{34,38},{42,46},{50,54},{65,67},{72,76},{77,80},{85,89},{90,93},{98,102},{123,125},{170,172},{178,180},{266,270},{275,279},{280,283},{288,292},{313,315},{363,365},{443,447},{468,470}};
        array_keyword_color_2 = new int[][]{{116,121},{157,162},{218,223},{306,311},{350,355},{400,405},{461,466},{502,507},{541,546}};
        array_self_color = new int[][]{{26,30}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{568,572},{605,607},{618,620},{621,623},{634,636},{637,639},{640,642}};
        array_function_name_color = new int[][]{{21,25}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "\n" +
                "Circle dimensions\n" +
                "r = 10\n" +
                "Area of circle is 314.0\n" +
                "\n" +
                "Rectangle dimensions\n" +
                "l = 10\n" +
                "b = 20\n" +
                "Area of rectangle 200\n" +
                "\n" +
                "Cuboid dimensions\n" +
                "l = 10\n" +
                "b = 20\n" +
                "h = 30\n" +
                "Volume of cuboid is 6000";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMethodOverriding.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonProtectedVariablesAndMethods.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python method overloading");
            String shareMessage = "Python method overloading" +
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