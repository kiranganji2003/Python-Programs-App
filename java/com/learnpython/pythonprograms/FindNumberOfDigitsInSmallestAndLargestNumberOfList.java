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

public class FindNumberOfDigitsInSmallestAndLargestNumberOfList extends AppCompatActivity {

    String program1,program_name;
    String output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_number_of_digits_in_smallest_and_largest_number_of_list);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python programs");
        actionBar.setDisplayHomeAsUpEnabled(true);


        program_name = "Find number of digits in smallest and largest number of list";
        TextView t_program = findViewById(R.id.program_name);
        t_program.setText(program_name);


        program1 = "class Count:\n" +
                "    def accept(self):\n" +
                "        self.list = []\n" +
                "        size = int(input(\"Enter the size of list: \"))\n" +
                "        print(\"Enter\",size,\"elements\")\n" +
                "        for i in range(size):\n" +
                "            n = int(input())\n" +
                "            self.list.append(n)\n" +
                "    def findSmallestLargest(self):\n" +
                "        small,large = self.list[0],self.list[0]\n" +
                "        for i in range(len(self.list)):\n" +
                "            if self.list[i]>large:\n" +
                "                large = self.list[i]\n" +
                "            if self.list[i]<small:\n" +
                "                small = self.list[i]\n" +
                "        return small,large\n" +
                "    def countDigits(self):\n" +
                "        x,y = self.findSmallestLargest()\n" +
                "        print(len(str(x)),\"digits in Smallest Number\")\n" +
                "        print(len(str(y)),\"digits in Largest Number\")\n" +
                "\n" +
                "obj = Count()\n" +
                "obj.accept()\n" +
                "obj.countDigits()";

        int[][] array_string_color = {{83,109},{126,133},{139,149},{630,657},{685,711}};
        int[][] array_keyword_color_1 = {{0,5},{17,20},{159,162},{165,167},{246,249},{333,336},{339,341},{377,379},{449,451},{517,523},{540,543}};
        int[][] array_keyword_color_2 = {{73,76},{77,82},{120,125},{168,173},{197,200},{201,206},{342,347},{348,351},{612,617},{618,621},{622,625},{667,672},{673,676},{677,680}};
        int[][] array_self_color = {{28,32},{43,47},{222,226},{270,274},{299,303},{312,316},{352,356},{380,384},{424,428},{496,500},{556,560},{577,581}};
        int[][] array_end_color = {};
        int[][] array_number_color = {{309,310},{322,323}};
        int[][] array_function_name_color = {{21,27},{250,269},{544,555}};
        int[][] array_comments = {};
        TextView t_ex1 = findViewById(R.id.program1);
        t_ex1.setText(ColouredProgramText.execute(new SpannableString(program1),array_string_color,array_keyword_color_1,array_keyword_color_2,array_self_color,array_end_color,array_number_color,array_function_name_color,array_comments));

        output1 = "Enter the size of list: 5\n" +
                "Enter 5 elements\n" +
                "12\n" +
                "47\n" +
                "23434\n" +
                "2344\n" +
                "484\n" +
                "2 digits in Smallest Number\n" +
                "5 digits in Largest Number";
        TextView t_out1 = findViewById(R.id.output1);
        t_out1.setText(output1);

        TextView next = findViewById(R.id.next);
        next.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            next.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),ReverseEachWordInTheSentenceKeepingTheWordPositionsTheSame.class);
            startActivity(intent);
            finish();
        });

        TextView previous = findViewById(R.id.previous);
        previous.setOnClickListener(v -> {
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
            previous.startAnimation(anim);
            Intent intent = new Intent(getApplicationContext(),CheckTheListHasOrderedValuesOrNot.class);
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
            intent.putExtra(Intent.EXTRA_SUBJECT,"Python program");
            String shareMessage = "Program :- " + program_name +
                    "\n\n\nInput :- \n\n" + program1 +
                    "\n\n\nOutput :-\n\n" + output1 +
                    "\n\n\nDownload this Python Programming app from the Google play store https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
            intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}