package co.ghostnotes.mvpsample.main

import co.ghostnotes.mvpsample.core.di.ActivityScoped
import co.ghostnotes.mvpsample.core.di.component.ApplicationComponent
import dagger.Component

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class],
        modules = [MainPresenterModule::class])
internal interface MainComponent