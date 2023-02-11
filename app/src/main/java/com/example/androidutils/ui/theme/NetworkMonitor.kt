package com.example.androidutils.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import com.example.networkmonitor.NetworkMonitor

val LocalNetworkMonitor = staticCompositionLocalOf<NetworkMonitor> {
    error("CompositionLocal LocalNetworkMonitor not present")
}



