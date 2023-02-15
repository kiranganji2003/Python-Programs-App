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

public class AlgebricFormulasCalculator extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebric_formulas_calculator);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Algebra Formulas Calculator");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "formula1 = lambda a,b:(a+b)*(a-b)\n" +
                "formula2 = lambda a,b:a*a+2*a*b+b*b\n" +
                "formula3 = lambda a,b:(a-b)**2+2*a*b\n" +
                "formula4 = lambda a,b:a*a-2*a*b+b*b\n" +
                "formula5 = lambda a,b,c:a*a+b*b+c*c+2*a*b+2*a*c+2*b*c\n" +
                "formula6 = lambda a,b,c:a*a+b*b+c*c-2*a*b-2*a*c+2*b*c\n" +
                "\n" +
                "class Algebra:\n" +
                "    \n" +
                "\n" +
                "\n" +
                "    def main(self):\n" +
                "        print(\"ALGEBRA FORMULAS CALCULATOR\")\n" +
                "        while 1:\n" +
                "            print(\"\\n1. (a^2)-(b^2) = (a+b)(a-b)\")\n" +
                "            print(\"2. (a+b)^2 = a^2+2ab+b^2\")\n" +
                "            print(\"3. (a^2)+(b^2) = (a-b)^2+2ab\")\n" +
                "            print(\"4. (a-b)^2 = a^2-2ab+b^2\")\n" +
                "            print(\"5. (a+b+c)^2 = a^2+b^2+c^2+2ab+2ac+2bc\")\n" +
                "            print(\"6. (a-b-c)^2 = a^2+b^2+c^2-2ab-2ac+2bc\")\n" +
                "            print(\"7. Exit\\n\")\n" +
                "            choice = int(input(\"Choose your choice :- \"))\n" +
                "            if choice<=0 or choice>=8:\n" +
                "                print(\"\\nInvalid choice\")\n" +
                "            elif choice<=4 and choice>=1:\n" +
                "                a = int(input(\"Enter value of a :- \"))\n" +
                "                b = int(input(\"Enter value of b :- \"))\n" +
                "                if choice==1:\n" +
                "                    print(\"Answer :- \",formula1(a,b))\n" +
                "                elif choice==2:\n" +
                "                    print(\"Answer :- \",formula2(a,b))\n" +
                "                elif choice==3:\n" +
                "                    print(\"Answer :- \",formula3(a,b))\n" +
                "                elif choice==4:\n" +
                "                    print(\"Answer :- \",formula4(a,b))\n" +
                "            elif choice<=6 and choice>=5:\n" +
                "                a = int(input(\"Enter value of a :- \"))\n" +
                "                b = int(input(\"Enter value of b :- \"))\n" +
                "                c = int(input(\"Enter value of c :- \"))\n" +
                "                if choice==5:\n" +
                "                    print(\"Answer :- \",formula5(a,b,c))\n" +
                "                elif choice==6:\n" +
                "                    print(\"Answer :- \",formula6(a,b,c))\n" +
                "            elif choice==7:\n" +
                "                break\n" +
                "\n" +
                "\n" +
                "obj = Algebra()\n" +
                "obj.main()";

        int[][] array_string_color = {{308,337},{374,375},{377,405},{425,451},{471,501},{521,547},{567,607},{627,667},{687,695},{697,698},{731,755},{819,820},{822,837},{911,933},{966,988},{1047,1059},{1133,1145},{1219,1231},{1305,1317},{1405,1427},{1460,1482},{1515,1537},{1596,1608},{1684,1696}};
        int[][] array_keyword_color_1 = {{11,17},{45,51},{81,87},{118,124},{154,160},{208,214},{252,257},{278,281},{347,352},{375,377},{695,697},{770,772},{783,785},{820,822},{851,855},{866,869},{1007,1009},{1091,1095},{1177,1181},{1263,1267},{1345,1349},{1360,1363},{1556,1558},{1642,1646},{1726,1730},{1758,1763}};
        int[][] array_keyword_color_2 = {{302,307},{368,373},{419,424},{465,470},{515,520},{561,566},{621,626},{681,686},{721,724},{725,730},{813,818},{901,904},{905,910},{956,959},{960,965},{1041,1046},{1127,1132},{1213,1218},{1299,1304},{1395,1398},{1399,1404},{1450,1453},{1454,1459},{1505,1508},{1509,1514},{1590,1595},{1678,1683}};
        int[][] array_self_color = {{287,291}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{60,61},{99,100},{101,102},{133,134},{179,180},{185,186},{191,192},{233,234},{239,240},{245,246},{353,354},{781,782},{794,795},{864,865},{878,879},{1018,1019},{1104,1105},{1190,1191},{1276,1277},{1358,1359},{1372,1373},{1567,1568},{1655,1656},{1739,1740}};
        int[][] array_function_name_color = {{282,286}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "ALGEBRA FORMULAS CALCULATOR\n" +
                "\n" +
                "1. (a^2)-(b^2) = (a+b)(a-b)\n" +
                "2. (a+b)^2 = a^2+2ab+b^2\n" +
                "3. (a^2)+(b^2) = (a-b)^2+2ab\n" +
                "4. (a-b)^2 = a^2-2ab+b^2\n" +
                "5. (a+b+c)^2 = a^2+b^2+c^2+2ab+2ac+2bc\n" +
                "6. (a-b-c)^2 = a^2+b^2+c^2-2ab-2ac+2bc\n" +
                "7. Exit\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "Enter value of a :- 3\n" +
                "Enter value of b :- 5\n" +
                "Answer :-  64\n" +
                "\n" +
                "1. (a^2)-(b^2) = (a+b)(a-b)\n" +
                "2. (a+b)^2 = a^2+2ab+b^2\n" +
                "3. (a^2)+(b^2) = (a-b)^2+2ab\n" +
                "4. (a-b)^2 = a^2-2ab+b^2\n" +
                "5. (a+b+c)^2 = a^2+b^2+c^2+2ab+2ac+2bc\n" +
                "6. (a-b-c)^2 = a^2+b^2+c^2-2ab-2ac+2bc\n" +
                "7. Exit\n" +
                "\n" +
                "Choose your choice :- 6\n" +
                "Enter value of a :- 3\n" +
                "Enter value of b :- 4\n" +
                "Enter value of c :- 5\n" +
                "Answer :-  36\n" +
                "\n" +
                "1. (a^2)-(b^2) = (a+b)(a-b)\n" +
                "2. (a+b)^2 = a^2+2ab+b^2\n" +
                "3. (a^2)+(b^2) = (a-b)^2+2ab\n" +
                "4. (a-b)^2 = a^2-2ab+b^2\n" +
                "5. (a+b+c)^2 = a^2+b^2+c^2+2ab+2ac+2bc\n" +
                "6. (a-b-c)^2 = a^2+b^2+c^2-2ab-2ac+2bc\n" +
                "7. Exit\n" +
                "\n" +
                "Choose your choice :- 7";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),DisplayingDataInTabularFormat.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ShoppingProductsCalculator.class);
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
            String shareMessage = "Project :- Algebra Formulas Calculator" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}