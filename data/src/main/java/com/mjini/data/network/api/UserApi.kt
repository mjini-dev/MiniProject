package com.mjini.data.network.api

import com.mjini.data.entity.UserEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("{username}")
    suspend fun getUserInfo(@Path("username") username: String): UserEntity

}