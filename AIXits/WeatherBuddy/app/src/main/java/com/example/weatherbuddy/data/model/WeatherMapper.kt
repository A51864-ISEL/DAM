package com.example.weatherbuddy.data.model

import com.example.weatherbuddy.domain.model.WeatherInfo

fun WeatherResponseDto.toDomain(): WeatherInfo? {
    val current = this.currentWeather ?: return null
    return WeatherInfo(
        temperatureDetails = "${current.temperature ?: 0.0}°C",
        windSpeed = current.windSpeed ?: 0.0,
        weatherCode = current.weatherCode ?: 0,
        isDay = current.isDay == 1,
        time = current.time ?: ""
    )
}
