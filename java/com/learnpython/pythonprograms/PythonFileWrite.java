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

public class PythonFileWrite extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_file_write);

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
        actionBar.setTitle("Python file write");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "print(\"Python file handling\")\n" +
                "print(\"\\\"w\\\" - Write - will overwrite the existing content\")\n" +
                "file = open(\"myfile.txt\",\"w\")\n" +
                "file.write(\"Python file handling\")\n" +
                "file.write(\"\\n\\\"w\\\" - Write - will overwrite the existing content\")\n" +
                "file.close()\n" +
                "print(\"In your directory myfile.txt file contains above data\")";

        array_string_color = new int[][]{{6,28},{36,37},{39,40},{42,89},{103,115},{116,119},{132,154},{167,168},{172,173},{175,222},{243,298}};
        array_keyword_color_1 = new int[][]{{37,39},{40,42},{168,172},{173,175}};
        array_keyword_color_2 = new int[][]{{0,5},{30,35},{98,102},{237,242}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Python file handling\n" +
                "\"w\" - Write - will overwrite the existing content\n" +
                "In your directory myfile.txt file contains above data";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "print(\"Python file handling\")\n" +
                "print(\"\\\"a\\\" - Append - will append to the end of the file\")\n" +
                "file = open(\"Myinfo.txt\",\"a\")\n" +
                "file.write(\"My name is John\")\n" +
                "file.write(\"\\nI am 22 years old\")\n" +
                "file.close()\n" +
                "print(\"In your directory Myinfo.txt file contains info\")";

        array_string_color = new int[][]{{6,28},{36,37},{39,40},{42,89},{103,115},{116,119},{132,149},{162,163},{165,183},{204,253}};
        array_keyword_color_1 = new int[][]{{37,39},{40,42},{163,165}};
        array_keyword_color_2 = new int[][]{{0,5},{30,35},{98,102},{198,203}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "Python file handling\n" +
                "\"a\" - Append - will append to the end of the file\n" +
                "In your directory Myinfo.txt file contains info";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);

        example3 = "print(\"Python file handling\")\n" +
                "print(\"Taking user input and writing this into file\")\n" +
                "print(\"Enter your today's task and type \\\"exit\\\" to stop accepting input\")\n" +
                "\n" +
                "file = open(\"Task List.txt\",\"a\")\n" +
                "inp = \"\"\n" +
                "while True:\n" +
                "    inp = input(\"\")\n" +
                "    if inp==\"exit\":\n" +
                "        break\n" +
                "    inp  = inp+\"\\n\"\n" +
                "    file.write(inp)\n" +
                "    \n" +
                "file.close()\n" +
                "print(\"Your tasks saved successfully\")";

        array_string_color = new int[][]{{6,28},{36,82},{90,124},{126,130},{132,157},{172,187},{188,191},{199,201},{230,232},{246,252},{283,284},{286,287},{332,363}};
        array_keyword_color_1 = new int[][]{{124,126},{130,132},{202,212},{238,240},{262,267},{284,286}};
        array_keyword_color_2 = new int[][]{{0,5},{30,35},{84,89},{167,171},{224,229},{326,331}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "Python file handling\n" +
                "Taking user input and writing this into file\n" +
                "Enter your today's task and type \"exit\" to stop accepting input\n" +
                "Going to gym\n" +
                "Complete math homework\n" +
                "Practice programming\n" +
                "exit\n" +
                "Your tasks saved successfully";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);


        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonFileRead.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python file write");
            String shareMessage = "Python file write" +
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