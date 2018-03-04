package co.ghostnotes.mvpsample.addtask

import android.util.Log
import co.ghostnotes.mvpsample.core.mvp.BaseView
import co.ghostnotes.mvpsample.navigation.Navigator
import javax.inject.Inject

class AddTaskPresenter @Inject constructor(): AddTaskContract.Presenter {

    @Inject
    lateinit var navigator: Navigator

    override fun start(view: BaseView) {
        Log.d("TEST", "### add task presenter start.")
    }

    override fun stop() {
        Log.d("TEST", "### add task presenter stop.")
    }

}