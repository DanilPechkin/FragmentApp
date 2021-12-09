package com.example.fragmentapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = view?.findViewById<TextView>(R.id.fragment_message_text)
        textView?.text = "some text"
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}