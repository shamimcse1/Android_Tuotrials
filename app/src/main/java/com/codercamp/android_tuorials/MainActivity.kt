package com.codercamp.android_tuorials

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private  lateinit var imageView: ImageView // Declare ImageView
    private lateinit var  button: Button // Declare Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        imageView = findViewById(R.id.imageView) // Initialize ImageView
        button = findViewById(R.id.button) // Initialize Button

        //Button Click Event
        button.setOnClickListener {
            // After Button Click Image Will Change
            imageView.setImageResource(R.drawable.image) // Set Image Resource
        }
    }
}

//1670.1 939.4