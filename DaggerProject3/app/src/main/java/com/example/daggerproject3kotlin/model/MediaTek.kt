package com.example.daggerproject3kotlin.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import kotlin.properties.Delegates

class MediaTek @Inject constructor(@Named("clockSpeed") val clockSpeed:Int, @Named("core") val core:Int) : Processor {

    init {
        Log.i("mobile", "mediaTek created: with clockSpeed: $clockSpeed core: $core")
    }
}