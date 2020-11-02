package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.antonioleiva.weatherapp.MainActivityBegin
import com.antonioleiva.weatherapp.R
import kotlinx.android.synthetic.main.activity_week2.*
import org.jetbrains.anko.find

class ActivityWeek2 : AppCompatActivity() {
    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",
        "Tue 6/24 - Foggy - 21/8",
        "Wed 6/25 - Cloudy - 22/17",
        "Thurs 6/26 - Rainy - 18/11",
        "Fri 6/27 - Foggy - 21/10",
        "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
        "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week2)

        val forecastList = find<RecyclerView>(R.id.rv_forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        tv_week2.text = getString(R.string.week_2)

        val boton1 = findViewById<Button>(R.id.bt_change_screan)
        boton1.setOnClickListener {
            val intent = Intent(this@ActivityWeek2, MainActivityBegin::class.java)
            startActivity(intent)
        }
    }
}