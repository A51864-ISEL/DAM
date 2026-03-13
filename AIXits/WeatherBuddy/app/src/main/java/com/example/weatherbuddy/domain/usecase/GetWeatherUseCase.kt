package com.example.weatherbuddy.domain.usecase

import com.example.weatherbuddy.domain.model.WeatherInfo
import com.example.weatherbuddy.domain.repository.WeatherRepository
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(latitude: Double, longitude: Double): Result<WeatherInfo> {
        return repository.getWeather(latitude, longitude)
    }
}
