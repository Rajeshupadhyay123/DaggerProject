package com.example.daggerproject3.model;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Processor {

    int clockSpeed;


    @Inject
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.i("mobile", "Snapdragon: ");
    }

    @Override
    public void start() {
        Log.i("mobile", "Snapdragon start: with clockSpeed " + clockSpeed);
    }
}
