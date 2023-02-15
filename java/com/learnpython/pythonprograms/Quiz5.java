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


public class Quiz5 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"A class is combination of ______ and ______.",
            "What will be output of the following code?",
            "Guess the output of the following code?",
            "Which of the following range statement return 1 to 10 numbers",
            "Which of the following statement is correct about recursion?",
            "Guess the output of the following code?",
            "Which of the following is correct type casting?",
            "Which data type the following function will return?",
            "A variable defined inside a function is called as",
            "A variable defined inside a class but outside the method is called as"
    };

    String[] coding={"",
            "string = \"Python\"\n" +
                    "for x in string:\n" +
                    "    print(x,end=\", \")",
            "x = True\n" +
                    "y = False\n" +
                    "if x or y:\n" +
                    "    print(\"Yes\")\n" +
                    "else:\n" +
                    "    print(\"No\")",
            "",
            "",
            "def hi():\n" +
                    "    print(\"Hi\")\n" +
                    "class Msg:\n" +
                    "    def __init__(self):\n" +
                    "        hi()\n" +
                    "obj = Msg()",
            "",
            "def fun(a,b):\n" +
                    "    return a>2*b",
            "",
            ""
    };

    String[] option1 = {"variables",
            "P, y, t, h, o, n, ",
            "Yes",
            "range(10)",
            "A function calling anther function",
            "hi",
            "int(45)",
            "int",
            "static variable",
            "static variable"
    };
    String[] option2 = {"methods",
            "P,y,t,h,o,n,",
            "No",
            "range(1,9)",
            "A function calling the method of class",
            "Hi",
            "str(45)",
            "float",
            "local variable",
            "class variable"
    };
    String[] option3 = {"Both A & B",
            "Python, Python, Python, Python, Python, Python, ",
            "Both A & B",
            "range(11)",
            "A function calling itself",
            "None",
            "bool(45)",
            "string",
            "class variable",
            "Both A & B"
    };
    String[] option4 = {"objects",
            "x, x, x, x, x, x, ",
            "Error",
            "range(1,11)",
            "Calling a function of another module",
            "Error",
            "All of the above",
            "boolean",
            "function variable",
            "None of the above"
    };
    String[] correct = {"Both A & B",
            "P, y, t, h, o, n, ",
            "Yes",
            "range(1,11)",
            "A function calling itself",
            "Hi",
            "All of the above",
            "boolean",
            "local variable",
            "Both A & B"
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
        setContentView(R.layout.activity_quiz5);

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
                Intent intent = new Intent(getApplicationContext(),Quiz6.class);
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
                array_string_color = new int[][]{{9,17},{51,55}};
                array_keyword_color_1 = new int[][]{{18,21},{24,26}};
                array_keyword_color_2 = new int[][]{{39,44}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{47,50}};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{40,45},{63,67}};
                array_keyword_color_1 = new int[][]{{4,8},{13,18},{19,21},{24,26},{47,51}};
                array_keyword_color_2 = new int[][]{{34,39},{57,62}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{{20,24}};
                array_keyword_color_1 = new int[][]{{0,3},{26,31},{41,44}};
                array_keyword_color_2 = new int[][]{{14,19}};
                array_self_color = new int[][]{{54,58}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{{4,6}};
                array_comments = new int[][]{};
                int[][] array_special_function_color = {{45,53}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{18,24}};
                array_keyword_color_2 = new int[][]{};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{27,28}};
                array_function_name_color = new int[][]{{4,7}};
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