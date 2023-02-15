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


public class Quiz7 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Which of the following statement call a function message?",
            "Guess the output of the following code.",
            "Guess the output of the following code.",
            "What will be the output of the following code?",
            "What will be the output of the following code?",
            "Which of the following statement is wrong?",
            "Guess the output of the following code.",
            "Guess the output of the following code.",
            "What will be the output of the following code?",
            "Which of the following method is used to overload + operator?"
    };

    String[] coding={"",
            "i = 1\n" +
                    "while i<5:\n" +
                    "    i += 1\n" +
                    "print(i)",
            "try:\n" +
                    "    print(12/0)\n" +
                    "except Exception:\n" +
                    "    print(\"Hello\")",
            "try:\n" +
                    "    print(\"Hi\",end=\" \")\n" +
                    "    a = 0/-7\n" +
                    "    print(\"Sir\")\n" +
                    "except Exception:\n" +
                    "    print(\"Mam\")",
            "count = 1\n" +
                    "for i in range(3):\n" +
                    "    count -= 7\n" +
                    "print(count)",
            "",
            "count = 1\n" +
                    "for i in range(3):\n" +
                    "    count += 10\n" +
                    "    count -= 2\n" +
                    "print(count)",
            "a = 7\n" +
                    "b = 8\n" +
                    "a,b = a+b,a\n" +
                    "print(a+b)",
            "def fun(a=10,b=15):\n" +
                    "    print(a>b)\n" +
                    "fun(b=10,a=15)",
            ""
    };

    String[] option1 = {"message()",
            "3",
            "0",
            "Error",
            "20",
            "var += 10",
            "24",
            "15",
            "False",
            "__Plus__()"
    };
    String[] option2 = {"message();",
            "4",
            "1",
            "Hi Sir",
            "21",
            "var //= 10",
            "25",
            "22",
            "True",
            "__Add__()"
    };
    String[] option3 = {"function message()",
            "5",
            "Hello",
            "Hi Mam",
            "-20",
            "var &&= 10",
            "26",
            "23",
            "Invalid syntax",
            "__plus__()"
    };
    String[] option4 = {"function message();",
            "6",
            "Error",
            "Hi ",
            "-21",
            "None of the above",
            "27",
            "Error",
            "None of the above",
            "__add__()"
    };
    String[] correct = {"message()",
            "5",
            "Hello",
            "Hi Sir",
            "-20",
            "var &&= 10",
            "25",
            "22",
            "True",
            "__add__()"
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
        setContentView(R.layout.activity_quiz7);

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
                Intent intent = new Intent(getApplicationContext(),Quiz8.class);
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
                array_keyword_color_1 = new int[][]{{6,11}};
                array_keyword_color_2 = new int[][]{{28,33}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,5},{14,15},{26,27}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{49,56}};
                array_keyword_color_1 = new int[][]{{0,3},{21,27}};
                array_keyword_color_2 = new int[][]{{9,14},{28,37},{43,48}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{15,17},{18,19}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{{15,19},{24,27},{52,57},{87,92}};
                array_keyword_color_1 = new int[][]{{0,3},{59,65}};
                array_keyword_color_2 = new int[][]{{9,14},{46,51},{66,75},{81,86}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{20,23}};
                array_number_color = new int[][]{{37,38},{40,41}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==4)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{10,13},{16,18}};
                array_keyword_color_2 = new int[][]{{19,24},{44,49}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{25,26},{42,43}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==6)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{10,13},{16,18}};
                array_keyword_color_2 = new int[][]{{19,24},{60,65}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{25,26},{42,44},{58,59}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{24,29}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,5},{10,11}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,3}};
                array_keyword_color_2 = new int[][]{{24,29}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{39,40},{44,45}};
                array_number_color = new int[][]{{10,12},{15,17},{41,43},{46,48}};
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