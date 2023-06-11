package com.example.androtestlab.di

import com.example.androtestlab.utils.NetworkConnectivityService
import com.example.androtestlab.utils.NetworkConnectivityServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ApplicationModule {

    @Binds
    abstract fun bindNetworkConnectivityService(networkConnectivityServiceImpl: NetworkConnectivityServiceImpl): NetworkConnectivityService

}