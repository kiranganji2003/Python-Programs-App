package com.learnpython.pythonprograms;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Quiz6 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Choose the incorrect import statement",
            "Guess the output of the following code?",
            "What will be the output of the following code?",
            "What will be the output of the following code?",
            "Guess the output of the following code?",
            "Guess the output of the following code?",
            "What will be the output of the following code?",
            "Guess the output of the following code?",
            "Guess the output of the following code?",
            "What will be the value of x of the following code?"
    };

    String[] coding={"",
            "def number(num=20):\n" +
                    "    print(num)\n" +
                    "number(80)",
            "def display(obj):\n" +
                    "    print(obj.rollno,obj.name)\n" +
                    "class Data:\n" +
                    "    def __init__(self,name,rollno):\n" +
                    "        self.name = name\n" +
                    "        self.rollno = rollno\n" +
                    "obj = Data(\"Manan\",43)\n" +
                    "display(obj)",
            "print(\"print = {}\".format(\"a b c\"))",
            "num = 13\n" +
                    "if not num%3!=0:\n" +
                    "    print(\"No\")\n" +
                    "else:\n" +
                    "    print(\"Yes\")",
            "num = 77\n" +
                    "print(num%7+num)",
            "def data(first,*second):\n" +
                    "    print(second)\n" +
                    "data(1,2,3,4)",
            "print(sum(16,68))",
            "def x():\n" +
                    "    return 20\n" +
                    "x = 10\n" +
                    "print(x)",
            "def fun1():\n" +
                    "    global x\n" +
                    "    print(x)\n" +
                    "def fun2():\n" +
                    "    global x\n" +
                    "    x+=2\n" +
                    "    \n" +
                    "x = 10\n" +
                    "fun2()"
    };

    String[] option1 = {"import math",
            "20",
            "Error",
            "print = a b c",
            "No",
            "87",
            "2, 3, 4",
            "16",
            "Error",
            "10"
    };
    String[] option2 = {"import math.sqrt",
            "80",
            "None",
            "print = {a b c}",
            "Yes",
            "70",
            "2",
            "68",
            "20",
            "12"
    };
    String[] option3 = {"from math import sqrt",
            "100",
            "Manan 43",
            "print = abc",
            "Invalid syntax",
            "84",
            "(2, 3, 4)",
            "84",
            "10",
            "20"
    };
    String[] option4 = {"from math import *",
            "Error",
            "43 Manan",
            "print = {abc}",
            "None of the above",
            "77",
            "(2)",
            "Error",
            "None",
            "Error"
    };
    String[] correct = {"import math.sqrt",
            "80",
            "43 Manan",
            "print = a b c",
            "Yes",
            "77",
            "(2, 3, 4)",
            "Error",
            "10",
            "12"
    };

    int[][] array_string_color;
    int[][] array_keyword_color_1;
    int[][] array_keyword_color_2;
    int[][] array_self_color;
    int[][] array_end_color;
    int[][] array_number_color;
    int[][] array_function_name_color;
    int[][] array_comments;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python Quiz : 1/10");
        radioGroup = findViewById(R.id.group);
        textView = findViewById(R.id.question);
        codeView = findViewById(R.id.code);
        horizontalScrollView = findViewById(R.id.parentCode);
        opt1 = findViewById(R.id.option1);
        opt2 = findViewById(R.id.option2);
        opt3 = findViewById(R.id.option3);
        opt4 = findViewById(R.id.option4);
        button = findViewById(R.id.next);
        button.setVisibility(View.GONE);
        assign(0);

        button.setOnClickListener(v -> {
            if (count==9){
                Intent intent = new Intent(getApplicationContext(),Quiz7.class);
                startActivity(intent);
                finish();
            }
            radioGroup.clearCheck();
            count++;
            actionBar.setTitle("Python Quiz : "+(count+1)+"/10");
            assign(count);
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            opt1.setTextColor(getResources().getColor(R.color.code_color, this.getTheme()));
            opt2.setTextColor(getResources().getColor(R.color.code_color, this.getTheme()));
            opt3.setTextColor(getResources().getColor(R.color.code_color, this.getTheme()));
            opt4.setTextColor(getResources().getColor(R.color.code_color, this.getTheme()));
            button.setVisibility(View.GONE);
            current = count;
        });
    }

    public void changeMethod(View v) {
        button.setVisibility(View.VISIBLE);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        if(!(opt1.getText().toString().equals(radioButton.getText().toString()))){
            opt1.setEnabled(false);
        }
        if(!(opt2.getText().toString().equals(radioButton.getText().toString()))){
            opt2.setEnabled(false);
        }
        if(!(opt3.getText().toString().equals(radioButton.getText().toString()))){
            opt3.setEnabled(false);
        }
        if(!(opt4.getText().toString().equals(radioButton.getText().toString()))){
            opt4.setEnabled(false);
        }

        String radiotext = radioButton.getText().toString();
        if(radiotext.equals(correct[count])){
            if(current==count){
                score++;
                radioButton.setTextColor(Color.rgb(0,210,0));
                current = -1;
            }
        }
        else{
            radioButton.setTextColor(Color.rgb(210,0,0));
            if(correct[count].equals(opt1.getText().toString())){
                opt1.setTextColor(Color.rgb(0,210,0));
            }
            else if(correct[count].equals(opt2.getText().toString())){
                opt2.setTextColor(Color.rgb(0,210,0));
            }
            else if(correct[count].equals(opt3.getText().toString())){
                opt3.setTextColor(Color.rgb(0,210,0));
            }
            else if(correct[count].equals(opt4.getText().toString())){
                opt4.setTextColor(Color.rgb(0,210,0));
            }
        }
        if(count==9){
            TextView Result = findViewById(R.id.result);
            Result.setVisibility(View.VISIBLE);
            String show1 = "Total Score: "+score,show2="Next Quiz";
            Result.setText(show1);
            button.setText(show2);
        }
    }

    public void assign(int index){
        textView.setText(questions[index]);
        if(coding[index].length()==0){
            horizontalScrollView.setVisibility(View.GONE);
        }
        else{
            horizontalScrollView.setVisibility(View.VISIBLE);
            if(index==1)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3}};
                array_keyword_color_2 = new int[][]{{24,29}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{15,17},{42,44}};
                array_function_name_color = new int[][]{{4,10}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{162,169}};
                array_keyword_color_1 = new int[][]{{0,3},{49,54},{65,68}};
                array_keyword_color_2 = new int[][]{{22,27}};
                array_self_color = new int[][]{{78,82},{105,109},{130,134}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{170,172}};
                array_function_name_color = new int[][]{{4,11}};
                array_comments = new int[][]{};
                int[][] array_special_function_color = {{69,77}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{{6,18},{26,33}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{0,5}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==4)
            {
                array_string_color = new int[][]{{36,40},{58,63}};
                array_keyword_color_1 = new int[][]{{9,15},{42,46}};
                array_keyword_color_2 = new int[][]{{30,35},{52,57}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{6,8},{20,21},{23,24}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{9,14}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{6,8},{19,20}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==6)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3}};
                array_keyword_color_2 = new int[][]{{29,34}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{48,49},{50,51},{52,53},{54,55}};
                array_function_name_color = new int[][]{{4,8}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{0,5},{6,9}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{10,12},{13,15}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{13,19}};
                array_keyword_color_2 = new int[][]{{30,35}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{20,22},{27,29}};
                array_function_name_color = new int[][]{{4,5}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==9)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{16,22},{38,41},{54,60}};
                array_keyword_color_2 = new int[][]{{29,34}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{70,71},{81,83}};
                array_function_name_color = new int[][]{{4,8},{42,46}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
        }
        opt1.setText(option1[index]);
        opt2.setText(option2[index]);
        opt3.setText(option3[index]);
        opt4.setText(option4[index]);
    }
}