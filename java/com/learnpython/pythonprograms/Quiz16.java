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

public class Quiz16 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Guess the output of the following code?",
            "Guess the output of the following code?",
            "What is the output of the following code?",
            "What is the output of the following code?",
            "What is the output of the following code?",
            "Which of the following data structure stores data in key-value pairs in python?",
            "Guess the output of the following code?",
            "In python, to define a block of code we use _____.",
            "Guess the output of the following code?",
            "Python supports _____."
    };

    String[] coding={"_A = 10\n" +
            "B_ = 100\n" +
            "print(_A/B_)",
            "value = str(100)\n" +
                    "print(type(value))",
            "string1 = \"Computer\"\n" +
                    "string2 = \"Computer\"\n" +
                    "\n" +
                    "if not string1!=string2:\n" +
                    "    print(\"Computer 1\")\n" +
                    "else:\n" +
                    "    print(\"Computer 2\")",
            "a = \"Python\"\n" +
                    "A = \"Programming\"\n" +
                    "print(a+A)",
            "x = 63987\n" +
                    "if 63987==x:\n" +
                    "    print(\"1. Condition is true\")\n" +
                    "elif x==63987:\n" +
                    "    print(\"2. Condition is true\")\n" +
                    "else:\n" +
                    "    print(\"3. Condition is true\")",
            "",
            "test = 100\n" +
                    "if test+=10 == 110:\n" +
                    "    print(test-=2*20)\n" +
                    "else:\n" +
                    "    print(test)",
            "",
            "list = [1,2,\"Hello\",4]\n" +
                    "print(len(list[2]))",
            ""
    };

    String[] option1 = {"0",
            "<class 'str'>",
            "Error",
            "Error",
            "Error",
            "Tuple",
            "70",
            "Brackets",
            "5",
            "Classes & Objects"
    };
    String[] option2 = {"0.1",
            "<class 'string'>",
            "Computer 1",
            "Python Programming",
            "3. Condition is true",
            "List",
            "90",
            "Keywords",
            "4",
            "Functions"
    };
    String[] option3 = {"10",
            "<class 'int'>",
            "Computer 2",
            "PythonProgramming",
            "2. Condition is true",
            "Dictionary",
            "110",
            "Indentation",
            "1",
            "Modules"
    };
    String[] option4 = {"Error",
            "None of the above",
            "None of the above",
            "\"PythonProgramming\"",
            "1. Condition is true",
            "Set",
            "Error",
            "All of the above",
            "2",
            "All of the above"
    };
    String[] correct = {"0.1",
            "<class 'str'>",
            "Computer 1",
            "PythonProgramming",
            "1. Condition is true",
            "Dictionary",
            "Error",
            "Indentation",
            "5",
            "All of the above"
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
        setContentView(R.layout.activity_quiz16);

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
                Intent intent = new Intent(getApplicationContext(),Quiz1.class);
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
                array_keyword_color_2 = new int[][]{{17,22}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{5,7},{13,16}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==1)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{8,11},{17,22},{23,27}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{12,15}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{10,20},{31,41},{78,90},{108,120}};
                array_keyword_color_1 = new int[][]{{43,49},{92,96}};
                array_keyword_color_2 = new int[][]{{72,77},{102,107}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{{4,12},{17,30}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{31,36}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==4)
            {
                array_string_color = new int[][]{{33,55},{82,104},{122,144}};
                array_keyword_color_1 = new int[][]{{10,12},{57,61},{106,110}};
                array_keyword_color_2 = new int[][]{{27,32},{76,81},{116,121}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,9},{13,18},{65,70}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==6)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{11,13},{53,57}};
                array_keyword_color_2 = new int[][]{{35,40},{63,68}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{7,10},{20,22},{26,29},{47,48},{49,51}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{{12,19}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{23,28},{29,32}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{8,9},{10,11},{20,21},{38,39}};
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