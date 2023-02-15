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

public class PythonDeleteFile extends AppCompatActivity {

    String example1,example2;
    String output1,output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_delete_file);

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
        actionBar.setTitle("Python delete file");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "from os import remove\n" +
                "\n" +
                "while True:\n" +
                "    print(\"1. Add student details in file\")\n" +
                "    print(\"2. Delete student file\")\n" +
                "    print(\"3. Exit\")\n" +
                "\n" +
                "    print()\n" +
                "    choice = int(input(\"Choose your choice: \"))\n" +
                "\n" +
                "    if choice==1:\n" +
                "        file = open(\"student.txt\",\"w\")\n" +
                "        file.write(input(\" Enter rollno: \"))\n" +
                "        file.write(input(\"   Enter name: \"))\n" +
                "        file.write(input(\"  Enter marks: \"))\n" +
                "        file.close()\n" +
                "        print(\"\\nAdded successfully\\n\")\n" +
                "        \n" +
                "    elif choice==2:\n" +
                "        try:\n" +
                "            remove(\"student.txt\")\n" +
                "            print(\"\\nDeleted successfully\\n\")\n" +
                "        except FileNotFoundError:\n" +
                "            print(\"File not found\\n\")\n" +
                "\n" +
                "    elif choice==3:\n" +
                "        break\n" +
                "\n" +
                "    else:\n" +
                "        print(\"Invalid choice\\n\")";

        array_string_color = new int[][]{{45,77},{89,113},{125,134},{172,194},{236,249},{250,253},{280,297},{325,342},{370,387},{425,426},{428,446},{448,449},{512,525},{545,546},{548,568},{570,571},{625,640},{642,643},{705,720},{722,723}};
        array_keyword_color_1 = new int[][]{{0,4},{8,14},{23,33},{202,204},{426,428},{446,448},{464,468},{488,491},{546,548},{568,570},{581,587},{640,642},{650,654},{674,679},{685,689},{720,722}};
        array_keyword_color_2 = new int[][]{{39,44},{83,88},{119,124},{141,146},{162,165},{166,171},{231,235},{274,279},{319,324},{364,369},{419,424},{539,544},{588,605},{619,624},{699,704}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{213,214},{477,478},{663,664}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "1. Add student details in file\n" +
                "2. Delete student file\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 1\n" +
                " Enter rollno: 12\n" +
                "   Enter name: John\n" +
                "  Enter marks: 98\n" +
                "\n" +
                "Added successfully\n" +
                "\n" +
                "1. Add student details in file\n" +
                "2. Delete student file\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 2\n" +
                "\n" +
                "Deleted successfully\n" +
                "\n" +
                "1. Add student details in file\n" +
                "2. Delete student file\n" +
                "3. Exit\n" +
                "\n" +
                "Choose your choice: 3";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "from os import *\n" +
                "\n" +
                "print(\"Delete the files\")\n" +
                "\n" +
                "file = input(\"Enter file name: \")\n" +
                "\n" +
                "if path.exists(file):\n" +
                "    remove(file)\n" +
                "    print(\"File deleted successfully\")\n" +
                "else:\n" +
                "    print(\"File does not exist\")";

        array_string_color = new int[][]{{24,42},{58,77},{129,156},{174,195}};
        array_keyword_color_1 = new int[][]{{0,4},{8,14},{80,82},{158,162}};
        array_keyword_color_2 = new int[][]{{18,23},{52,57},{123,128},{168,173}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Delete the files\n" +
                "Enter file name: Tasks.txt\n" +
                "File deleted successfully";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonReadFileUsingForLoop.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python delete file");
            String shareMessage = "Python delete file" +
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