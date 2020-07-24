package com.example.meowtec.ui.adopta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.meowtec.R

class AdoptaFragment : Fragment() {

    private lateinit var adoptaViewModel: AdoptaViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        adoptaViewModel =
                ViewModelProviders.of(this).get(AdoptaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_adopta, container, false)
        val textView: TextView = root.findViewById(R.id.text_adopta)
        adoptaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}