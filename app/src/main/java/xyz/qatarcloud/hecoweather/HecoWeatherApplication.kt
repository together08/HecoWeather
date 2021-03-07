package xyz.qatarcloud.hecoweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class HecoWeatherApplication : Application() {

    companion object {

        const val TOKEN = "eH0SK4GusIWAgiM1" // 填入你申请到的令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}
