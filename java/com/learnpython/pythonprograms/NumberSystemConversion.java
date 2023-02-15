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

public class NumberSystemConversion extends AppCompatActivity {

    String program1,program2,program3;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_conversion);

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
        actionBar.setTitle("Number system conversion");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "from Conversions import *\n" +
                "\n" +
                "def choice1():\n" +
                "    print()\n" +
                "    binary = int(input(\"Enter binary number: \"))\n" +
                "    decimal = binary_decimal(binary)\n" +
                "    octal = decimal_octal(decimal)\n" +
                "    print(\"\\nBinary {} in Octal = {}\".format(binary,octal))\n" +
                "\n" +
                "def choice2():\n" +
                "    print()\n" +
                "    binary = int(input(\"Enter binary number: \"))\n" +
                "    decimal = binary_decimal(binary)\n" +
                "    print(\"\\nBinary {} in Decimal = {}\".format(binary,decimal))\n" +
                "\n" +
                "def choice3():\n" +
                "    print()\n" +
                "    binary = int(input(\"Enter binary number: \"))\n" +
                "    decimal = binary_decimal(binary)\n" +
                "    hexadecimal = decimal_hexadecimal(decimal)\n" +
                "    print(\"\\nBinary {} in Hexadecimal = {}\".format(binary,hexadecimal))\n" +
                "\n" +
                "def choice4():\n" +
                "    print()\n" +
                "    octal = int(input(\"Enter octal number: \"))\n" +
                "    decimal = octal_decimal(octal)\n" +
                "    binary = decimal_binary(decimal)\n" +
                "    print(\"\\nOctal {} in Binary = {}\".format(octal,binary))\n" +
                "\n" +
                "def choice5():\n" +
                "    print()\n" +
                "    octal = int(input(\"Enter octal number: \"))\n" +
                "    decimal = octal_decimal(octal)\n" +
                "    print(\"\\nOctal {} in Decimal = {}\".format(octal,decimal))\n" +
                "\n" +
                "def choice6():\n" +
                "    print()\n" +
                "    octal = int(input(\"Enter octal number: \"))\n" +
                "    decimal = octal_decimal(octal)\n" +
                "    hexadecimal = decimal_hexadecimal(decimal)\n" +
                "    print(\"\\nOctal {} in Hexadecimal = {}\".format(octal,hexadecimal))\n" +
                "\n" +
                "def choice7():\n" +
                "    print()\n" +
                "    decimal = int(input(\"Enter decimal number: \"))\n" +
                "    binary = decimal_binary(decimal)\n" +
                "    print(\"\\nDecimal {} in Binary = {}\".format(decimal,binary))\n" +
                "\n" +
                "def choice8():\n" +
                "    print()\n" +
                "    decimal = int(input(\"Enter decimal number: \"))\n" +
                "    octal = decimal_octal(decimal)\n" +
                "    print(\"\\nDecimal {} in octal = {}\".format(decimal,octal))\n" +
                "\n" +
                "def choice9():\n" +
                "    print()\n" +
                "    decimal = int(input(\"Enter decimal number: \"))\n" +
                "    hexadecimal = decimal_hexadecimal(decimal)\n" +
                "    print(\"\\nDecimal {} in Hexadecimal = {}\".format(decimal,hexadecimal))\n" +
                "\n" +
                "def choice10():\n" +
                "    print()\n" +
                "    hexadecimal = input(\"Enter hexadecimal number: \")\n" +
                "    decimal = hexadecimal_decimal(hexadecimal)\n" +
                "    binary = decimal_binary(decimal)\n" +
                "    print(\"\\nHexadecimal {} in Binary = {}\".format(hexadecimal,binary))\n" +
                "\n" +
                "def choice11():\n" +
                "    print()\n" +
                "    hexadecimal = input(\"Enter hexadecimal number: \")\n" +
                "    decimal = hexadecimal_decimal(hexadecimal)\n" +
                "    octal = decimal_octal(decimal)\n" +
                "    print(\"\\nHexadecimal {} in Octal = {}\".format(hexadecimal,octal))\n" +
                "\n" +
                "def choice12():\n" +
                "    print()\n" +
                "    hexadecimal = input(\"Enter hexadecimal number: \")\n" +
                "    decimal = hexadecimal_decimal(hexadecimal)\n" +
                "    print(\"\\nHexadecimal {} in Decimal = {}\".format(hexadecimal,decimal))";


        array_string_color = new int[][]{{77,100},{185,186},{188,212},{286,309},{359,360},{362,388},{464,487},{584,585},{587,617},{696,718},{803,804},{806,830},{903,925},{973,974},{976,1001},{1075,1097},{1192,1193},{1195,1224},{1304,1328},{1378,1379},{1381,1407},{1484,1508},{1556,1557},{1559,1584},{1660,1684},{1744,1745},{1747,1778},{1861,1889},{1985,1986},{1988,2018},{2100,2128},{2222,2223},{2225,2254},{2335,2363},{2422,2423},{2425,2456}};
        array_keyword_color_1 = new int[][]{{0,4},{17,23},{27,30},{186,188},{236,239},{360,362},{414,417},{585,587},{647,650},{804,806},{854,857},{974,976},{1026,1029},{1193,1195},{1253,1256},{1379,1381},{1433,1436},{1557,1559},{1609,1612},{1745,1747},{1809,1812},{1986,1988},{2048,2051},{2223,2225},{2283,2286},{2423,2425}};
        array_keyword_color_2 = new int[][]{{46,51},{67,70},{71,76},{179,184},{255,260},{276,279},{280,285},{353,358},{433,438},{454,457},{458,463},{578,583},{666,671},{686,689},{690,695},{797,802},{873,878},{893,896},{897,902},{967,972},{1045,1050},{1065,1068},{1069,1074},{1186,1191},{1272,1277},{1294,1297},{1298,1303},{1372,1377},{1452,1457},{1474,1477},{1478,1483},{1550,1555},{1628,1633},{1650,1653},{1654,1659},{1738,1743},{1829,1834},{1855,1860},{1979,1984},{2068,2073},{2094,2099},{2216,2221},{2303,2308},{2329,2334},{2416,2421}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{31,38},{240,247},{418,425},{651,658},{858,865},{1030,1037},{1257,1264},{1437,1444},{1613,1620},{1813,1821},{2052,2060},{2287,2295}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "def binary_decimal(binary):\n" +
                "    multiply,decimal = 1,0\n" +
                "    while binary>0:\n" +
                "        if binary%2==1:\n" +
                "            decimal += multiply\n" +
                "        multiply *= 2\n" +
                "        binary //= 10\n" +
                "    return decimal\n" +
                "\n" +
                "def octal_decimal(octal):\n" +
                "    count,decimal = 0,0\n" +
                "    while octal>0:\n" +
                "        decimal = decimal+(octal%10)*(8**count)\n" +
                "        count += 1\n" +
                "        octal //=10\n" +
                "    return decimal\n" +
                "\n" +
                "def hexadecimal_decimal(hex):\n" +
                "    count,decimal = 0,0\n" +
                "    for i in range(len(hex)-1,-1,-1):\n" +
                "        val = 0\n" +
                "        if hex[i]=='A':\n" +
                "            val = 10\n" +
                "        elif hex[i]=='B':\n" +
                "            val = 11\n" +
                "        elif hex[i]=='C':\n" +
                "            val = 12\n" +
                "        elif hex[i]=='D':\n" +
                "            val = 13\n" +
                "        elif hex[i]=='E':\n" +
                "            val = 14\n" +
                "        elif hex[i]=='F':\n" +
                "            val = 15\n" +
                "        else:\n" +
                "            val = int(hex[i])\n" +
                "        decimal += (val)*(16**count)\n" +
                "        count += 1\n" +
                "    return decimal\n" +
                "\n" +
                "\n" +
                "def decimal_binary(num):\n" +
                "    bin = []\n" +
                "    while num>0:\n" +
                "        bin.append(num%2)\n" +
                "        num //= 2\n" +
                "    binary = \"\"\n" +
                "    for i in range(len(bin)-1,-1,-1):\n" +
                "        binary += str(bin[i])\n" +
                "    return binary\n" +
                "\n" +
                "def decimal_octal(num):\n" +
                "    oct = []\n" +
                "    while num>0:\n" +
                "        oct.append(num%8)\n" +
                "        num //= 8\n" +
                "    octal = \"\"\n" +
                "    for i in range(len(oct)-1,-1,-1):\n" +
                "        octal += str(oct[i])\n" +
                "    return octal\n" +
                "\n" +
                "def decimal_hexadecimal(num):\n" +
                "    hex = []\n" +
                "    while num>0:\n" +
                "        rem = num%16\n" +
                "        if rem==10:\n" +
                "            hex.append('A')\n" +
                "        elif rem==11:\n" +
                "            hex.append('B')\n" +
                "        elif rem==12:\n" +
                "            hex.append('C')\n" +
                "        elif rem==13:\n" +
                "            hex.append('D')\n" +
                "        elif rem==14:\n" +
                "            hex.append('E')\n" +
                "        elif rem==15:\n" +
                "            hex.append('F')\n" +
                "        else:\n" +
                "            hex.append(rem)\n" +
                "        num //= 16\n" +
                "    hexadecimal = \"\"\n" +
                "    for i in range(len(hex)-1,-1,-1):\n" +
                "        hexadecimal += str(hex[i])\n" +
                "    return hexadecimal";

        array_string_color = new int[][]{{498,501},{545,548},{592,595},{639,642},{686,689},{733,736},{992,994},{1192,1194},{1404,1407},{1454,1457},{1504,1507},{1554,1557},{1604,1607},{1654,1657},{1738,1740}};
        array_keyword_color_1 = new int[][]{{0,3},{59,64},{83,85},{179,185},{195,198},{249,254},{355,361},{371,374},{429,432},{435,437},{487,489},{532,536},{579,583},{626,630},{673,677},{720,724},{767,771},{863,869},{880,883},{922,927},{999,1002},{1005,1007},{1067,1073},{1082,1085},{1123,1128},{1199,1202},{1205,1207},{1266,1272},{1280,1283},{1327,1332},{1369,1371},{1417,1421},{1467,1471},{1517,1521},{1567,1571},{1617,1621},{1667,1671},{1745,1748},{1751,1753},{1818,1824}};
        array_keyword_color_2 = new int[][]{{438,443},{444,447},{791,794},{1008,1013},{1014,1017},{1051,1054},{1208,1213},{1214,1217},{1250,1253},{1754,1759},{1760,1763},{1802,1805}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{51,52},{53,54},{72,73},{93,94},{96,97},{151,152},{172,174},{241,242},{243,244},{261,262},{297,299},{302,303},{329,330},{348,350},{421,422},{423,424},{453,454},{456,457},{459,460},{477,478},{521,523},{568,570},{615,617},{662,664},{709,711},{756,758},{829,831},{857,858},{932,933},{958,959},{977,978},{1023,1024},{1026,1027},{1029,1030},{1133,1134},{1159,1160},{1178,1179},{1223,1224},{1226,1227},{1229,1230},{1337,1338},{1358,1360},{1377,1379},{1427,1429},{1477,1479},{1527,1529},{1577,1579},{1627,1629},{1717,1719},{1769,1770},{1772,1773},{1775,1776}};
        array_function_name_color = new int[][]{{4,18},{199,212},{375,394},{884,898},{1086,1099},{1284,1303}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "from Choice import *\n" +
                "\n" +
                "def main():\n" +
                "    print(\"\\n--------------------------\")\n" +
                "    print(\" NUMBER SYSTEM CONVERSION\")\n" +
                "    print(\"--------------------------\")\n" +
                "    print(\"1. Binary to octal\")\n" +
                "    print(\"2. Binary to decimal\")\n" +
                "    print(\"3. Binary to hexadecimal\")\n" +
                "    print(\"4. Octal to binary\")\n" +
                "    print(\"5. Octal to decimal\")\n" +
                "    print(\"6. Octal to hexadecimal\")\n" +
                "    print(\"7. Decimal to binary\")\n" +
                "    print(\"8. Decimal to octal\")\n" +
                "    print(\"9. Decimal to hexadecimal\")\n" +
                "    print(\"10. Hexadecimal to binary\")\n" +
                "    print(\"11. Hexadecimal to octal\")\n" +
                "    print(\"12. Hexadecimal to decimal\")\n" +
                "    print(\"13. Exit from system\")\n" +
                "    print()\n" +
                "    ch = int(input(\"Choose your choice: \"))\n" +
                "\n" +
                "    if ch==1:\n" +
                "        choice1()\n" +
                "    elif ch==2:\n" +
                "        choice2()\n" +
                "    elif ch==3:\n" +
                "        choice3()\n" +
                "    elif ch==4:\n" +
                "        choice4()\n" +
                "    elif ch==5:\n" +
                "        choice5()\n" +
                "    elif ch==6:\n" +
                "        choice6()\n" +
                "    elif ch==7:\n" +
                "        choice7()\n" +
                "    elif ch==8:\n" +
                "        choice8()\n" +
                "    elif ch==9:\n" +
                "        choice9()\n" +
                "    elif ch==10:\n" +
                "        choice10()\n" +
                "    elif ch==11:\n" +
                "        choice11()\n" +
                "    elif ch==12:\n" +
                "        choice12()\n" +
                "    elif ch==13:\n" +
                "        return True\n" +
                "    else:\n" +
                "        print(\"\\nInvalid choice\")\n" +
                "\n" +
                "try:\n" +
                "    while main()!=True:\n" +
                "        pass\n" +
                "except:\n" +
                "    print(\"Exception occurs\")";


        array_string_color = new int[][]{{44,45},{47,74},{86,113},{125,153},{165,185},{197,219},{231,257},{269,289},{301,322},{334,359},{371,393},{405,426},{438,465},{477,504},{516,542},{554,582},{594,616},{649,671},{1148,1149},{1151,1166},{1229,1247}};
        array_keyword_color_1 = new int[][]{{0,4},{12,18},{22,25},{45,47},{679,681},{711,715},{745,749},{779,783},{813,817},{847,851},{881,885},{915,919},{949,953},{983,987},{1019,1023},{1055,1059},{1091,1095},{1112,1123},{1128,1132},{1149,1151},{1169,1172},{1178,1183},{1192,1196},{1206,1210},{1211,1217}};
        array_keyword_color_2 = new int[][]{{38,43},{80,85},{119,124},{159,164},{191,196},{225,230},{263,268},{295,300},{328,333},{365,370},{399,404},{432,437},{471,476},{510,515},{548,553},{588,593},{622,627},{639,642},{643,648},{1142,1147},{1223,1228}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{686,687},{720,723},{754,755},{788,789},{822,823},{856,857},{890,891},{924,925},{958,959},{992,994},{1028,1030},{1064,1066},{1100,1102}};
        array_function_name_color = new int[][]{{26,30}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "--------------------------\n" +
                " NUMBER SYSTEM CONVERSION\n" +
                "--------------------------\n" +
                "1. Binary to octal\n" +
                "2. Binary to decimal\n" +
                "3. Binary to hexadecimal\n" +
                "4. Octal to binary\n" +
                "5. Octal to decimal\n" +
                "6. Octal to hexadecimal\n" +
                "7. Decimal to binary\n" +
                "8. Decimal to octal\n" +
                "9. Decimal to hexadecimal\n" +
                "10. Hexadecimal to binary\n" +
                "11. Hexadecimal to octal\n" +
                "12. Hexadecimal to decimal\n" +
                "13. Exit from system\n" +
                "\n" +
                "Choose your choice: 10\n" +
                "\n" +
                "Enter hexadecimal number: 1B23\n" +
                "\n" +
                "Hexadecimal 1B23 in Binary = 1101100100011\n" +
                "\n" +
                "--------------------------\n" +
                " NUMBER SYSTEM CONVERSION\n" +
                "--------------------------\n" +
                "1. Binary to octal\n" +
                "2. Binary to decimal\n" +
                "3. Binary to hexadecimal\n" +
                "4. Octal to binary\n" +
                "5. Octal to decimal\n" +
                "6. Octal to hexadecimal\n" +
                "7. Decimal to binary\n" +
                "8. Decimal to octal\n" +
                "9. Decimal to hexadecimal\n" +
                "10. Hexadecimal to binary\n" +
                "11. Hexadecimal to octal\n" +
                "12. Hexadecimal to decimal\n" +
                "13. Exit from system\n" +
                "\n" +
                "Choose your choice: 13";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),LibraryManagementSystem.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),BirthdaySaverApplication.class);
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
            String shareMessage = "Project :- Number system conversion" +
                    "\n\n\nChoice.py \n\n" + program1 +
                    "\n\n\nConversions.py \n\n" + program2 +
                    "\n\n\nMain.py \n\n" + program3 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}