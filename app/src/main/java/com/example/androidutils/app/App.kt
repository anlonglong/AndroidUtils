package com.example.androidutils.app

import android.app.Application
import android.util.Log
import com.example.appforegroundstatus.ApplicationForegroundStatusRegistryImpl


private const val TAG = "App"

class App : Application() {

    private val mForegroundStatusRegistry by lazy { ApplicationForegroundStatusRegistryImpl() }

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(mForegroundStatusRegistry)
        mForegroundStatusRegistry.addObserver {
            Log.d(TAG, "isInForeground = $it")
        }
    }

}