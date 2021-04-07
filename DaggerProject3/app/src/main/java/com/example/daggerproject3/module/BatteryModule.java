package com.example.daggerproject3.module;

import com.example.daggerproject3.model.Battery;
import com.example.daggerproject3.model.Cobalt;
import com.example.daggerproject3.model.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Lithium getLitium(){
        return new Lithium();
    }

    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }

    @Singleton
    @Provides
    Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(lithium,cobalt);
    }
}

/**
 * If we uses the @Singleton annotation then only one object will be created and if there is a need to
 * create an another object then it reuses the old one...
 *
 * And if we uses the @Singleton annotation in any module then in component class where it uses,
 * we have to also use the @Singleton annotation..otherwise it will give you an error
 **/