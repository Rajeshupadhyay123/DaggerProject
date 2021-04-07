package com.example.daggerproject3;

import android.app.Application;

import com.example.daggerproject3.component.DaggerMobileComponent;
import com.example.daggerproject3.component.MobileComponent;

public class MainApplication extends Application {

    private MobileComponent component;

    public void onCreate() {
        super.onCreate();

        component = DaggerMobileComponent.factory().create(4,3,64);
    }

    public MobileComponent getComponent() {
        return component;
    }
}
