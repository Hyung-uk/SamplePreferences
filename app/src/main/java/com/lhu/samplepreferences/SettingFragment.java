package com.lhu.samplepreferences;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;

/**
 * Created by Tacademy on 2015-10-21.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SettingFragment extends PreferenceFragment {

    public SettingFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }
}
