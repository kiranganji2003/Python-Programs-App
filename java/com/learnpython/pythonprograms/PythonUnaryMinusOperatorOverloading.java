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

public class PythonUnaryMinusOperatorOverloading extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_unary_minus_operator_overloading);

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
        actionBar.setTitle("Python unary minus operator overloading");
        actionBar.setDisplayHomeAsUpEnabled(true);


        example1 = "class MyClass:\n" +
                "    def __neg__(self):\n" +
                "        print(\"This method is invoked\")\n" +
                "\n" +
                "myobj = MyClass()\n" +
                "-myobj";

        array_string_color = new int[][]{{52,76}};
        array_keyword_color_1 = new int[][]{{0,5},{19,22}};
        array_keyword_color_2 = new int[][]{{46,51}};
        array_self_color = new int[][]{{31,35}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{23,30}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "This method is invoked";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Negate all the values in list\")\n" +
                "\n" +
                "class List:\n" +
                "    def __init__(self,list):\n" +
                "        self.list = list\n" +
                "    def __neg__(self):\n" +
                "        for i in range(len(self.list)):\n" +
                "            self.list[i] = -self.list[i]\n" +
                "    def show(self):\n" +
                "        print(\"List values\")\n" +
                "        for i in self.list:\n" +
                "            print(i)\n" +
                "\n" +
                "obj = List([34,65,92,29,45])\n" +
                "print(\"\\nBefore negating\")\n" +
                "obj.show()\n" +
                "-obj\n" +
                "print(\"\\nAfter negating\")\n" +
                "obj.show()";

        array_string_color = new int[][]{{6,37},{244,257},{344,345},{347,363},{387,388},{390,405}};
        array_keyword_color_1 = new int[][]{{40,45},{56,59},{110,113},{137,140},{143,145},{214,217},{267,270},{273,275},{345,347},{388,390}};
        array_keyword_color_2 = new int[][]{{0,5},{146,151},{152,155},{238,243},{299,304},{338,343},{381,386}};
        array_self_color = new int[][]{{69,73},{89,93},{122,126},{156,160},{181,185},{197,201},{223,227},{276,280}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{321,323},{324,326},{327,329},{330,332},{333,335}};
        array_function_name_color = new int[][]{{218,222}};
        array_comments = new int[][]{};
        array_special_function_color = new int[][]{{60,68},{114,121}};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output2 = "Negate all the values in list\n" +
                "\n" +
                "Before negating\n" +
                "List values\n" +
                "34\n" +
                "65\n" +
                "92\n" +
                "29\n" +
                "45\n" +
                "\n" +
                "After negating\n" +
                "List values\n" +
                "-34\n" +
                "-65\n" +
                "-92\n" +
                "-29\n" +
                "-45";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);



        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonUnaryPlusOperatorOverloading.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonMethodOverriding.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python unary minus operator overloading");
            String shareMessage = "Python unary minus operator overloading" +
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