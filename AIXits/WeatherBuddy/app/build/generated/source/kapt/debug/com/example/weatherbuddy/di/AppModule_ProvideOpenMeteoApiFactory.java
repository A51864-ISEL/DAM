package com.example.weatherbuddy.di;

import com.example.weatherbuddy.data.api.OpenMeteoApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideOpenMeteoApiFactory implements Factory<OpenMeteoApi> {
  @Override
  public OpenMeteoApi get() {
    return provideOpenMeteoApi();
  }

  public static AppModule_ProvideOpenMeteoApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OpenMeteoApi provideOpenMeteoApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideOpenMeteoApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideOpenMeteoApiFactory INSTANCE = new AppModule_ProvideOpenMeteoApiFactory();
  }
}
