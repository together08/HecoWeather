package xyz.qatarcloud.hecoweather.logic.network

import xyz.qatarcloud.hecoweather.HecoWeatherApplication
import xyz.qatarcloud.hecoweather.logic.model.DailyResponse
import xyz.qatarcloud.hecoweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${HecoWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${HecoWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>

}