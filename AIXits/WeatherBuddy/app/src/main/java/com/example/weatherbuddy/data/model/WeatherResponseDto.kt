package com.example.weatherbuddy.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherResponseDto(
    @Json(name = "current_weather")
    val currentWeather: CurrentWeatherDto?
)

@JsonClass(generateAdapter = true)
data class CurrentWeatherDto(
    @Json(name = "temperature") val temperature: Double?,
    @Json(name = "windspeed") val windSpeed: Double?,
    @Json(name = "weathercode") val weatherCode: Int?,
    @Json(name = "is_day") val isDay: Int?,
    @Json(name = "time") val time: String?
)
