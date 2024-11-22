package com.example.imageview


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}