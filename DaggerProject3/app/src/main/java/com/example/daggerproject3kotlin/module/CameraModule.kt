package com.example.daggerproject3kotlin.module

import com.example.daggerproject3kotlin.model.Camera
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CameraModule {

    @Provides
    fun getCamera(@Named("megaPx") megaPx:Int):Camera{
        return Camera(megaPx)
    }
}