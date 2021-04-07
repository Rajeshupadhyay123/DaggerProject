package com.example.daggerproject3.component;

import com.example.daggerproject3.MainActivity;
import com.example.daggerproject3.module.MediaTekModule;
import com.example.daggerproject3.module.MobileModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {MobileModule.class, MediaTekModule.class})
public interface MobileComponent {

    void inject(MainActivity activity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        //this annotation is also creating as :---
        Builder setCore(@BindsInstance @Named("core") int core);

        //it will be important bez it return the reference of the MobileComponent interface
        MobileComponent build();
    }
}

/*
    The @Named annotation is used to differenciate of the same return type value
    but you can use it in general for better understanding.
 */
