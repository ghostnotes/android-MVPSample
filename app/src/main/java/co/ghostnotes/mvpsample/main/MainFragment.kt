package co.ghostnotes.mvpsample.main

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.ghostnotes.mvpsample.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment: Fragment() {

    @Inject
    lateinit var presenter: MainPresenter
    @Inject
    lateinit var mainUIHelper: MainUIHelper

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        lifecycle.addObserver(MainLifecycleObserver(presenter))

        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mainUIHelper.sayHi()
    }


}