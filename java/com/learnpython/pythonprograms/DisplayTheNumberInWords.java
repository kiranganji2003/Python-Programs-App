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

public class DisplayTheNumberInWords extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_the_number_in_words);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Display 0 to 100 numbers in words";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "def display_digit(digit):\n" +
                "    if digit==0:\n" +
                "        print(\"Zero\",end=\"\")\n" +
                "    elif digit==1:\n" +
                "        print(\"One\",end=\"\")\n" +
                "    elif digit==2:\n" +
                "        print(\"Two\",end=\"\")\n" +
                "    elif digit==3:\n" +
                "        print(\"Three\",end=\"\")\n" +
                "    elif digit==4:\n" +
                "        print(\"Four\",end=\"\")\n" +
                "    elif digit==5:\n" +
                "        print(\"Five\",end=\"\")\n" +
                "    elif digit==6:\n" +
                "        print(\"Six\",end=\"\")\n" +
                "    elif digit==7:\n" +
                "        print(\"Seven\",end=\"\")\n" +
                "    elif digit==8:\n" +
                "        print(\"Eight\",end=\"\")\n" +
                "    elif digit==9:\n" +
                "        print(\"Nine\",end=\"\")\n" +
                "\n" +
                "\n" +
                "def display_tens(tens):\n" +
                "    if tens==10:\n" +
                "        print(\"Ten\",end=\"\")\n" +
                "    elif tens==20:\n" +
                "        print(\"Twenty\",end=\"\")\n" +
                "    elif tens==30:\n" +
                "        print(\"Thirty\",end=\"\")\n" +
                "    elif tens==40:\n" +
                "        print(\"Forty\",end=\"\")\n" +
                "    elif tens==50:\n" +
                "        print(\"Fifty\",end=\"\")\n" +
                "    elif tens==60:\n" +
                "        print(\"Sixty\",end=\"\")\n" +
                "    elif tens==70:\n" +
                "        print(\"Seventy\",end=\"\")\n" +
                "    elif tens==80:\n" +
                "        print(\"Eighty\",end=\"\")\n" +
                "    elif tens==90:\n" +
                "        print(\"Ninety\",end=\"\")\n" +
                "    elif tens==100:\n" +
                "        print(\"Hundred\",end=\"\")\n" +
                "\n" +
                "\n" +
                "number = int(input(\"Enter any number from 0 to 100 :- \"))\n" +
                "\n" +
                "if number<0 or number>100:\n" +
                "    print(\"Invalid\")\n" +
                "else:\n" +
                "    if number<=9 and number>=0:\n" +
                "        print(number,\":-\",end=\" \")\n" +
                "        display_digit(number)\n" +
                "    elif number%10==0:\n" +
                "        print(number,\":-\",end=\" \")\n" +
                "        display_tens(number)\n" +
                "    elif number==11:\n" +
                "        print(\"11 :- Eleven\")\n" +
                "    elif number==12:\n" +
                "        print(\"12 :- Twelve\")\n" +
                "    elif number==13:\n" +
                "        print(\"13 :- Thirteen\")\n" +
                "    elif number==14:\n" +
                "        print(\"14 :- Fourteen\")\n" +
                "    elif number==15:\n" +
                "        print(\"15 :- Fifteen\")\n" +
                "    elif number==16:\n" +
                "        print(\"16 :- Sixteen\")\n" +
                "    elif number==17:\n" +
                "        print(\"17 :- Seventeen\")\n" +
                "    elif number==18:\n" +
                "        print(\"18 :- Eighteen\")\n" +
                "    elif number==19:\n" +
                "        print(\"19 :- Nineteen\")\n" +
                "    else:\n" +
                "        i = 1\n" +
                "        print(number,\":-\",end=\" \")\n" +
                "        display_tens(number-number%10)\n" +
                "        print(end=\" \")\n" +
                "        display_digit(number%10)";

        int[][] array_string_color = {{57,63},{68,70},{105,110},{115,117},{152,157},{162,164},{199,206},{211,213},{248,254},{259,261},{296,302},{307,309},{344,349},{354,356},{391,398},{403,405},{440,447},{452,454},{489,495},{500,502},{561,566},{571,572},{608,616},{621,623},{658,666},{671,673},{708,715},{720,722},{757,764},{769,771},{806,813},{818,820},{855,864},{869,871},{906,914},{919,921},{956,964},{969,971},{1007,1016},{1021,1023},{1046,1082},{1123,1132},{1193,1197},{1202,1205},{1281,1285},{1290,1293},{1359,1373},{1410,1424},{1461,1477},{1514,1530},{1567,1582},{1619,1634},{1671,1688},{1725,1741},{1778,1794},{1841,1845},{1850,1853},{1912,1915}};
        int[][] array_keyword_color_1 = {{0,3},{30,32},{76,80},{123,127},{170,174},{219,223},{267,271},{315,319},{362,366},{411,415},{460,464},{506,509},{534,536},{579,583},{629,633},{679,683},{728,732},{777,781},{826,830},{877,881},{927,931},{977,981},{1086,1088},{1098,1100},{1134,1138},{1144,1146},{1157,1160},{1241,1245},{1328,1332},{1379,1383},{1430,1434},{1483,1487},{1536,1540},{1588,1592},{1640,1644},{1694,1698},{1747,1751},{1800,1804}};
        int[][] array_keyword_color_2 = {{51,56},{99,104},{146,151},{193,198},{242,247},{290,295},{338,343},{385,390},{434,439},{483,488},{555,560},{602,607},{652,657},{702,707},{751,756},{800,805},{849,854},{900,905},{950,955},{1001,1006},{1036,1039},{1040,1045},{1117,1122},{1180,1185},{1268,1273},{1353,1358},{1404,1409},{1455,1460},{1508,1513},{1561,1566},{1613,1618},{1665,1670},{1719,1724},{1772,1777},{1828,1833},{1902,1907}};
        int[][] array_self_color = {};
        int[][] array_end_color = {{64,67},{111,114},{158,161},{207,210},{255,258},{303,306},{350,353},{399,402},{448,451},{496,499},{567,570},{617,620},{667,670},{716,719},{765,768},{814,817},{865,868},{915,918},{965,968},{1017,1020},{1198,1201},{1286,1289},{1846,1849},{1908,1911}};
        int[][] array_number_color = {{40,41},{88,89},{135,136},{182,183},{231,232},{279,280},{327,328},{374,375},{423,424},{472,473},{543,545},{590,592},{640,642},{690,692},{739,741},{788,790},{837,839},{888,890},{938,940},{988,991},{1096,1097},{1108,1111},{1155,1156},{1169,1170},{1253,1255},{1257,1258},{1341,1343},{1392,1394},{1443,1445},{1496,1498},{1549,1551},{1601,1603},{1653,1655},{1707,1709},{1760,1762},{1818,1819},{1890,1892},{1946,1948}};
        int[][] array_function_name_color = {{4,17},{510,522}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter any number from 0 to 100 :- 78\n" +
                "78 :- Seventy Eight";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CountNumberOfRepeatedLettersInString.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ConvertTheBinaryNumberIntoDecimal.class);
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