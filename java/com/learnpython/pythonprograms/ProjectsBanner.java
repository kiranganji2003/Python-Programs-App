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

public class ProjectsBanner extends AppCompatActivity {

    String[] names = {"1. Shopping Products Calculator",
            "2. Algebra Formulas Calculator",
            "3. Displaying data in tabular format",
            "4. Josephus problem using queue",
            "5. Birthday saver application",
            "6. Number system conversion",
            "7. Library management system",
            "8. Math quiz application",
            "9. Customer data record system",
            "10. Random password generator",
            "11. Systematic investment plan (SIP) calculator",
            "12. Generate random strings",
            "13. Number guessing game"};

    List<ItemsModel> itemsModelList = new ArrayList<>();
    ListView listView;
    CustomAdapter customAdapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects_banner);

        LoadTheInterstitialAd();

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python Projects");
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
                if(names.getText().equals("1. Shopping Products Calculator")){
                    Intent intent = new Intent(getApplicationContext(),ShoppingProductsCalculator.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("2. Algebra Formulas Calculator")){
                    Intent intent = new Intent(getApplicationContext(),AlgebricFormulasCalculator.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("3. Displaying data in tabular format")){
                    Intent intent = new Intent(getApplicationContext(),DisplayingDataInTabularFormat.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("4. Josephus problem using queue")){
                    Intent intent = new Intent(getApplicationContext(),JosephusProblemUsingQueue.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("5. Birthday saver application")){
                    Intent intent = new Intent(getApplicationContext(),BirthdaySaverApplication.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("6. Number system conversion")){
                    Intent intent = new Intent(getApplicationContext(),NumberSystemConversion.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("7. Library management system")){
                    Intent intent = new Intent(getApplicationContext(),LibraryManagementSystem.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("8. Math quiz application")){
                    Intent intent = new Intent(getApplicationContext(),MathQuiz.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("9. Customer data record system")){
                    Intent intent = new Intent(getApplicationContext(),CustomerDataRecordSystem.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("10. Random password generator")){
                    Intent intent = new Intent(getApplicationContext(),RandomPasswordGenerator.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("11. Systematic investment plan (SIP) calculator")){
                    Intent intent = new Intent(getApplicationContext(),SystematicInvestmentPlanSIPCalculator.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("12. Generate random strings")){
                    Intent intent = new Intent(getApplicationContext(),GenerateRandomStrings.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("13. Number guessing game")){
                    Intent intent = new Intent(getApplicationContext(),NumberGuessingGame.class);
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
            mInterstitialAd.show(ProjectsBanner.this);
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