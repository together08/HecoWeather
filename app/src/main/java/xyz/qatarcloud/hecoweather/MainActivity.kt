package xyz.qatarcloud.hecoweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (HecoWeatherApplication.TOKEN.isEmpty()) {
            Toast.makeText(this, "请在 HecoWeatherApplication 中填入你申请到的令牌值", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}
