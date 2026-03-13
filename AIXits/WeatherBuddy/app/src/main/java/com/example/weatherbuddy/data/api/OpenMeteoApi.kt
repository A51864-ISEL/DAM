package com.example.weatherbuddy.data.api

import com.example.weatherbuddy.data.model.WeatherResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenMeteoApi {
    @GET("v1/forecast")
    suspend fun getWeather(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
        @Query("current_weather") currentWeather: Boolean = true
    ): WeatherResponseDto
}
