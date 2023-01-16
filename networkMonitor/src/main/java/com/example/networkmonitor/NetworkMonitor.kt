package com.example.networkmonitor

import kotlinx.coroutines.flow.Flow

interface NetworkMonitor {
    val isOnline: Flow<Boolean>
    val isConnected: Boolean
}