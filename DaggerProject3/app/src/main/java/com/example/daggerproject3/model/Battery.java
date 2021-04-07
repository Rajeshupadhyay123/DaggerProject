package com.example.daggerproject3.model;

import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;

public class Battery {

    private Lithium lithium;
    private Cobalt cobalt;

    public Battery(Lithium lithium, Cobalt cobalt) {
        this.lithium = lithium;
        this.cobalt = cobalt;
        Log.i("mobile", "Battery: ");
    }
}
