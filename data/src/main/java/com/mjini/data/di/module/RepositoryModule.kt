package com.mjini.data.di.module

import com.mjini.data.repository.UserRepositoryImpl
import com.mjini.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun UserRepositoryImpl (UserRepositoryImpl: UserRepositoryImpl): UserRepository
}