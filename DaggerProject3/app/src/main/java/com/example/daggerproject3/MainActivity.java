package com.example.daggerproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerproject3.component.DaggerMobileComponent;
import com.example.daggerproject3.component.MobileComponent;
import com.example.daggerproject3.model.Mobile;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

   @Inject
    Mobile mobile1,mobile2,mobile3,mobile4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MobileComponent component = DaggerMobileComponent.factory().create(4,3,64);
        //for better understanding check in Note.txt file
        MobileComponent component=((MainApplication)getApplication()).getComponent();

        component.inject(this);
        //mobile1=component.getMobile();
        //mobile2=component.getMobile();
        //mobile3=component.getMobile();
        //mobile4=component.getMobile();

        mobile1.run();
        mobile2.run();
    }
}

/**
 * If we will use any instance variable in any module class then in that the DaggerComponent class
 * does not have cretae() method available. in that case we have to use builder() method..
 * This approach is known as Providing value at run time..
 **/