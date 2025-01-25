package com.codercamp.android_tuorials

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var  imageView: ImageView // Declare ImageView
    private lateinit var  loadImageBtn: Button // Declare Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView = findViewById(R.id.loadImage) // Initialize ImageView
        loadImageBtn = findViewById(R.id.loadImageBtn) // Initialize Button

        //When Button Clicked Image Will Load
        loadImageBtn.setOnClickListener {
            Glide.with(this)
                .load("https://goo.gl/gEgYUd")
                .into(imageView)


        }
        //Image load from URL

    }
}
