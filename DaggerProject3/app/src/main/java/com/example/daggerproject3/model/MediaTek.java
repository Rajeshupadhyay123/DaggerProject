package com.example.daggerproject3.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MediaTek implements Processor {

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed")int clockSpeed, @Named("core")int core) {
        this.clockSpeed=clockSpeed;
        this.core=core;
        Log.i("mobile", "MediaTek: start with clockSpeed "+clockSpeed+" core: "+core);
    }

    @Override
    public void start() {
        Log.i("mobile", "MediaTek start: ");
    }
}

/**
 *The parameter in @Named must be same as provided in the Component interface
 **/