package com.example.daggerproject3kotlin.module

import com.example.daggerproject3kotlin.model.MediaTek
import com.example.daggerproject3kotlin.model.Processor
import dagger.Binds
import dagger.BindsInstance
import dagger.Module

@Module
abstract class ProcessorModule {

    @Binds
    abstract fun  getProcessor(mediaTek: MediaTek):Processor
}