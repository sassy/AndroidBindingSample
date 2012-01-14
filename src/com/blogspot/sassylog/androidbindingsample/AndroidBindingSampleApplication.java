package com.blogspot.sassylog.androidbindingsample;

import android.app.Application;
import gueei.binding.Binder;;

public class AndroidBindingSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Binder.init(this);
    }
}
