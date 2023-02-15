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

public class BirthdaySaverApplication extends AppCompatActivity {

    String program1,program2,program3,program4;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_saver_application);

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
        actionBar.setTitle("Birthday saver application");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "def add_birthday():\n" +
                "    name = input(\"Enter the name: \")\n" +
                "    flag = 0\n" +
                "    \n" +
                "    while True:\n" +
                "        dd = int(input(\"Enter the date: \"))\n" +
                "        if dd>=1 and dd<=31:\n" +
                "            flag = 1\n" +
                "        if flag==1:\n" +
                "            flag = 0\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nEnter valid date\")\n" +
                "\n" +
                "    while True:\n" +
                "        mm = int(input(\"Enter the month: \"))\n" +
                "        if mm>=1 and mm<=12:\n" +
                "            flag = 1\n" +
                "        if flag==1:\n" +
                "            flag = 0\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nEnter valid month\")\n" +
                "\n" +
                "    yy = int(input(\"Enter the year: \"))\n" +
                "\n" +
                "    if dd<10:\n" +
                "        temp = dd\n" +
                "        dd = \"0\"+str(dd)\n" +
                "    if mm<10:\n" +
                "        temp = mm\n" +
                "        mm = \"0\"+str(mm)\n" +
                "    \n" +
                "    file = open(\"birthday.txt\",\"a\")\n" +
                "    file.write(name)\n" +
                "    file.write(\"\\n\")\n" +
                "    file.write(str(dd))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.write(str(mm))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.write(str(yy))\n" +
                "    file.write(\"\\n\")\n" +
                "    file.close()\n" +
                "\n" +
                "    print(\"\\nRecord added successfully\")";
        array_string_color = new int[][]{{37,55},{114,132},{276,277},{279,296},{338,357},{501,502},{504,522},{544,562},{611,614},{668,671},{701,715},{716,719},{757,758},{760,761},{802,803},{805,806},{847,848},{850,851},{892,893},{895,896},{926,927},{929,955}};
        array_keyword_color_1 = new int[][]{{0,3},{79,89},{143,145},{152,155},{193,195},{238,243},{252,256},{277,279},{303,313},{368,370},{377,380},{418,420},{463,468},{477,481},{502,504},{570,572},{576,578},{627,629},{633,635},{758,760},{803,805},{848,850},{893,895},{927,929}};
        array_keyword_color_2 = new int[][]{{31,36},{104,107},{108,113},{270,275},{328,331},{332,337},{495,500},{534,537},{538,543},{615,618},{672,675},{696,700},{778,781},{823,826},{868,871},{920,925}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{68,69},{150,151},{160,162},{183,184},{202,203},{224,225},{375,376},{385,387},{408,409},{427,428},{449,450}};
        array_function_name_color = new int[][]{{4,16}};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program2 = "def see_all_birthdays():\n" +
                "    try:\n" +
                "        file  = open(\"birthday.txt\",\"r\")\n" +
                "        count,name,dd,mm,yy =0,0,0,0,0\n" +
                "        \n" +
                "        for i in file:\n" +
                "            count+=1\n" +
                "            if count==1:\n" +
                "                name = i\n" +
                "            elif count==2:\n" +
                "                dd = i\n" +
                "            elif count==3:\n" +
                "                mm = i\n" +
                "            elif count==4:\n" +
                "                count = 0\n" +
                "                yy = i\n" +
                "                print(\"\\n----------------------------\")\n" +
                "                print(\"        Name :\",name,end=\"\")\n" +
                "                print(\"  Birth date :\",dd,end=\"\")\n" +
                "                print(\" Birth Month :\",mm,end=\"\")\n" +
                "                print(\"  Birth Year :\",yy,end=\"\")\n" +
                "                \n" +
                "            \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"\\nFile is empty\")";

        array_string_color = new int[][]{{55,69},{70,73},{415,416},{418,447},{471,487},{497,499},{523,539},{547,549},{573,589},{597,599},{623,639},{647,649},{725,726},{728,742}};
        array_keyword_color_1 = new int[][]{{0,3},{29,32},{131,134},{137,139},{179,181},{229,233},{279,283},{329,333},{416,418},{685,691},{726,728}};
        array_keyword_color_2 = new int[][]{{50,54},{409,414},{465,470},{517,522},{567,572},{617,622},{692,709},{719,724}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{493,496},{543,546},{593,596},{643,646}};
        array_number_color = new int[][]{{104,105},{106,107},{108,109},{110,111},{112,113},{165,166},{189,190},{241,242},{291,292},{341,342},{368,369}};
        array_function_name_color = new int[][]{{4,21}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.program2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(program2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program3 = "def search_birthday():\n" +
                "    try:\n" +
                "        file = open(\"birthday.txt\",\"r\")\n" +
                "        print()\n" +
                "        name = input(\"Enter the name of person: \")\n" +
                "        count,flag = 0,0\n" +
                "        name += \"\\n\"\n" +
                "        birth_date = []\n" +
                "        \n" +
                "        for i in file:\n" +
                "            count = count%4+1\n" +
                "            \n" +
                "            if count==1 and name==i:\n" +
                "                flag = 1\n" +
                "                birth_date.append(i)\n" +
                "                \n" +
                "            elif count==2 and flag==1:\n" +
                "                birth_date.append(i)\n" +
                "                \n" +
                "            elif count==3 and flag==1:\n" +
                "                birth_date.append(i)\n" +
                "                \n" +
                "            elif count==4 and flag==1:\n" +
                "                flag = 2\n" +
                "                birth_date.append(i)\n" +
                "                print(\"\\nSearch result found\")\n" +
                "                print(\"\\n----------------------------\")\n" +
                "                print(\"        Name :\",birth_date[0],end=\"\")\n" +
                "                print(\"  Birth date :\",birth_date[1],end=\"\")\n" +
                "                print(\" Birth Month :\",birth_date[2],end=\"\")\n" +
                "                print(\"  Birth Year :\",birth_date[3])\n" +
                "                \n" +
                "            if flag==2:\n" +
                "                break\n" +
                "\n" +
                "        if flag==0:\n" +
                "            print(\"\\nSearch result not found\")\n" +
                "                \n" +
                "    except FileNotFoundError:\n" +
                "        print(\"File not found\")";

        array_string_color = new int[][]{{52,66},{67,70},{109,137},{180,181},{183,184},{709,710},{712,732},{756,757},{759,788},{812,828},{847,849},{873,889},{908,910},{934,950},{969,971},{995,1011},{1129,1130},{1132,1156},{1219,1235}};
        array_keyword_color_1 = new int[][]{{0,3},{27,30},{181,183},{226,229},{232,234},{296,298},{308,311},{412,416},{426,429},{505,509},{519,522},{598,602},{612,615},{710,712},{757,759},{1056,1058},{1084,1089},{1099,1101},{1130,1132},{1179,1185}};
        array_keyword_color_2 = new int[][]{{47,51},{80,85},{103,108},{703,708},{750,755},{806,811},{867,872},{928,933},{989,994},{1123,1128},{1186,1203},{1213,1218}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{843,846},{904,907},{965,968}};
        array_number_color = new int[][]{{160,161},{162,163},{267,268},{269,270},{306,307},{344,345},{424,425},{436,437},{517,518},{529,530},{610,611},{622,623},{648,649},{840,841},{901,902},{962,963},{1023,1024},{1065,1066},{1108,1109}};
        array_function_name_color = new int[][]{{4,19}};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.program3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(program3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        program4 = "from Add_Birthday import *\n" +
                "from See_All_Birthdays import *\n" +
                "from Search_Birthday import *\n" +
                "\n" +
                "def main():\n" +
                "    while True:\n" +
                "        print(\"\\n----------------------------\")\n" +
                "        print(\" Birthday Saver Application\")\n" +
                "        print(\"----------------------------\")\n" +
                "        print(\"1. Add birthday\")\n" +
                "        print(\"2. See all birthdays\")\n" +
                "        print(\"3. Search birthday\")\n" +
                "        print(\"4. Clear all birthdays\")\n" +
                "        print(\"5. Exit\\n\")\n" +
                "        ch = int(input(\"Choose your choice: \"))\n" +
                "\n" +
                "        if ch==1:\n" +
                "            add_birthday()\n" +
                "        elif ch==2:\n" +
                "            see_all_birthdays()\n" +
                "        elif ch==3:\n" +
                "            search_birthday()\n" +
                "        elif ch==4:\n" +
                "            file = open(\"birthday.txt\",\"w\")\n" +
                "            file.truncate()\n" +
                "            file.close()\n" +
                "            print(\"\\nCleared successfully\")\n" +
                "        elif ch==5:\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"\\nInvalid choice\")\n" +
                "            \n" +
                "try:\n" +
                "    main()\n" +
                "except:\n" +
                "    print(\"Exception occurs\")";


        array_string_color = new int[][]{{132,133},{135,164},{180,209},{225,255},{271,288},{304,326},{342,362},{378,402},{418,426},{428,429},{454,476},{671,685},{686,689},{762,763},{765,786},{858,859},{861,876},{925,943}};
        array_keyword_color_1 = new int[][]{{0,4},{18,24},{27,31},{50,56},{59,63},{80,86},{90,93},{106,116},{133,135},{426,428},{488,490},{533,537},{585,589},{635,639},{763,765},{796,800},{820,825},{834,838},{859,861},{891,894},{907,913}};
        array_keyword_color_2 = new int[][]{{126,131},{174,179},{219,224},{265,270},{298,303},{336,341},{372,377},{412,417},{444,447},{448,453},{666,670},{756,761},{852,857},{919,924}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{495,496},{542,543},{594,595},{644,645},{805,806}};
        array_function_name_color = new int[][]{{94,98}};
        array_comments = new int[][]{};
        TextView t_ex4 = findViewById(R.id.program4);
        t_ex4.setText(ColouredProgramText.execute(new SpannableString(program4),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "Enter the name: Kiran Kumar\n" +
                "Enter the date: 11\n" +
                "Enter the month: 1\n" +
                "Enter the year: 1998\n" +
                "\n" +
                "Record added successfully\n" +
                "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "Enter the name: Manish Kumar\n" +
                "Enter the date: 23\n" +
                "Enter the month: 12\n" +
                "Enter the year: 1997\n" +
                "\n" +
                "Record added successfully\n" +
                "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "Enter the name: Rakesh Singh\n" +
                "Enter the date: 14\n" +
                "Enter the month: 9\n" +
                "Enter the year: 1998\n" +
                "\n" +
                "Record added successfully\n" +
                "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "----------------------------\n" +
                "        Name : Kiran Kumar\n" +
                "  Birth date : 11\n" +
                " Birth Month : 01\n" +
                "  Birth Year : 1998\n" +
                "\n" +
                "----------------------------\n" +
                "        Name : Manish Kumar\n" +
                "  Birth date : 23\n" +
                " Birth Month : 12\n" +
                "  Birth Year : 1997\n" +
                "\n" +
                "----------------------------\n" +
                "        Name : Rakesh Singh\n" +
                "  Birth date : 14\n" +
                " Birth Month : 09\n" +
                "  Birth Year : 1998\n" +
                "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 3\n" +
                "\n" +
                "Enter the name of person: Rakesh Singh\n" +
                "\n" +
                "Search result found\n" +
                "\n" +
                "----------------------------\n" +
                "        Name : Rakesh Singh\n" +
                "  Birth date : 14\n" +
                " Birth Month : 09\n" +
                "  Birth Year : 1998\n" +
                "\n" +
                "\n" +
                "----------------------------\n" +
                " Birthday Saver Application\n" +
                "----------------------------\n" +
                "1. Add birthday\n" +
                "2. See all birthdays\n" +
                "3. Search birthday\n" +
                "4. Clear all birthdays\n" +
                "5. Exit\n" +
                "\n" +
                "Choose your choice: 5";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),NumberSystemConversion.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),JosephusProblemUsingQueue.class);
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
            String shareMessage = "Project :- Birthday saver application" +
                    "\n\n\nAdd_Birthday.py \n\n" + program1 +
                    "\n\n\nSee_All_Birthdays.py \n\n" + program2 +
                    "\n\n\nSearch_Birthday.py \n\n" + program3 +
                    "\n\n\nMain.py \n\n" + program4 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}