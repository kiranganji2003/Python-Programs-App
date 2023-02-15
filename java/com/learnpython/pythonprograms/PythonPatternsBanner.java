package com.learnpython.pythonprograms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.List;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class PythonPatternsBanner extends AppCompatActivity {

    String[] names = {"1. Python pattern 1",
            "2. Python pattern 2",
            "3. Python pattern 3",
            "4. Python pattern 4",
            "5. Python pattern 5",
            "6. Python pattern 6",
            "7. Python pattern 7",
            "8. Python pattern 8",
            "9. Python pattern 9",
            "10. Python pattern 10",
            "11. Python pattern 11",
            "12. Python pattern 12",
            "13. Python pattern 13",
            "14. Python pattern 14",
            "15. Python pattern 15",
            "16. Python pattern 16",
            "17. Python pattern 17",
            "18. Python pattern 18",
            "19. Python pattern 19",
            "20. Python pattern 20",
            "21. Python pattern 21",
            "22. Python pattern 22",
            "23. Python pattern 23",
            "24. Python pattern 24",
            "25. Python pattern 25",
            "26. Python pattern 26",
            "27. Python pattern 27",
            "28. Python pattern 28",
            "29. Python pattern 29",
            "30. Python pattern 30",
            "31. Python pattern 31"};

    List<ItemsModel> itemsModelList = new ArrayList<>();
    ListView listView;
    CustomAdapter customAdapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_patterns_banner);

        LoadTheInterstitialAd();

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python Patterns");
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.listview);
        for (String name : names) {
            ItemsModel itemsModel = new ItemsModel(name);
            itemsModelList.add(itemsModel);
        }

        customAdapter = new CustomAdapter(itemsModelList,this);
        listView.setAdapter(customAdapter);
        listView.setDivider(null);
    }

    @Override
    public void onResume(){
        super.onResume();
        LoadTheInterstitialAd();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.e("Main","data search"+newText);
                customAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        int id = item.getItemId();
        if(id == R.id.search_view){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class CustomAdapter extends BaseAdapter implements Filterable {
        private final List<ItemsModel> itemsModelsl;
        private List<ItemsModel> itemsModelListFiltered;
        private final Context context;

        public CustomAdapter(List<ItemsModel> itemsModelsl,Context context){
            this.itemsModelsl = itemsModelsl;
            this.itemsModelListFiltered = itemsModelsl;
            this.context = context;
        }

        @Override
        public int getCount(){
            return itemsModelListFiltered.size();
        }

        @Override
        public Object getItem(int position){
            return itemsModelListFiltered.get(position);
        }

        @Override
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent){
            @SuppressLint({"ViewHolder", "InflateParams"}) View view = getLayoutInflater().inflate(R.layout.row_items,null);
            TextView names = view.findViewById(R.id.itemName);
            names.setText(itemsModelListFiltered.get(position).getName());

            view.setOnClickListener(v -> {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation);
                view.startAnimation(anim);
                if(names.getText().equals("1. Python pattern 1")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern1.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("2. Python pattern 2")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern2.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("3. Python pattern 3")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern3.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("4. Python pattern 4")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern4.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("5. Python pattern 5")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern5.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("6. Python pattern 6")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern6.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("7. Python pattern 7")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern7.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("8. Python pattern 8")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern8.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("9. Python pattern 9")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern9.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("10. Python pattern 10")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern10.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("11. Python pattern 11")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern11.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("12. Python pattern 12")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern12.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("13. Python pattern 13")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern13.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("14. Python pattern 14")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern14.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("15. Python pattern 15")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern15.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("16. Python pattern 16")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern16.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("17. Python pattern 17")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern17.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("18. Python pattern 18")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern18.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("19. Python pattern 19")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern19.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("20. Python pattern 20")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern20.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("21. Python pattern 21")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern21.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("22. Python pattern 22")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern22.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("23. Python pattern 23")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern23.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("24. Python pattern 24")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern24.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("25. Python pattern 25")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern25.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("26. Python pattern 26")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern26.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("27. Python pattern 27")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern27.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("28. Python pattern 28")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern28.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("29. Python pattern 29")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern29.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("30. Python pattern 30")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern30.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("31. Python pattern 31")){
                    Intent intent = new Intent(getApplicationContext(),PythonPattern31.class);
                    startActivity(intent);
                }

                showInterstitialAd();

            });

            return view;
        }

        @Override
        public Filter getFilter(){
            return new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    FilterResults filterResults = new FilterResults();
                    if(constraint==null || constraint.length() == 0){
                        filterResults.count = itemsModelsl.size();
                        filterResults.values = itemsModelsl;
                    }
                    else{
                        int flag=0;
                        List<ItemsModel> resultsModel = new ArrayList<>();
                        String searchStr = constraint.toString().toLowerCase();

                        for(ItemsModel itemsModel:itemsModelsl){
                            if(itemsModel.getName().toLowerCase().contains(searchStr)){
                                flag = 1;
                                resultsModel.add(itemsModel);
                                filterResults.count = resultsModel.size();
                                filterResults.values = resultsModel;
                            }
                        }
                        if(flag==0){
                            filterResults.count = 0;
                            filterResults.values = resultsModel;
                            Toast.makeText(context, "Search result not found", Toast.LENGTH_SHORT).show();
                        }
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    itemsModelListFiltered = (List<ItemsModel>)results.values;
                    notifyDataSetChanged();
                }
            };
        }
    }

    public void showInterstitialAd(){
        if (mInterstitialAd != null) {
            mInterstitialAd.show(PythonPatternsBanner.this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }
    }

    public void LoadTheInterstitialAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,InterstitialAdID.ID, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        //LoadTheInterstitialAd();
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });
    }

}