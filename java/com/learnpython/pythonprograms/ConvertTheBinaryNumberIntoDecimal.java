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

public class ConvertTheBinaryNumberIntoDecimal extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_the_binary_number_into_decimal);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Convert the binary number into decimal";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def check_is_binary(num):\n" +
                "    flag = True\n" +
                "    while num>0:\n" +
                "        rem = num%10\n" +
                "        if rem==1 or rem==0:\n" +
                "            pass\n" +
                "        else:\n" +
                "            flag = False\n" +
                "        num = num//10\n" +
                "        return flag\n" +
                "\n" +
                "\n" +
                "def convert_into_decimal(num):\n" +
                "    decimal = 0\n" +
                "    inc = 0\n" +
                "    while num>0:\n" +
                "        rem = num%10\n" +
                "        if inc==0:\n" +
                "            inc=1\n" +
                "        else:\n" +
                "            inc = inc*2\n" +
                "\n" +
                "        if rem==1:\n" +
                "            decimal += inc\n" +
                "        num = num//10\n" +
                "    print(\"\\nDecimal number :-\",decimal)\n" +
                "    \n" +
                "\n" +
                "\n" +
                "\n" +
                "binary = int(input(\"Enter the binary number :- \"))\n" +
                "\n" +
                "if binary==0:\n" +
                "    print(\"\\nDecimal number :- 0\")\n" +
                "elif binary<0:\n" +
                "    print(\"\\nInvalid binary number\")\n" +
                "else:\n" +
                "    if check_is_binary(binary):\n" +
                "        convert_into_decimal(binary)\n" +
                "    else:\n" +
                "        print(\"\\nInvalid binary number\")";

        int[][] array_string_color = {{460,461},{463,481},{518,547},{575,576},{578,598},{625,626},{628,650},{751,752},{754,776}};
        int[][] array_keyword_color_1 = {{0,3},{37,41},{46,51},{88,90},{98,100},{121,125},{134,138},{159,164},{195,201},{209,212},{272,277},{314,316},{351,355},{390,392},{461,463},{551,553},{576,578},{600,604},{626,628},{652,656},{662,664},{731,735},{752,754}};
        int[][] array_keyword_color_2 = {{454,459},{508,511},{512,517},{569,574},{619,624},{745,750}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{56,57},{77,79},{96,97},{106,107},{184,186},{254,255},{266,267},{282,283},{303,305},{322,323},{341,342},{379,380},{398,399},{447,449},{562,563},{612,613}};
        int[][] array_function_name_color = {{4,19},{213,233}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the binary number :- 11010\n" +
                "\n" +
                "Decimal number :- 26";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayTheNumberInWords.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayTheMonthAndNumberOfDays.class);
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