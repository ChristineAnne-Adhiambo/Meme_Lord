package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeThreeActivity : AppCompatActivity() {
    lateinit var btnPreviousThree: Button
    lateinit var btnNextThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        btnPreviousThree = findViewById(R.id.btnPreviousThree)
        btnPreviousThree.setOnClickListener {
            val intent = Intent(this, memeTwoActivity::class.java)
            startActivity(intent)
        }
        btnNextThree = findViewById(R.id.btnNextThree)
        btnNextThree.setOnClickListener {
            val intent = Intent(this, memeFourActivity::class.java)
            startActivity(intent)
        }
    }
}