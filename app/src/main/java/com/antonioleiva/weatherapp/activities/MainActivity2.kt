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
import com.antonioleiva.weatherapp.R
import com.example.weatherapp.ForecastListAdapter
import org.jetbrains.anko.find


class MainActivity2 : AppCompatActivity() {

    private val itemsEs1 = listOf(
        "Lun 23/6 - Soleado  - 31/17",
        "Mar 24/6 - Niebla   - 21/8",
        "Mie 25/6 - Nublado  - 22/17",
        "Jue 26/6 - Lluvia   - 18/11",
        "Vie 27/6 - Niebla   - 21/10",
        "Sab 28/6 - Tormenta - 23/18",
        "Dom 29/6 - Soleado  - 20/7",
        "Lun 30/6 - Soleado  - 31/17",
        "Mar  1/7 -  Tormenta - 21/8",
        "Mie  2/7 -  Lluvia   - 22/17",
        "Jue  3/7 -  Lluvia   - 18/11",
        "Vie  4/7 -  Tormenta - 21/10",
        "Sab  5/7 -  Nublado  - 23/18",
        "Dom  6/7 -  Soleado  - 20/7"
    )
    /*private val itemsEs2 = listOf(
        "Lun 30/6 - Soleado - 31/17",
        "Mar 1/7 - Tormenta - 21/8",
        "Mie 2/7 - Lluvia - 22/17",
        "Jue 3/7 - Lluvia - 18/11",
        "Vie 4/7 - Tormenta - 21/10",
        "Sab 5/7 - Nublado - 23/18",
        "Dom 6/7 - Soleado - 20/7"
    )*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = find<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(itemsEs1)
        /*val listaDos=find<RecyclerView>(R.id.lista2)
        listaDos.layoutManager=LinearLayoutManager(this)
        listaDos.adapter=ForecastListAdapter(itemsEs2)
        forecastList.setNestedScrollingEnabled(false);
        listaDos.setNestedScrollingEnabled(false);*/
        val boton1 = findViewById<Button>(R.id.changeScrean)
        boton1.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(i)
        }
    }
}