package co.ghostnotes.mvpsample.core.di.module

import android.arch.persistence.room.Room
import co.ghostnotes.mvpsample.ExampleApplication
import co.ghostnotes.mvpsample.core.executor.JobExecutor
import co.ghostnotes.mvpsample.core.executor.PostExecutionThread
import co.ghostnotes.mvpsample.core.executor.ThreadExecutor
import co.ghostnotes.mvpsample.core.executor.UIThread
import co.ghostnotes.mvpsample.db.ApplicationDatabase
import co.ghostnotes.mvpsample.navigation.Navigator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun provideApplicationDatabase(application: ExampleApplication): ApplicationDatabase {
        return Room.databaseBuilder(application.applicationContext, ApplicationDatabase::class.java, "example-db").build()
    }

    @Provides
    @Singleton
    fun provideThreadExecutor(): ThreadExecutor = JobExecutor()

    @Provides
    @Singleton
    fun providePostExecutionThread(): PostExecutionThread = UIThread()

    @Provides
    @Singleton
    fun provideNavigator(): Navigator = Navigator()

}