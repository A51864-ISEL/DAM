package com.example.weatherbuddy.presentation.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherbuddy.domain.model.WeatherInfo
import com.example.weatherbuddy.domain.usecase.GetWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class WeatherUiState {
    object Loading : WeatherUiState()
    data class Success(val weather: WeatherInfo) : WeatherUiState()
    data class Error(val message: String) : WeatherUiState()
}

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<WeatherUiState>(WeatherUiState.Loading)
    val uiState: StateFlow<WeatherUiState> = _uiState.asStateFlow()

    fun loadWeather(lat: Double, lon: Double) {
        viewModelScope.launch {
            _uiState.value = WeatherUiState.Loading
            val result = getWeatherUseCase(lat, lon)
            result.onSuccess { weatherInfo ->
                _uiState.value = WeatherUiState.Success(weatherInfo)
            }.onFailure { exception ->
                _uiState.value = WeatherUiState.Error(exception.message ?: "Unknown error occurred")
            }
        }
    }
}
