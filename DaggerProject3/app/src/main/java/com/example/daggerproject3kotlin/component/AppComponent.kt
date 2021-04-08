package com.example.daggerproject3kotlin.component

import com.example.daggerproject3kotlin.MainActivity
import com.example.daggerproject3kotlin.module.BatteryModule
import com.example.daggerproject3kotlin.module.CameraModule
import com.example.daggerproject3kotlin.module.ProcessorModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [BatteryModule::class, ProcessorModule::class,CameraModule::class])
interface AppComponent {


    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance @Named("clockSpeed") clockSpeed: Int,
                   @BindsInstance @Named("core") core: Int,
                   @BindsInstance @Named("megaPx") megaPx: Int): AppComponent
    }
}