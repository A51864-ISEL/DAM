package com.example.weatherbuddy.di;

import com.example.weatherbuddy.data.api.OpenMeteoApi;
import com.example.weatherbuddy.domain.repository.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideWeatherRepositoryFactory implements Factory<WeatherRepository> {
  private final Provider<OpenMeteoApi> apiProvider;

  public AppModule_ProvideWeatherRepositoryFactory(Provider<OpenMeteoApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public WeatherRepository get() {
    return provideWeatherRepository(apiProvider.get());
  }

  public static AppModule_ProvideWeatherRepositoryFactory create(
      Provider<OpenMeteoApi> apiProvider) {
    return new AppModule_ProvideWeatherRepositoryFactory(apiProvider);
  }

  public static WeatherRepository provideWeatherRepository(OpenMeteoApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWeatherRepository(api));
  }
}
