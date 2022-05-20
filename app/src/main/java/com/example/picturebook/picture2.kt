package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture2 : AppCompatActivity() {
    lateinit var btnprevious1:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        btnprevious1=findViewById(R.id.btnprevious1)
        btnnext2=findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
            val intent=Intent(this,picture3::class.java)
            startActivity(intent)
        }
        btnprevious1.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}