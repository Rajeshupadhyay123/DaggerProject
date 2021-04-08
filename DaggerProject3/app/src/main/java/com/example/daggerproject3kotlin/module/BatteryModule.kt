package com.example.daggerproject3kotlin.module

import com.example.daggerproject3kotlin.model.Battery
import com.example.daggerproject3kotlin.model.Cobalt
import com.example.daggerproject3kotlin.model.Lithium
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun getLithium():Lithium{
        return Lithium();
    }

    @Provides
    fun getCobalt():Cobalt{
        return Cobalt()
    }

    @Provides
    fun getBattery(lithium: Lithium,cobalt: Cobalt):Battery{
        return Battery(lithium,cobalt)
    }
}