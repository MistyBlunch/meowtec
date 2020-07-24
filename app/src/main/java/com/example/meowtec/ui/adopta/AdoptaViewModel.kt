package com.example.meowtec.ui.adopta

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdoptaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is adopta Fragment"
    }
    val text: LiveData<String> = _text
}