package com.example.daggerproject3kotlin

import android.app.Application
import android.util.Log
import com.example.daggerproject3kotlin.component.ApplicationComponent
import com.example.daggerproject3kotlin.component.DaggerApplicationComponent
import com.example.daggerproject3kotlin.model.Camera
import javax.inject.Inject

open class MainApplication : Application() {

    @Inject
    lateinit var camera: Camera

    lateinit var component:ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        component=DaggerApplicationComponent.factory().create(64)
        component.inject(this)

        Log.i("raj", "===================Application=============")
        Log.i("raj", "Camera: $camera")
    }
}