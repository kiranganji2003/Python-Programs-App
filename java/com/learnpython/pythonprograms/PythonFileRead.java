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

public class PythonFileRead extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_file_read);

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
        actionBar.setTitle("Python file read");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"Python file reading\")\n" +
                "print(\"\\\"r\\\" - Write - will read the file content\")\n" +
                "file = open(\"myfile.txt\",\"r\")\n" +
                "print(\"\\nmyfile.txt\\n\")\n" +
                "print(file.read())";

        array_string_color = new int[][]{{6,27},{35,36},{38,39},{41,79},{93,105},{106,109},{117,118},{120,130},{132,133}};
        array_keyword_color_1 = new int[][]{{36,38},{39,41},{118,120},{130,132}};
        array_keyword_color_2 = new int[][]{{0,5},{29,34},{88,92},{111,116},{135,140}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Python file reading\n" +
                "\"r\" - Write - will read the file content\n" +
                "\n" +
                "myfile.txt\n" +
                "\n" +
                "Python file handling\n" +
                "\"w\" - Write - will overwrite the existing content";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "class Data:\n" +
                "    def menu(self):\n" +
                "        while True:\n" +
                "            print(\"1. Add Customer Record\")\n" +
                "            print(\"2. Display Customer Record\")\n" +
                "            print(\"3. Exit\")\n" +
                "            ch = int(input(\"Choose your choice: \"))\n" +
                "            if ch==1:\n" +
                "                self.add_record()\n" +
                "            elif ch==2:\n" +
                "                self.display_records()\n" +
                "            elif ch==3:\n" +
                "                break\n" +
                "            else:\n" +
                "                print(\"Invalid choice\\n\")\n" +
                "\n" +
                "    def add_record(self):\n" +
                "        file = open(\"customer.txt\",\"a\")\n" +
                "        print()\n" +
                "        name = input(\"Enter customer name: \")\n" +
                "        product = input(\"Enter product name: \")\n" +
                "        quantity = input(\"Enter product quantity: \")\n" +
                "        name = name+\" \"\n" +
                "        product = product+\" \"\n" +
                "        quantity = quantity+\"\\n\"\n" +
                "        file.write(name)\n" +
                "        file.write(product)\n" +
                "        file.write(quantity)\n" +
                "        file.close()\n" +
                "        print(\"Customer record added successfully\\n\")\n" +
                "\n" +
                "    def display_records(self):\n" +
                "        print()\n" +
                "        try:\n" +
                "            file = open(\"customer.txt\",\"r\")\n" +
                "            print(\"Customer records\\n\")\n" +
                "            print(file.read())\n" +
                "        except FileNotFoundError:\n" +
                "            print(\"File not found\")\n" +
                "        \n" +
                "obj = Data()\n" +
                "obj.menu()";

        array_string_color = new int[][]{{70,94},{114,142},{162,171},{200,222},{430,445},{447,448},{497,511},{512,515},{554,577},{603,625},{652,678},{700,703},{730,733},{762,763},{765,766},{884,919},{921,922},{1009,1023},{1024,1027},{1047,1064},{1066,1067},{1152,1168}};
        array_keyword_color_1 = new int[][]{{16,19},{40,50},{237,239},{293,297},{356,360},{384,389},{402,406},{445,447},{455,458},{763,765},{919,921},{929,932},{980,983},{1064,1066},{1108,1114}};
        array_keyword_color_2 = new int[][]{{0,5},{64,69},{108,113},{156,161},{190,193},{194,199},{424,429},{492,496},{525,530},{548,553},{597,602},{646,651},{878,883},{964,969},{1004,1008},{1041,1046},{1081,1086},{1115,1132},{1146,1151}};
        array_self_color = new int[][]{{25,29},{263,267},{321,325},{470,474},{949,953}};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{244,245},{302,303},{365,366}};
        array_function_name_color = new int[][]{{20,24},{459,469},{933,948}};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "1. Add Customer Record\n" +
                "2. Display Customer Record\n" +
                "3. Exit\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter customer name: Shyam\n" +
                "Enter product name: Notebooks\n" +
                "Enter product quantity: 3\n" +
                "Customer record added successfully\n" +
                "\n" +
                "1. Add Customer Record\n" +
                "2. Display Customer Record\n" +
                "3. Exit\n" +
                "Choose your choice: 1\n" +
                "\n" +
                "Enter customer name: Jaya\n" +
                "Enter product name: Pencils\n" +
                "Enter product quantity: 12\n" +
                "Customer record added successfully\n" +
                "\n" +
                "1. Add Customer Record\n" +
                "2. Display Customer Record\n" +
                "3. Exit\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Customer records\n" +
                "\n" +
                "Shyam Notebooks 3\n" +
                "Jaya Pencils 12\n" +
                "\n" +
                "1. Add Customer Record\n" +
                "2. Display Customer Record\n" +
                "3. Exit\n" +
                "Choose your choice: 3";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Student info\")\n" +
                "name = \"Rajkumar\"\n" +
                "roll = \"43\"\n" +
                "\n" +
                "file = open(\"student.txt\",\"w\")\n" +
                "file.write(name)\n" +
                "file.write(\"\\n\")\n" +
                "file.write(roll)\n" +
                "file.close()\n" +
                "\n" +
                "file = open(\"student.txt\",\"r\")\n" +
                "print(\"Student name:\",file.read(8))";

        array_string_color = new int[][]{{6,20},{29,39},{47,51},{65,78},{79,82},{112,113},{115,116},{161,174},{175,178},{186,201}};
        array_keyword_color_1 = new int[][]{{113,115}};
        array_keyword_color_2 = new int[][]{{0,5},{60,64},{156,160},{180,185}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{212,213}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Student info\n" +
                "Student name: Rajkumar";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFileReadline.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFileWrite.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python file read");
            String shareMessage = "Python file read" +
                    "\n\n\nExample 1:\n\n" + example1 +
                    "\n\nOutput :-\n\n" + output1 +
                    "\n\n\nExample 2:\n\n" + example2 +
                    "\n\nOutput :-\n\n" + output2 +
                    "\n\n\nExample 3:\n\n" + example3 +
                    "\n\nOutput :-\n\n" + output3 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}