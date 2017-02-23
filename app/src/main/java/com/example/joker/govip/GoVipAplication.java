package com.example.joker.govip;

import android.app.Application;

import com.example.joker.govip.util.TypefaceUtil;

/**
 * Created by joker on 23/02/17.
 */
public class GoVipAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Lato-Regular.ttf");
    }
}
