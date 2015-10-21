package com.lhu.samplepreferences;

import android.app.Application;
import android.content.Context;

/**
 * Created by Tacademy on 2015-10-21.
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
