package com.example.weatherbuddy.data.repository

import com.example.weatherbuddy.data.api.OpenMeteoApi
import com.example.weatherbuddy.data.model.toDomain
import com.example.weatherbuddy.domain.model.WeatherInfo
import com.example.weatherbuddy.domain.repository.WeatherRepository

class WeatherRepositoryImpl(
    private val api: OpenMeteoApi
) : WeatherRepository {
    override suspend fun getWeather(latitude: Double, longitude: Double): Result<WeatherInfo> {
        return try {
            val response = api.getWeather(lat = latitude, long = longitude)
            val weatherInfo = response.toDomain()
            if (weatherInfo != null) {
                Result.success(weatherInfo)
            } else {
                Result.failure(Exception("Weather data is null"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
