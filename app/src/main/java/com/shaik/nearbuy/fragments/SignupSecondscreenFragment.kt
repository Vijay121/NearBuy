package com.shaik.nearbuy.fragments

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import com.shaik.nearbuy.R
import kotlinx.android.synthetic.main.signup_secondscreen_fragment_layout.*

class SignupSecondscreenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.signup_secondscreen_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt_address.setText(HtmlCompat.fromHtml("<u>Address</u>",HtmlCompat.FROM_HTML_MODE_LEGACY))
    }
}