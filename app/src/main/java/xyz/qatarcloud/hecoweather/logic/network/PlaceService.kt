package xyz.qatarcloud.hecoweather.logic.network

import xyz.qatarcloud.hecoweather.HecoWeatherApplication
import xyz.qatarcloud.hecoweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${HecoWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}