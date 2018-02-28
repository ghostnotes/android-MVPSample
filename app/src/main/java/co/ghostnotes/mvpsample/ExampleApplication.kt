package co.ghostnotes.mvpsample

import android.app.Activity
import android.app.Application
import co.ghostnotes.mvpsample.core.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class ExampleApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var  dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        initializeInjector()
    }

    private fun initializeInjector() {
        DaggerApplicationComponent.builder()
                .create(this)
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

}