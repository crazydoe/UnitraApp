package com.example.michal.unitraapp;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by michal on 21.11.2017.
 */

public class Typefaces {

    public static Typeface getSfIuDisplayLight(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/SF-UI-Display-Light.otf");
    }

    public static Typeface getSfIuDisplayRegular(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/SF-UI-Display-Regular.otf");
    }
}
