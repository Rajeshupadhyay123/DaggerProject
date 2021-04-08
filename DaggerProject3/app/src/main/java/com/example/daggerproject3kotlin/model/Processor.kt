package com.example.daggerproject3kotlin.model

import android.util.Log

interface Processor {

    fun start(){
        Log.i("mobile", "start: ")
    }
}