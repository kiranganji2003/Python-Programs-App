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

public class MathQuiz extends AppCompatActivity {

    String program1,program2,program3,program4,program5,program6;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);

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
        actionBar.setTitle("Math quiz application");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "correct = ['c','b','c','c','b']\n" +
                "score = 0\n" +
                "\n" +
                "def check(q):\n" +
                "    global correct,score\n" +
                "    while True:\n" +
                "        print()\n" +
                "        ans = input(\"Enter your answer: \")\n" +
                "        if ans=='a' or ans=='b' or ans=='c' or ans=='d':\n" +
                "            if ans==correct[q-1]:\n" +
                "                print(\"\\nCorrect answer\")\n" +
                "                score += 1\n" +
                "            else:\n" +
                "                print(\"\\nWrong answer\")\n" +
                "                print(\"Correct answer is:\",correct[q-1])\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nPlease choose valid choice\")\n" +
                "        \n" +
                "\n" +
                "def quiz1():\n" +
                "    print(\"1. 23 ___ 19\")\n" +
                "    print(\"a. =\")\n" +
                "    print(\"b. <\")\n" +
                "    print(\"c. >\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(1)\n" +
                "\n" +
                "    print(\"\\n2. ___ comes before 52\")\n" +
                "    print(\"a. 50\")\n" +
                "    print(\"b. 51\")\n" +
                "    print(\"c. 52\")\n" +
                "    print(\"d. 53\")\n" +
                "    check(2)\n" +
                "\n" +
                "    print(\"\\n3. 2 tens and 5 ones = ___\")\n" +
                "    print(\"a. 50\")\n" +
                "    print(\"b. 52\")\n" +
                "    print(\"c. 25\")\n" +
                "    print(\"d. 23\")\n" +
                "    check(3)\n" +
                "\n" +
                "    print(\"\\n4. 104 ___ 113\")\n" +
                "    print(\"a. >\")\n" +
                "    print(\"b. =\")\n" +
                "    print(\"c. <\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(4)\n" +
                "\n" +
                "    print(\"\\n5. ___ comes after 79\")\n" +
                "    print(\"a. 81\")\n" +
                "    print(\"b. 80\")\n" +
                "    print(\"c. 79\")\n" +
                "    print(\"d. 78\")\n" +
                "    check(5)\n" +
                "\n" +
                "    global score\n" +
                "    print(\"\\nTotal Score: {}/{}\".format(score,5))";

        array_string_color = new int[][]{{11,14},{15,18},{19,22},{23,26},{27,30},{134,155},{173,176},{185,188},{197,200},{209,212},{270,271},{273,288},{357,358},{360,373},{397,417},{482,483},{485,512},{547,561},{573,579},{591,597},{609,615},{627,645},{671,672},{674,697},{709,716},{728,735},{747,754},{766,773},{799,800},{802,829},{841,848},{860,867},{879,886},{898,905},{931,932},{934,949},{961,967},{979,985},{997,1003},{1015,1033},{1059,1060},{1062,1084},{1096,1103},{1115,1122},{1134,1141},{1153,1160},{1203,1204},{1206,1225}};
        array_keyword_color_1 = new int[][]{{43,46},{61,67},{86,96},{165,167},{177,179},{189,191},{201,203},{226,228},{271,273},{329,333},{358,360},{391,396},{444,449},{458,462},{483,485},{524,527},{672,674},{800,802},{932,934},{1060,1062},{1180,1186},{1204,1206}};
        array_keyword_color_2 = new int[][]{{106,111},{128,133},{264,269},{351,356},{476,481},{541,546},{567,572},{585,590},{603,608},{621,626},{665,670},{703,708},{722,727},{741,746},{760,765},{793,798},{835,840},{854,859},{873,878},{892,897},{925,930},{955,960},{973,978},{991,996},{1009,1014},{1053,1058},{1090,1095},{1109,1114},{1128,1133},{1147,1152},{1197,1202}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41},{244,245},{315,316},{428,429},{657,658},{785,786},{917,918},{1045,1046},{1172,1173},{1239,1240}};
        array_function_name_color = new int[][]{{47,52},{528,533}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "correct = ['b','c','b','c','b']\n" +
                "score = 0\n" +
                "\n" +
                "def check(q):\n" +
                "    global correct,score\n" +
                "    while True:\n" +
                "        print()\n" +
                "        ans = input(\"Enter your answer: \")\n" +
                "        if ans=='a' or ans=='b' or ans=='c' or ans=='d':\n" +
                "            if ans==correct[q-1]:\n" +
                "                print(\"\\nCorrect answer\")\n" +
                "                score += 1\n" +
                "            else:\n" +
                "                print(\"\\nWrong answer\")\n" +
                "                print(\"Correct answer is:\",correct[q-1])\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nPlease choose valid choice\")\n" +
                "        \n" +
                "\n" +
                "def quiz2():\n" +
                "    print(\"1. Add 1 to largest 3 digit number\")\n" +
                "    print(\"a. 2000\")\n" +
                "    print(\"b. 1000\")\n" +
                "    print(\"c. 3000\")\n" +
                "    print(\"d. 999\")\n" +
                "    check(1)\n" +
                "\n" +
                "    print(\"\\n2. Add 450 to smallest 3-digit number\")\n" +
                "    print(\"a. 650\")\n" +
                "    print(\"b. 450\")\n" +
                "    print(\"c. 550\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(2)\n" +
                "\n" +
                "    print(\"\\n3. 752 – 245 = ___\")\n" +
                "    print(\"a. 705\")\n" +
                "    print(\"b. 507\")\n" +
                "    print(\"c. 570\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(3)\n" +
                "\n" +
                "    print(\"\\n4. Multiplication is ___\")\n" +
                "    print(\"a. Repeated subtraction\")\n" +
                "    print(\"b. Addition\")\n" +
                "    print(\"c. Repeated addition\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(4)\n" +
                "\n" +
                "    print(\"\\n5. Fifty seven rupees and seventy five paise = ___\")\n" +
                "    print(\"a. Rs. 75.57\")\n" +
                "    print(\"b. Rs. 57.75\")\n" +
                "    print(\"c. Rs. 57.57\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(5)\n" +
                "\n" +
                "    global score\n" +
                "    print(\"\\nTotal Score: {}/{}\".format(score,5))";

        array_string_color = new int[][]{{11,14},{15,18},{19,22},{23,26},{27,30},{134,155},{173,176},{185,188},{197,200},{209,212},{270,271},{273,288},{357,358},{360,373},{397,417},{482,483},{485,512},{547,583},{595,604},{616,625},{637,646},{658,666},{692,693},{695,733},{745,753},{765,773},{785,793},{805,823},{849,850},{852,871},{883,891},{903,911},{923,931},{943,961},{987,988},{990,1015},{1027,1052},{1064,1077},{1089,1111},{1123,1141},{1167,1168},{1170,1221},{1233,1247},{1259,1273},{1285,1299},{1311,1329},{1372,1373},{1375,1394}};
        array_keyword_color_1 = new int[][]{{43,46},{61,67},{86,96},{165,167},{177,179},{189,191},{201,203},{226,228},{271,273},{329,333},{358,360},{444,449},{458,462},{483,485},{524,527},{693,695},{850,852},{988,990},{1168,1170},{1349,1355},{1373,1375}};
        array_keyword_color_2 = new int[][]{{106,111},{128,133},{264,269},{351,356},{391,396},{476,481},{541,546},{589,594},{610,615},{631,636},{652,657},{686,691},{739,744},{759,764},{779,784},{799,804},{843,848},{877,882},{897,902},{917,922},{937,942},{981,986},{1021,1026},{1058,1063},{1083,1088},{1117,1122},{1161,1166},{1227,1232},{1253,1258},{1279,1284},{1305,1310},{1366,1371}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41},{244,245},{315,316},{428,429},{678,679},{835,836},{973,974},{1153,1154},{1341,1342},{1408,1409}};
        array_function_name_color = new int[][]{{47,52},{528,533}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "correct = ['c','b','b','a','d']\n" +
                "score = 0\n" +
                "\n" +
                "def check(q):\n" +
                "    global correct,score\n" +
                "    while True:\n" +
                "        print()\n" +
                "        ans = input(\"Enter your answer: \")\n" +
                "        if ans=='a' or ans=='b' or ans=='c' or ans=='d':\n" +
                "            if ans==correct[q-1]:\n" +
                "                print(\"\\nCorrect answer\")\n" +
                "                score += 1\n" +
                "            else:\n" +
                "                print(\"\\nWrong answer\")\n" +
                "                print(\"Correct answer is:\",correct[q-1])\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nPlease choose valid choice\")\n" +
                "        \n" +
                "\n" +
                "def quiz3():\n" +
                "    print(\"1. What is the predecessor of 56345?\")\n" +
                "    print(\"a. 56345\")\n" +
                "    print(\"b. 56346\")\n" +
                "    print(\"c. 56344\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(1)\n" +
                "\n" +
                "    print(\"\\n2. 35 thousands = ___ hundreds\")\n" +
                "    print(\"a. 35\")\n" +
                "    print(\"b. 350\")\n" +
                "    print(\"c. 3500\")\n" +
                "    print(\"d. 35000\")\n" +
                "    check(2)\n" +
                "\n" +
                "    print(\"\\n3. 103 + 52 + 11012 = 11012 + ___ + 103\")\n" +
                "    print(\"a. 103\")\n" +
                "    print(\"b. 52\")\n" +
                "    print(\"c. 11012\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(3)\n" +
                "\n" +
                "    print(\"\\n4. 1927 + 2738 has which number at hundred digit?\")\n" +
                "    print(\"a. 6\")\n" +
                "    print(\"b. 7\")\n" +
                "    print(\"c. 8\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(4)\n" +
                "\n" +
                "    print(\"\\n5. 818 * 9815 * ___ = 0\")\n" +
                "    print(\"a. 815\")\n" +
                "    print(\"b. 9815\")\n" +
                "    print(\"c. 50\")\n" +
                "    print(\"d. 0\")\n" +
                "    check(5)\n" +
                "\n" +
                "    global score\n" +
                "    print(\"\\nTotal Score: {}/{}\".format(score,5))";

        array_string_color = new int[][]{{11,14},{15,18},{19,22},{23,26},{27,30},{134,155},{173,176},{185,188},{197,200},{209,212},{270,271},{273,288},{357,358},{360,373},{397,417},{482,483},{485,512},{547,585},{597,607},{619,629},{641,651},{663,681},{707,708},{710,741},{753,760},{772,780},{792,801},{813,823},{849,850},{852,892},{904,912},{924,931},{943,953},{965,983},{1009,1010},{1012,1062},{1074,1080},{1092,1098},{1110,1116},{1128,1146},{1172,1173},{1175,1199},{1211,1219},{1231,1240},{1252,1259},{1271,1277},{1320,1321},{1323,1342}};
        array_keyword_color_1 = new int[][]{{43,46},{61,67},{86,96},{165,167},{177,179},{189,191},{201,203},{226,228},{271,273},{329,333},{358,360},{444,449},{458,462},{483,485},{524,527},{708,710},{850,852},{1010,1012},{1173,1175},{1297,1303},{1321,1323}};
        array_keyword_color_2 = new int[][]{{106,111},{128,133},{264,269},{351,356},{391,396},{476,481},{541,546},{591,596},{613,618},{635,640},{657,662},{701,706},{747,752},{766,771},{786,791},{807,812},{843,848},{898,903},{918,923},{937,942},{959,964},{1003,1008},{1068,1073},{1086,1091},{1104,1109},{1122,1127},{1166,1171},{1205,1210},{1225,1230},{1246,1251},{1265,1270},{1314,1319}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41},{244,245},{315,316},{428,429},{693,694},{835,836},{995,996},{1158,1159},{1289,1290},{1356,1357}};
        array_function_name_color = new int[][]{{47,52},{528,533}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program4 = "correct = ['d','b','c','a','a']\n" +
                "score = 0\n" +
                "\n" +
                "def check(q):\n" +
                "    global correct,score\n" +
                "    while True:\n" +
                "        print()\n" +
                "        ans = input(\"Enter your answer: \")\n" +
                "        if ans=='a' or ans=='b' or ans=='c' or ans=='d':\n" +
                "            if ans==correct[q-1]:\n" +
                "                print(\"\\nCorrect answer\")\n" +
                "                score += 1\n" +
                "            else:\n" +
                "                print(\"\\nWrong answer\")\n" +
                "                print(\"Correct answer is:\",correct[q-1])\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nPlease choose valid choice\")\n" +
                "        \n" +
                "\n" +
                "def quiz4():\n" +
                "    print(\"1. What you will get after adding 1 to greatest 6-digit number?\")\n" +
                "    print(\"a. 100000\")\n" +
                "    print(\"b. 999999\")\n" +
                "    print(\"c. 99999999\")\n" +
                "    print(\"d. 1000000\")\n" +
                "    check(1)\n" +
                "\n" +
                "    print(\"\\n2. If a number is subtracted from itself, then the result is ___\")\n" +
                "    print(\"a. Number itself\")\n" +
                "    print(\"b. Zero\")\n" +
                "    print(\"c. One\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(2)\n" +
                "\n" +
                "    print(\"\\n3. 157882 - 45067 + 12036 = ___\")\n" +
                "    print(\"a. 142851\")\n" +
                "    print(\"b. 412851\")\n" +
                "    print(\"c. 124851\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(3)\n" +
                "\n" +
                "    print(\"\\n4. 30677 ÷ 11, find the quotient and the remainder\")\n" +
                "    print(\"a. 2788 and 9\")\n" +
                "    print(\"b. 2688 and 9\")\n" +
                "    print(\"c. 2688 and 6\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(4)\n" +
                "\n" +
                "    print(\"\\n5. Which number is divisible by 4?\")\n" +
                "    print(\"a. 25688\")\n" +
                "    print(\"b. 13622\")\n" +
                "    print(\"c. 34534\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(5)\n" +
                "\n" +
                "    global score\n" +
                "    print(\"\\nTotal Score: {}/{}\".format(score,5))";

        array_string_color = new int[][]{{11,14},{15,18},{19,22},{23,26},{27,30},{134,155},{173,176},{185,188},{197,200},{209,212},{270,271},{273,288},{357,358},{360,373},{397,417},{482,483},{485,512},{547,612},{624,635},{647,658},{670,683},{695,707},{733,734},{736,801},{813,831},{843,852},{864,872},{884,902},{928,929},{931,963},{975,986},{998,1009},{1021,1032},{1044,1062},{1088,1089},{1091,1142},{1154,1169},{1181,1196},{1208,1223},{1235,1253},{1279,1280},{1282,1317},{1329,1339},{1351,1361},{1373,1383},{1395,1413},{1456,1457},{1459,1478}};
        array_keyword_color_1 = new int[][]{{43,46},{61,67},{86,96},{165,167},{177,179},{189,191},{201,203},{226,228},{271,273},{329,333},{358,360},{444,449},{458,462},{483,485},{524,527},{734,736},{929,931},{1089,1091},{1280,1282},{1433,1439},{1457,1459}};
        array_keyword_color_2 = new int[][]{{106,111},{128,133},{264,269},{351,356},{391,396},{476,481},{541,546},{618,623},{641,646},{664,669},{689,694},{727,732},{807,812},{837,842},{858,863},{878,883},{922,927},{969,974},{992,997},{1015,1020},{1038,1043},{1082,1087},{1148,1153},{1175,1180},{1202,1207},{1229,1234},{1273,1278},{1323,1328},{1345,1350},{1367,1372},{1389,1394},{1450,1455}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41},{244,245},{315,316},{428,429},{719,720},{914,915},{1074,1075},{1265,1266},{1425,1426},{1492,1493}};
        array_function_name_color = new int[][]{{47,52},{528,533}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.program4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(program4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program5 = "correct = ['c','b','d','b','c']\n" +
                "score = 0\n" +
                "\n" +
                "def check(q):\n" +
                "    global correct,score\n" +
                "    while True:\n" +
                "        print()\n" +
                "        ans = input(\"Enter your answer: \")\n" +
                "        if ans=='a' or ans=='b' or ans=='c' or ans=='d':\n" +
                "            if ans==correct[q-1]:\n" +
                "                print(\"\\nCorrect answer\")\n" +
                "                score += 1\n" +
                "            else:\n" +
                "                print(\"\\nWrong answer\")\n" +
                "                print(\"Correct answer is:\",correct[q-1])\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nPlease choose valid choice\")\n" +
                "        \n" +
                "\n" +
                "def quiz5():\n" +
                "    print(\"1. Length and breadth of a rectangle is 10 m and 8m respectively. Find the area of the rectangle\")\n" +
                "    print(\"a. 120 sq. m\")\n" +
                "    print(\"b. 100 sq. m\")\n" +
                "    print(\"c. 80 sq. m\")\n" +
                "    print(\"d. None of these\")\n" +
                "    check(1)\n" +
                "\n" +
                "    print(\"\\n2. If Cost Price is Rs. 85 and Selling Price is 105, then what is the profit?\")\n" +
                "    print(\"a. Rs. 15\")\n" +
                "    print(\"b. Rs. 20\")\n" +
                "    print(\"c. Rs. 25\")\n" +
                "    print(\"d. Rs. 30\")\n" +
                "    check(2)\n" +
                "\n" +
                "    print(\"\\n3. Ram bought a pen for Rs. 20 and sold it for Rs. 25. Find his percentage of gain\")\n" +
                "    print(\"a. 10%\")\n" +
                "    print(\"b. 15%\")\n" +
                "    print(\"c. 20%\")\n" +
                "    print(\"d. 25%\")\n" +
                "    check(3)\n" +
                "\n" +
                "    print(\"\\n4. 75% of Rs 1200 is equal to ___\")\n" +
                "    print(\"a. Rs. 750\")\n" +
                "    print(\"b. Rs. 900\")\n" +
                "    print(\"c. Rs. 800\")\n" +
                "    print(\"d. Rs. 950\")\n" +
                "    check(4)\n" +
                "\n" +
                "    print(\"\\n5. 275% of 2 liters is equal to ___\")\n" +
                "    print(\"a. 4.5 Liters\")\n" +
                "    print(\"b. 5 Liters\")\n" +
                "    print(\"c. 5.5 Liters\")\n" +
                "    print(\"d. 6 Liters\")\n" +
                "    check(5)\n" +
                "\n" +
                "    global score\n" +
                "    print(\"\\nTotal Score: {}/{}\".format(score,5))";

        array_string_color = new int[][]{{11,14},{15,18},{19,22},{23,26},{27,30},{134,155},{173,176},{185,188},{197,200},{209,212},{270,271},{273,288},{357,358},{360,373},{397,417},{482,483},{485,512},{547,645},{657,671},{683,697},{709,722},{734,752},{778,779},{781,859},{871,882},{894,905},{917,928},{940,951},{977,978},{980,1063},{1075,1083},{1095,1103},{1115,1123},{1135,1143},{1169,1170},{1172,1206},{1218,1230},{1242,1254},{1266,1278},{1290,1302},{1328,1329},{1331,1367},{1379,1394},{1406,1419},{1431,1446},{1458,1471},{1514,1515},{1517,1536}};
        array_keyword_color_1 = new int[][]{{43,46},{61,67},{86,96},{165,167},{177,179},{189,191},{201,203},{226,228},{271,273},{329,333},{358,360},{444,449},{458,462},{483,485},{524,527},{779,781},{978,980},{1170,1172},{1329,1331},{1491,1496},{1515,1517}};
        array_keyword_color_2 = new int[][]{{106,111},{128,133},{264,269},{351,356},{391,396},{476,481},{541,546},{651,656},{677,682},{703,708},{728,733},{772,777},{865,870},{888,893},{911,916},{934,939},{971,976},{1069,1074},{1089,1094},{1109,1114},{1129,1134},{1163,1168},{1212,1217},{1236,1241},{1260,1265},{1284,1289},{1322,1327},{1373,1378},{1400,1405},{1425,1430},{1452,1457},{1508,1513}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{40,41},{244,245},{315,316},{428,429},{764,765},{963,964},{1155,1156},{1314,1315},{1483,1484},{1550,1551}};
        array_function_name_color = new int[][]{{47,52},{528,533}};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.program5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(program5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program6 = "from Quiz1 import quiz1\n" +
                "from Quiz2 import quiz2\n" +
                "from Quiz3 import quiz3\n" +
                "from Quiz4 import quiz4\n" +
                "from Quiz5 import quiz5\n" +
                "from random import random\n" +
                "\n" +
                "def main():\n" +
                "    quiz_no = 0\n" +
                "    \n" +
                "    while True:\n" +
                "        while True:\n" +
                "            quiz_no = int(random()*6)\n" +
                "            if quiz_no!=0:\n" +
                "                break\n" +
                "            \n" +
                "        if quiz_no==1:\n" +
                "            quiz1()\n" +
                "        elif quiz_no==2:\n" +
                "            quiz2()\n" +
                "        elif quiz_no==3:\n" +
                "            quiz3()\n" +
                "        elif quiz_no==4:\n" +
                "            quiz4()\n" +
                "        elif quiz_no==5:\n" +
                "            quiz5()\n" +
                "\n" +
                "        ch = \"\"\n" +
                "        while True:\n" +
                "            print()\n" +
                "            ch = input(\"Do you want to give another quiz? (y/n): \")\n" +
                "            if not(ch=='y' or ch=='n'):\n" +
                "                print(\"\\nPlease enter valid choice\")\n" +
                "            else:\n" +
                "                break\n" +
                "\n" +
                "        if ch=='n':\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\n\")\n" +
                "    \n" +
                "try:\n" +
                "    main()\n" +
                "except:\n" +
                "    print(\"Exception occurs\")";

        array_string_color = new int[][]{{553,555},{619,662},{687,690},{698,701},{726,727},{729,755},{813,816},{868,869},{871,872},{913,931}};
        array_keyword_color_1 = new int[][]{{0,4},{11,17},{24,28},{35,41},{48,52},{59,65},{72,76},{83,89},{96,100},{107,113},{120,124},{132,138},{147,150},{184,194},{204,214},{266,268},{297,302},{324,326},{367,371},{412,416},{457,461},{502,506},{564,574},{676,682},{691,693},{727,729},{769,773},{791,796},{806,808},{830,835},{844,848},{869,871},{879,882},{895,901}};
        array_keyword_color_2 = new int[][]{{588,593},{613,618},{720,725},{862,867},{907,912}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{173,174},{251,252},{278,279},{336,337},{381,382},{426,427},{471,472},{516,517}};
        array_function_name_color = new int[][]{{151,155}};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.program6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(program6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "1. Length and breadth of a rectangle is 10 m and 8m respectively. Find the area of the rectangle\n" +
                "a. 120 sq. m\n" +
                "b. 100 sq. m\n" +
                "c. 80 sq. m\n" +
                "d. None of these\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "2. If Cost Price is Rs. 85 and Selling Price is 105, then what is the profit?\n" +
                "a. Rs. 15\n" +
                "b. Rs. 20\n" +
                "c. Rs. 25\n" +
                "d. Rs. 30\n" +
                "\n" +
                "Enter your answer: b\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "3. Ram bought a pen for Rs. 20 and sold it for Rs. 25. Find his percentage of gain\n" +
                "a. 10%\n" +
                "b. 15%\n" +
                "c. 20%\n" +
                "d. 25%\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Wrong answer\n" +
                "Correct answer is: d\n" +
                "\n" +
                "4. 75% of Rs 1200 is equal to ___\n" +
                "a. Rs. 750\n" +
                "b. Rs. 900\n" +
                "c. Rs. 800\n" +
                "d. Rs. 950\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Wrong answer\n" +
                "Correct answer is: b\n" +
                "\n" +
                "5. 275% of 2 liters is equal to ___\n" +
                "a. 4.5 Liters\n" +
                "b. 5 Liters\n" +
                "c. 5.5 Liters\n" +
                "d. 6 Liters\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "Total Score: 3/5\n" +
                "\n" +
                "Do you want to give another quiz? (y/n): y\n" +
                "\n" +
                "\n" +
                "1. 23 ___ 19\n" +
                "a. =\n" +
                "b. <\n" +
                "c. >\n" +
                "d. None of these\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "2. ___ comes before 52\n" +
                "a. 50\n" +
                "b. 51\n" +
                "c. 52\n" +
                "d. 53\n" +
                "\n" +
                "Enter your answer: b\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "3. 2 tens and 5 ones = ___\n" +
                "a. 50\n" +
                "b. 52\n" +
                "c. 25\n" +
                "d. 23\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "4. 104 ___ 113\n" +
                "a. >\n" +
                "b. =\n" +
                "c. <\n" +
                "d. None of these\n" +
                "\n" +
                "Enter your answer: c\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "5. ___ comes after 79\n" +
                "a. 81\n" +
                "b. 80\n" +
                "c. 79\n" +
                "d. 78\n" +
                "\n" +
                "Enter your answer: b\n" +
                "\n" +
                "Correct answer\n" +
                "\n" +
                "Total Score: 5/5\n" +
                "\n" +
                "Do you want to give another quiz? (y/n): n";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CustomerDataRecordSystem.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),LibraryManagementSystem.class);
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
            String shareMessage = "Project :- Math quiz application" +
                    "\n\n\nQuiz1.py \n\n" + program1 +
                    "\n\n\nQuiz2.py \n\n" + program2 +
                    "\n\n\nQuiz3.py \n\n" + program3 +
                    "\n\n\nQuiz4.py \n\n" + program4 +
                    "\n\n\nQuiz5.py \n\n" + program5 +
                    "\n\n\nMain.py \n\n" + program6 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}