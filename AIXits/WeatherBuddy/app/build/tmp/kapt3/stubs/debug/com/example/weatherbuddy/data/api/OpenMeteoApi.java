package com.example.weatherbuddy.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherbuddy/data/api/OpenMeteoApi;", "", "getWeather", "Lcom/example/weatherbuddy/data/model/WeatherResponseDto;", "lat", "", "long", "currentWeather", "", "(DDZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface OpenMeteoApi {
    
    @retrofit2.http.GET(value = "v1/forecast")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeather(@retrofit2.http.Query(value = "latitude")
    double lat, @retrofit2.http.Query(value = "longitude")
    double p1_1663806, @retrofit2.http.Query(value = "current_weather")
    boolean currentWeather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherbuddy.data.model.WeatherResponseDto> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}