package co.ghostnotes.mvpsample.core.di.module

import co.ghostnotes.mvpsample.addtask.AddTaskActivity
import co.ghostnotes.mvpsample.addtask.AddTaskModule
import co.ghostnotes.mvpsample.addtask.AddTaskPresenterModule
import co.ghostnotes.mvpsample.main.MainActivity
import co.ghostnotes.mvpsample.main.MainModule
import co.ghostnotes.mvpsample.main.MainPresenterModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [MainPresenterModule::class, MainModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AddTaskPresenterModule::class, AddTaskModule::class])
    abstract fun contributeAddTaskActivity(): AddTaskActivity

}