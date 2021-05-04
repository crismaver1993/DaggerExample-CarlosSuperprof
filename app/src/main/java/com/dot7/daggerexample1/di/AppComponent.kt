package com.dot7.daggerexample1.di

import android.app.Application
import com.dot7.daggerexample1.base.App
import com.dot7.daggerexample1.ui.di.MainModule
import com.dot7.daggerexample1.utils.di.UtilsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class, // De cajon copy paste
        UtilsModule::class,
        MainModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App) // lo unico que cambia es este por
                       // tu nombre de class que extiende de Application
}