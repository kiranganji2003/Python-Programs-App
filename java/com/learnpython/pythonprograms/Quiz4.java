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


public class Quiz4 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"What wil be the output of the following code?",
            "What wil be the output of the following code?",
            "Which of the following is invalid identifier?",
            "What wil be the output of the following code?",
            "Which of the following statement creates list?",
            "Which method overloads the * operator?",
            "Which of the following operator cannot be overloaded?",
            "Which keyword is used to exit out of loop?",
            "What wil be the output of the following code?",
            "Which of the following is invalid variable name?"
    };

    String[] coding={"class Value:\n" +
            "     def __init__(self,value):\n" +
            "          self.value = value\n" +
            "\n" +
            "def fun():\n" +
            "     obj = Value(\"Object created\")\n" +
            "     return obj\n" +
            "\n" +
            "obj = fun()\n" +
            "print(obj.value)",
            "list = [2,4,6,8,10]\n" +
                    "nums = list[-3:-1]\n" +
                    "print(nums)",
            "",
            "def fun(var):\n" +
                    "     var[0] *= 10\n" +
                    "\n" +
                    "list = [10,20,30,40]\n" +
                    "fun(list)\n" +
                    "print(list[0])",
            "",
            "",
            "",
            "",
            "class Update:\n" +
                    "     def __init__(self,val):\n" +
                    "          self.val = val\n" +
                    "     def update(self,other):\n" +
                    "          other.val *= 2\n" +
                    "\n" +
                    "obj1 = Update(47)\n" +
                    "obj2 = Update(32)\n" +
                    "obj1.update(obj2)\n" +
                    "print(obj2.val)",
            ""
    };

    String[] option1 = {"Object created",
            "[6, 8]",
            "it",
            "10",
            "list = ()",
            "multiplication",
            "==",
            "break",
            "Error",
            "inheritance"
    };
    String[] option2 = {"Object not created",
            "[6, 8, 10]",
            "on",
            "100",
            "list = []",
            "__multiplication__",
            "!=",
            "continue",
            "32",
            "polymorphism"
    };
    String[] option3 = {"Error",
            "[8, 6, 4]",
            "of",
            "Error",
            "list = {}",
            "mul",
            "//",
            "pass",
            "94",
            "pass"
    };
    String[] option4 = {"None of the above",
            "Error",
            "in",
            "None of the above",
            "list = {[]}",
            "__mul__",
            "&&",
            "exit",
            "64",
            "variable"
    };
    String[] correct = {"Object created",
            "[6, 8]",
            "in",
            "100",
            "list = []",
            "__mul__",
            "&&",
            "break",
            "64",
            "pass"
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
        setContentView(R.layout.activity_quiz4);

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
                Intent intent = new Intent(getApplicationContext(),Quiz5.class);
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
                array_string_color = new int[][]{{102,118}};
                array_keyword_color_1 = new int[][]{{0,5},{18,21},{74,77},{125,131}};
                array_keyword_color_2 = new int[][]{{149,154}};
                array_self_color = new int[][]{{31,35},{54,58}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{{78,81}};
                array_comments = new int[][]{};
                int[][] array_special_function_color = {{22,30}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));
            }
            else if(index==1)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{39,44}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{10,11},{12,13},{14,15},{16,18},{33,34},{36,37}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3}};
                array_keyword_color_2 = new int[][]{{64,69}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{23,24},{29,31},{41,43},{44,46},{47,49},{50,52},{75,76}};
                array_function_name_color = new int[][]{{4,7}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,5},{19,22},{73,76}};
                array_keyword_color_2 = new int[][]{{177,182}};
                array_self_color = new int[][]{{32,36},{53,57},{84,88}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{120,121},{137,139},{155,157}};
                array_function_name_color = new int[][]{{77,83}};
                array_comments = new int[][]{};
                int[][] array_special_function_color = {{23,31}};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));
            }
        }
        opt1.setText(option1[index]);
        opt2.setText(option2[index]);
        opt3.setText(option3[index]);
        opt4.setText(option4[index]);
    }
}