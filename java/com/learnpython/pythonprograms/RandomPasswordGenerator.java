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

public class RandomPasswordGenerator extends AppCompatActivity {

    String program1,program2,program3;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_password_generator);

        int[][] array_string_color;
        int[][] array_keyword_color_1;
        int[][] array_keyword_color_2;
        int[][] array_self_color;
        int[][] array_end_color;
        int[][] array_number_color;
        int[][] array_function_name_color;
        int[][] array_comments;

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Random password generator");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "from random import random\n" +
                "\n" +
                "def getPasswordLength():\n" +
                "    length = 0\n" +
                "    flag = 0\n" +
                "    while True:\n" +
                "        length = int(random()*16)\n" +
                "\n" +
                "        if length<=15 and length>=8:\n" +
                "            flag = 1\n" +
                "\n" +
                "        if flag==1:\n" +
                "            break\n" +
                "        \n" +
                "    return length";

        array_string_color = new int[][]{};
        array_keyword_color_1 = new int[][]{{0,4},{12,18},{27,30},{84,94},{139,141},{153,156},{198,200},{222,227},{241,247}};
        array_keyword_color_2 = new int[][]{{113,116}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{65,66},{78,79},{126,128},{150,152},{165,166},{187,188},{207,208}};
        array_function_name_color = new int[][]{{31,48}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "from random import random \n" +
                "\n" +
                "def generatePassword(length):\n" +
                "    count = 0\n" +
                "    password = \"\"\n" +
                "    while count<length:\n" +
                "        num = int(random()*123)\n" +
                "\n" +
                "        if num<=57 and num>=48:\n" +
                "            char = chr(num)\n" +
                "            password += char\n" +
                "            count += 1\n" +
                "        elif num<=90 and num>=65:\n" +
                "            char = chr(num)\n" +
                "            password += char\n" +
                "            count += 1\n" +
                "        elif num<=122 and num>=97:\n" +
                "            char = chr(num)\n" +
                "            password += char\n" +
                "            count += 1\n" +
                "            \n" +
                "    return password";

        array_string_color = new int[][]{{87,89}};
        array_keyword_color_1 = new int[][]{{0,4},{12,18},{28,31},{94,99},{155,157},{166,169},{267,271},{280,283},{381,385},{395,398},{505,511}};
        array_keyword_color_2 = new int[][]{{128,131},{198,201},{312,315},{427,430}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{70,71},{141,144},{163,165},{175,177},{257,258},{277,279},{289,291},{371,372},{391,394},{404,406},{486,487}};
        array_function_name_color = new int[][]{{32,48}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "from Length import getPasswordLength\n" +
                "from Password import generatePassword\n" +
                "\n" +
                "def main():\n" +
                "    length = getPasswordLength()\n" +
                "    password = generatePassword(length)\n" +
                "    print(\"Random Password:\",password)\n" +
                "\n" +
                "try:\n" +
                "    main()\n" +
                "except Exception:\n" +
                "    print(\"Exception occurs\")";

        array_string_color = new int[][]{{171,189},{245,263}};
        array_keyword_color_1 = new int[][]{{0,4},{12,18},{37,41},{51,57},{76,79},{201,204},{217,223}};
        array_keyword_color_2 = new int[][]{{165,170},{224,233},{239,244}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{80,84}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Random Password: wlJy38AmC";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SystematicInvestmentPlanSIPCalculator.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CustomerDataRecordSystem.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python Project");
            String shareMessage = "Project :- Random password generator" +
                    "\n\n\nLength.py \n\n" + program1 +
                    "\n\n\nPassword.py \n\n" + program2 +
                    "\n\n\nMain.py \n\n" + program3 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}