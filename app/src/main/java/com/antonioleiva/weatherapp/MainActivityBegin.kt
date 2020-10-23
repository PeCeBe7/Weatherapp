package com.antonioleiva.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.antonioleiva.weatherapp.activities.MainActivity

class MainActivityBegin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_begin)
        val boton1 = findViewById<Button>(R.id.changeScrean)
        boton1.setOnClickListener {
            val intent = Intent(this@MainActivityBegin, MainActivity::class.java)
            startActivity(intent)
        }
    }
    /*fun actionClick(view: View?) {

    }*/
}