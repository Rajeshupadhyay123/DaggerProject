package com.example.daggerproject3kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerproject3kotlin.component.AppComponent
import com.example.daggerproject3kotlin.component.DaggerAppComponent
import com.example.daggerproject3kotlin.model.mobile
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: mobile

    lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appComponent=DaggerAppComponent.factory().create(120,2,64)
        appComponent.inject(this)

        mobile.run()
    }
}