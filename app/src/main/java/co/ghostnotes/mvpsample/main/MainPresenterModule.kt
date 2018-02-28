package co.ghostnotes.mvpsample.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainPresenterModule {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment

}