package com.mjini.miniproject.base

import android.app.Application
import com.mjini.baseproject.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MiniProjectApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.BUILD_TYPE.startsWith("debug")) {
            Timber.plant(Timber.DebugTree())
        }
    }
}