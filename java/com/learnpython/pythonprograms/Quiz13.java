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


public class Quiz13 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Which of the following is not a access modifier in python?",
            "_____ variables can be accessed from anywhere in program",
            "Guess the inheritance type of the following inheritance.",
            "Which of the following keyword is used to skip the iteration in loop?",
            "How many times following while loop will execute in the program?",
            "Guess the output of the following code.",
            "How to call the base class constructor from derived class?",
            "What will be the output of the following code?",
            "What will be the output of the following code?",
            "Python _____ is a collection of similar data types."
    };

    String[] coding={"",
            "",
            "class A:\n" +
                    "    def __init__(self):\n" +
                    "        print(\"class A\")\n" +
                    "\n" +
                    "class B:\n" +
                    "    def __init__(self):\n" +
                    "        print(\"class B\")\n" +
                    "\n" +
                    "class C(A,B):\n" +
                    "    def __init__(self):\n" +
                    "        print(\"class C\")",
            "",
            "x = 10\n" +
                    "\n" +
                    "while x<(x+10):\n" +
                    "    x = x+1",
            "def sum_diff(a,b):\n" +
                    "    return a+b,a-b\n" +
                    "\n" +
                    "print(sum_diff(10,20))",
            "",
            "for j in range(5):\n" +
                    "    print(j+1,end=\" \")",
            "from numpy import arange\n" +
                    "\n" +
                    "numbers = arange(10)\n" +
                    "\n" +
                    "print(numbers)",
            ""
    };

    String[] option1 = {"private",
            "protected",
            "Single inheritance",
            "pass",
            "1",
            "Error",
            "super().__init__()",
            "0 1 2 3 4 5",
            "[0 1 2 3 4 5 6 7 8 9]",
            "class"
    };
    String[] option2 = {"personal",
            "private",
            "Multilevel inheritance",
            "break",
            "10",
            "30 -10",
            "base().__init__()",
            "1 2 3 4 5 ",
            "[1 2 3 4 5 6 7 8 9 10]",
            "function"
    };
    String[] option3 = {"public",
            "local",
            "Multiple inheritance",
            "continue",
            "100",
            "30, -10",
            "super.__init__()",
            "2 3 4 5 6",
            "(0 1 2 3 4 5 6 7 8 9)",
            "list"
    };
    String[] option4 = {"protected",
            "public",
            "Hybrid inheritance",
            "skip",
            "Infinite",
            "(30, -10)",
            "base.__init__()",
            "6 6 6 6 6",
            "(1 2 3 4 5 6 7 8 9 10)",
            "array"
    };
    String[] correct = {"personal",
            "public",
            "Multiple inheritance",
            "continue",
            "Infinite",
            "(30, -10)",
            "super().__init__()",
            "1 2 3 4 5 ",
            "[0 1 2 3 4 5 6 7 8 9]",
            "array"
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
        setContentView(R.layout.activity_quiz13);

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
                Intent intent = new Intent(getApplicationContext(),Quiz14.class);
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
            if(index==2)
            {
                array_string_color = new int[][]{{47,56},{106,115},{170,179}};
                array_keyword_color_1 = new int[][]{{0,5},{13,16},{59,64},{72,75},{118,123},{136,139}};
                array_keyword_color_2 = new int[][]{{41,46},{100,105},{164,169}};
                array_self_color = new int[][]{{26,30},{85,89},{149,153}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                int[][] array_special_special_function_color = {{17,25},{76,84},{140,148}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_special_function_color));
            }
            else if(index==4)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{8,13}};
                array_keyword_color_2 = new int[][]{};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,6},{19,21},{34,35}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{23,29}};
                array_keyword_color_2 = new int[][]{{39,44}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{54,56},{57,59}};
                array_function_name_color = new int[][]{{4,12}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{{37,40}};
                array_keyword_color_1 = new int[][]{{0,3},{6,8}};
                array_keyword_color_2 = new int[][]{{9,14},{23,28}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{33,36}};
                array_number_color = new int[][]{{15,16},{31,32}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,4},{11,17}};
                array_keyword_color_2 = new int[][]{{48,53}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{43,45}};
                array_function_name_color = new int[][]{};
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