package com.dot7.daggerexample1.utils.di

import android.app.Application
import com.dot7.daggerexample1.utils.preferences.IPreferences
import com.dot7.daggerexample1.utils.preferences.Preferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {

    @Singleton // Crea una sola instsanica
    @Provides // provee el valor
    fun providerPreferences(application: Application): IPreferences {
        return Preferences(application.baseContext)
    }
}