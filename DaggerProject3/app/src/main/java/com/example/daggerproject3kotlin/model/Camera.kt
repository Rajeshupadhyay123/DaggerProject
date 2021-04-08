package com.example.daggerproject3kotlin.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Camera constructor( megaPx:Int) {

    init {
        Log.i("mobile", "Camera created with mp: $megaPx")
    }
}