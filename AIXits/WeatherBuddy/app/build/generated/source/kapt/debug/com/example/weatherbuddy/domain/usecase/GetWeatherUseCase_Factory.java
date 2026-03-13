package com.example.weatherbuddy.domain.usecase;

import com.example.weatherbuddy.domain.repository.WeatherRepository;
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
public final class GetWeatherUseCase_Factory implements Factory<GetWeatherUseCase> {
  private final Provider<WeatherRepository> repositoryProvider;

  public GetWeatherUseCase_Factory(Provider<WeatherRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetWeatherUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetWeatherUseCase_Factory create(Provider<WeatherRepository> repositoryProvider) {
    return new GetWeatherUseCase_Factory(repositoryProvider);
  }

  public static GetWeatherUseCase newInstance(WeatherRepository repository) {
    return new GetWeatherUseCase(repository);
  }
}
