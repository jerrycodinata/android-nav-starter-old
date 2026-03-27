package com.dicoding.picodiploma.academy

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var mTextMessage: TextView? = null

    private val mOnNavigationItemSelectedListener
            : BottomNavigationView.OnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.getItemId()) {
                    R.id.navigation_home -> {
                        mTextMessage!!.setText(R.string.title_home)
                        return true
                    }

                    R.id.navigation_dashboard -> {
                        mTextMessage!!.setText(R.string.title_dashboard)
                        return true
                    }

                    R.id.navigation_notifications -> {
                        mTextMessage!!.setText(R.string.title_notifications)
                        return true
                    }
                }
                return false
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        mTextMessage = findViewById<TextView>(R.id.message)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}