package co.ghostnotes.mvpsample.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import co.ghostnotes.mvpsample.R
import co.ghostnotes.mvpsample.navigation.Navigator
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector, MainContract.View {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator.navigateToMain()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.content_frame, MainFragment(), FRAGMENT_TAG_MAIN)
                    .commit()
        }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }

    companion object {

        private const val FRAGMENT_TAG_MAIN = "co.ghostnotes.mvpsample.FRAGMENT_TAG_MAIN"

        fun getCallingIntent(context: Context): Intent =
                Intent(context, MainActivity::class.java)

    }

}
