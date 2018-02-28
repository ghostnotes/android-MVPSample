package co.ghostnotes.mvpsample.main

import android.util.Log
import javax.inject.Inject

class MainPresenter @Inject constructor(): MainContract.Presenter {

    override fun start() {
        Log.d("TEST", "### main presenter start.")
    }

    override fun stop() {
        Log.d("TEST", "### main presenter stop.")
    }

}