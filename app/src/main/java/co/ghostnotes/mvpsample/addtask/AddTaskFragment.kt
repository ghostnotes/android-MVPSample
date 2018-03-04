package co.ghostnotes.mvpsample.addtask

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.ghostnotes.mvpsample.R
import co.ghostnotes.mvpsample.databinding.FragmentAddTaskBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class AddTaskFragment: Fragment(), AddTaskContract.View {

    @Inject
    lateinit var presenter: AddTaskPresenter

    private lateinit var binding: FragmentAddTaskBinding

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_task, container, false)

        return binding.root
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        lifecycle.addObserver(AddTaskLifecycleObserver(this, presenter))

        super.onAttach(context)
    }

}