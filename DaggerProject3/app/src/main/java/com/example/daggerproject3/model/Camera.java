package com.example.daggerproject3.model;

import android.util.Log;

public class Camera {

    //we don't create the constructor injection. let is a third party library
    int megaPixel;


    public Camera(int megaPixel) {
        this.megaPixel=megaPixel;
        Log.i("mobile", "Camera created with : "+megaPixel+" megaPixel");
    }
}
