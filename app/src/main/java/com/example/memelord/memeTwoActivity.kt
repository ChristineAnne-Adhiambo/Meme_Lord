package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeTwoActivity : AppCompatActivity() {
    lateinit var btnPreviousOne:Button
    lateinit var btnNextTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        btnPreviousOne=findViewById(R.id.btnPreviousOne)
        btnPreviousOne.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnNextTwo=findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            val intent = Intent(this,memeThreeActivity::class.java)
            startActivity(intent)
        }
    }
}