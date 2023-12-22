package com.ivano.native_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val bottomnaviview = findViewById<BottomNavigationView>(R.id.botton_navigation)
        bottomnaviview.setOnClickListener{
            Toast.makeText(this, "BERHASIL", Toast.LENGTH_SHORT).show().toString()
        }
    }
}