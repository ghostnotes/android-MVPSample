package co.ghostnotes.mvpsample.core.di.module

import co.ghostnotes.mvpsample.navigation.Navigator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun provideNavigator(): Navigator {
        return Navigator()
    }

}