package com.antonioleiva.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.antonioleiva.weatherapp.activities.MainActivity
import com.example.weatherapp.ActivityWeek2
import kotlinx.android.synthetic.main.activity_main_begin.*


open class MainActivityBegin : AppCompatActivity() {
    companion object {
        const val PARAM = "param"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_begin)

        inits()

    }

    private fun inits() {
        iniText()
        iniListeners()
        /*changeScrean2.apply {
            text = getString(R.string.info_week)

            setOnClickListener {
                //val intent = Intent(this@MainActivityBegin, ActivityWeek2::class.java)
                val intent = Intent(this@MainActivityBegin, MainActivity2::class.java)
                intent.putExtra(PARAM,"Pol")
                startActivity(intent)
            }
        }*/

    }

    private fun iniListeners() {
        bt_change_screan.setOnClickListener {
            val intent = Intent(this@MainActivityBegin, MainActivity::class.java)
            intent.putExtra(MainActivityBegin.PARAM, "Pol")
            startActivity(intent)
        }
        bt_changeScrean2.setOnClickListener {
            val intent = Intent(this@MainActivityBegin, ActivityWeek2::class.java)
            //val intent = Intent(this@MainActivityBegin, MainActivity2::class.java)
            intent.putExtra(MainActivityBegin.PARAM, "Pol")
            startActivity(intent)
        }
    }

    private fun iniText() {
        bt_change_screan.text = getString(R.string.info_week)
        bt_changeScrean2.text = getString(R.string.info_week)

        tv_week1.text = getString(R.string.week_1)
        tv_week2.text = getString(R.string.week_2)
    }

}