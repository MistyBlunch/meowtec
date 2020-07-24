package com.example.meowtec.ui.albergue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.meowtec.R
import com.example.meowtec.ui.albergue.AlbergueViewModel

class AlbergueFragment {
    private lateinit var albergueViewModel: AlbergueViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        albergueViewModel =
            ViewModelProviders.of(this).get(albergueViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_albergue, container, false)
        val textView: TextView = root.findViewById(R.id.text_albergue)
        albergueViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}