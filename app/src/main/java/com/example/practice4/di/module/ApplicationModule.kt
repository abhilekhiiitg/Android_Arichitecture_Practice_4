package com.example.practice4.di.module

import android.app.Application
import com.example.practice4.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule (private val application: Application) {

    @Singleton
    @Provides
    @ApplicationContext
    fun provideContext(): Application = this.application
}