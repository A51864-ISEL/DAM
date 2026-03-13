package com.example.weatherbuddy.presentation.weather

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Float
import kotlin.jvm.JvmStatic

public data class WeatherFragmentArgs(
  public val latitude: Float,
  public val longitude: Float,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putFloat("latitude", this.latitude)
    result.putFloat("longitude", this.longitude)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("latitude", this.latitude)
    result.set("longitude", this.longitude)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): WeatherFragmentArgs {
      bundle.setClassLoader(WeatherFragmentArgs::class.java.classLoader)
      val __latitude : Float
      if (bundle.containsKey("latitude")) {
        __latitude = bundle.getFloat("latitude")
      } else {
        throw IllegalArgumentException("Required argument \"latitude\" is missing and does not have an android:defaultValue")
      }
      val __longitude : Float
      if (bundle.containsKey("longitude")) {
        __longitude = bundle.getFloat("longitude")
      } else {
        throw IllegalArgumentException("Required argument \"longitude\" is missing and does not have an android:defaultValue")
      }
      return WeatherFragmentArgs(__latitude, __longitude)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): WeatherFragmentArgs {
      val __latitude : Float?
      if (savedStateHandle.contains("latitude")) {
        __latitude = savedStateHandle["latitude"]
        if (__latitude == null) {
          throw IllegalArgumentException("Argument \"latitude\" of type float does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"latitude\" is missing and does not have an android:defaultValue")
      }
      val __longitude : Float?
      if (savedStateHandle.contains("longitude")) {
        __longitude = savedStateHandle["longitude"]
        if (__longitude == null) {
          throw IllegalArgumentException("Argument \"longitude\" of type float does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"longitude\" is missing and does not have an android:defaultValue")
      }
      return WeatherFragmentArgs(__latitude, __longitude)
    }
  }
}
