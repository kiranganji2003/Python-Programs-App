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


public class Quiz15 extends AppCompatActivity {

    int score=0, count=0, current=0;
    RadioGroup radioGroup;
    RadioButton opt1,opt2,opt3,opt4,radioButton;
    TextView textView,codeView;
    HorizontalScrollView horizontalScrollView;
    Button button;

    String[] questions = {"Guess the output of the following code.",
            "Python doesn't support _____.",
            "We can declare method as _____.",
            "List is collection of _____ data types.",
            "Array is collection of _____ data types.",
            "What will be the output of the following code?",
            "Guess the output of the following code?",
            "Guess the output of the following code?",
            "What will be the output if the following code?",
            "What will be the output if the following code?"
    };

    String[] coding={"string = 'Hello \"World\"'\n" +
            "print(string)",
            "",
            "",
            "",
            "",
            "i = 0\n" +
                    "for j in range(10):\n" +
                    "    if 5%2!=0:\n" +
                    "      i += j%3\n" +
                    "      \n" +
                    "print(\"i =\",i)",
            "if 2<3:\n" +
                    "    print(\"Condition is true\")\n" +
                    "else:\n" +
                    "    print(\"Condition is false\")",
            "print(800//8/8)",
            "for x in range(-1):\n" +
                    "    print(\"Hello\")",
            "if 1>2:\n" +
                    "    print(\"Condition 1\")\n" +
                    "elif 1<-20:\n" +
                    "    print(\"Condition 2\")\n" +
                    "elif -1>=2:\n" +
                    "    print(\"Condition 3\")\n" +
                    "elif -1<=20:\n" +
                    "    print(\"Condition 4\")\n" +
                    "else:\n" +
                    "    print(\"Condition 5\")"
    };

    String[] option1 = {"Error",
            "Multiple inheritance",
            "public",
            "Similar",
            "Similar",
            "i = 7",
            "Condition is true",
            "12",
            "Error",
            "Condition 1"
    };
    String[] option2 = {"Hello \"World\"",
            "Multilevel inheritance",
            "protected",
            "Different",
            "Different",
            "i = 8",
            "Condition is false",
            "12.5",
            "Hello",
            "Condition 2"
    };
    String[] option3 = {"'Hello \"World\"'",
            "Hybrid inheritance",
            "private",
            "Similar or Different",
            "Similar or Different",
            "i = 9",
            "Error",
            "80",
            "\"Hello\"",
            "Condition 3"
    };
    String[] option4 = {"None of the above",
            "None of the above",
            "All of the above",
            "None of the above",
            "None of the above",
            "i = 10",
            "None",
            "80.8",
            "None",
            "Condition 4"
    };
    String[] correct = {"Hello \"World\"",
            "None of the above",
            "All of the above",
            "Similar or Different",
            "Similar",
            "i = 9",
            "Condition is true",
            "12.5",
            "None",
            "Condition 4"
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
        setContentView(R.layout.activity_quiz15);

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
                Intent intent = new Intent(getApplicationContext(),Quiz16.class);
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
                array_string_color = new int[][]{{9,24}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{25,30}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{{69,74}};
                array_keyword_color_1 = new int[][]{{6,9},{12,14},{30,32}};
                array_keyword_color_2 = new int[][]{{15,20},{63,68}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,5},{21,23},{33,34},{35,36},{38,39},{54,55}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==6)
            {
                array_string_color = new int[][]{{18,37},{55,75}};
                array_keyword_color_1 = new int[][]{{0,2},{39,43}};
                array_keyword_color_2 = new int[][]{{12,17},{49,54}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{3,4},{5,6}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{0,5}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{6,9},{11,12},{13,14}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{{30,37}};
                array_keyword_color_1 = new int[][]{{0,3},{6,8}};
                array_keyword_color_2 = new int[][]{{9,14},{24,29}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{16,17}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==9)
            {
                array_string_color = new int[][]{{18,31},{55,68},{92,105},{130,143},{161,174}};
                array_keyword_color_1 = new int[][]{{0,2},{33,37},{70,74},{107,111},{145,149}};
                array_keyword_color_2 = new int[][]{{12,17},{49,54},{86,91},{124,129},{155,160}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{3,4},{5,6},{38,39},{41,43},{76,77},{79,80},{113,114},{116,118}};
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