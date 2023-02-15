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

public class PythonDictionary extends AppCompatActivity {

    String example1,example2,example3;
    String output1,output2,output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_dictionary);

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
        actionBar.setTitle("Python dictionary");
        actionBar.setDisplayHomeAsUpEnabled(true);

        example1 = "'''  In python dictionary holds key:value pair.\n" +
                "We can access value using its key in dictionary.  '''\n" +
                "\n" +
                "students = {\n" +
                "             1:'Martin',\n" +
                "             2:'John',\n" +
                "             3:'Shirish',\n" +
                "             4:'Ashish'\n" +
                "        }\n" +
                "\n" +
                "print(students)\n" +
                "print(\"Student 4 =\",students[4])";

        array_string_color = new int[][]{{131,139},{156,162},{179,188},{205,213},{247,260}};
        array_keyword_color_1 = new int[][]{};
        array_keyword_color_2 = new int[][]{{225,230},{241,246}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{{129,130},{154,155},{177,178},{203,204},{270,271}};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{{0,101}};
        TextView t_ex1 = findViewById(R.id.example1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(example1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "{1: 'Martin', 2: 'John', 3: 'Shirish', 4: 'Ashish'}\n" +
                "Student 4 = Ashish";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        example2 = "dictionary = {\n" +
                "                \"key 1\":\"value 1\",\n" +
                "                \"key 2\":\"value 2\",\n" +
                "                \"key 3\":\"value 3\",\n" +
                "                \"key 4\":\"value 4\",\n" +
                "        }\n" +
                "\n" +
                "print(dictionary)\n" +
                "print(\"key 3 =\",dictionary.get(\"key 3\",\"Not found\"))\n" +
                "print(\"key 10 =\",dictionary.get(\"key 10\",\"Not found\"))\n" +
                "\n" +
                "dictionary[\"key 10\"] = \"value 10\"\n" +
                "print(dictionary)\n" +
                "del dictionary[\"key 2\"]\n" +
                "print(dictionary)";

        array_string_color = new int[][]{{31,38},{39,48},{66,73},{74,83},{101,108},{109,118},{136,143},{144,153},{190,199},{215,222},{223,234},{243,253},{269,277},{278,289},{304,312},{316,326},{360,367}};
        array_keyword_color_1 = new int[][]{{345,348}};
        array_keyword_color_2 = new int[][]{{166,171},{184,189},{237,242},{327,332},{369,374}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex2 = findViewById(R.id.example2);
        t_ex2.setText(ColouredProgramText.execute(new SpannableString(example2),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output2 = "{'key 1': 'value 1', 'key 2': 'value 2', 'key 3': 'value 3', 'key 4': 'value 4'}\n" +
                "key 3 = value 3\n" +
                "key 10 = Not found\n" +
                "{'key 1': 'value 1', 'key 2': 'value 2', 'key 3': 'value 3', 'key 4': 'value 4', 'key 10': 'value 10'}\n" +
                "{'key 1': 'value 1', 'key 3': 'value 3', 'key 4': 'value 4', 'key 10': 'value 10'}";
        TextView t_out2 = findViewById(R.id.output2);
        t_out2.setText(output2);


        example3 = "seasons = {\n" +
                "    \"Summer\" : [\"Mar\",\"Apr\",\"May\",\"Jun\"],\n" +
                "    \"Rainy\" : [\"Jul\",\"Aug\",\"Sep\",\"Oct\"],\n" +
                "    \"Winter\" : [\"Nov\",\"Dec\",\"Jan\",\"Feb\"],\n" +
                "\n" +
                "    \"Days\":{\n" +
                "            \"Day 1\" : \"Sunday\",\n" +
                "            \"Day 2\" : \"Monday\",\n" +
                "            \"Day 3\" : \"Tuesday\",\n" +
                "            \"Day 4\" : \"Wednesday\",\n" +
                "            \"Day 5\" : \"Thursday\",\n" +
                "            \"Day 6\" : \"Friday\",\n" +
                "            \"Day 7\" : \"Saturday\"\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "print(seasons)\n" +
                "print(\"\\n\",seasons[\"Winter\"])\n" +
                "print(\"\\n\",seasons[\"Days\"][\"Day 6\"])";

        array_string_color = new int[][]{{16,24},{28,33},{34,39},{40,45},{46,51},{58,65},{69,74},{75,80},{81,86},{87,92},{99,107},{111,116},{117,122},{123,128},{129,134},{142,148},{163,170},{173,181},{195,202},{205,213},{227,234},{237,246},{260,267},{270,281},{295,302},{305,315},{329,336},{339,347},{361,368},{371,381},{420,421},{423,424},{433,441},{450,451},{453,454},{463,469},{471,478}};
        array_keyword_color_1 = new int[][]{{421,423},{451,453}};
        array_keyword_color_2 = new int[][]{{399,404},{414,419},{444,449}};
        array_self_color = new int[][]{};
        array_end_color = new int[][]{};
        array_number_color = new int[][]{};
        array_function_name_color = new int[][]{};
        array_comments = new int[][]{};
        TextView t_ex3 = findViewById(R.id.example3);
        t_ex3.setText(ColouredProgramText.execute(new SpannableString(example3),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output3 = "{'Summer': ['Mar', 'Apr', 'May', 'Jun'], 'Rainy': ['Jul', 'Aug', 'Sep', 'Oct'], 'Winter': ['Nov', 'Dec', 'Jan', 'Feb'], 'Days': {'Day 1': 'Sunday', 'Day 2': 'Monday', 'Day 3': 'Tuesday', 'Day 4': 'Wednesday', 'Day 5': 'Thursday', 'Day 6': 'Friday', 'Day 7': 'Saturday'}}\n" +
                "\n" +
                " ['Nov', 'Dec', 'Jan', 'Feb']\n" +
                "\n" +
                " Friday";
        TextView t_out3 = findViewById(R.id.output3);
        t_out3.setText(output3);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonInput.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),PythonSet.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python dictionary");
            String shareMessage = "Python dictionary" +
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