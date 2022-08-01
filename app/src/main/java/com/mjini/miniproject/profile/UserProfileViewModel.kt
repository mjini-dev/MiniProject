package com.mjini.miniproject.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mjini.domain.model.User
import com.mjini.domain.usecase.GetUserUseCase
import com.mjini.miniproject.base.BaseViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class UserProfileViewModel  @Inject constructor(private val getUserUseCase: GetUserUseCase) : BaseViewModel() {

    private val _userInfo = MutableLiveData<User>()
    val userInfo: LiveData<User> = _userInfo

    fun getUserByCoroutine(username: String) {
        viewModelScope.launch {
            getUserUseCase.getUser(username)
                .catch { }
                .collect {
                    Timber.d("User Data : $it")
                    _userInfo.value = it
                }
        }
    }
}