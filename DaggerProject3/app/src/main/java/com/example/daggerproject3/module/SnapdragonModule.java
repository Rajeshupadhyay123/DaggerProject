package com.example.daggerproject3.module;

import com.example.daggerproject3.model.Processor;
import com.example.daggerproject3.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragonModule {

    int clockSpeed;

    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    //it is for making the Snapdragon object there we have need of an int type value for clockSpeed
    //so when an int type value will be identify then this method will be called......
    @Provides
    int getClockSpeed(){
        return clockSpeed;
    }

    @Provides
    Processor getProcessor(Snapdragon snapdragon) {
        return snapdragon;
    }
}
/**
 * Here for creating the Snapdragon object we need an int type dependency for clockSpeed so here
 * we create a method that recognize after looking an int value.
 *
 * If we will use any instance variable in any module then simply create the dagger object by create()
 * method is not possible there we have to use builder() method and then call the module constructor.
 **/