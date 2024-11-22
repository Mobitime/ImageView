package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PhotoActivity : AppCompatActivity() {
    private val photos = listOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo5
    )
    private var currentPhotoIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        val imgPhoto = findViewById<ImageView>(R.id.imgPhoto)
        val btnNext = findViewById<Button>(R.id.btnNext)

        imgPhoto.setImageResource(photos[currentPhotoIndex])

        btnNext.setOnClickListener{
            currentPhotoIndex++

            if (currentPhotoIndex < photos.size) {
                imgPhoto.setImageResource(photos[currentPhotoIndex])
            }else{
                val intent = Intent(this, EndActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }
}