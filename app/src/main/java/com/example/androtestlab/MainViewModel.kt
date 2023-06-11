package com.example.androtestlab

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androtestlab.utils.NetworkConnectivityService
import com.example.androtestlab.utils.NetworkStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    networkConnectivityService: NetworkConnectivityService
) : ViewModel() {
    val networkStatus: StateFlow<NetworkStatus> = networkConnectivityService.networkStatus.stateIn(
        initialValue = NetworkStatus.Unknown,
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000)
    )
}