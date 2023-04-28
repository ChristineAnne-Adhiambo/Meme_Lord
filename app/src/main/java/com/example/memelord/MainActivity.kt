package com.example.memelord

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnPreviousOne:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext=findViewById(R.id.btnNext)
//        btnPreviousOne=findViewById(R.id.btnPreviousOne)
        btnNext.setOnClickListener {
            val intent = Intent(this,memeTwoActivity::class.java)
            startActivity(intent)
        }

//
//        btnPreviousOne.setOnClickListener {
//            val intent=Intent(this,btnPreviousOne::class.java)
//            startActivity(intent)
//        }
    }
}