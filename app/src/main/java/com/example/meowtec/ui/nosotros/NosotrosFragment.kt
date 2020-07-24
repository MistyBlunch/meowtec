package com.example.meowtec.ui.nosotros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.meowtec.R

class NosotrosFragment : Fragment() {

    private lateinit var nosotrosViewModel: NosotrosViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        nosotrosViewModel =
                ViewModelProviders.of(this).get(NosotrosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nosotros, container, false)
        val textView: TextView = root.findViewById(R.id.text_nosotros)
        nosotrosViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}