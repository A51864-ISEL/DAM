package com.example.weatherbuddy.data.model;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/example/weatherbuddy/data/model/CurrentWeatherDto;", "", "temperature", "", "windSpeed", "weatherCode", "", "isDay", "time", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTime", "()Ljava/lang/String;", "getWeatherCode", "getWindSpeed", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/weatherbuddy/data/model/CurrentWeatherDto;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CurrentWeatherDto {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temperature = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double windSpeed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer weatherCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer isDay = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String time = null;
    
    public CurrentWeatherDto(@com.squareup.moshi.Json(name = "temperature")
    @org.jetbrains.annotations.Nullable()
    java.lang.Double temperature, @com.squareup.moshi.Json(name = "windspeed")
    @org.jetbrains.annotations.Nullable()
    java.lang.Double windSpeed, @com.squareup.moshi.Json(name = "weathercode")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer weatherCode, @com.squareup.moshi.Json(name = "is_day")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer isDay, @com.squareup.moshi.Json(name = "time")
    @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWindSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWeatherCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherbuddy.data.model.CurrentWeatherDto copy(@com.squareup.moshi.Json(name = "temperature")
    @org.jetbrains.annotations.Nullable()
    java.lang.Double temperature, @com.squareup.moshi.Json(name = "windspeed")
    @org.jetbrains.annotations.Nullable()
    java.lang.Double windSpeed, @com.squareup.moshi.Json(name = "weathercode")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer weatherCode, @com.squareup.moshi.Json(name = "is_day")
    @org.jetbrains.annotations.Nullable()
    java.lang.Integer isDay, @com.squareup.moshi.Json(name = "time")
    @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}