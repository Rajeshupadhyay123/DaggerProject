package com.example.daggerproject3.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private Processor processor;
    private Camera camera;

    @Inject
    public Mobile(Battery battery, Processor processor,Camera camera) {
        this.battery = battery;
        this.processor = processor;
        this.camera=camera;
        Log.i("mobile", "Battery: "+battery.toString()+" "+this.toString());
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
