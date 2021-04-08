package com.example.daggerproject3kotlin.model

import android.util.Log

class Battery constructor(lithium: Lithium,cobalt: Cobalt) {

    init {
        Log.i("mobile", "Battery created: ")
    }
}