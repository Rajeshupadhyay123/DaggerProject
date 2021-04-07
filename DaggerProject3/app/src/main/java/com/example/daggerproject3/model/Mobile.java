package com.example.daggerproject3.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.i("mobile", "Mobile: ");
    }

    public void run() {
        processor.start();
        Log.i("mobile", "mobile run: ");
    }

    @Inject
    public void setCharger(Charger charger) {
        Log.i("mobile", "setCharger: ");
    }
}
