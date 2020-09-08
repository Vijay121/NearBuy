package com.shaik.nearbuy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.shaik.nearbuy.R
import kotlinx.android.synthetic.main.splash_fragment_layout.*

class SplashFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.splash_fragment_layout, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_getstarted.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToSignupFragment())
            }
        })

        txt_already_have_account.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToSignInFragment())
            }
        })
    }
}