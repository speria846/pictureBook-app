package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture4 : AppCompatActivity() {
    lateinit var btnnext4:Button
    lateinit var btnprevious4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        btnnext4=findViewById(R.id.btnnext4)
        btnprevious4=findViewById(R.id.btnprevious4)
        btnnext4.setOnClickListener {
            val intent= Intent(this,picfure5::class.java)
            startActivity(intent)
        }
        btnprevious4.setOnClickListener {
            val intent=Intent(this,picture3::class.java)
            startActivity(intent)
        }
    }
}