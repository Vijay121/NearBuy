package com.shaik.nearbuy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.shaik.nearbuy.R
import kotlinx.android.synthetic.main.signup_fragment_layout.*

class SignupFirstscreenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.signup_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt_next.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                findNavController().navigate(R.id.action_signupFragment_to_signupSecondscreenFragment)
            }
        })
    }
}