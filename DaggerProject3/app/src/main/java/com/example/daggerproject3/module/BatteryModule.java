package com.example.daggerproject3.module;

import com.example.daggerproject3.model.Battery;
import com.example.daggerproject3.model.Cobalt;
import com.example.daggerproject3.model.Lithium;

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

    @Provides
    Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(lithium,cobalt);
    }
}
