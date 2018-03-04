package co.ghostnotes.mvpsample.addtask

import co.ghostnotes.mvpsample.core.di.ActivityScoped
import co.ghostnotes.mvpsample.core.di.component.ApplicationComponent
import dagger.Component

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class],
        modules = [AddTaskPresenterModule::class])
internal interface AddTaskComponent