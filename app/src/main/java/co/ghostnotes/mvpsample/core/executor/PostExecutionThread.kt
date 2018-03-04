package co.ghostnotes.mvpsample.core.executor

import io.reactivex.Scheduler

interface PostExecutionThread {

    fun getScheduler(): Scheduler

}