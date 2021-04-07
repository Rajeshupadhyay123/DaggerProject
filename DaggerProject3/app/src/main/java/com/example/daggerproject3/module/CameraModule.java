package com.example.daggerproject3.module;

import android.util.Log;

import com.example.daggerproject3.model.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    int megaPixel;

    public CameraModule(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    @Provides
    static Camera getCamera(@Named("megaPixel") int megaPixel){
        return new Camera(megaPixel);
    }
}
