package com.example.weatherbuddy.domain.model

data class WeatherInfo(
    val temperatureDetails: String,
    val windSpeed: Double,
    val weatherCode: Int,
    val isDay: Boolean,
    val time: String
)
