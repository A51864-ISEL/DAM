package com.example.weatherbuddy.presentation.weather;

import com.example.weatherbuddy.domain.usecase.GetWeatherUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<GetWeatherUseCase> getWeatherUseCaseProvider;

  public WeatherViewModel_Factory(Provider<GetWeatherUseCase> getWeatherUseCaseProvider) {
    this.getWeatherUseCaseProvider = getWeatherUseCaseProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(getWeatherUseCaseProvider.get());
  }

  public static WeatherViewModel_Factory create(
      Provider<GetWeatherUseCase> getWeatherUseCaseProvider) {
    return new WeatherViewModel_Factory(getWeatherUseCaseProvider);
  }

  public static WeatherViewModel newInstance(GetWeatherUseCase getWeatherUseCase) {
    return new WeatherViewModel(getWeatherUseCase);
  }
}
