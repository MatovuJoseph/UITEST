package com.interswitchug.uitest.ui.topup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TopUpViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is topup Fragment"
    }
    val text: LiveData<String> = _text
}