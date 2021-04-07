package com.example.daggerproject3.module;

import com.example.daggerproject3.model.MediaTek;
import com.example.daggerproject3.model.Processor;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {

    @Binds
    abstract Processor getProcessor(MediaTek mediaTek);
}
