package com.mjini.domain.repository

import com.mjini.domain.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

@Singleton
interface UserRepository{
    suspend fun getUser(username:String) : Flow<User>

}