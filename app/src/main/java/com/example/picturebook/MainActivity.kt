package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext1=findViewById(R.id.btnnext1)
        btnnext1.setOnClickListener {
            val intent= Intent(this,picture2::class.java)
            startActivity(intent)
        }
    }
}