package com.mjini.domain.usecase

import com.mjini.domain.repository.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend fun getUser(username:String) = userRepository.getUser(username)


}