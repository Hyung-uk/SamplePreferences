package com.lhu.samplepreferences;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tacademy on 2015-10-21.
 */
public class SettingActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new SettingFragment()).commit();
        }
    }
}
