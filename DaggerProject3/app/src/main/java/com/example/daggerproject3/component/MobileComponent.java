package com.example.daggerproject3.component;

import com.example.daggerproject3.MainActivity;
import com.example.daggerproject3.model.Mobile;
import com.example.daggerproject3.module.BatteryModule;
import com.example.daggerproject3.module.CameraModule;
import com.example.daggerproject3.module.MediaTekModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    Mobile getMobile();

    void inject(MainActivity activity);


    @Component.Factory
    interface factory {

        //it is nessoccery
        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megaPixel") int megaPixel
        );
    }
}

/*
    The @Named annotation is used to differenciate of the same return type value
    but you can use it in general for better understanding.
 */
