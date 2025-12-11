package com.example.whatsapp.Presentation.viewmodeles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


abstract class BaseViewModel : ViewModel() {


    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> get() = _isLoading


    private val _errorMessage = MutableLiveData<String?>(null)
    val errorMessage: LiveData<String?> get() = _errorMessage


    protected fun setLoading(loading: Boolean) {
        _isLoading.postValue(loading)
    }

    protected fun setError(message: String) {
        _errorMessage.postValue(message)
    }


    fun clearError() {
        _errorMessage.postValue(null)
    }

}
