package com.example.daggerproject3kotlin.component

import com.example.daggerproject3kotlin.MainApplication
import com.example.daggerproject3kotlin.module.CameraModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [CameraModule::class])
interface ApplicationComponent {


    fun inject(mainApplication: MainApplication)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance @Named("megaPx") megaPx: Int):ApplicationComponent
    }
}