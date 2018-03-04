package co.ghostnotes.mvpsample.main

import android.util.Log
import co.ghostnotes.mvpsample.core.mvp.BaseView
import co.ghostnotes.mvpsample.navigation.Navigator
import javax.inject.Inject

class MainPresenter @Inject constructor(): MainContract.Presenter {

    @Inject
    lateinit var navigator: Navigator

    override fun start(view: BaseView) {
        Log.d("TEST", "### main presenter start.")
    }

    override fun stop() {
        Log.d("TEST", "### main presenter stop.")
    }

}