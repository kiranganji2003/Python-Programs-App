package com.learnpython.pythonprograms;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

public class ColouredProgramText {

    static final int[]  string_color            =           { 18, 140, 18};
    static final int[]  keyword_color_1         =           {  0,  61, 230};
    static final int[] keyword_color_2          =           { 43,  52, 212};
    static final int[] self_color               =           {153,   0, 204};
    static final int[] end_color                =           {163,  41, 122};
    static final int[] number_color             =           {  0, 102, 255};
    static final int[] function_name_color      =           {  0, 110, 110};
    static final int[] comments                 =           {121, 117, 124};
    static final int[] special_functions_color  =           {213,   0, 249};

//    static final int[]  string_color = {18,140,18};
//    static final int[]  keyword_color_1 = {0, 71, 179};
//    static final int[] keyword_color_2 = {41, 41, 163};
//    static final int[] self_color = {0,0,0};
//    static final int[] end_color = {0,0,0};
//    static final int[] number_color = {13,58,170};
//    static final int[] function_name_color = {13,104,180};

    static SpannableString spannableString;

    static SpannableString execute(SpannableString s,int[][] array_string_color,int[][] array_keyword_color_1,int[][] array_keyword_color_2,int[][] array_self_color,int[][] array_end_color,int[][] array_number_color,int[][] array_function_name_color,int[][] array_comments,int[] ... array_special_functions_color){
        spannableString = s;
        method_string_color(array_string_color);
        method_keyword_color_1(array_keyword_color_1);
        method_keyword_color_2(array_keyword_color_2);
        method_self_color(array_self_color);
        method_end_color(array_end_color);
        method_number_color(array_number_color);
        method_function_name_color(array_function_name_color);
        method_comments(array_comments);
        if(array_special_functions_color.length != 0) {
                for (int[] ints : array_special_functions_color) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.rgb(special_functions_color[0], special_functions_color[1], special_functions_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                }
        }
        return spannableString;
    }
    static void method_string_color(int[][] array_string_color) {
        if (array_string_color.length != 0)
        {
            for (int[] ints : array_string_color)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(string_color[0], string_color[1], string_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }
    static void method_keyword_color_1(int[][] array_keyword_color_1) {
        if (array_keyword_color_1.length != 0)
        {
            for (int[] ints : array_keyword_color_1)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(keyword_color_1[0], keyword_color_1[1], keyword_color_1[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_keyword_color_2(int[][] array_keyword_color_2) {
        if (array_keyword_color_2.length != 0)
        {
            for (int[] ints : array_keyword_color_2)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(keyword_color_2[0], keyword_color_2[1], keyword_color_2[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_self_color(int[][] array_self_color) {
        if (array_self_color.length != 0)
        {
            for (int[] ints : array_self_color)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(self_color[0], self_color[1], self_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_end_color(int[][] array_end_color) {
        if (array_end_color.length != 0)
        {
            for (int[] ints : array_end_color)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(end_color[0], end_color[1], end_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_number_color(int[][] array_number_color) {
        if (array_number_color.length != 0)
        {
            for (int[] ints : array_number_color)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(number_color[0], number_color[1], number_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_function_name_color(int[][] array_function_name_color) {
        if (array_function_name_color.length != 0)
        {
            for (int[] ints : array_function_name_color)
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(function_name_color[0], function_name_color[1], function_name_color[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }

    static void method_comments(int[][] array_comments) {
        if (array_comments.length != 0)
        {
            for (int[] ints : array_comments) {
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb(comments[0], comments[1], comments[2])), ints[0], ints[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableString.setSpan(new StyleSpan(Typeface.ITALIC),ints[0],ints[1],Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }
}
