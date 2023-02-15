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

public class ClassesAndObjectsBanner extends AppCompatActivity {

    String[] names = {"1. Python classes and objects",
                      "2. Python constructors",
                      "3. Python passing objects",
                      "4. Python class variables",
                      "5. Python types of methods",
                      "6. Python inner class",
                      "7. Python single level inheritance",
                      "8. Python multi level inheritance",
                      "9. Python multiple inheritance",
                      "10. Python hybrid inheritance",
                      "11. Python constructors in inheritance",
                      "12. Python public variables and methods",
                      "13. Python private variables and methods",
                      "14. Python protected variables and methods",
                      "15. Python method overloading",
                      "16. Python method overriding",
                      "17. Python unary minus operator overloading",
                      "18. Python unary plus operator overloading",
                      "19. Python binary plus operator overloading",
                      "20. Python binary minus operator overloading",
                      "21. Python multiplication operator overloading",
                      "22. Python division operator overloading",
                      "23. Python floor division operator overloading",
                      "24. Python greater than operator overloading",
                      "25. Python less than operator overloading"};

    List<ItemsModel> itemsModelList = new ArrayList<>();
    ListView listView;
    CustomAdapter customAdapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_and_objects_banner);

        LoadTheInterstitialAd();

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python Classes and Objects");
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
                if(names.getText().equals("1. Python classes and objects")){
                    Intent intent = new Intent(getApplicationContext(),PythonClassesAndObjects.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("2. Python constructors")){
                    Intent intent = new Intent(getApplicationContext(),PythonConstructors.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("3. Python passing objects")){
                    Intent intent = new Intent(getApplicationContext(),PythonPassingObjects.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("4. Python class variables")){
                    Intent intent = new Intent(getApplicationContext(),PythonClassVariables.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("5. Python types of methods")){
                    Intent intent = new Intent(getApplicationContext(),PythonTypesOfMethods.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("6. Python inner class")){
                    Intent intent = new Intent(getApplicationContext(),PythonInnerClass.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("7. Python single level inheritance")){
                    Intent intent = new Intent(getApplicationContext(),PythonSingleInheritence.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("8. Python multi level inheritance")){
                    Intent intent = new Intent(getApplicationContext(),PythonMultiLevelInheritance.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("9. Python multiple inheritance")){
                    Intent intent = new Intent(getApplicationContext(),PythonMultipleInheritance.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("10. Python hybrid inheritance")){
                    Intent intent = new Intent(getApplicationContext(),PythonHybridInheritance.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("11. Python constructors in inheritance")){
                    Intent intent = new Intent(getApplicationContext(),PythonConstructorsInInheritance.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("12. Python public variables and methods")){
                    Intent intent = new Intent(getApplicationContext(),PythonPublicVariablesAndMethods.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("13. Python private variables and methods")){
                    Intent intent = new Intent(getApplicationContext(),PythonPrivateVariablesAndMethods.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("14. Python protected variables and methods")){
                    Intent intent = new Intent(getApplicationContext(),PythonProtectedVariablesAndMethods.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("15. Python method overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonMethodOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("16. Python method overriding")){
                    Intent intent = new Intent(getApplicationContext(),PythonMethodOverriding.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("17. Python unary minus operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonUnaryMinusOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("18. Python unary plus operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonUnaryPlusOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("19. Python binary plus operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonBinaryPlusOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("20. Python binary minus operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonBinaryMinusOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("21. Python multiplication operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonMultiplicationOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("22. Python division operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonDivisionOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("23. Python floor division operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonFloorDivisionOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("24. Python greater than operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonGreaterThanOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("25. Python less than operator overloading")){
                    Intent intent = new Intent(getApplicationContext(),PythonLessThanOperatorOverloading.class);
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
            mInterstitialAd.show(ClassesAndObjectsBanner.this);
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