package com.antonioleiva.weatherapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.antonioleiva.weatherapp.R
import com.antonioleiva.weatherapp.customviews.interfaces.ButtonClickInterface

import kotlinx.android.synthetic.main.activity_main_begin.*


open class MainActivityBegin : AppCompatActivity(), ButtonClickInterface {
    companion object {
        const val PARAM = "param"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_begin)

        inits()

    }

    private fun inits() {

        custom_botton_carlos.setTitle("holaaaa")
        custom_botton_carlos.setText("textooooo")
        custom_botton_carlos.setListener(this)
    }




    override fun clickButton() {
        val intent = Intent(this@MainActivityBegin, MainActivity::class.java)
        intent.putExtra(PARAM, "Pol")
        startActivity(intent)
    }

}