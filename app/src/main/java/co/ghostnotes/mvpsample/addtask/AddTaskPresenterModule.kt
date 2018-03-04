package co.ghostnotes.mvpsample.addtask

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AddTaskPresenterModule {

    @ContributesAndroidInjector
    abstract fun contributeAddTaskFragment(): AddTaskFragment

}