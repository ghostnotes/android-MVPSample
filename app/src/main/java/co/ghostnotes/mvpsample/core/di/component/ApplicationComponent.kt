package co.ghostnotes.mvpsample.core.di.component

import co.ghostnotes.mvpsample.ExampleApplication
import co.ghostnotes.mvpsample.core.di.module.ActivityModule
import co.ghostnotes.mvpsample.core.di.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, ActivityModule::class])
interface ApplicationComponent: AndroidInjector<ExampleApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ExampleApplication>()

}