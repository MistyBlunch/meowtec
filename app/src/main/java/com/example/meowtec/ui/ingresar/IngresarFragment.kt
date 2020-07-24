package com.example.meowtec.ui.ingresar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.meowtec.R

class IngresarFragment : Fragment() {

    private lateinit var ingresarViewModel: NosotrosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ingresarViewModel =
            ViewModelProviders.of(this).get(IngresarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ingresar, container, false)
        val textView: TextView = root.findViewById(R.id.text_ingresar)
        ingresarViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}