package com.example.meowtec.ui.nosotros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NosotrosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is nosotros Fragment"
    }
    val text: LiveData<String> = _text
}