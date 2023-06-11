package com.example.androtestlab.utils

import kotlinx.coroutines.flow.Flow


interface NetworkConnectivityService {
    val networkStatus: Flow<NetworkStatus>
}
