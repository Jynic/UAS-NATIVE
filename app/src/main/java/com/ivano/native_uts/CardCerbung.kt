package com.ivano.native_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ivano.native_uts.databinding.ActivityCardCerbungBinding
import com.ivano.native_uts.databinding.ActivityMainBinding
import org.json.JSONObject

class CardCerbung : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    var ceritas:ArrayList<Cerita> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
//
}