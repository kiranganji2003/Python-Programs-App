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

public class LibraryManagementSystem extends AppCompatActivity {

    String program1,program2,program3,program4,program5,program6,program7;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_management_system);

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
        actionBar.setTitle("Library Management System");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "def add():\n" +
                "    print()\n" +
                "    book_id = input(\"Enter book id: \")\n" +
                "    book_name = input(\"Enter the book name: \")\n" +
                "    author = input(\"Enter author name: \")\n" +
                "\n" +
                "    file = open(\"Library Books.txt\",\"a\")\n" +
                "    book_id += \";\"\n" +
                "    book_name += \";\"\n" +
                "    author += \";\"\n" +
                "    file.write(book_id)\n" +
                "    file.write(book_name)\n" +
                "    file.write(author)\n" +
                "    file.write(\"\\n\")\n" +
                "    print(\"\\nBook added successfully\")";

        array_string_color = new int[][]{{43,60},{84,107},{128,149},{168,187},{188,191},{208,211},{229,232},{247,250},{339,340},{342,343},{355,356},{358,382}};
        array_keyword_color_1 = new int[][]{{0,3},{340,342},{356,358}};
        array_keyword_color_2 = new int[][]{{15,20},{37,42},{78,83},{122,127},{163,167},{349,354}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{{4,7}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "from os import remove\n" +
                "\n" +
                "def delete():\n" +
                "    try:\n" +
                "        file = open(\"Library Books.txt\",\"r\")\n" +
                "        book_id,empty = \"\",0\n" +
                "        books_list = []\n" +
                "        flag,deleted_book = 0,\"\"\n" +
                "        \n" +
                "        for book in file:\n" +
                "            if empty==0:\n" +
                "                print()\n" +
                "                book_id = input(\"Enter book id: \")\n" +
                "                empty = 1\n" +
                "                \n" +
                "            temp_id = \"\"\n" +
                "            for i in range(len(book)):\n" +
                "                if book[i]!=\";\":\n" +
                "                    temp_id += book[i]\n" +
                "                else:\n" +
                "                    break     \n" +
                "            if book_id == temp_id:\n" +
                "                deleted_book = book\n" +
                "                flag = 1\n" +
                "            else:\n" +
                "                books_list.append(book)\n" +
                "\n" +
                "        file.close()\n" +
                "\n" +
                "        if empty==0:\n" +
                "            print(\"\\nLibrary books list is empty\") \n" +
                "            return\n" +
                "        \n" +
                "        if flag==1:\n" +
                "            remove(\"Library Books.txt\")\n" +
                "            file = open(\"Library Books.txt\",\"a\")\n" +
                "            for book in books_list:\n" +
                "                file.write(book)\n" +
                "            file.close()\n" +
                "            \n" +
                "            count,id,book_name,author_name,str = 1,\"\",\"\",\"\",\"\"\n" +
                "            for i in range(len(deleted_book)):\n" +
                "                if deleted_book[i]==';':\n" +
                "                    if count==1:\n" +
                "                        id = str\n" +
                "                        str = \"\"\n" +
                "                        count = 2\n" +
                "                    elif count==2:\n" +
                "                        book_name = str\n" +
                "                        str = \"\"\n" +
                "                        count = 3\n" +
                "                    elif count==3:\n" +
                "                        author_name = str\n" +
                "                else:\n" +
                "                    str += deleted_book[i]\n" +
                "                    \n" +
                "            print(\"\\nBOOK DETAILS\")\n" +
                "            print(\"\\n----------------------------\")\n" +
                "            print(\"    Book id :\",id)\n" +
                "            print(\"  Book name :\",book_name)\n" +
                "            print(\"author_name :\",author_name)\n" +
                "            print(\"----------------------------\")\n" +
                "            print(\"\\nThe book record is deleted successfully\")\n" +
                "            \n" +
                "        else:\n" +
                "            print(\"\\nThe book id is not found\")\n" +
                "                            \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nLibrary books list is empty\")";

        array_string_color = new int[][]{{66,85},{86,89},{115,117},{174,176},{293,310},{377,379},{447,450},{760,761},{763,791},{861,880},{906,925},{926,929},{1089,1091},{1092,1094},{1095,1097},{1098,1100},{1184,1187},{1285,1287},{1427,1429},{1645,1646},{1648,1661},{1681,1682},{1684,1713},{1733,1748},{1771,1786},{1816,1831},{1863,1893},{1913,1914},{1916,1956},{2003,2004},{2006,2031},{2106,2107},{2109,2137}};
        array_keyword_color_1 = new int[][]{{0,4},{8,14},{23,26},{41,44},{194,197},{203,205},{224,226},{392,395},{398,400},{507,511},{533,538},{556,558},{652,656},{729,731},{761,763},{806,812},{830,832},{943,946},{952,954},{1113,1116},{1119,1121},{1164,1166},{1209,1211},{1342,1346},{1484,1488},{1557,1561},{1646,1648},{1682,1684},{1914,1916},{1979,1983},{2004,2006},{2066,2072},{2107,2109}};
        array_keyword_color_2 = new int[][]{{61,65},{253,258},{287,292},{401,406},{407,410},{435,437},{754,759},{901,905},{1122,1127},{1128,1131},{1639,1644},{1675,1680},{1727,1732},{1765,1770},{1810,1815},{1857,1862},{1907,1912},{1997,2002},{2073,2090},{2100,2105}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{118,119},{172,173},{234,235},{336,337},{638,639},{739,740},{839,840},{1087,1088},{1219,1220},{1320,1321},{1354,1355},{1462,1463},{1496,1497}};
        array_function_name_color = new int[][]{{27,33}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "def display():\n" +
                "    try:\n" +
                "        file = open(\"Library Books.txt\",\"r\")\n" +
                "        empty = 0\n" +
                "        for book in file:\n" +
                "            if empty==0:\n" +
                "                print(\"\\nAVAILABLE BOOKS\")\n" +
                "                empty = 1\n" +
                "            book_id,book_name,author_name,str,count = \"\",\"\",\"\",\"\",1\n" +
                "            for i in range(len(book)):\n" +
                "                if book[i]==';':\n" +
                "                    if count==1:\n" +
                "                        book_id = str\n" +
                "                        str = \"\"\n" +
                "                        count = 2\n" +
                "                    elif count==2:\n" +
                "                        book_name = str\n" +
                "                        str = \"\"\n" +
                "                        count = 3\n" +
                "                    elif count==3:\n" +
                "                        author_name = str\n" +
                "                else:\n" +
                "                    str += book[i]\n" +
                "            print(\"\\n----------------------------\")\n" +
                "            print(\"    Book id :\",book_id)\n" +
                "            print(\"  Book name :\",book_name)\n" +
                "            print(\"author_name :\",author_name)\n" +
                "            print(\"----------------------------\")\n" +
                "\n" +
                "        if empty==0:\n" +
                "            print(\"\\nLibrary books list is empty\")\n" +
                "            \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nLibrary books list is empty\")";

        array_string_color = new int[][]{{44,63},{64,67},{160,161},{163,179},{261,263},{264,266},{267,269},{270,272},{342,345},{448,450},{590,592},{779,780},{782,811},{831,846},{874,889},{919,934},{966,996},{1038,1039},{1041,1069},{1128,1129},{1131,1159}};
        array_keyword_color_1 = new int[][]{{0,3},{19,22},{95,98},{104,106},{125,127},{161,163},{287,290},{293,295},{330,332},{367,369},{505,509},{647,651},{720,724},{780,782},{1007,1009},{1039,1041},{1088,1094},{1129,1131}};
        array_keyword_color_2 = new int[][]{{39,43},{154,159},{296,301},{302,305},{773,778},{825,830},{868,873},{913,918},{960,965},{1032,1037},{1095,1112},{1122,1127}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{85,86},{135,136},{205,206},{273,274},{377,378},{483,484},{517,518},{625,626},{659,660},{1017,1018}};
        array_function_name_color = new int[][]{{4,11}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program4 = "from os import remove \n" +
                "\n" +
                "def issue_book():\n" +
                "    try:\n" +
                "        file = open(\"Library Books.txt\",\"r\")\n" +
                "        book_id = \"\"\n" +
                "        books_list = []\n" +
                "        flag,deleted_book,empty = 0,\"\",0\n" +
                "        \n" +
                "        for book in file:\n" +
                "            if empty==0:\n" +
                "                book_id = input(\"Enter book id: \")\n" +
                "                empty = 1\n" +
                "            id,count = \"\",0\n" +
                "            for i in range(len(book)):\n" +
                "                if book[i]!=\";\":\n" +
                "                    id += book[i]\n" +
                "                else:\n" +
                "                    break     \n" +
                "            if book_id == id:\n" +
                "                deleted_book = book\n" +
                "                flag = 1\n" +
                "            else:\n" +
                "                books_list.append(book)\n" +
                "\n" +
                "        file.close()\n" +
                "        \n" +
                "        if flag==1:\n" +
                "            remove(\"Library Books.txt\")\n" +
                "            file = open(\"Library Books.txt\",\"a\")\n" +
                "            for book in books_list:\n" +
                "                file.write(book)\n" +
                "            print()\n" +
                "            std_id = input(\"Enter student id: \")\n" +
                "            std_name = input(\"Enter student name: \")\n" +
                "            std_id += \";\"\n" +
                "            std_name += \";\"\n" +
                "            file = open(\"Issue Books.txt\",\"a\")\n" +
                "            file.write(std_id)\n" +
                "            file.write(std_name)\n" +
                "            file.write(\"\\n\")\n" +
                "            file.write(deleted_book)\n" +
                "            print(\"\\nThe book is issued to student successfully\")\n" +
                "        else:\n" +
                "            print(\"\\nBook id not found\")\n" +
                "\n" +
                "        if empty==0:\n" +
                "            print(\"\\nLibrary books list is empty\")        \n" +
                "\n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nLibrary books list is empty\")";

        array_string_color = new int[][]{{71,90},{91,94},{114,116},{177,179},{274,291},{342,344},{414,417},{725,744},{770,789},{790,793},{911,931},{962,984},{1008,1011},{1036,1039},{1064,1081},{1082,1085},{1174,1175},{1177,1178},{1235,1236},{1238,1281},{1315,1316},{1318,1336},{1378,1379},{1381,1409},{1464,1465},{1467,1495}};
        array_keyword_color_1 = new int[][]{{0,4},{8,14},{24,27},{46,49},{199,202},{208,210},{229,231},{359,362},{365,367},{402,404},{469,473},{495,500},{518,520},{609,613},{694,696},{807,810},{816,818},{1175,1177},{1236,1238},{1291,1295},{1316,1318},{1347,1349},{1379,1381},{1424,1430},{1465,1467}};
        array_keyword_color_2 = new int[][]{{66,70},{268,273},{368,373},{374,377},{765,769},{876,881},{905,910},{956,961},{1059,1063},{1229,1234},{1309,1314},{1372,1377},{1431,1448},{1458,1463}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{175,176},{180,181},{239,240},{317,318},{345,346},{595,596},{703,704},{1357,1358}};
        array_function_name_color = new int[][]{{28,38}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.program4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(program4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program5 = "from os import remove\n" +
                "\n" +
                "def take_book():\n" +
                "    try:\n" +
                "        file = open(\"Issue Books.txt\",\"r\")\n" +
                "        stud_id = \"\"\n" +
                "        empty,line,book,completed,next = 0,1,0,0,0\n" +
                "        std_id,std_name,book_details,str = \"\",\"\",\"\",\"\"\n" +
                "        book_id,book_name,author_name = \"\",\"\",\"\"\n" +
                "        issuing = []\n" +
                "        \n" +
                "        for data in file:\n" +
                "            if empty==0:\n" +
                "                print()\n" +
                "                stud_id = input(\"Enter the student id: \")\n" +
                "                empty = 1\n" +
                "            flag = 0\n" +
                "            str = \"\"\n" +
                "            if line==1:\n" +
                "                if completed==1:\n" +
                "                    issuing.append(data)\n" +
                "                else:\n" +
                "                    flip = 0\n" +
                "                    for i in range(len(data)):\n" +
                "                        if data[i]!=';':\n" +
                "                            str += data[i]\n" +
                "                        else:\n" +
                "                            if flip==0:\n" +
                "                                std_id = str\n" +
                "                                str = \"\"\n" +
                "                                flag = 1\n" +
                "                                flip = 1\n" +
                "                            else:\n" +
                "                                std_name = str\n" +
                "                    if stud_id==std_id:\n" +
                "                        book = 1\n" +
                "                    if flag!=1:\n" +
                "                        issuing.append(data)\n" +
                "                line = 2\n" +
                "            elif line==2:\n" +
                "                line = 1\n" +
                "                if completed==1:\n" +
                "                    issuing.append(data)\n" +
                "                else:\n" +
                "                    if book==1:\n" +
                "                        book_details = data\n" +
                "                        next = 1\n" +
                "                        completed = 1\n" +
                "                    else:\n" +
                "                        issuing.append(data)\n" +
                "\n" +
                "        if empty==0:\n" +
                "            print(\"\\nIssuing books list is empty\")\n" +
                "            return\n" +
                "        \n" +
                "        if next==1:\n" +
                "            file = open(\"Library Books.txt\",\"a\")\n" +
                "            file.write(book_details)\n" +
                "            remove(\"Issue Books.txt\")\n" +
                "            file = open(\"Issue Books.txt\",\"a\")\n" +
                "            for i in issuing:\n" +
                "                file.write(i)\n" +
                "            count = 1\n" +
                "            str = \"\"\n" +
                "            for i in book_details:\n" +
                "                if i==';':\n" +
                "                    if count==1:\n" +
                "                        book_id = str\n" +
                "                        str = \"\"\n" +
                "                        count = 2\n" +
                "                    elif count==2:\n" +
                "                        book_name = str\n" +
                "                        str = \"\"\n" +
                "                        count = 3\n" +
                "                    elif count==3:\n" +
                "                        author_name = str\n" +
                "                else:\n" +
                "                    str += i\n" +
                "                            \n" +
                "            print(\"\\nBOOK ISSUING DETAILS\")\n" +
                "            print(\"\\n----------------------------\")\n" +
                "            print(\"  Student id :\",std_id)\n" +
                "            print(\"Student name :\",std_name)\n" +
                "            print(\"     Book id :\",book_id)\n" +
                "            print(\"   Book name :\",book_name)\n" +
                "            print(\" author_name :\",author_name)\n" +
                "            print(\"----------------------------\")\n" +
                "            print(\"\\nSuccessfully returned the book\")\n" +
                "            \n" +
                "        else:\n" +
                "            print(\"\\nStudent ID\",stud_id,\"did not take any books\")\n" +
                "            \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nIssuing books list is empty\")";

        array_string_color = new int[][]{{69,86},{87,90},{110,112},{207,209},{210,212},{213,215},{216,218},{259,261},{262,264},{265,267},{405,429},{496,498},{731,734},{932,934},{1678,1679},{1681,1709},{1783,1802},{1803,1806},{1864,1881},{1907,1924},{1925,1928},{2030,2032},{2090,2093},{2196,2198},{2338,2340},{2550,2551},{2553,2574},{2594,2595},{2597,2626},{2646,2662},{2689,2705},{2734,2750},{2778,2794},{2824,2840},{2872,2902},{2922,2923},{2925,2956},{3003,3004},{3006,3017},{3026,3050},{3109,3110},{3112,3140}};
        array_keyword_color_1 = new int[][]{{0,4},{8,14},{23,26},{44,47},{306,309},{315,317},{336,338},{511,513},{539,541},{613,617},{668,671},{674,676},{719,721},{803,807},{837,839},{1045,1049},{1118,1120},{1191,1193},{1285,1289},{1340,1342},{1414,1418},{1440,1442},{1587,1591},{1647,1649},{1679,1681},{1723,1729},{1747,1749},{1942,1945},{1948,1950},{2045,2048},{2051,2053},{2084,2086},{2115,2117},{2253,2257},{2395,2399},{2468,2472},{2551,2553},{2595,2597},{2923,2925},{2979,2983},{3004,3006},{3069,3075},{3110,3112}};
        array_keyword_color_2 = new int[][]{{64,68},{365,370},{399,404},{677,682},{683,686},{1672,1677},{1778,1782},{1902,1906},{2544,2549},{2588,2593},{2640,2645},{2683,2688},{2728,2733},{2772,2777},{2818,2823},{2866,2871},{2916,2921},{2997,3002},{3076,3093},{3103,3108}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{154,155},{156,157},{158,159},{160,161},{162,163},{346,347},{455,456},{476,477},{520,521},{553,554},{646,647},{846,847},{974,975},{1015,1016},{1169,1170},{1200,1201},{1271,1272},{1296,1297},{1322,1323},{1354,1355},{1449,1450},{1527,1528},{1565,1566},{1657,1658},{1756,1757},{2010,2011},{2125,2126},{2231,2232},{2265,2266},{2373,2374},{2407,2408}};
        array_function_name_color = new int[][]{{27,36}};
        array_comments = new int[][]{};
        TextView t_ex5 = findViewById(R.id.program5);
        t_ex5.setText(ColouredProgramText.execute(new SpannableString(program5),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program6 = "def show():\n" +
                "    try:\n" +
                "        file = open(\"Issue Books.txt\",\"r\")\n" +
                "        empty,line = 0,1\n" +
                "        std_id,std_name = \"\",\"\"\n" +
                "        book_id,book_name,author_name = \"\",\"\",\"\"\n" +
                "        for data in file:\n" +
                "            if empty==0:\n" +
                "                print(\"\\nBOOK ISSUING DETAILS\")\n" +
                "                empty = 1\n" +
                "            str = \"\"\n" +
                "            if line==1:\n" +
                "                flip = 0\n" +
                "                for i in range(len(data)):\n" +
                "                    if data[i]!=';':\n" +
                "                        str += data[i]\n" +
                "                    else:\n" +
                "                        if flip==0:\n" +
                "                            std_id = str\n" +
                "                            str = \"\"\n" +
                "                            flip = 1\n" +
                "                        else:\n" +
                "                            std_name = str\n" +
                "                line = 2\n" +
                "            elif line==2:\n" +
                "                line = 1\n" +
                "                count = 1\n" +
                "                for i in data:\n" +
                "                    if i==';':\n" +
                "                        if count==1:\n" +
                "                            book_id = str\n" +
                "                            str = \"\"\n" +
                "                            count = 2\n" +
                "                        elif count==2:\n" +
                "                            book_name = str\n" +
                "                            str = \"\"\n" +
                "                            count = 3\n" +
                "                        elif count==3:\n" +
                "                            author_name = str\n" +
                "                    else:\n" +
                "                        str += i\n" +
                "                            \n" +
                "                print(\"\\n----------------------------\")\n" +
                "                print(\"  Student id :\",std_id)\n" +
                "                print(\"Student name :\",std_name)\n" +
                "                print(\"     Book id :\",book_id)\n" +
                "                print(\"   Book name :\",book_name)\n" +
                "                print(\" author_name :\",author_name)\n" +
                "                print(\"----------------------------\")\n" +
                "\n" +
                "        if empty==0:\n" +
                "            print(\"\\nNo students taken the books\")\n" +
                "        \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nNo students taken the books\")";

        array_string_color = new int[][]{{41,58},{59,62},{115,117},{118,120},{161,163},{164,166},{167,169},{243,244},{246,267},{313,315},{440,443},{621,623},{893,896},{1011,1013},{1169,1171},{1405,1406},{1408,1437},{1461,1477},{1508,1524},{1557,1573},{1605,1621},{1655,1671},{1707,1737},{1779,1780},{1782,1810},{1865,1866},{1868,1896}};
        array_keyword_color_1 = new int[][]{{0,3},{16,19},{178,181},{187,189},{208,210},{244,246},{328,330},{381,384},{387,389},{428,430},{504,508},{534,536},{685,689},{771,775},{852,855},{858,860},{887,889},{922,924},{1076,1080},{1234,1238},{1315,1319},{1406,1408},{1748,1750},{1780,1782},{1825,1831},{1866,1868}};
        array_keyword_color_2 = new int[][]{{36,40},{237,242},{390,395},{396,399},{1399,1404},{1455,1460},{1502,1507},{1551,1556},{1599,1604},{1649,1654},{1701,1706},{1773,1778},{1832,1849},{1859,1864}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{85,86},{87,88},{218,219},{293,294},{337,338},{363,364},{543,544},{659,660},{757,758},{782,783},{808,809},{834,835},{932,933},{1050,1051},{1088,1089},{1208,1209},{1246,1247},{1758,1759}};
        array_function_name_color = new int[][]{{4,8}};
        array_comments = new int[][]{};
        TextView t_ex6 = findViewById(R.id.program6);
        t_ex6.setText(ColouredProgramText.execute(new SpannableString(program6),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program7 = "from AddBookInLibrary import *\n" +
                "from DeleteTheBookFromLibrary import *\n" +
                "from ListAllAvailableBooks import *\n" +
                "from IssueBookToStudent import *\n" +
                "from TakeBackTheBook import *\n" +
                "from DisplayStudentsWhoHaveTakenTheBooks import *\n" +
                "\n" +
                "def Library():\n" +
                "    library_name = \"\"\n" +
                "    try:\n" +
                "        file = open(\"Library.txt\",\"r\")\n" +
                "        library_name = file.readline()\n" +
                "    except FileNotFoundError:\n" +
                "        library_name = input(\"Enter the library name: \")\n" +
                "        file = open(\"Library.txt\",\"w\")\n" +
                "        file.write(library_name)\n" +
                "        file.close()\n" +
                "    return library_name\n" +
                "\n" +
                "def main():\n" +
                "    name = Library()\n" +
                "    print(\"\\n-----------------------------------\")\n" +
                "    print(\"      WELCOME TO\",name)\n" +
                "    print(\"-----------------------------------\")\n" +
                "    print(\"1. Add book in library\")\n" +
                "    print(\"2. Delete the book from library\")\n" +
                "    print(\"3. List all available books\")\n" +
                "    print(\"4. Issue book to student\")\n" +
                "    print(\"5. Take back the book\")\n" +
                "    print(\"6. Display students who have taken the books\")\n" +
                "    print(\"7. Close the program\")\n" +
                "    print()\n" +
                "    ch = int(input(\"Choose your choice: \"))\n" +
                "    if ch==1:\n" +
                "        add()\n" +
                "    elif ch==2:\n" +
                "        delete()\n" +
                "    elif ch==3:\n" +
                "        display()\n" +
                "    elif ch==4:\n" +
                "        issue_book()\n" +
                "    elif ch==5:\n" +
                "        take_book()\n" +
                "    elif ch==6:\n" +
                "        show()\n" +
                "    elif ch==7:\n" +
                "        return 1\n" +
                "    else:\n" +
                "        print(\"\\nInvalid choice\")\n" +
                "    return 0\n" +
                "\n" +
                "try:\n" +
                "    while main()!=1:\n" +
                "        pass\n" +
                "except:\n" +
                "    print(\"Exception occurs\")";

        array_string_color = new int[][]{{254,256},{286,299},{300,303},{403,429},{451,464},{465,468},{592,593},{595,631},{643,661},{678,715},{727,751},{763,796},{808,837},{849,875},{887,910},{922,968},{980,1002},{1035,1057},{1316,1317},{1319,1334},{1407,1425}};
        array_keyword_color_1 = new int[][]{{0,4},{22,28},{31,35},{61,66},{70,74},{97,103},{106,110},{130,136},{139,143},{160,166},{169,173},{210,216},{220,223},{261,264},{348,354},{528,534},{549,552},{593,595},{1064,1066},{1092,1096},{1125,1129},{1159,1163},{1196,1200},{1232,1236},{1263,1267},{1283,1289},{1296,1300},{1317,1319},{1340,1346},{1350,1353},{1359,1364},{1384,1388},{1389,1395}};
        array_keyword_color_2 = new int[][]{{281,285},{355,372},{397,402},{446,450},{586,591},{637,642},{672,677},{721,726},{757,762},{802,807},{843,848},{881,886},{916,921},{974,979},{1008,1013},{1025,1028},{1029,1034},{1310,1315},{1401,1406}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{1071,1072},{1101,1102},{1134,1135},{1168,1169},{1205,1206},{1241,1242},{1272,1273},{1290,1291},{1347,1348},{1373,1374}};
        array_function_name_color = new int[][]{{224,231},{553,557}};
        array_comments = new int[][]{};
        TextView t_ex7 = findViewById(R.id.program7);
        t_ex7.setText(ColouredProgramText.execute(new SpannableString(program7),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the library name: My Knowledge\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 3\n" +
                "\n" +
                "Library books list is empty\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter book id: BK01\n" +
                "Enter the book name: The Power Of Your Subconscious Mind\n" +
                "Enter author name: Dr. Joseph Murphy\n" +
                "\n" +
                "Book added successfully\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter book id: BK02\n" +
                "Enter the book name: Think & Grow Rich\n" +
                "Enter author name: Napoleon Hill\n" +
                "\n" +
                "Book added successfully\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 5\n" +
                "\n" +
                "Issuing books list is empty\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 4\n" +
                "Enter book id: BK01\n" +
                "\n" +
                "Enter student id: STD_134\n" +
                "Enter student name: Jack\n" +
                "\n" +
                "The book is issued to student successfully\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 3\n" +
                "\n" +
                "AVAILABLE BOOKS\n" +
                "\n" +
                "----------------------------\n" +
                "    Book id : BK02\n" +
                "  Book name : Think & Grow Rich\n" +
                "author_name : Napoleon Hill\n" +
                "----------------------------\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Enter book id: BK02\n" +
                "\n" +
                "BOOK DETAILS\n" +
                "\n" +
                "----------------------------\n" +
                "    Book id : BK02\n" +
                "  Book name : Think & Grow Rich\n" +
                "author_name : Napoleon Hill\n" +
                "----------------------------\n" +
                "\n" +
                "The book record is deleted successfully\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 3\n" +
                "\n" +
                "Library books list is empty\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 5\n" +
                "\n" +
                "Enter the student id: STD_134\n" +
                "\n" +
                "BOOK ISSUING DETAILS\n" +
                "\n" +
                "----------------------------\n" +
                "  Student id : STD_134\n" +
                "Student name : Jack\n" +
                "     Book id : BK01\n" +
                "   Book name : The Power Of Your Subconscious Mind\n" +
                " author_name : Dr. Joseph Murphy\n" +
                "----------------------------\n" +
                "\n" +
                "Successfully returned the book\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 3\n" +
                "\n" +
                "AVAILABLE BOOKS\n" +
                "\n" +
                "----------------------------\n" +
                "    Book id : BK01\n" +
                "  Book name : The Power Of Your Subconscious Mind\n" +
                "author_name : Dr. Joseph Murphy\n" +
                "----------------------------\n" +
                "\n" +
                "-----------------------------------\n" +
                "      WELCOME TO My Knowledge\n" +
                "-----------------------------------\n" +
                "1. Add book in library\n" +
                "2. Delete the book from library\n" +
                "3. List all available books\n" +
                "4. Issue book to student\n" +
                "5. Take back the book\n" +
                "6. Display students who have taken the books\n" +
                "7. Close the program\n" +
                "\n" +
                "Choose your choice: 7";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),MathQuiz.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),NumberSystemConversion.class);
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
            String shareMessage = "Project :- Library Management System" +
                    "\n\n\nAddBookInLibrary.py \n\n" + program1 +
                    "\n\n\nDeleteTheBookFromLibrary.py \n\n" + program2 +
                    "\n\n\nListAllAvailableBooks.py \n\n" + program3 +
                    "\n\n\nIssueBookToStudent.py \n\n" + program4 +
                    "\n\n\nTakeBackTheBook.py \n\n" + program5 +
                    "\n\n\nDisplayStudentsWhoHaveTakenTheBooks.py \n\n" + program6 +
                    "\n\n\nMain.py \n\n" + program7 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}