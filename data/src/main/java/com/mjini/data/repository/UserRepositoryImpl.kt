package com.mjini.data.repository

import com.mjini.data.mapper.UserEntityMapper
import com.mjini.data.network.api.UserApi
import com.mjini.domain.model.User
import com.mjini.domain.repository.UserRepository
import kotlinx.coroutines.flow.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi,
    private val userEntityMapper: UserEntityMapper
) : UserRepository {

    override suspend fun getUser(username: String): Flow<User> =
        flow { emit(userApi.getUserInfo(username)) }.map { userEntityMapper.transform(it) }



}