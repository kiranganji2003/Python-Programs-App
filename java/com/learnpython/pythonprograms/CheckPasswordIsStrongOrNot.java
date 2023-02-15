package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class CheckPasswordIsStrongOrNot extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_password_is_strong_or_not);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Check password is strong or not";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "print(\"Characteristics of strong password\")\n" +
                "print(\"\\nAt least 8 characters.\")\n" +
                "print(\"Mixture of both uppercase and lowercase.\")\n" +
                "print(\"Mixture of both letters and numbers.\")\n" +
                "print(\"At least one special character. (@,#,$)\")\n" +
                "\n" +
                "password = input(\"Enter your password :- \")\n" +
                "\n" +
                "def check_password(password):\n" +
                "    criteria1,criteria2,criteria3,criteria4,criteria5 = 0,0,0,0,0\n" +
                "    if len(password)>=8:\n" +
                "        criteria1 = 1\n" +
                "    for i in password:\n" +
                "        if i.isupper():\n" +
                "            criteria2 = 1\n" +
                "        elif i.islower():\n" +
                "            criteria3 = 1\n" +
                "        elif i.isnumeric():\n" +
                "            criteria4 = 1\n" +
                "        elif i=='@' or i=='#' or i=='$':\n" +
                "            criteria5 = 1\n" +
                "\n" +
                "    if criteria1==1 and criteria2==1 and criteria3==1 and criteria4==1 and criteria5==1:\n" +
                "        print(\"\\nYour password is strong\")\n" +
                "    else:\n" +
                "        print(\"\\nYour password is weak\\n\")\n" +
                "        if criteria1==0:\n" +
                "            print(\"Password should be minimum 8 characters\")\n" +
                "        if criteria2==0:\n" +
                "            print(\"Password should contain at least 1 uppercase letter\")\n" +
                "        if criteria3==0:\n" +
                "            print(\"Password should contain at least 1 lowercase letter\")\n" +
                "        if criteria4==0:\n" +
                "            print(\"Password should contain at least 1 numeric value\")\n" +
                "        if criteria5==0:\n" +
                "            print(\"Password should contain at least 1 special symbol\")\n" +
                "\n" +
                "check_password(password)";
        int[][] array_string_color = {{6,42},{50,51},{53,76},{84,126},{134,172},{180,221},{241,266},{607,610},{617,620},{627,630},{762,763},{765,789},{815,816},{818,839},{841,842},{887,928},{973,1026},{1071,1124},{1169,1219},{1264,1315}};
        int[][] array_keyword_color_1 = {{51,53},{269,272},{369,372},{416,419},{422,424},{443,445},{493,497},{545,549},{599,603},{611,613},{621,623},{663,665},{679,682},{696,699},{713,716},{730,733},{763,765},{795,799},{816,818},{839,841},{852,854},{938,940},{1036,1037},{1134,1136},{1229,1231}};
        int[][] array_keyword_color_2 = {{0,5},{44,49},{78,83},{128,133},{174,179},{235,240},{372,375},{756,761},{809,814},{881,886},{967,972},{1065,1070},{1163,1168},{1258,1263}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{355,356},{357,358},{359,360},{361,362},{363,364},{387,388},{410,411},{483,484},{535,536},{589,590},{656,657},{677,678},{694,695},{711,712},{728,729},{745,746},{866,867},{952,953},{1050,1051},{1148,1149},{1243,1244}};
        int[][] array_function_name_color = {{273,287}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));
        output1 = "Characteristics of strong password\n" +
                "\n" +
                "At least 8 characters.\n" +
                "Mixture of both uppercase and lowercase.\n" +
                "Mixture of both letters and numbers.\n" +
                "At least one special character. (@,#,$)\n" +
                "Enter your password :- MyStrongPassword\n" +
                "\n" +
                "Your password is weak\n" +
                "\n" +
                "Password should contain at least 1 numeric value\n" +
                "Password should contain at least 1 special symbol";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RotateArray.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayPerfectSquareNumbersFromOneToN.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.share,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        if (item.getItemId() == R.id.share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python program");
            String shareMessage = "Program :- " + program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}