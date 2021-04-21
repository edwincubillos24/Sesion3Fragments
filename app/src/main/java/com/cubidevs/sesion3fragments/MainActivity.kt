package com.cubidevs.sesion3fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cubidevs.sesion3fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  //  private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  //      mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

}