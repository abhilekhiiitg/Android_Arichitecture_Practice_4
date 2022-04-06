package com.example.practice4

import android.app.Application
import com.example.practice4.di.component.AppComponent
import com.example.practice4.di.component.DaggerAppComponent
import com.example.practice4.di.module.ApplicationModule
import com.example.practice4.di.module.UserDataModule

open class MainApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        createComponent()
    }

    protected open fun createComponent() {
        component = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .userDataModule(UserDataModule())
            .build()
    }
}