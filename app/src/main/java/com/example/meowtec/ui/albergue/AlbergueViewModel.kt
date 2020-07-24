package com.example.meowtec.ui.albergue

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlbergueViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is albergue Fragment"
    }
    val text: LiveData<String> = _text
}