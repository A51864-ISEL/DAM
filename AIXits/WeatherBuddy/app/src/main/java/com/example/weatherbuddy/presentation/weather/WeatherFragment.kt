package com.example.weatherbuddy.presentation.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.navArgs
import com.example.weatherbuddy.databinding.FragmentWeatherBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!

    private val viewModel: WeatherViewModel by viewModels()
    private val args: WeatherFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvCoordinates.text = "Lat: ${args.latitude}, Lon: ${args.longitude}"

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    updateUi(state)
                }
            }
        }

        if (savedInstanceState == null) {
            viewModel.loadWeather(args.latitude.toDouble(), args.longitude.toDouble())
        }
    }

    private fun updateUi(state: WeatherUiState) {
        when (state) {
            is WeatherUiState.Loading -> {
                binding.progressBar.visibility = View.VISIBLE
                binding.llWeatherContent.visibility = View.GONE
                binding.tvError.visibility = View.GONE
            }
            is WeatherUiState.Success -> {
                binding.progressBar.visibility = View.GONE
                binding.tvError.visibility = View.GONE
                binding.llWeatherContent.visibility = View.VISIBLE
                
                val weather = state.weather
                binding.tvTemperature.text = weather.temperatureDetails
                binding.tvWindSpeed.text = "Wind: ${weather.windSpeed} km/h"
                
                // Extremely basic weather code mapping
                val condition = when (weather.weatherCode) {
                    0 -> "Clear sky"
                    1, 2, 3 -> "Mainly clear, partly cloudy"
                    45, 48 -> "Fog"
                    51, 53, 55 -> "Drizzle"
                    61, 63, 65 -> "Rain"
                    71, 73, 75 -> "Snow"
                    95 -> "Thunderstorm"
                    else -> "Unknown condition"
                }
                binding.tvCondition.text = condition
            }
            is WeatherUiState.Error -> {
                binding.progressBar.visibility = View.GONE
                binding.llWeatherContent.visibility = View.GONE
                binding.tvError.visibility = View.VISIBLE
                binding.tvError.text = state.message
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
