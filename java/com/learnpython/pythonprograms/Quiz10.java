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


public class Quiz10 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Which of the following statement will not display 123 as output?",
            "Which of the following statement will convert the float value into int?",
            "Guess the output of the following code?",
            "Guess the output of the following code?",
            "Which of the following is correct statement to declare set in python?",
            "What will be the output of the following code?",
            "How do you print the value of variable var from outside of class?",
            "What is the variable declared in the class table called?",
            "Choose the correct extension of python file?",
            "A python _______ is a file containing python definitions and statements."
    };

    String[] coding={"",
            "",
            "def call():\n" +
                    "    return 2+(-1)\n" +
                    "\n" +
                    "sum =  0\n" +
                    "\n" +
                    "for i in range(5):\n" +
                    "    sum += call()\n" +
                    "\n" +
                    "print(sum)",
            "p,q,r = 1,2,2\n" +
                    "\n" +
                    "if p!=q!=r:\n" +
                    "    print(\"if statement\")\n" +
                    "else:\n" +
                    "    print(\"else statement\")",
            "",
            "num = 0\n" +
                    "\n" +
                    "for i in range(5):\n" +
                    "    if i%2==1:\n" +
                    "        num -= 2\n" +
                    "    elif i%2!=1:\n" +
                    "        num += 1\n" +
                    "\n" +
                    "print(num)",
            "class Value:\n" +
                    "    var = \"Value\"",
            "class Table:\n" +
                    "    color = \"White\"",
            "",
            ""
    };

    String[] option1 = {"print(123)",
            "x = float(3.275)",
            "5",
            "if statement",
            "set = [1, 2, 3]",
            "1",
            "print(var)",
            "Local variable",
            ".python",
            "dictionary"
    };
    String[] option2 = {"print('123')",
            "x = (int) 3.275",
            "-5",
            "else statement",
            "set = (1, 2, 3)",
            "5",
            "print(Value.var)",
            "Static variable",
            ".pyt",
            "function"
    };
    String[] option3 = {"print(\"123\")",
            "x = int(3.275)",
            "15",
            "Error",
            "set = {1:2, 2:3, 3:4}",
            "-1",
            "print(Value.Value)",
            "Class variable",
            ".py",
            "class"
    };
    String[] option4 = {"None of the above",
            "None of the above",
            "Error",
            "None of the above",
            "set = {1, 2, 3}",
            "-5",
            "Error",
            "Both b & c",
            ".p",
            "module"
    };
    String[] correct = {"None of the above",
            "x = int(3.275)",
            "5",
            "else statement",
            "set = {1, 2, 3}",
            "-1",
            "print(Value.var)",
            "Both b & c",
            ".py",
            "module"
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
        setContentView(R.layout.activity_quiz10);

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
                Intent intent = new Intent(getApplicationContext(),Quiz11.class);
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
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3},{16,22},{41,44},{47,49}};
                array_keyword_color_2 = new int[][]{{50,55},{79,84}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{23,24},{27,28},{38,39},{56,57}};
                array_function_name_color = new int[][]{{4,8}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{{37,51},{69,85}};
                array_keyword_color_1 = new int[][]{{15,17},{53,57}};
                array_keyword_color_2 = new int[][]{{31,36},{63,68}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{10,11},{12,13}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{9,12},{15,17},{32,34},{64,68}};
                array_keyword_color_2 = new int[][]{{18,23},{95,100}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{6,7},{24,25},{37,38},{40,41},{58,59},{71,72},{74,75},{92,93}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==6)
            {
                array_string_color = new int[][]{{23,30}};
                array_keyword_color_1 = new int[][]{{0,5}};
                array_keyword_color_2 = new int[][]{};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{{25,32}};
                array_keyword_color_1 = new int[][]{{0,5}};
                array_keyword_color_2 = new int[][]{};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
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