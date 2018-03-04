package co.ghostnotes.mvpsample.main

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import co.ghostnotes.mvpsample.R
import co.ghostnotes.mvpsample.databinding.ActivityMainBinding
import co.ghostnotes.mvpsample.navigation.Navigator
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var navigator: Navigator

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.fab.setOnClickListener(OnAddTaskClickListener(this, navigator))

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.content_frame, MainFragment(), FRAGMENT_TAG_MAIN)
                    .commit()
        }
    }

    internal class OnAddTaskClickListener(private val activity: Activity, private val navigator: Navigator): View.OnClickListener {
        override fun onClick(v: View?) {
            navigator.navigateToAddTask(activity)
        }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector

    companion object {

        private const val FRAGMENT_TAG_MAIN = "co.ghostnotes.mvpsample.FRAGMENT_TAG_MAIN"

        fun getCallingIntent(context: Context): Intent =
                Intent(context, MainActivity::class.java)

    }

}
