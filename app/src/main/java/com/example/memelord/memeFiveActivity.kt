package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeFiveActivity : AppCompatActivity() {
    lateinit var btnLastPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_five)
        btnLastPrevious=findViewById(R.id.btnLastPrevious)
        btnLastPrevious.setOnClickListener {
            val intent = Intent(this, memeFourActivity::class.java)
            startActivity(intent)
        }
        }
    }
