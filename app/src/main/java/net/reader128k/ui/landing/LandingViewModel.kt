package net.reader128k.ui.landing

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class LandingViewModel @Inject constructor() : ViewModel() {

    private val _user = MutableStateFlow("Guest")
    val user: StateFlow<String> = _user.asStateFlow()

    fun getUser() {
        // TODO: Implement
    }
}