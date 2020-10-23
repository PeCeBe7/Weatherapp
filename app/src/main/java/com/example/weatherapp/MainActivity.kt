package com.antonioleiva.weatherapp.activities

//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
//import com.antonioleiva.weatherapp.adapters.ForecastListAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.antonioleiva.weatherapp.MainActivityBegin
import com.antonioleiva.weatherapp.R
import com.example.weatherapp.ForecastListAdapter
import org.jetbrains.anko.find


class MainActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_main)

        val forecastList = find<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)
        val boton1 = findViewById<Button>(R.id.changeScrean)
        boton1.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivityBegin::class.java)
            startActivity(intent)
        }
    }
}
/*package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text="Hello Kotlin!"
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

    }
    fun add(x: Int, y: Int): Int{
        return x + y
    }
    // fun add(x: Int, y: Int) : Int = x + y  ASI TAMBIEN SE PUEDE HACER
    fun Toast(message: String, length: Int = android.widget.Toast.LENGTH_SHORT) {
        android.widget.Toast.makeText(this, message, length).show()
    }
    fun niceToast(message: String,
                  tag: String = MainActivity::class.java.simpleName,
                  length: Int = android.widget.Toast.LENGTH_SHORT) {
        android.widget.Toast.makeText(this, "[$tag] $message", length).show()
    }


    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",
        "Tue 6/24 - Foggy - 21/8",
        "Wed 6/25 - Cloudy - 22/17",
        "Thurs 6/26 - Rainy - 18/11",
        "Fri 6/27 - Foggy - 21/10",
        "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
        "Sun 6/29 - Sunny - 20/7"
         )

}
class Person(name: String, surname: String) {
    init {

    }
}

open class Animal(name: String)
class Person2(name: String, lastName: String) : Animal(name)

class Request(val url: String){
    fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName,forecastJsonStr)
    }
}
data class Forecast(val date: Date, val temperature: Float, val details: String)
*/
