package net.reader128k.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.reader128k.data.LoginRepository
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository) :
    ViewModel() {
    private val _loginResponse by lazy { MutableLiveData<String>() }
    val loginResponse: LiveData<String>
        get() = _loginResponse

    fun login(username: String, password: String) {
        viewModelScope.launch {
            loginRepository.login(username, password).collect { response ->
                if (response.isSuccessful) {
                    _loginResponse.value = "ok"
                } else {
                    _loginResponse.value = "error"
                }
            }
        }
    }
}