package com.example.daggerproject3kotlin.model

import android.util.Log
import com.example.daggerproject3kotlin.model.Battery
import javax.inject.Inject

class mobile @Inject constructor(battery: Battery, processor: Processor, camera: Camera) {

    init {
        Log.i("mobile", "mobile created: ")
    }

    fun run(){
        Log.i("mobile", "run: ")
    }
}