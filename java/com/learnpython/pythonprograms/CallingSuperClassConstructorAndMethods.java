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

public class CallingSuperClassConstructorAndMethods extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_super_class_constructor_and_methods);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);

        program_name = "Calling super class constructors and methods";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class Quantity:\n" +
                "    def __init__(self):\n" +
                "        t = int(input(\"Enter total number of products: \"))\n" +
                "        self.total_products = t\n" +
                "\n" +
                "    def accept(self):\n" +
                "        self.quantity = []\n" +
                "        for i in range(self.total_products):\n" +
                "            print(\"Enter quantity\",i+1,end=\": \")\n" +
                "            q = int(input())\n" +
                "            self.quantity.append(q)\n" +
                "\n" +
                "    def calculate(self,price_obj):\n" +
                "        self.grand_total = 0\n" +
                "        for i in range(self.total_products):\n" +
                "            total = price_obj.price[i]*self.quantity[i]\n" +
                "            self.grand_total += total\n" +
                "            print(\"\\n***************\")\n" +
                "            print(\"   Price {}: {}\".format(i+1,price_obj.price[i]))\n" +
                "            print(\"Quantity {}: {}\".format(i+1,self.quantity[i]))\n" +
                "            print(\"   Total {}: {}\".format(i+1,total))\n" +
                "            print(\"***************\")\n" +
                "        print(\"\\nGRAND TOTAL: {}\".format(self.grand_total))\n" +
                "\n" +
                "\n" +
                "class Price(Quantity):\n" +
                "    def __init__(self):\n" +
                "        super().__init__()\n" +
                "\n" +
                "    def accept(self):\n" +
                "        super().accept()\n" +
                "        self.price = []\n" +
                "        for i in range(self.total_products):\n" +
                "            print(\"Enter price\",i+1,end=\": \")\n" +
                "            p = int(input())\n" +
                "            self.price.append(p)\n" +
                "\n" +
                "    def calculate(self):\n" +
                "        super().calculate(self)\n" +
                "\n" +
                "\n" +
                "obj = Price()\n" +
                "obj.accept()\n" +
                "obj.calculate()";

        int[][] array_string_color = {{62,96},{244,260},{269,273},{562,563},{565,581},{601,618},{669,686},{735,752},{790,807},{823,824},{826,842},{1080,1093},{1102,1106}};
        int[][] array_keyword_color_1 = {{0,5},{20,23},{136,139},{189,192},{195,197},{345,348},{413,417},{419,421},{563,565},{824,826},{871,876},{898,901},{950,953},{1025,1028},{1031,1033},{1175,1178}};
        int[][] array_keyword_color_2 = {{52,55},{56,61},{198,203},{238,243},{291,294},{295,300},{422,427},{556,561},{595,600},{663,668},{729,734},{784,789},{817,822},{926,931},{976,981},{1034,1039},{1074,1079},{1124,1127},{1128,1133},{1204,1209}};
        int[][] array_self_color = {{33,37},{107,111},{147,151},{162,166},{204,208},{316,320},{359,363},{384,388},{428,432},{489,493},{518,522},{698,702},{850,854},{911,915},{961,965},{1001,1005},{1040,1044},{1149,1153},{1189,1193},{1222,1226}};
        int[][] array_end_color = {{265,268},{1098,1101}};
        int[][] array_number_color = {{263,264},{403,404},{628,629},{696,697},{762,763},{1096,1097}};
        int[][] array_function_name_color = {{140,146},{349,358},{954,960},{1179,1188}};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{24,32},{902,910},{934,942}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter total number of products: 5\n" +
                "Enter quantity 1: 20\n" +
                "Enter quantity 2: 14\n" +
                "Enter quantity 3: 2\n" +
                "Enter quantity 4: 4\n" +
                "Enter quantity 5: 12\n" +
                "Enter price 1: 12\n" +
                "Enter price 2: 54\n" +
                "Enter price 3: 237\n" +
                "Enter price 4: 30\n" +
                "Enter price 5: 50\n" +
                "\n" +
                "***************\n" +
                "   Price 1: 12\n" +
                "Quantity 1: 20\n" +
                "   Total 1: 240\n" +
                "***************\n" +
                "\n" +
                "***************\n" +
                "   Price 2: 54\n" +
                "Quantity 2: 14\n" +
                "   Total 2: 756\n" +
                "***************\n" +
                "\n" +
                "***************\n" +
                "   Price 3: 237\n" +
                "Quantity 3: 2\n" +
                "   Total 3: 474\n" +
                "***************\n" +
                "\n" +
                "***************\n" +
                "   Price 4: 30\n" +
                "Quantity 4: 4\n" +
                "   Total 4: 120\n" +
                "***************\n" +
                "\n" +
                "***************\n" +
                "   Price 5: 50\n" +
                "Quantity 5: 12\n" +
                "   Total 5: 600\n" +
                "***************\n" +
                "\n" +
                "GRAND TOTAL: 2190";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonInnerClassProgram.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),FindNthPrimeNumber.class);
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