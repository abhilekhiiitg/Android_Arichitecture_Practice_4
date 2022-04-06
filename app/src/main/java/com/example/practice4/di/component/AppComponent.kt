package com.example.practice4.di.component

import com.example.practice4.di.module.ApplicationModule
import com.example.practice4.di.module.UserDataModule
import com.example.practice4.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, UserDataModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}