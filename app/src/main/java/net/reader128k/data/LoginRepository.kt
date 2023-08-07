package net.reader128k.data

import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class LoginRepository @Inject constructor(private val loginRemoteDataSource: LoginRemoteDataSource) {

    fun login(username: String, password: String): Flow<Response<Unit>> {
        return loginRemoteDataSource.login(username, password)
    }
}