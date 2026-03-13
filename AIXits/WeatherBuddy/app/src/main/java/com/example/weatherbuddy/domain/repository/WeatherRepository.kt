package com.example.weatherbuddy.domain.repository

import com.example.weatherbuddy.domain.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeather(latitude: Double, longitude: Double): Result<WeatherInfo>
}
