package com.example.weatherbuddy.di

import com.example.weatherbuddy.data.api.OpenMeteoApi
import com.example.weatherbuddy.data.repository.WeatherRepositoryImpl
import com.example.weatherbuddy.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOpenMeteoApi(): OpenMeteoApi {
        return Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(OpenMeteoApi::class.java)
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(api: OpenMeteoApi): WeatherRepository {
        return WeatherRepositoryImpl(api)
    }
}
