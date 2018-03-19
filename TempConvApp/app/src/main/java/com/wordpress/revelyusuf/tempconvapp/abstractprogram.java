package com.wordpress.revelyusuf.tempconvapp;

/**
 * Created by Yusuf on 03-Mar-18.
 */
abstract class abstractprogram {

    public static double from_celsius_to_farenheit(double f){
        return 32+f*9/5;
    }
    public static double from_farenheit_to_celsius(double c){
        return (c-32)*5/9;
    }


}
