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

public class CustomerDataRecordSystem extends AppCompatActivity {

    String program1,program2,program3,program4,program5,program6;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_data_record_system);

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
        actionBar.setTitle("Customer data record system");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "class Add_Customer_Record:\n" +
                "\n" +
                "    def main(self):\n" +
                "        while 1:\n" +
                "            self.customer_name = input(\"\\n\\nEnter customer name :- \")\n" +
                "            self.product_name = input(\"Enter Product name :- \")\n" +
                "            while 1:\n" +
                "                flag = 0\n" +
                "                try:\n" +
                "                    self.buying_price = int(input(\"Enter buying price :- \"))\n" +
                "                    flag = 1\n" +
                "                except:\n" +
                "                    print(\"\\n\\nEnter valid input\")\n" +
                "                if flag == 1:\n" +
                "                    break\n" +
                "            while 1:\n" +
                "                flag = 0\n" +
                "                try:\n" +
                "                    self.selling_price = int(input(\"Enter selling price :- \"))\n" +
                "                    flag = 1\n" +
                "                except:\n" +
                "                    print(\"\\n\\nEnter valid input\")\n" +
                "                if flag == 1:\n" +
                "                    break\n" +
                "\n" +
                "            self.add_record_in_file()\n" +
                "            while 1:\n" +
                "                extra_rec = input(\"\\n\\nDo you want add another record (y/n) :- \")[0]\n" +
                "                self.extra_record = extra_rec.lower()\n" +
                "                if self.extra_record == 'y' or self.extra_record == 'n':\n" +
                "                    break\n" +
                "                else:\n" +
                "                    print(\"\\n\\nPlease enter valid input\")\n" +
                "            if self.extra_record == 'n':\n" +
                "                break\n" +
                "\n" +
                "    def add_record_in_file(self):\n" +
                "        file = open(\"customer-data-record.txt\", \"a\")\n" +
                "        customer_name = self.customer_name + \"\\n\"\n" +
                "        product_name = self.product_name + \"\\n\"\n" +
                "        buying_price = str(self.buying_price) + \"\\n\"\n" +
                "        selling_price = str(self.selling_price) + \"\\n\"\n" +
                "        file.write(customer_name)\n" +
                "        file.write(product_name)\n" +
                "        file.write(buying_price)\n" +
                "        file.write(selling_price)";

        array_string_color = new int[][]{{104,105},{109,133},{173,197},{316,340},{422,423},{427,445},{621,646},{728,729},{733,751},{903,904},{908,949},{1048,1051},{1076,1079},{1155,1156},{1160,1185},{1223,1226},{1305,1331},{1333,1336},{1383,1384},{1386,1387},{1431,1432},{1434,1435},{1484,1485},{1487,1488},{1539,1540},{1542,1543}};
        array_keyword_color_1 = new int[][]{{0,5},{32,35},{56,61},{105,109},{211,216},{261,264},{388,394},{423,427},{463,465},{497,502},{515,520},{565,568},{694,700},{729,733},{769,771},{803,808},{860,865},{904,908},{1024,1026},{1052,1054},{1101,1106},{1123,1127},{1156,1160},{1199,1201},{1244,1249},{1255,1258},{1384,1386},{1432,1434},{1485,1487},{1540,1542}};
        array_keyword_color_2 = new int[][]{{98,103},{167,172},{306,309},{310,315},{416,421},{611,614},{615,620},{722,727},{897,902},{1149,1154},{1300,1304},{1459,1462},{1513,1516}};
        array_self_color = new int[][]{{41,45},{77,81},{147,151},{286,290},{590,594},{822,826},{970,974},{1027,1031},{1055,1059},{1202,1206},{1278,1282},{1362,1366},{1411,1415},{1463,1467},{1517,1521}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{62,63},{217,218},{243,244},{370,371},{474,475},{521,522},{547,548},{676,677},{780,781},{866,867},{951,952}};
        array_function_name_color = new int[][]{{36,40},{1259,1277}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "from time import sleep\n" +
                "\n" +
                "class Display_Customer_Record:\n" +
                "    def main(self):\n" +
                "        try:\n" +
                "            file = open(\"customer-data-record.txt\",\"r\")\n" +
                "            count=0\n" +
                "            flag = 0\n" +
                "            for i in file:\n" +
                "                flag = 1\n" +
                "                count+=1\n" +
                "                if count==1:\n" +
                "                    sleep(0.5)\n" +
                "                    print(\"\\n\\n**************************\")\n" +
                "                    print(\"Customer name :-\",i,end=\"\")\n" +
                "                elif count==2:\n" +
                "                    print(\"Product name :-\",i,end=\"\")\n" +
                "                elif count==3:\n" +
                "                    print(\"Buying price :-\",i,end=\"\")\n" +
                "                elif count == 4:\n" +
                "                    count = 0\n" +
                "                    print(\"Selling price :-\", i,end=\"\")\n" +
                "            if flag==0:\n" +
                "                print(\"\\n\\nRecord list is empty\")\n" +
                "        except FileNotFoundError:\n" +
                "            print(\"\\n\\nNo record list\")";

        array_string_color = new int[][]{{112,138},{139,142},{348,349},{353,380},{408,426},{433,435},{494,511},{518,520},{579,596},{603,605},{696,714},{722,724},{772,773},{777,798},{852,853},{857,872}};
        array_keyword_color_1 = new int[][]{{0,4},{10,16},{24,29},{59,62},{83,86},{197,200},{203,205},{278,280},{349,353},{453,457},{538,542},{623,627},{738,740},{773,777},{808,814},{853,857}};
        array_keyword_color_2 = new int[][]{{107,111},{342,347},{402,407},{488,493},{573,578},{690,695},{766,771},{815,832},{846,851}};
        array_self_color = new int[][]{{68,72}};
        array_end_color = new int[][]{{429,432},{514,517},{599,602},{718,721}};
        array_number_color = new int[][]{{162,163},{183,184},{235,236},{260,261},{288,289},{317,320},{465,466},{550,551},{637,638},{668,669},{747,748}};
        array_function_name_color = new int[][]{{63,67}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "from time import sleep\n" +
                "\n" +
                "class Search_Customer_Record:\n" +
                "\n" +
                "    def main(self):\n" +
                "        try:\n" +
                "            file = open(\"customer-data-record.txt\", \"r\")\n" +
                "            customer_name = input(\"\\nEnter the customer name :- \")\n" +
                "            count, flag, found = 0, 0, 0\n" +
                "\n" +
                "            for i in file:\n" +
                "                count += 1\n" +
                "                if count == 1:\n" +
                "                    if i.lower() == customer_name.lower() + \"\\n\":\n" +
                "                        if flag == 0:\n" +
                "                            flag = 1\n" +
                "                            print(\"\\nYes! Customer founded\")\n" +
                "                        found = 1\n" +
                "                if found == 1:\n" +
                "                    if count == 1:\n" +
                "                        sleep(0.5)\n" +
                "                        print(\"\\n\\n**************************\")\n" +
                "                        print(\"Customer name :-\", i, end=\"\")\n" +
                "                    elif count == 2:\n" +
                "                        print(\"Product name :-\", i, end=\"\")\n" +
                "                    elif count == 3:\n" +
                "                        print(\"Buying price :-\", i, end=\"\")\n" +
                "                    elif count == 4:\n" +
                "                        found = 0\n" +
                "                        print(\"Selling price :-\", i, end=\"\")\n" +
                "                if count == 4:\n" +
                "                    count = 0\n" +
                "\n" +
                "            if flag==0:\n" +
                "                print(\"\\n\\nNo such customer\")\n" +
                "\n" +
                "        except Exception:\n" +
                "            print(\"\\n\\nNo record list\")";

        array_string_color = new int[][]{{112,138},{140,143},{179,180},{182,210},{399,400},{402,403},{514,515},{517,539},{706,707},{711,738},{770,788},{797,799},{868,885},{894,896},{965,982},{991,993},{1096,1114},{1123,1125},{1235,1236},{1240,1257},{1304,1305},{1309,1324}};
        array_keyword_color_1 = new int[][]{{0,4},{10,16},{24,29},{59,62},{83,86},{180,182},{266,269},{272,274},{324,326},{359,361},{400,402},{429,431},{515,517},{591,593},{626,628},{707,711},{821,825},{918,922},{1015,1019},{1143,1145},{1201,1203},{1236,1240},{1268,1274},{1305,1309}};
        array_keyword_color_2 = new int[][]{{107,111},{173,178},{508,513},{700,705},{764,769},{862,867},{959,964},{1090,1095},{1229,1234},{1275,1284},{1298,1303}};
        array_self_color = new int[][]{{68,72}};
        array_end_color = new int[][]{{793,796},{890,893},{987,990},{1119,1122}};
        array_number_color = new int[][]{{245,246},{248,249},{251,252},{306,307},{336,337},{440,441},{478,479},{573,574},{603,604},{638,639},{671,674},{835,836},{932,933},{1029,1030},{1064,1065},{1155,1156},{1186,1187},{1210,1211}};
        array_function_name_color = new int[][]{{63,67}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program4 = "class Display_Profit_Loss:\n" +
                "\n" +
                "    def main(self):\n" +
                "        try:\n" +
                "            file = open(\"customer-data-record.txt\", \"r\")\n" +
                "            count, buying_amount, selling_amount = 0, 0, 0\n" +
                "\n" +
                "            for data in file:\n" +
                "                count += 1\n" +
                "                if count == 3:\n" +
                "                    buying_amount += int(data)\n" +
                "                if count == 4:\n" +
                "                    selling_amount += int(data)\n" +
                "                    count = 0\n" +
                "\n" +
                "            print(\"\\n\\nTotal buying amount :-\", buying_amount)\n" +
                "            print(\"Total selling amount :-\", selling_amount)\n" +
                "\n" +
                "            if buying_amount > selling_amount:\n" +
                "                print(\"Loss :-\", (buying_amount-selling_amount))\n" +
                "            elif selling_amount > buying_amount:\n" +
                "                print(\"Profit :-\", (selling_amount-buying_amount))\n" +
                "            else:\n" +
                "                print(\"Profit :- 0\")\n" +
                "\n" +
                "        except Exception:\n" +
                "            print(\"\\n\\nNo record list\")";

        array_string_color = new int[][]{{85,111},{113,116},{441,442},{446,469},{504,529},{617,626},{731,742},{816,829},{876,877},{881,896}};
        array_keyword_color_1 = new int[][]{{0,5},{32,35},{56,59},{190,193},{199,201},{251,253},{329,331},{442,446},{560,562},{672,676},{788,792},{840,846},{877,881}};
        array_keyword_color_2 = new int[][]{{80,84},{303,306},{382,385},{435,440},{498,503},{611,616},{725,730},{810,815},{847,856},{870,875}};
        array_self_color = new int[][]{{41,45}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{169,170},{172,173},{175,176},{233,234},{263,264},{341,342},{420,421}};
        array_function_name_color = new int[][]{{36,40}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.program4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(program4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program5 = "from time import sleep\n" +
                "\n" +
                "class Display_Customer_Records_of_Product:\n" +
                "    def main(self):\n" +
                "        try:\n" +
                "            file = open(\"customer-data-record.txt\", \"r\")\n" +
                "            product_name = input(\"\\n\\nEnter product name :- \")\n" +
                "            customer_data = []\n" +
                "            count,flag = 0,0\n" +
                "            found = False\n" +
                "            customer_name = \"\"\n" +
                "\n" +
                "            for data in file:\n" +
                "                count += 1\n" +
                "                if count==1:\n" +
                "                    customer_name = data\n" +
                "                elif count==2:\n" +
                "                    if data.lower() == product_name.lower()+\"\\n\":\n" +
                "                        found = True\n" +
                "                        customer_data.append(customer_name)\n" +
                "                        customer_data.append(data)\n" +
                "                        flag = 1\n" +
                "                elif count==3 and flag==1:\n" +
                "                    customer_data.append(data)\n" +
                "                elif count==4 and flag==1:\n" +
                "                    customer_data.append(data)\n" +
                "                    flag = 0\n" +
                "\n" +
                "                if count == 4:\n" +
                "                    count = 0\n" +
                "\n" +
                "\n" +
                "            if found==True:\n" +
                "                print(\"\\nCustomers record found\")\n" +
                "                for i in customer_data:\n" +
                "                    count += 1\n" +
                "                    if count == 1:\n" +
                "                        sleep(0.5)\n" +
                "                        print(\"\\n**************************\")\n" +
                "                        print(\"Customer name :-\", i, end=\"\")\n" +
                "                    elif count == 2:\n" +
                "                        print(\"Product name :-\", i, end=\"\")\n" +
                "                    elif count == 3:\n" +
                "                        print(\"Buying price :-\", i, end=\"\")\n" +
                "                    elif count == 4:\n" +
                "                        count = 0\n" +
                "                        print(\"Selling price :-\", i, end=\"\")\n" +
                "            else:\n" +
                "                print(\"\\nNo customers bought product\",product_name)\n" +
                "\n" +
                "        except Exception:\n" +
                "            print(\"\\n\\nNo record list\")";

        array_string_color = new int[][]{{124,150},{152,155},{190,191},{195,218},{334,336},{556,557},{559,560},{1066,1067},{1069,1092},{1265,1266},{1268,1295},{1327,1345},{1354,1356},{1425,1442},{1451,1453},{1522,1539},{1548,1550},{1653,1671},{1680,1682},{1724,1725},{1727,1755},{1815,1816},{1820,1835}};
        array_keyword_color_1 = new int[][]{{0,4},{10,16},{24,29},{71,74},{95,98},{191,195},{300,305},{350,353},{359,361},{411,413},{481,485},{516,518},{557,559},{594,598},{759,763},{773,776},{849,853},{863,866},{969,971},{1028,1030},{1038,1042},{1067,1069},{1110,1113},{1116,1118},{1185,1187},{1266,1268},{1378,1382},{1475,1479},{1572,1576},{1696,1700},{1725,1727},{1779,1785},{1816,1820}};
        array_keyword_color_2 = new int[][]{{119,123},{184,189},{1060,1065},{1259,1264},{1321,1326},{1419,1424},{1516,1521},{1647,1652},{1718,1723},{1786,1795},{1809,1814}};
        array_self_color = new int[][]{{80,84}};
        array_end_color = new int[][]{{1350,1353},{1447,1450},{1544,1547},{1676,1679}};
        array_number_color = new int[][]{{276,277},{278,279},{393,394},{421,422},{493,494},{741,742},{771,772},{783,784},{861,862},{873,874},{950,951},{981,982},{1012,1013},{1163,1164},{1197,1198},{1230,1233},{1392,1393},{1489,1490},{1586,1587},{1621,1622}};
        array_function_name_color = new int[][]{{75,79}};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.program5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(program5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program6 = "from add_customer_record import *\n" +
                "from display_customer_record import *\n" +
                "from search_customer_record import *\n" +
                "from display_profit_loss import *\n" +
                "from display_customer_records_of_product import *\n" +
                "from time import sleep\n" +
                "\n" +
                "class MainClass:\n" +
                "\n" +
                "    def main(self):\n" +
                "        while 1:\n" +
                "            sleep(0.5)\n" +
                "            print(\"\\n\\n********************************\\n  Customer Data Record System\\n********************************\\n\")\n" +
                "            print(\"1. Add customer record\")\n" +
                "            print(\"2. Display customer records\")\n" +
                "            print(\"3. Search customer record\")\n" +
                "            print(\"4. View profit Loss\")\n" +
                "            print(\"5. Display customer records who bought THIS product\")\n" +
                "            print(\"6. Exit from system\")\n" +
                "            while 1:\n" +
                "                flag = 0\n" +
                "                try:\n" +
                "                    self.user_choice = int(input(\"\\nChoose your choice :- \"))\n" +
                "                    flag = 1\n" +
                "                except Exception:\n" +
                "                    print(\"\\n\\nEnter valid input\")\n" +
                "                if flag == 1:\n" +
                "                    break\n" +
                "\n" +
                "            if self.user_choice <= 6 and self.user_choice >= 1:\n" +
                "                if self.user_choice == 1:\n" +
                "                    obj = Add_Customer_Record()\n" +
                "                    obj.main()\n" +
                "                elif self.user_choice == 2:\n" +
                "                    obj = Display_Customer_Record()\n" +
                "                    obj.main()\n" +
                "                elif self.user_choice == 3:\n" +
                "                    obj = Search_Customer_Record()\n" +
                "                    obj.main()\n" +
                "                elif self.user_choice == 4:\n" +
                "                    obj = Display_Profit_Loss()\n" +
                "                    obj.main()\n" +
                "                elif self.user_choice == 5:\n" +
                "                    obj = Display_Customer_Records_of_Product()\n" +
                "                    obj.main()\n" +
                "            else:\n" +
                "                print(\"\\nInvalid choice\")\n" +
                "\n" +
                "            if self.user_choice == 6:\n" +
                "                break\n" +
                "\n" +
                "\n" +
                "if __name__==\"__main__\":\n" +
                "    obj = MainClass()\n" +
                "    obj.main()";

        array_string_color = new int[][]{{313,314},{318,350},{354,381},{383,415},{417,418},{438,462},{482,511},{531,558},{578,599},{619,672},{692,713},{831,832},{834,857},{949,950},{954,972},{1771,1772},{1774,1789},{1867,1877}};
        array_keyword_color_1 = new int[][]{{0,4},{25,31},{34,38},{63,69},{72,76},{100,106},{109,113},{134,140},{143,147},{184,190},{193,197},{203,209},{217,222},{239,242},{263,268},{314,318},{350,352},{381,383},{415,417},{727,732},{777,780},{832,834},{905,911},{950,954},{990,992},{1024,1029},{1043,1045},{1068,1071},{1111,1113},{1232,1236},{1359,1363},{1485,1489},{1608,1612},{1743,1747},{1772,1774},{1804,1806},{1846,1851},{1854,1856}};
        array_keyword_color_2 = new int[][]{{307,312},{432,437},{476,481},{525,530},{572,577},{613,618},{686,691},{821,824},{825,830},{912,921},{943,948},{1765,1770}};
        array_self_color = new int[][]{{248,252},{802,806},{1046,1050},{1072,1076},{1114,1118},{1237,1241},{1364,1368},{1490,1494},{1613,1617},{1807,1811}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{269,270},{290,293},{733,734},{759,760},{887,888},{1001,1002},{1066,1067},{1092,1093},{1134,1135},{1257,1258},{1384,1385},{1510,1511},{1633,1634},{1827,1828}};
        array_function_name_color = new int[][]{{243,247}};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.program6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(program6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 3\n" +
                "\n" +
                "\n" +
                "No record list\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 1\n" +
                "\n" +
                "\n" +
                "Enter customer name :- Mani\n" +
                "Enter Product name :- Notebooks\n" +
                "Enter buying price :- 240\n" +
                "Enter selling price :- 460\n" +
                "\n" +
                "\n" +
                "Do you want add another record (y/n) :- y\n" +
                "\n" +
                "\n" +
                "Enter customer name :- Rakesh\n" +
                "Enter Product name :- Pencil Box\n" +
                "Enter buying price :- 700\n" +
                "Enter selling price :- 1100\n" +
                "\n" +
                "\n" +
                "Do you want add another record (y/n) :- n\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 2\n" +
                "\n" +
                "\n" +
                "**************************\n" +
                "Customer name :- Mani\n" +
                "Product name :- Notebooks\n" +
                "Buying price :- 240\n" +
                "Selling price :- 460\n" +
                "\n" +
                "\n" +
                "**************************\n" +
                "Customer name :- Rakesh\n" +
                "Product name :- Pencil Box\n" +
                "Buying price :- 700\n" +
                "Selling price :- 1100\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 4\n" +
                "\n" +
                "\n" +
                "Total buying amount :- 940\n" +
                "Total selling amount :- 1560\n" +
                "Profit :- 620\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 3\n" +
                "\n" +
                "Enter the customer name :- Rakesh\n" +
                "\n" +
                "Yes! Customer founded\n" +
                "\n" +
                "\n" +
                "**************************\n" +
                "Customer name :- Rakesh\n" +
                "Product name :- Pencil Box\n" +
                "Buying price :- 700\n" +
                "Selling price :- 1100\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 5\n" +
                "\n" +
                "\n" +
                "Enter product name :- Notebooks\n" +
                "\n" +
                "Customers record found\n" +
                "\n" +
                "**************************\n" +
                "Customer name :- Mani\n" +
                "Product name :- Notebooks\n" +
                "Buying price :- 240\n" +
                "Selling price :- 460\n" +
                "\n" +
                "\n" +
                "********************************\n" +
                "  Customer Data Record System\n" +
                "********************************\n" +
                "\n" +
                "1. Add customer record\n" +
                "2. Display customer records\n" +
                "3. Search customer record\n" +
                "4. View profit Loss\n" +
                "5. Display customer records who bought THIS product\n" +
                "6. Exit from system\n" +
                "\n" +
                "Choose your choice :- 6";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),RandomPasswordGenerator.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),MathQuiz.class);
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
            String shareMessage = "Project :- Customer data record system" +
                    "\n\n\nadd_customer_record.py \n\n" + program1 +
                    "\n\n\ndisplay_customer_record.py \n\n" + program2 +
                    "\n\n\nsearch_customer_record.py \n\n" + program3 +
                    "\n\n\ndisplay_profit_loss.py \n\n" + program4 +
                    "\n\n\ndisplay_customer_records_of_product.py \n\n" + program5 +
                    "\n\n\nMain.py \n\n" + program6 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}