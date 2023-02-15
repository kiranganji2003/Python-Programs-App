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

public class Quiz3 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Guess the output of the following code.",
            "Choose the correct statement to access the value 4 from dictionary.",
            "A _________ is block of code and we can call it multiple times.",
            "What will be the output of the following code?",
            "How many functions we can define in module?",
            "A variable name cannot starts with",
            "What is the answer of these expression in python? 5*6/10",
            "How to access the static variable?",
            "Which of the following statement is true?",
            "What will be the output of the following code?"
    };

    String[] coding={"list = [1,2,3,[10,20,30],40]\n" +
            "x = len(list)\n" +
            "print(x)",
            "dict = { 1:1,\n" +
                    "         2:2,\n" +
                    "         \"list\":[1,2,[3,4]] }",
            "",
            "a = 10\n" +
                    "b = 20\n" +
                    "a,b = b,a\n" +
                    "if a>b:\n" +
                    "     print(b)\n" +
                    "else:\n" +
                    "     print(a)",
            "",
            "",
            "",
            "",
            "",
            "class A:\n" +
                    "     def __init__(self):\n" +
                    "          return\n" +
                    "          print(\"Hello\")\n" +
                    "     \n" +
                    "obj=A()"
    };

    String[] option1 = {"7",
            "dict[2][2][1]",
            "program",
            "10",
            "25",
            "letters",
            "3.0",
            "Using class object",
            "We have limit to create the number of objets of class",
            "Hello"
    };
    String[] option2 = {"5",
            "dict[3][3][2]",
            "inheritance",
            "20",
            "50",
            "underscore",
            "3",
            "using variable name",
            "A class cannot have public variables",
            "object created"
    };
    String[] option3 = {"4",
            "dict[\"list\"][2][1]",
            "class",
            "Error",
            "100",
            "digit",
            "30.0",
            "using class name",
            "A static variable of class is common for all objects",
            "None"
    };
    String[] option4 = {"None of the above",
            "dict[\"list\"][3][2]",
            "function",
            "None of the above",
            "None of the above",
            "None of the above",
            "30",
            "None of the above",
            "A private variable of class is common to all objects",
            "Error"
    };
    String[] correct = {"5",
            "dict[\"list\"][2][1]",
            "function",
            "10",
            "None of the above",
            "digit",
            "3.0",
            "using class name",
            "A static variable of class is common for all objects",
            "None"
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
        setContentView(R.layout.activity_quiz3);

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
                Intent intent = new Intent(getApplicationContext(),Quiz4.class);
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
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{33,36},{43,48}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{10,11},{12,13},{15,17},{18,20},{21,23},{25,27}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==1)
            {
                array_string_color = new int[][]{{37,43}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{9,10},{11,12},{23,24},{25,26},{45,46},{47,48},{50,51},{52,53}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{24,26},{46,50}};
                array_keyword_color_2 = new int[][]{{37,42},{57,62}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,6},{11,13}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==9)
            {
                array_string_color = new int[][]{{67,74}};
                array_keyword_color_1 = new int[][]{{0,5},{14,17},{44,50}};
                array_keyword_color_2 = new int[][]{{61,66}};
                array_self_color = new int[][]{{27,31}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                int[][] array_special_function_color = {{18,26}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));
            }
        }
        opt1.setText(option1[index]);
        opt2.setText(option2[index]);
        opt3.setText(option3[index]);
        opt4.setText(option4[index]);
    }
}