package com.example.vpn.di


import com.example.vpn.data.repository.SettingsRepositoryImpl
import com.example.vpn.domain.repository.SettingsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Привязывает интерфейс к реализации: когда кому-то нужен SettingsRepository,
 * Hilt подставляет SettingsRepositoryImpl.
 * Если позже поменяем хранилище, достаточно заменить класс в этой строке.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindSettingsRepository(
        impl: SettingsRepositoryImpl
    ): SettingsRepository
}