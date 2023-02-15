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

public class DisplayingDataInTabularFormat extends AppCompatActivity {

    String program1;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaying_data_in_tabular_format);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Displaying data in tabular format");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program1 = "class Table:\n" +
                "    def __init__(self,name):\n" +
                "        self.name = name\n" +
                "        self.list = []\n" +
                "\n" +
                "def main():\n" +
                "    table_name = input(\"Enter table name: \")\n" +
                "    columns = int(input(\"Enter no. of columns: \"))\n" +
                "    print(\"Enter column names of\",columns,\"columns\")\n" +
                "    list = []\n" +
                "    for i in range(columns):\n" +
                "        column = Table(input(\"Enter column name: \"))\n" +
                "        list.append(column)\n" +
                "    while True:\n" +
                "        print(\"\\n1. Add record in table\")\n" +
                "        print(\"2. Display all records\")\n" +
                "        print(\"3. Exit\\n\")\n" +
                "        ch = int(input(\"Choose your choice: \"))\n" +
                "        if ch==1:\n" +
                "            for i in list:\n" +
                "                print(\"Enter\",table_name,i.name,\": \",end=\"\")\n" +
                "                i.list.append(input(\"\"))\n" +
                "            print(\"Record added successfully\")\n" +
                "        elif ch==2:\n" +
                "            print(\"\\n\",table_name,\"Table\\n\")\n" +
                "            for i in list:\n" +
                "                print(i.name,end=\"\\t\")\n" +
                "            print()\n" +
                "            row = len(list[0].list)\n" +
                "            col = len(list)\n" +
                "            for i in range(row):\n" +
                "                for j in range(col):\n" +
                "                    print(list[j].list[i],end=\"\\t\")\n" +
                "                print()\n" +
                "        elif ch==3:\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"Invalid choice\")\n" +
                "            \n" +
                "main()";

        int[][] array_string_color = {{126,146},{172,196},{209,232},{241,250},{324,345},{406,407},{409,432},{448,472},{488,496},{498,499},{524,546},{616,623},{642,646},{651,653},{691,693},{714,741},{781,782},{784,785},{797,803},{805,806},{868,869},{871,872},{1074,1075},{1077,1078},{1174,1190}};
        int[][] array_keyword_color_1 = {{0,5},{17,20},{91,94},{270,273},{276,278},{380,390},{407,409},{496,498},{557,559},{579,582},{585,587},{751,755},{782,784},{803,805},{820,823},{826,828},{869,871},{970,973},{976,978},{1007,1010},{1013,1015},{1075,1077},{1112,1116},{1136,1141},{1150,1154}};
        int[][] array_keyword_color_2 = {{120,125},{162,165},{166,171},{203,208},{279,284},{318,323},{400,405},{442,447},{482,487},{514,517},{518,523},{610,615},{685,690},{708,713},{775,780},{851,856},{886,891},{912,915},{948,951},{979,984},{1016,1021},{1048,1053},{1096,1101},{1168,1173}};
        int[][] array_self_color = {{30,34},{50,54},{75,79}};
        int[][] array_end_color = {{647,650},{864,867},{1070,1073}};
        int[][] array_number_color = {{564,565},{760,761},{921,922},{1121,1122}};
        int[][] array_function_name_color = {{95,99}};
        int[][] array_comments = {};
        int[][] array_special_function_color = {{21,29}};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments,array_special_function_color));

        output1 = "Enter table name: Teacher\n" +
                "Enter no. of columns: 4\n" +
                "Enter column names of 4 columns\n" +
                "Enter column name: Id\n" +
                "Enter column name: Name\n" +
                "Enter column name: Degree\n" +
                "Enter column name: Salary\n" +
                "\n" +
                "1. Add record in table\n" +
                "2. Display all records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "Enter Teacher Id : 1\n" +
                "Enter Teacher Name : Rahul\n" +
                "Enter Teacher Degree : B.A\n" +
                "Enter Teacher Salary : 12000\n" +
                "Record added successfully\n" +
                "\n" +
                "1. Add record in table\n" +
                "2. Display all records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "Enter Teacher Id : 2\n" +
                "Enter Teacher Name : Tanveer\n" +
                "Enter Teacher Degree : M.A\n" +
                "Enter Teacher Salary : 35000\n" +
                "Record added successfully\n" +
                "\n" +
                "1. Add record in table\n" +
                "2. Display all records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                " Teacher Table\n" +
                "\n" +
                "Id\tName\tDegree\tSalary\t\n" +
                "1\tRahul\tB.A\t12000\t\n" +
                "2\tTanveer\tM.A\t35000\t\n" +
                "\n" +
                "1. Add record in table\n" +
                "2. Display all records\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 3";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),JosephusProblemUsingQueue.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
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
            String shareMessage = "Project :- Displaying data in tabular format" +
                    "\n\n\nMain.py \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}