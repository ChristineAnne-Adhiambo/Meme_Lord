package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeFourActivity : AppCompatActivity() {
    lateinit var btnPreviousFour:Button
    lateinit var btnFourNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_four)
        btnPreviousFour = findViewById(R.id.btnPreviousFour)
        btnPreviousFour.setOnClickListener {
            val intent = Intent(this, memeThreeActivity::class.java)
            startActivity(intent)
        }
        btnFourNext = findViewById(R.id.btnFourNext)
        btnFourNext.setOnClickListener {
            val intent = Intent(this, memeFiveActivity::class.java)
            startActivity(intent)
        }

    }
}