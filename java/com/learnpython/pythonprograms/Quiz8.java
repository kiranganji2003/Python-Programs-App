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

public class Quiz8 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Guess the output of the following code?",
            "What will be the output of the following code?",
            "What will be the output of the following code?",
            "Guess the output of the following code?",
            "Guess the output of the following code?",
            "Variables declared inside function are called as _____.",
            "How many classes we can define in module?",
            "What will be the output of the following code?",
            "What will be the output of the following code?",
            "The lambda expression is a _____."
    };

    String[] coding={"for i in range(1,-1,-2):\n" +
            "    print(i,end=\" \")",
            "x = \"12\"\n" +
                    "print(x.isnumeric())",
            "while True:\n" +
                    "    if True!=False:\n" +
                    "        print(\"True\")\n" +
                    "    else:\n" +
                    "        print(\"False\")\n" +
                    "    break",
            "false = True\n" +
                    "if false is True:\n" +
                    "    print(\"Abc\")\n" +
                    "else:\n" +
                    "    print(\"Xyz\")",
            "def sq(n):\n" +
                    "    return 1-n*n\n" +
                    "\n" +
                    "print(1+sq(100))",
            "",
            "",
            "class A:\n" +
                    "    a = 10\n" +
                    "    def m():\n" +
                    "        a = 11\n" +
                    "\n" +
                    "A.a = 12\n" +
                    "obj = A()\n" +
                    "print(A.a)",
            "p = 9999\n" +
                    "q = 9999\n" +
                    "if p>q:\n" +
                    "    print(\"if\")\n" +
                    "elif q>p:\n" +
                    "    print(\"elif\")",
            ""
    };

    String[] option1 = {"1",
            "False",
            "False",
            "Abc",
            "9999",
            "static variable",
            "Zero",
            "10",
            "if",
            "class"
    };
    String[] option2 = {"1 0",
            "True",
            "True",
            "Xyz",
            "9998",
            "function variable",
            "One",
            "11",
            "elif",
            "variable"
    };
    String[] option3 = {"1 0 -1",
            "Error",
            "Error",
            "None",
            "-9999",
            "local variable",
            "More than one",
            "12",
            "None",
            "operator"
    };
    String[] option4 = {"1 0 -1 -2",
            "None of the above",
            "Infinite loop",
            "Error",
            "-9998",
            "global variable",
            "None of the above",
            "Error",
            "None of the above",
            "function"
    };
    String[] correct = {"1",
            "True",
            "True",
            "Abc",
            "-9998",
            "local variable",
            "None of the above",
            "12",
            "None",
            "function"
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
        setContentView(R.layout.activity_quiz8);

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
                Intent intent = new Intent(getApplicationContext(),Quiz9.class);
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
            if(index==0)
            {
                array_string_color = new int[][]{{41,44}};
                array_keyword_color_1 = new int[][]{{0,3},{6,8}};
                array_keyword_color_2 = new int[][]{{9,14},{29,34}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{37,40}};
                array_number_color = new int[][]{{15,16},{18,19},{21,22}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==1)
            {
                array_string_color = new int[][]{{4,8}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{9,14}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{46,52},{78,85}};
                array_keyword_color_1 = new int[][]{{0,10},{16,23},{25,30},{58,62},{91,96}};
                array_keyword_color_2 = new int[][]{{40,45},{72,77}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{{41,46},{64,69}};
                array_keyword_color_1 = new int[][]{{8,12},{13,15},{22,29},{48,52}};
                array_keyword_color_2 = new int[][]{{35,40},{58,63}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==4)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{15,21}};
                array_keyword_color_2 = new int[][]{{29,34}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{22,23},{35,36},{40,43}};
                array_function_name_color = new int[][]{{4,6}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,5},{24,27}};
                array_keyword_color_2 = new int[][]{{68,73}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{17,19},{45,47},{55,57}};
                array_function_name_color = new int[][]{{28,29}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{{36,40},{62,68}};
                array_keyword_color_1 = new int[][]{{18,20},{42,46}};
                array_keyword_color_2 = new int[][]{{30,35},{56,61}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,8},{13,17}};
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