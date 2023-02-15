package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class GenerateRandomStrings extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_random_strings);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Generate Random Strings");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program1 = "from random import randint\n" +
                "\n" +
                "class RandomStrings:\n" +
                "    \n" +
                "    def __init__(self):\n" +
                "        print(\"GENERATE RANDOM STRINGS\\n\")\n" +
                "        self.length = int(input(\"Enter the length of string: \"))\n" +
                "        self.total = int(input(\"Enter total number of strings: \"))\n" +
                "        self.randomStrings = []\n" +
                "        self.asciiCodes = []\n" +
                "        self.generateAsciiCodes()\n" +
                "    \n" +
                "    def generateAsciiCodes(self):\n" +
                "        for i in range(self.total):\n" +
                "            asciiList = []\n" +
                "            for j in range(self.length):\n" +
                "                x = randint(97,122)     #generating random numbers from 97 to 122\n" +
                "                asciiList.append(x)\n" +
                "            self.asciiCodes.append(asciiList)\n" +
                "        self.generateStrings()\n" +
                "\n" +
                "    def generateStrings(self):\n" +
                "        for asciiList in self.asciiCodes:\n" +
                "            string = \"\"\n" +
                "            for ascii in asciiList:\n" +
                "                string += chr(ascii)    #converting the ASCII code into its corresponding character\n" +
                "            self.randomStrings.append(string)\n" +
                "\n" +
                "    def displayStrings(self):\n" +
                "        print(\"{} Random Strings of Length {}\\n\".format(self.total,self.length))\n" +
                "        count = 0\n" +
                "        for string in self.randomStrings:\n" +
                "            count += 1\n" +
                "            print(string,end=\"   \")\n" +
                "            if count%3==0:\n" +
                "                print()\n" +
                "\n" +
                "randomStrings = RandomStrings()\n" +
                "randomStrings.displayStrings()";

        int[][] array_string_color = {{92,116},{118,119},{153,183},{217,250},{781,783},{1011,1042},{1044,1045},{1190,1195}};
        int[][] array_keyword_color_1 = {{0,4},{12,18},{28,33},{58,61},{116,118},{357,360},{395,398},{401,403},{462,465},{468,470},{691,694},{726,729},{740,742},{796,799},{806,808},{971,974},{1042,1044},{1104,1107},{1115,1117},{1209,1211}};
        int[][] array_keyword_color_2 = {{86,91},{143,146},{147,152},{207,210},{211,216},{404,409},{471,476},{846,849},{1005,1010},{1173,1178},{1240,1245}};
        int[][] array_self_color = {{71,75},{129,133},{194,198},{261,265},{293,297},{322,326},{380,384},{410,414},{477,481},{621,625},{663,667},{711,715},{743,747},{932,936},{990,994},{1053,1057},{1064,1068},{1118,1122}};
        int[][] array_end_color = {{1186,1189}};
        int[][] array_number_color = {{519,521},{522,525},{1094,1095},{1159,1160},{1218,1219},{1221,1222}};
        int[][] array_function_name_color = {{361,379},{695,710},{975,989}};
        int[][] array_comments = {{531,572},{860,919}};
        int[][] array_special_function_color = {{62,70}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "GENERATE RANDOM STRINGS\n" +
                "\n" +
                "Enter the length of string: 8\n" +
                "Enter total number of strings: 50\n" +
                "50 Random Strings of Length 8\n" +
                "\n" +
                "laagvhay   pgykyuab   touaihan   \n" +
                "rhhcpcxg   oruxmkfw   ylsnjnvm   \n" +
                "dycmpxbr   pixtaatp   tvfohnam   \n" +
                "syqqdwlt   mpiaalzk   dlddctgn   \n" +
                "dytvobpp   irssalst   dfecomax   \n" +
                "diiepmck   ftmtscdz   ezdeskbd   \n" +
                "ulcnyxfw   bnioboka   irswmrnb   \n" +
                "fqhhqzxg   qpvtbjdl   isosseon   \n" +
                "cddsqykc   wpdqsfkl   zzddltnt   \n" +
                "okcuecue   ydrxrgjy   vvtrrtcc   \n" +
                "bnacznjp   qprqjpyj   ticjpstv   \n" +
                "ryicoqsl   vitolzba   jadqkykb   \n" +
                "nfmbfqiw   qybjhknl   dbdrveom   \n" +
                "agoahhfy   wtgdxvcs   nbrxetcc   \n" +
                "vwvuwbun   bygebjyr   cbaxrwqp   \n" +
                "gnehtejd   kmaapdoe   sqgnmvlv   \n" +
                "tohyjudw   psboigqc   ";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),NumberGuessingGame.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),SystematicInvestmentPlanSIPCalculator.class);
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
            String shareMessage = "Project :- Generate Random Strings" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}