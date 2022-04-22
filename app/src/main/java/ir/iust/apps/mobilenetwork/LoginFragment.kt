package ir.iust.apps.mobilenetwork

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class LoginFragment : Fragment() {

    // Android View Models
    private val viewModel: MainViewModel by viewModels()

    // Views
    private lateinit var loginBtn: MaterialButton
    private lateinit var googleBtn: MaterialButton
    private lateinit var facebookBtn: MaterialButton
    private lateinit var goToSignupBtn: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // Bind views
        loginBtn = view.findViewById(R.id.login_fragment__login_btn)
        goToSignupBtn = view.findViewById(R.id.login_fragment__sign_up_btn)

        // Set listeners
        loginBtn.setOnClickListener {

        }

        goToSignupBtn.setOnClickListener {
            Log.i(LOG_TAG, "Go to Signup page btn was clicked")
            viewModel.pageState.value = Pages.SIGNUP
            Log.i(LOG_TAG, "New state is ${viewModel.pageState.value}")
        }

        return view
    }

    companion object {
        const val LOG_TAG = "LOGIN_PAGE"

        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}