package com.example.daggerproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerproject3.component.DaggerMobileComponent;
import com.example.daggerproject3.component.MobileComponent;
import com.example.daggerproject3.model.Mobile;
import com.example.daggerproject3.module.SnapdragonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component = DaggerMobileComponent.builder()
                .setClockSpeed(4)
                .setCore(2)
                .build();

        component.inject(this);
        mobil.run();
    }
}

/**
 * If we will use any instance variable in any module class then in that the DaggerComponent class
 * does not have cretae() method available. in that case we have to use builder() method..
 * This approach is known as Providing value at run time..
 **/