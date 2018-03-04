package co.ghostnotes.mvpsample.main

import android.util.Log
import co.ghostnotes.mvpsample.core.executor.PostExecutionThread
import co.ghostnotes.mvpsample.core.executor.ThreadExecutor
import co.ghostnotes.mvpsample.core.mvp.BaseView
import co.ghostnotes.mvpsample.data.Task
import co.ghostnotes.mvpsample.db.ApplicationDatabase
import co.ghostnotes.mvpsample.navigation.Navigator
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter @Inject constructor(): MainContract.Presenter {

    @Inject
    lateinit var threadExecutor: ThreadExecutor
    @Inject
    lateinit var postExecutionThread: PostExecutionThread
    @Inject
    lateinit var navigator: Navigator
    @Inject
    lateinit var applicationDatabase: ApplicationDatabase

    override fun start(view: BaseView) {
        Log.d("TEST", "### main presenter start.")

        getAllTasks()
    }

    private fun getAllTasks() {
        applicationDatabase.taskDao().getAllTasks()
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getScheduler())
                .subscribe(this::onNext)
    }

    internal fun onNext(tasks: MutableList<Task>) {
        Log.d("TEST", "### task size: ${tasks.size}")
    }

    override fun stop() {
        Log.d("TEST", "### main presenter stop.")
    }

}