package net.reader128k.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import net.reader128k.api.ApiService
import javax.inject.Inject

class LoginRemoteDataSource @Inject constructor(private val apiService: ApiService) {
    private val ioDispatcher = Dispatchers.IO
    fun login(username: String, password: String) = flow {
        val loginResponse = apiService.login(username, password)
        emit(loginResponse)
    }.flowOn(ioDispatcher)
}