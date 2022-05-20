package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture3 : AppCompatActivity() {
    lateinit var btnnext3:Button
    lateinit var btnprevious3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        btnnext3=findViewById(R.id.btnnext3)
        btnprevious3=findViewById(R.id.btnprevious3)
        btnnext3.setOnClickListener {
            val intent= Intent(this,picture4::class.java)
            startActivity(intent)
        }
        btnprevious3.setOnClickListener {
            val intent=Intent(this,picture2::class.java)
            startActivity(intent)
        }
    }
}