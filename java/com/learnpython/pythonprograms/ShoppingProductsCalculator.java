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

public class ShoppingProductsCalculator extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_products_calculator);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Shopping Products Calculator");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "class Shopping:\n" +
                "    def add_product(self):\n" +
                "        print()\n" +
                "        self.product_name = input(\"Enter product name :- \")\n" +
                "        flag = 0\n" +
                "        while 1:\n" +
                "            try:\n" +
                "                self.product_price = int(input(\"Enter product price :- \"))\n" +
                "                flag = 1\n" +
                "            except Exception:\n" +
                "                print(\"\\nEnter valid input\")\n" +
                "            if flag==1:\n" +
                "                break\n" +
                "        flag = 0\n" +
                "        while 1:\n" +
                "            try:\n" +
                "                self.product_quantity = int(input(\"Enter no. of quantity :- \"))\n" +
                "                flag = 1\n" +
                "            except Exception:\n" +
                "                print(\"\\nEnter valid input\")\n" +
                "            if flag==1:\n" +
                "                break\n" +
                "        self.product_total = self.product_price*self.product_quantity\n" +
                "\n" +
                "\n" +
                "    def display(self):\n" +
                "        print(\"\\n\\n***********************\")\n" +
                "        print(\"   Product :-\",self.product_name)\n" +
                "        print(\"   Price :-\",self.product_price)\n" +
                "        print(\"   Quantity :-\",self.product_quantity)\n" +
                "        print(\"   Total :-\",self.product_total)\n" +
                "        print(\"***********************\\n\")\n" +
                "\n" +
                "\n" +
                "def mainBanner():\n" +
                "    list_of_products = []\n" +
                "    while 1:\n" +
                "        print(\"\\n******* SHOPPING PRODUCTS CALCULATOR *******\")\n" +
                "        print(\"\\n1. Add product\")\n" +
                "        print(\"2. Display all\")\n" +
                "        print(\"3. View Grand Total\")\n" +
                "        print(\"4. Clear all products list\")\n" +
                "        print(\"5. Close\\n\")\n" +
                "        flag = 0\n" +
                "        while 1:\n" +
                "            try:\n" +
                "                choice = int(input(\"Choose your choice :- \"))\n" +
                "                flag = 1\n" +
                "            except Exception:\n" +
                "                print(\"\\nEnter valid input\")\n" +
                "            if flag==1:\n" +
                "                break\n" +
                "        if choice<=0 or choice>=6:\n" +
                "            print(\"\\nInvalid choice\")\n" +
                "        elif choice==1:\n" +
                "            product_obj = Shopping()\n" +
                "            product_obj.add_product()\n" +
                "            list_of_products.append(product_obj)\n" +
                "        elif choice==2:\n" +
                "            if len(list_of_products)!=0:\n" +
                "                for obj in list_of_products:\n" +
                "                    obj.display()\n" +
                "            else:\n" +
                "                print(\"\\nNo products list\")\n" +
                "        elif choice==3:\n" +
                "            if len(list_of_products)!=0:\n" +
                "                grandTotal = 0\n" +
                "                for obj in list_of_products:\n" +
                "                    grandTotal += obj.product_total\n" +
                "                print(\"\\nGrand Total :-\",grandTotal)\n" +
                "            else:\n" +
                "                print(\"\\nNo products list\")\n" +
                "        elif choice==4:\n" +
                "            if len(list_of_products)!=0:\n" +
                "                list_of_products.clear()\n" +
                "                print(\"\\nSuccessfully cleared\")\n" +
                "            else:\n" +
                "                print(\"\\nNo products list\")\n" +
                "        elif choice==5:\n" +
                "            break\n" +
                "\n" +
                "\n" +
                "\n" +
                "mainBanner()";

        int[][] array_string_color = {{93,117},{217,242},{322,323},{325,343},{492,519},{599,600},{602,620},{777,778},{782,806},{822,837},{871,884},{919,935},{973,986},{1021,1045},{1047,1048},{1123,1124},{1126,1171},{1187,1188},{1190,1205},{1221,1237},{1253,1274},{1290,1318},{1334,1343},{1345,1346},{1434,1458},{1538,1539},{1541,1559},{1660,1661},{1663,1678},{2012,2013},{2015,2032},{2249,2250},{2252,2267},{2320,2321},{2323,2340},{2470,2471},{2473,2494},{2536,2537},{2539,2556}};
        int[][] array_keyword_color_1 = {{0,5},{20,23},{144,149},{165,168},{282,288},{323,325},{357,359},{385,390},{416,421},{437,440},{559,565},{600,602},{634,636},{662,667},{744,747},{778,782},{1045,1047},{1052,1055},{1100,1105},{1124,1126},{1188,1190},{1343,1345},{1373,1378},{1394,1397},{1498,1504},{1539,1541},{1573,1575},{1601,1606},{1615,1617},{1628,1630},{1661,1663},{1688,1692},{1836,1840},{1864,1866},{1909,1912},{1917,1919},{1984,1988},{2013,2015},{2042,2046},{2070,2072},{2146,2149},{2154,2156},{2250,2252},{2292,2296},{2321,2323},{2350,2354},{2378,2380},{2471,2473},{2508,2512},{2537,2539},{2566,2570},{2594,2599}};
        int[][] array_keyword_color_2 = {{51,56},{87,92},{207,210},{211,216},{289,298},{316,321},{482,485},{486,491},{566,575},{593,598},{771,776},{816,821},{865,870},{913,918},{967,972},{1015,1020},{1117,1122},{1181,1186},{1215,1220},{1247,1252},{1284,1289},{1328,1333},{1424,1427},{1428,1433},{1505,1514},{1532,1537},{1654,1659},{1867,1870},{2006,2011},{2073,2076},{2243,2248},{2314,2319},{2381,2384},{2464,2469},{2530,2535}};
        int[][] array_self_color = {{36,40},{67,71},{186,190},{458,462},{676,680},{697,701},{716,720},{756,760},{838,842},{885,889},{936,940},{987,991}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{134,135},{150,151},{268,269},{366,367},{406,407},{422,423},{545,546},{643,644},{1106,1107},{1363,1364},{1379,1380},{1484,1485},{1582,1583},{1626,1627},{1639,1640},{1701,1702},{1849,1850},{1890,1891},{2055,2056},{2096,2097},{2128,2129},{2363,2364},{2404,2405},{2579,2580}};
        int[][] array_function_name_color = {{24,35},{748,755},{1056,1066}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "\n" +
                "Enter product name :- Pen\n" +
                "Enter product price :- 15\n" +
                "Enter no. of quantity :- 5\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "\n" +
                "***********************\n" +
                "   Product :- Pen\n" +
                "   Price :- 15\n" +
                "   Quantity :- 5\n" +
                "   Total :- 75\n" +
                "***********************\n" +
                "\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 3\n" +
                "\n" +
                "Grand Total :- 75\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "\n" +
                "Enter product name :- Python Book\n" +
                "Enter product price :- 350\n" +
                "Enter no. of quantity :- 3\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "\n" +
                "***********************\n" +
                "   Product :- Pen\n" +
                "   Price :- 15\n" +
                "   Quantity :- 5\n" +
                "   Total :- 75\n" +
                "***********************\n" +
                "\n" +
                "\n" +
                "\n" +
                "***********************\n" +
                "   Product :- Python Book\n" +
                "   Price :- 350\n" +
                "   Quantity :- 3\n" +
                "   Total :- 1050\n" +
                "***********************\n" +
                "\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 3\n" +
                "\n" +
                "Grand Total :- 1125\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 4\n" +
                "\n" +
                "Successfully cleared\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "No products list\n" +
                "\n" +
                "******* SHOPPING PRODUCTS CALCULATOR *******\n" +
                "\n" +
                "1. Add product\n" +
                "2. Display all\n" +
                "3. View Grand Total\n" +
                "4. Clear all products list\n" +
                "5. Close\n" +
                "\n" +
                "Choose your choice :- 5";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);




        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),AlgebricFormulasCalculator.class);
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
            String shareMessage = "Project :- Shopping Products Calculator" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}