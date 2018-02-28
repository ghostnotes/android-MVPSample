package co.ghostnotes.mvpsample.main

import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideMainUIHelper(): MainUIHelper {
        return MainUIHelper()
    }

}