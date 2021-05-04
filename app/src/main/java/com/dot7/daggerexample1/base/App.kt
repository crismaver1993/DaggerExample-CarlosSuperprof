package com.dot7.daggerexample1.base

import android.app.Application
import com.dot7.daggerexample1.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {  // copy paste de HasAndroidInjecto

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any> // copy paste

    override fun onCreate() {
        super.onCreate()

      DaggerAppComponent.builder()
          .application(this)
          .build()
          .inject(this)

    }

    override fun androidInjector() = androidInjector // copy paste


}