package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.btnStart)
        startButton.setOnClickListener {

            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
    }
}
