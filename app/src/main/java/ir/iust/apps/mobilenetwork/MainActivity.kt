package ir.iust.apps.mobilenetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.iust.apps.mobilenetwork.utils.UiUtils

class MainActivity : AppCompatActivity() {

    private val loginFragment: LoginFragment = LoginFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UiUtils().changeFragment(
            supportFragmentManager,
            loginFragment,
            R.id.main_activity__main_frame,
            true,
            LOGIN_FRAGMENT_TAG
        )
    }

    companion object {
        const val LOGIN_FRAGMENT_TAG = "LOGIN_FRAGMENT"
    }
}