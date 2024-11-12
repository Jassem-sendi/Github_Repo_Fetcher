package com.example.githubfetchdata.ui.helloPage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubfetchdata.network.getUserInfo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HelloViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HelloUiState())
    val uiState: StateFlow<HelloUiState> = _uiState.asStateFlow()

    fun updateUsername(newUsername: String) {
        _uiState.value = HelloUiState(username = newUsername)
    }
    fun fetchUserInfo(){
        viewModelScope.launch {
            val userInfo = getUserInfo(_uiState.value.username)
            println("USer Info : $userInfo")
        }
    }
}

data class HelloUiState(
    val username: String = ""
)