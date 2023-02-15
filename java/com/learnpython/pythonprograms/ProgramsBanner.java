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

public class ProgramsBanner extends AppCompatActivity {

    String[] names = {"1. Separate consonants and vowels from string",
                      "2. Count no. of each digits in a array",
                      "3. Display perfect square numbers from 1 to N",
                      "4. Check password is strong or not",
                      "5. Rotate the array to the right by k steps",
                      "6. Check the array has unique values or not",
                      "7. Form largest number from given array",
                      "8. Product of array except self",
                      "9. List of objects",
                      "10. Kth smallest element in list",
                      "11. Display armstrong numbers between 1 to N",
                      "12. Display first number whose sum of digits is equal to K",
                      "13. Diagonal difference of matrix",
                      "14. Find the ratio of elements that are positive, negative, and zero in array",
                      "15. Time conversion",
                      "16. Check the string is palindrome or not",
                      "17. Grading Student",
                      "18. Find the pairs in list where the sum of these pairs is divisible by k",
                      "19. Converting the decimal number to binary form manually",
                      "20. Counting digits",
                      "21. Add the numbers until user enter stop",
                      "22. Find the kth digit of a number",
                      "23. Display the month and number of days",
                      "24. Convert the binary number into decimal",
                      "25. Display the number in words",
                      "26. Count number of repeated letters in a string",
                      "27. Double the number for nth times",
                      "28. Expanded form of number",
                      "29. Sum of arithmetic sequence",
                      "30. Accept the paragraph",
                      "31. Display all the divisors of a number",
                      "32. Check the number is prime or not",
                      "33. Find the pair in array which has maximum sum",
                      "34. Reverse the number",
                      "35. Find GCD of two numbers",
                      "36. Find GCD of three numbers",
                      "37. Find LCM of two numbers",
                      "38. Find LCM of three numbers",
                      "39. Sum of numbers from x to y",
                      "40. Accept unique values in an array",
                      "41. Check if a string is substring of another",
                      "42. Add two distances given in kilometer-meter",
                      "43. Determine the type of triangle by sides",
                      "44. Reverse the words of sentence",
                      "45. Add k to each element of list using operator overloading",
                      "46. Separate the words of sentence",
                      "47. Sort the values of list while accepting",
                      "48. Add values in list of object using operator overloading",
                      "49. Remove the characters X from the string",
                      "50. Count number of occurrence of characters from string",
                      "51. Raise the exception when user enters the invalid name",
                      "52. Count number of occurrence of digit in a number",
                      "53. Sum of first and last digit of a number",
                      "54. Check the number is palindrome or not",
                      "55. Find second largest element among three numbers",
                      "56. Check the number is armstrong or not",
                      "57. Find Nth even or odd number",
                      "58. Find Nth even or odd number which is divisible by K",
                      "59. Reverse the string using recursion",
                      "60. Find the next element of a given number that is divisible by k",
                      "61. Find difference between addition and subtraction of all digits of a number",
                      "62. Remove the digits from number",
                      "63. Find nth largest number from list",
                      "64. Display prime numbers between 1 to N",
                      "65. Find nth prime number",
                      "66. Calling super class constructors and methods",
                      "67. Python inner class program",
                      "68. Generate random OTP",
                      "69. Shuffle the elements of list",
                      "70. Reverse the string using unary minus operator overloading",
                      "71. Display the message N times using recursion",
                      "72. Find exponential of a number using recursion",
                      "73. Swapping two objects",
                      "74. Check the list has ordered values or not",
                      "75. Find number of digits in smallest and largest number of list",
                      "76. Reverse each word in the sentence, keeping the word positions the same"};

    List<ItemsModel> itemsModelList = new ArrayList<>();
    ListView listView;
    CustomAdapter customAdapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_banner);

        LoadTheInterstitialAd();

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Python Programs");
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
                if(names.getText().equals("1. Separate consonants and vowels from string")){
                    Intent intent = new Intent(getApplicationContext(),SeperateConsonantsAndVowelsFromString.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("2. Count no. of each digits in a array")){
                    Intent intent = new Intent(getApplicationContext(),CountAndSayNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("3. Display perfect square numbers from 1 to N")){
                    Intent intent = new Intent(getApplicationContext(),DisplayPerfectSquareNumbersFromOneToN.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("4. Check password is strong or not")){
                    Intent intent = new Intent(getApplicationContext(),CheckPasswordIsStrongOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("5. Rotate the array to the right by k steps")){
                    Intent intent = new Intent(getApplicationContext(),RotateArray.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("6. Check the array has unique values or not")){
                    Intent intent = new Intent(getApplicationContext(),CheckTheArrayHasUniqueValuesOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("7. Form largest number from given array")){
                    Intent intent = new Intent(getApplicationContext(),FormLargestNumberFromGivenArray.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("8. Product of array except self")){
                    Intent intent = new Intent(getApplicationContext(),ProductOfArrayExceptSelf.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("9. List of objects")){
                    Intent intent = new Intent(getApplicationContext(),ListOfObjects.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("10. Kth smallest element in list")){
                    Intent intent = new Intent(getApplicationContext(),KthSmallestElementInList.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("11. Display armstrong numbers between 1 to N")){
                    Intent intent = new Intent(getApplicationContext(),DisplayArmstrongNumbersBetweenOneToN.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("12. Display first number whose sum of digits is equal to K")){
                    Intent intent = new Intent(getApplicationContext(),DisplayFirstNumberWhoseSumOfDigitsIsEqualToK.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("13. Diagonal difference of matrix")){
                    Intent intent = new Intent(getApplicationContext(),DiagonalDifferenceOfMatrix.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("14. Find the ratio of elements that are positive, negative, and zero in array")){
                    Intent intent = new Intent(getApplicationContext(),FindTheRatioOfElementsThatArePositiveNegativeAndZero.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("15. Time conversion")){
                    Intent intent = new Intent(getApplicationContext(),TimeConversion.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("16. Check the string is palindrome or not")){
                    Intent intent = new Intent(getApplicationContext(),CheckTheStringIsPalindromOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("17. Grading Student")){
                    Intent intent = new Intent(getApplicationContext(),GradingStudents.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("18. Find the pairs in list where the sum of these pairs is divisible by k")){
                    Intent intent = new Intent(getApplicationContext(),FindThePairsInListWhereSumOfThesePairsIsDivisibleByK.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("19. Converting the decimal number to binary form manually")){
                    Intent intent = new Intent(getApplicationContext(),ConvertingTheDecimalNumberToBinaryManually.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("20. Counting digits")){
                    Intent intent = new Intent(getApplicationContext(),CountingDigits.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("21. Add the numbers until user enter stop")){
                    Intent intent = new Intent(getApplicationContext(),AddTheNumbersUntilUserStops.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("22. Find the kth digit of a number")){
                    Intent intent = new Intent(getApplicationContext(),FindKthDigitOfNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("23. Display the month and number of days")){
                    Intent intent = new Intent(getApplicationContext(),DisplayTheMonthAndNumberOfDays.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("24. Convert the binary number into decimal")){
                    Intent intent = new Intent(getApplicationContext(),ConvertTheBinaryNumberIntoDecimal.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("25. Display the number in words")){
                    Intent intent = new Intent(getApplicationContext(),DisplayTheNumberInWords.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("26. Count number of repeated letters in a string")) {
                    Intent intent = new Intent(getApplicationContext(),CountNumberOfRepeatedLettersInString.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("27. Double the number for nth times")) {
                    Intent intent = new Intent(getApplicationContext(),DoubleTheNumberForNthTimes.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("28. Expanded form of number")) {
                    Intent intent = new Intent(getApplicationContext(),ExpandedFormOfNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("29. Sum of arithmetic sequence")) {
                    Intent intent = new Intent(getApplicationContext(),SumOfArithmeticSequence.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("30. Accept the paragraph")) {
                    Intent intent = new Intent(getApplicationContext(),AcceptingParagraph.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("31. Display all the divisors of a number")) {
                    Intent intent = new Intent(getApplicationContext(),DisplayAllTheDivisorsOfNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("32. Check the number is prime or not")) {
                    Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsPrimeOrNotNewMEthod.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("33. Find the pair in array which has maximum sum")) {
                    Intent intent = new Intent(getApplicationContext(),FindThePairInArrayWhichHasMaximumSum.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("34. Reverse the number")) {
                    Intent intent = new Intent(getApplicationContext(),ReverseTheNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("35. Find GCD of two numbers")) {
                    Intent intent = new Intent(getApplicationContext(),FindGCDOfTwoNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("36. Find GCD of three numbers")) {
                    Intent intent = new Intent(getApplicationContext(),FindGCDOfThreeNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("37. Find LCM of two numbers")) {
                    Intent intent = new Intent(getApplicationContext(),FindLCMOfTwoNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("38. Find LCM of three numbers")) {
                    Intent intent = new Intent(getApplicationContext(),FindLCMOfThreeNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("39. Sum of numbers from x to y")) {
                    Intent intent = new Intent(getApplicationContext(),SumOfNumbersFromXToY.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("40. Accept unique values in an array")) {
                    Intent intent = new Intent(getApplicationContext(),AcceptUniqueValuesInAnArray.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("41. Check if a string is substring of another")) {
                    Intent intent = new Intent(getApplicationContext(),CheckIfAStringIsSubstringOfAnother.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("42. Add two distances given in kilometer-meter")) {
                    Intent intent = new Intent(getApplicationContext(),AddTwoDistancesGivenInKilometerMeter.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("43. Determine the type of triangle by sides")) {
                    Intent intent = new Intent(getApplicationContext(),DetermineTheTypeOfTriangleBySide.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("44. Reverse the words of sentence")) {
                    Intent intent = new Intent(getApplicationContext(),ReverseTheWordsOfSentence.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("45. Add k to each element of list using operator overloading")) {
                    Intent intent = new Intent(getApplicationContext(),AddKToEachElementOfListUsingOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("46. Separate the words of sentence")) {
                    Intent intent = new Intent(getApplicationContext(),SeparateTheWordsOfSentence.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("47. Sort the values of list while accepting")) {
                    Intent intent = new Intent(getApplicationContext(),SortTheValuesOfListWhileAccepting.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("48. Add values in list of object using operator overloading")) {
                    Intent intent = new Intent(getApplicationContext(),AddValuesInListOfObjectUsingOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("49. Remove the characters X from the string")) {
                    Intent intent = new Intent(getApplicationContext(),RemoveTheCharactersXFromTheString.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("50. Count number of occurrence of characters from string")) {
                    Intent intent = new Intent(getApplicationContext(),CountNumberOfOccuranceOfCharactersFromString.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("51. Raise the exception when user enters the invalid name")) {
                    Intent intent = new Intent(getApplicationContext(),RaiseTheExceptionWhenUserEnteresTheInvalidName.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("52. Count number of occurrence of digit in a number")) {
                    Intent intent = new Intent(getApplicationContext(),CountNumberOfOccurrenceOfDigitInANumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("53. Sum of first and last digit of a number")) {
                    Intent intent = new Intent(getApplicationContext(),SumOfFirstAndLastDigitOfNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("54. Check the number is palindrome or not")) {
                    Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsPalindromOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("55. Find second largest element among three numbers")) {
                    Intent intent = new Intent(getApplicationContext(),FindSecondLargestAmongThreeNumbers.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("56. Check the number is armstrong or not")) {
                    Intent intent = new Intent(getApplicationContext(),CheckTheNumberIsArmstrongOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("57. Find Nth even or odd number")) {
                    Intent intent = new Intent(getApplicationContext(),FindNthEvenOrOddNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("58. Find Nth even or odd number which is divisible by K")) {
                    Intent intent = new Intent(getApplicationContext(),FindNthEvenOrOddNumberWhichIsDivisibleByK.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("59. Reverse the string using recursion")) {
                    Intent intent = new Intent(getApplicationContext(),ReverseTheStringUsingRecursion.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("60. Find the next element of a given number that is divisible by k")) {
                    Intent intent = new Intent(getApplicationContext(),FindTheNextElementThatIsDivisibleByKOfAGivenNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("61. Find difference between addition and subtraction of all digits of a number")) {
                    Intent intent = new Intent(getApplicationContext(),FindDifferenceOfDigitsOfNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("62. Remove the digits from number")) {
                    Intent intent = new Intent(getApplicationContext(),RemoveTheDigitFromNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("63. Find nth largest number from list")) {
                    Intent intent = new Intent(getApplicationContext(),FindNthLargestNumberFromList.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("64. Display prime numbers between 1 to N")) {
                    Intent intent = new Intent(getApplicationContext(),PrimeNumbersBetween1ToN.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("65. Find nth prime number")) {
                    Intent intent = new Intent(getApplicationContext(),FindNthPrimeNumber.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("66. Calling super class constructors and methods")) {
                    Intent intent = new Intent(getApplicationContext(),CallingSuperClassConstructorAndMethods.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("67. Python inner class program")) {
                    Intent intent = new Intent(getApplicationContext(),PythonInnerClassProgram.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("68. Generate random OTP")) {
                    Intent intent = new Intent(getApplicationContext(),GenerateRandomOTP.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("69. Shuffle the elements of list")) {
                    Intent intent = new Intent(getApplicationContext(),ShuffleTheElementsOfList.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("70. Reverse the string using unary minus operator overloading")) {
                    Intent intent = new Intent(getApplicationContext(),ReverseTheStringUsingUnaryMinusOperatorOverloading.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("71. Display the message N times using recursion")) {
                    Intent intent = new Intent(getApplicationContext(),DisplayTheMessageNTimesUsingRecursion.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("72. Find exponential of a number using recursion")) {
                    Intent intent = new Intent(getApplicationContext(),FindExponentialOfANumberUsingRecursion.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("73. Swapping two objects")) {
                    Intent intent = new Intent(getApplicationContext(),SwapTwoObjects.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("74. Check the list has ordered values or not")) {
                    Intent intent = new Intent(getApplicationContext(),CheckTheListHasOrderedValuesOrNot.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("75. Find number of digits in smallest and largest number of list")) {
                    Intent intent = new Intent(getApplicationContext(),FindNumberOfDigitsInSmallestAndLargestNumberOfList.class);
                    startActivity(intent);
                }
                else if(names.getText().equals("76. Reverse each word in the sentence, keeping the word positions the same")) {
                    Intent intent = new Intent(getApplicationContext(),ReverseEachWordInTheSentenceKeepingTheWordPositionsTheSame.class);
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
            mInterstitialAd.show(ProgramsBanner.this);
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