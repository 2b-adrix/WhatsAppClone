package com.example.whatsapp.Presentation.viewmodeles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// ERROR FIX: I have removed the specific import for 'ChatListModel' because the path was wrong.
// AFTER PASTING: If 'ChatListModel' is red below, click it and press (Alt + Enter) to auto-import the correct one.

abstract class BaseViewModel : ViewModel() {

    // 1. Common Loading State
    // Useful for showing a progress bar on any screen extending this class
    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> get() = _isLoading

    // 2. Common Error State
    // Useful for showing Snackbars or Toasts on errors
    private val _errorMessage = MutableLiveData<String?>(null)
    val errorMessage: LiveData<String?> get() = _errorMessage

    /**
     * Helper function to update loading state
     */
    protected fun setLoading(loading: Boolean) {
        _isLoading.postValue(loading)
    }

    /**
     * Helper function to set an error message
     */
    protected fun setError(message: String) {
        _errorMessage.postValue(message)
    }

    /**
     * Helper function to clear error message after showing it
     */
    fun clearError() {
        _errorMessage.postValue(null)
    }

    /**
     * Your original search function placeholder.
     * Note: You usually want to use a specific user model here, not necessarily ChatListModel.
     * Ensure ChatListModel is imported correctly.
     */
    /*
    // Uncomment this block once you have fixed the Import issue for ChatListModel

    fun searchUserByPhoneNumber(phoneNumber: String, callback: (ChatListModel?) -> Unit) {
        viewModelScope.launch {
            setLoading(true)
            try {
                // TODO: specific search implementation logic here
                // val result = repository.searchUser(phoneNumber)
                // callback(result)
            } catch (e: Exception) {
                setError(e.message ?: "Unknown Error")
                callback(null)
            } finally {
                setLoading(false)
            }
        }
    }
    */
}
