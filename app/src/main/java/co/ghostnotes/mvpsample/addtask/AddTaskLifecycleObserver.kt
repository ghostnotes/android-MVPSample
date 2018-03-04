package co.ghostnotes.mvpsample.addtask

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class AddTaskLifecycleObserver(
        private val view: AddTaskContract.View,
        private val presenter: AddTaskContract.Presenter
): LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d("TEST", "### lifecycle on create.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.d("TEST", "### lifecycle on start.")

        presenter.start(view)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d("TEST", "### lifecycle on stop.")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d("TEST", "### lifecycle on destroy.")

        presenter.stop()
    }

}