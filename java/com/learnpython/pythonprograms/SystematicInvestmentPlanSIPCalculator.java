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

public class SystematicInvestmentPlanSIPCalculator extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systematic_investment_plan_sipcalculator);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Systematic Investment Plan (SIP) Calculator");
        actionBar.setDisplayHomeAsUpEnabled(true);



        program1 = "'''     SIP Formula: FV = P[(1+I)^N-1]*(1+I)/I\n" +
                "FV = Future value\n" +
                "P = Amount you invest through SIP\n" +
                "I = Compounded rate of return\n" +
                "N = investment duration in months\n" +
                "R = Rate of return\n" +
                "I = R/100/12     '''\n" +
                "\n" +
                "monthly_sip_amount = 0\n" +
                "sip_period = 0\n" +
                "compounded_return_rate = 0\n" +
                "\n" +
                "def Calculate():\n" +
                "    global monthly_sip_amount,sip_period,compounded_return_rate\n" +
                "    fv = eval(str(monthly_sip_amount*((1+compounded_return_rate)**(sip_period*12)-1)*(1+compounded_return_rate)/compounded_return_rate))\n" +
                "    total_amount = fv\n" +
                "    total_investment = monthly_sip_amount*sip_period*12\n" +
                "    total_interest = total_amount-total_investment\n" +
                "    print(\"\\nTotal Interest:\",int(total_interest))\n" +
                "    print(\"\\nTotal investment:\",int(total_investment))\n" +
                "    print(\"\\nTotal Amount:\",int(total_amount))\n" +
                "    print(\"\\nYear   Interest    Balance\")\n" +
                "    period = sip_period\n" +
                "    for i in range(1,period+1):\n" +
                "        sip_period = i\n" +
                "        fv = eval(str(monthly_sip_amount*((1+compounded_return_rate)**(sip_period*12)-1)*(1+compounded_return_rate)/compounded_return_rate))\n" +
                "        total_amount = fv\n" +
                "        total_investment = monthly_sip_amount*sip_period*12\n" +
                "        total_interest = total_amount-total_investment\n" +
                "        print(i,\"\\t\",int(total_interest),\"\\t\",int(total_amount))\n" +
                "\n" +
                "def main():\n" +
                "    global monthly_sip_amount,sip_period,compounded_return_rate\n" +
                "    monthly_sip_amount = int(input(\"Monthly SIP Amount: \"))\n" +
                "    sip_period = int(input(\"SIP Period(In Years): \"))\n" +
                "    return_rate = int(input(\"Expected Return Rate: \"))\n" +
                "    compounded_return_rate = return_rate/100/12\n" +
                "    if not (monthly_sip_amount<=0 or sip_period<=0 or return_rate<=0):\n" +
                "        Calculate()\n" +
                "    else:\n" +
                "        print(\"Invalid Data\")\n" +
                "\n" +
                "main()";

        int[][] array_string_color = {{627,628},{630,646},{678,679},{681,699},{733,734},{736,750},{780,781},{783,810},{1189,1190},{1192,1193},{1214,1215},{1217,1218},{1350,1372},{1402,1426},{1457,1481},{1647,1661}};
        int[][] array_keyword_color_1 = {{270,273},{291,297},{628,630},{679,681},{734,736},{781,783},{840,843},{846,848},{1190,1192},{1215,1217},{1239,1242},{1255,1261},{1536,1542},{1566,1568},{1583,1585},{1627,1631}};
        int[][] array_keyword_color_2 = {{360,364},{365,368},{621,626},{647,650},{672,677},{700,703},{727,732},{751,754},{774,779},{849,854},{904,908},{909,912},{1181,1186},{1194,1197},{1219,1222},{1340,1343},{1344,1349},{1392,1395},{1396,1401},{1447,1450},{1451,1456},{1641,1646}};
        int[][] array_self_color = {};
        int[][] array_end_color = {};
        int[][] array_number_color = {{225,226},{240,241},{267,268},{390,391},{429,431},{433,434},{437,438},{563,565},{855,856},{864,865},{934,935},{973,975},{977,978},{981,982},{1115,1117},{1525,1528},{1529,1531},{1564,1565},{1581,1582},{1599,1600}};
        int[][] array_function_name_color = {{274,283},{1243,1247}};
        int[][] array_comments = {{0,202}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Monthly SIP Amount: 100\n" +
                "SIP Period(In Years): 20\n" +
                "Expected Return Rate: 5\n" +
                "\n" +
                "Total Interest: 17274\n" +
                "\n" +
                "Total investment: 24000\n" +
                "\n" +
                "Total Amount: 41274\n" +
                "\n" +
                "Year   Interest    Balance\n" +
                "1 \t 33 \t 1233\n" +
                "2 \t 129 \t 2529\n" +
                "3 \t 291 \t 3891\n" +
                "4 \t 523 \t 5323\n" +
                "5 \t 828 \t 6828\n" +
                "6 \t 1211 \t 8411\n" +
                "7 \t 1674 \t 10074\n" +
                "8 \t 2223 \t 11823\n" +
                "9 \t 2861 \t 13661\n" +
                "10 \t 3592 \t 15592\n" +
                "11 \t 4423 \t 17623\n" +
                "12 \t 5358 \t 19758\n" +
                "13 \t 6402 \t 22002\n" +
                "14 \t 7560 \t 24360\n" +
                "15 \t 8840 \t 26840\n" +
                "16 \t 10246 \t 29446\n" +
                "17 \t 11786 \t 32186\n" +
                "18 \t 13465 \t 35065\n" +
                "19 \t 15292 \t 38092\n" +
                "20 \t 17274 \t 41274";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),GenerateRandomStrings.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RandomPasswordGenerator.class);
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
            String shareMessage = "Project :- Systematic Investment Plan (SIP) Calculator" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}