package com.example.weatherbuddy.presentation.map

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.weatherbuddy.R
import kotlin.Float
import kotlin.Int

public class MapFragmentDirections private constructor() {
  private data class ActionMapFragmentToWeatherFragment(
    public val latitude: Float,
    public val longitude: Float,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mapFragment_to_weatherFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putFloat("latitude", this.latitude)
        result.putFloat("longitude", this.longitude)
        return result
      }
  }

  public companion object {
    public fun actionMapFragmentToWeatherFragment(latitude: Float, longitude: Float): NavDirections
        = ActionMapFragmentToWeatherFragment(latitude, longitude)
  }
}
