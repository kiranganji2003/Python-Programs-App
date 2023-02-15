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

public class PythonReadFileUsingForLoop extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_read_file_using_for_loop);

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
        actionBar.setTitle("Python read file using for loop");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"type \\\"StopExit\\\" to stop the paragraph\")\n" +
                "print(\"Enter your paragraph here ...\")\n" +
                "\n" +
                "inp = \"\"\n" +
                "file = open(\"paragraph.txt\",\"w\")\n" +
                "while True:\n" +
                "    inp = input()\n" +
                "    if inp!=\"StopExit\":        \n" +
                "        file.write(inp)\n" +
                "        file.write(\"\\n\")\n" +
                "    else:\n" +
                "        break\n" +
                "    \n" +
                "file.close()\n" +
                "\n" +
                "file = open(\"paragraph.txt\",\"r\")\n" +
                "print(\"\\nSaved paragraph\")\n" +
                "for i in file:\n" +
                "    print(i,end=\"\")";

        array_string_color = new int[][]{{6,12},{14,22},{24,47},{55,86},{95,97},{110,125},{126,129},{173,183},{236,237},{239,240},{297,312},{313,316},{324,325},{327,343},{376,378}};
        array_keyword_color_1 = new int[][]{{12,14},{22,24},{131,141},{165,167},{237,239},{246,250},{260,265},{325,327},{345,348},{351,353}};
        array_keyword_color_2 = new int[][]{{0,5},{49,54},{105,109},{153,158},{292,296},{318,323},{364,369}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{372,375}};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "type \"StopExit\" to stop the paragraph\n" +
                "Enter your paragraph here ...\n" +
                "There is a tree in the backyard.\n" +
                "It is a mango tree.\n" +
                "It has many fruits.\n" +
                "The fruits are green.\n" +
                "They all look fresh and clean\n" +
                "StopExit\n" +
                "\n" +
                "Saved paragraph\n" +
                "There is a tree in the backyard.\n" +
                "It is a mango tree.\n" +
                "It has many fruits.\n" +
                "The fruits are green.\n" +
                "They all look fresh and clean";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "def Tasks():\n" +
                "    while True:\n" +
                "        print(\"1. Add task\")\n" +
                "        print(\"2. View all tasks\")\n" +
                "        print(\"3. Clear all tasks\")\n" +
                "        print(\"4. Exit\")\n" +
                "        print()\n" +
                "        ch = int(input(\"Choose your choice: \"))\n" +
                "        if ch==1:\n" +
                "            print()\n" +
                "            file  = open(\"Tasks.txt\",\"a\")\n" +
                "            task = input(\"Enter the task: \")\n" +
                "            file.write(task)\n" +
                "            file.write(\"\\n\")\n" +
                "            file.close()\n" +
                "            print()\n" +
                "        elif ch==2:\n" +
                "            read = open(\"Tasks.txt\",\"r\")\n" +
                "            print(\"\\nYour tasks\")\n" +
                "            count =0 \n" +
                "            for i in read:\n" +
                "                count = count+1 \n" +
                "                print(\"{}. {}\".format(count,i),end=\"\")\n" +
                "            print()\n" +
                "        elif ch==3:\n" +
                "            file = open(\"Tasks.txt\",\"w\")\n" +
                "            file.truncate()\n" +
                "            file.close()\n" +
                "            print(\"\\nAll tasks cleared\\n\")\n" +
                "        elif ch==4:\n" +
                "            break\n" +
                "        else:\n" +
                "            print(\"Invalid choice\")\n" +
                "    file.close()\n" +
                "\n" +
                "try:\n" +
                "    Tasks()\n" +
                "except FileNotFoundError:\n" +
                "    print(\"File not found\")\n" +
                "except Exception:\n" +
                "    print(\"Exception occurs\")";

        array_string_color = new int[][]{{43,56},{72,91},{107,127},{143,152},{193,215},{281,292},{293,296},{323,341},{395,396},{398,399},{490,501},{502,505},{525,526},{528,539},{645,653},{674,676},{742,753},{754,757},{830,831},{833,850},{852,853},{925,941},{1014,1030},{1060,1078}};
        array_keyword_color_1 = new int[][]{{0,3},{17,27},{226,228},{396,398},{454,458},{526,528},{575,578},{581,583},{706,710},{831,833},{850,852},{863,867},{887,892},{901,905},{961,964},{978,984},{1032,1038}};
        array_keyword_color_2 = new int[][]{{37,42},{66,71},{101,106},{137,142},{162,167},{183,186},{187,192},{248,253},{276,280},{317,322},{438,443},{485,489},{519,524},{639,644},{690,695},{737,741},{824,829},{919,924},{985,1002},{1008,1013},{1039,1048},{1054,1059}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{{670,673}};
        array_number_color = new int[][]{{233,234},{463,464},{560,561},{620,621},{715,716},{872,873}};
        array_function_name_color = new int[][]{{4,9}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "1. Add task\n" +
                "2. View all tasks\n" +
                "3. Clear all tasks\n" +
                "4. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter the task: Practising maths\n" +
                "\n" +
                "1. Add task\n" +
                "2. View all tasks\n" +
                "3. Clear all tasks\n" +
                "4. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter the task: Going to playground at 11 Am\n" +
                "\n" +
                "1. Add task\n" +
                "2. View all tasks\n" +
                "3. Clear all tasks\n" +
                "4. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Your tasks\n" +
                "1. Practising maths\n" +
                "2. Going to playground at 11 Am\n" +
                "\n" +
                "1. Add task\n" +
                "2. View all tasks\n" +
                "3. Clear all tasks\n" +
                "4. Exit\n" +
                "\n" +
                "Choose your choice: 4";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonDeleteFile.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFileReadline.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python read file using for loop");
            String shareMessage = "Python read file using for loop" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}