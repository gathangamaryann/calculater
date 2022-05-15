package com.example.mycalculater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  lateinit var  btnCalculater : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculater = findViewById(R.id.btnCalculater)
        btnCalculater = findViewById(R.id.btnCalculater)
        btnCalculater.setOnClickListener{
            val intent= Intent(this,calculate::class.java)
            startActivity(intent)
        }
    }
}