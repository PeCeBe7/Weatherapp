package com.antonioleiva.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.antonioleiva.weatherapp.activities.MainActivity
import com.example.weatherapp.ActivityWeek2
import kotlinx.android.synthetic.main.activity_main_begin.*

private const val NUM_PAGES = 2

open class MainActivityBegin : FragmentActivity() {
    companion object {
        const val PARAM = "param"
    }

    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_begin)

        mPager = findViewById(R.id.pager)

        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        mPager.adapter = pagerAdapter

        inits()

    }


    override fun onBackPressed() {
        if (mPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            mPager.currentItem = mPager.currentItem - 1
        }
    }


    private inner class ScreenSlidePagerAdapter(fm: FragmentManager) :
        FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int = NUM_PAGES

        override fun getItem(position: Int): Fragment =
    }

    private fun inits() {
        iniText()
        iniListeners()
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