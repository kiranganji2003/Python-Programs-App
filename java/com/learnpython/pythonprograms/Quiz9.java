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


public class Quiz9 extends AppCompatActivity {

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
            "Which of the following inheritance type python doesn't support?",
            "Guess the output of the following code?",
            "Which of the following is not keyword in python?",
            "Guess the output of the following code?",
            "How many times variable a will be printed?",
            "What will be the output of the following code?"
    };

    String[] coding={"string = \"Hello\"\n" +
            "print(string[-4:])",
            "j = 10\n" +
                    "\n" +
                    "for j in range(15):\n" +
                    "    j = j*2\n" +
                    "    \n" +
                    "print(j)",
            "str = \"abcde\"\n" +
                    "\n" +
                    "for i in range(-1,-5,-3):\n" +
                    "    print(str[i].upper(),end=\", \")",
            "i = 1\n" +
                    "\n" +
                    "while i<10:\n" +
                    "    i *= 2\n" +
                    "\n" +
                    "print(i)",
            "",
            "class A:\n" +
                    "    def a(self):\n" +
                    "        print(\"class A\")\n" +
                    "\n" +
                    "class B(A):\n" +
                    "    def a(self):\n" +
                    "        print(\"class B\")\n" +
                    "\n" +
                    "obj = B()\n" +
                    "obj.a()",
            "",
            "class N:\n" +
                    "    n = 10\n" +
                    "\n" +
                    "obj1 = N()\n" +
                    "obj2 = N()\n" +
                    "obj1.n = 100\n" +
                    "obj2.n = 1000\n" +
                    "print(N.n)",
            "a = 0.03\n" +
                    "b = 0.033\n" +
                    "\n" +
                    "while a<b:\n" +
                    "    print(a)\n" +
                    "    a += 0.001",
            "a = -(-5)-(-2)\n" +
                    "print(a)"
    };

    String[] option1 = {"ello",
            "15",
            "Error",
            "16",
            "Single inheritance",
            "class A",
            "for",
            "10",
            "None",
            "-3"
    };
    String[] option2 = {"eH",
            "20",
            "A, D, ",
            "18",
            "Multilevel inheritance",
            "class B",
            "while",
            "100",
            "2",
            "3"
    };
    String[] option3 = {"Hello",
            "28",
            "B, E, ",
            "20",
            "Multiple inheritance",
            "Error",
            "pass",
            "1000",
            "3",
            "-7"
    };
    String[] option4 = {"None of the above",
            "30",
            "E, B, ",
            "Error",
            "None of the above",
            "None of the above",
            "fail",
            "Error",
            "4",
            "7"
    };
    String[] correct = {"ello",
            "28",
            "E, B, ",
            "16",
            "None of the above",
            "class B",
            "fail",
            "10",
            "3",
            "7"
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
        setContentView(R.layout.activity_quiz9);

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
                Intent intent = new Intent(getApplicationContext(),Quiz10.class);
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
                array_string_color = new int[][]{{9,16}};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{17,22}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{31,32}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==1)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{8,11},{14,16}};
                array_keyword_color_2 = new int[][]{{17,22},{45,50}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,6},{23,25},{38,39}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==2)
            {
                array_string_color = new int[][]{{6,13},{70,74}};
                array_keyword_color_1 = new int[][]{{15,18},{21,23}};
                array_keyword_color_2 = new int[][]{{24,29},{45,50}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{{66,69}};
                array_number_color = new int[][]{{31,32},{34,35},{37,38}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==3)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{7,12}};
                array_keyword_color_2 = new int[][]{{31,36}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,5},{15,17},{28,29}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==5)
            {
                array_string_color = new int[][]{{40,49},{95,104}};
                array_keyword_color_1 = new int[][]{{0,5},{13,16},{52,57},{68,71}};
                array_keyword_color_2 = new int[][]{{34,39},{89,94}};
                array_self_color = new int[][]{{19,23},{74,78}};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{};
                array_function_name_color = new int[][]{{17,18},{72,73}};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==7)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{0,5}};
                array_keyword_color_2 = new int[][]{{70,75}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{17,19},{52,55},{65,69}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==8)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{{20,25}};
                array_keyword_color_2 = new int[][]{{35,40}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{4,8},{13,18},{53,58}};
                array_function_name_color = new int[][]{};
                array_comments = new int[][]{};
                codeView.setText(ColouredProgramText.execute(new SpannableString(coding[index]),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
            }
            else if(index==9)
            {
                array_string_color = new int[][]{};
                array_keyword_color_1 = new int[][]{};
                array_keyword_color_2 = new int[][]{{15,20}};
                array_self_color = new int[][]{};
                array_end_color = new int[][]{};
                array_number_color = new int[][]{{7,8},{12,13}};
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