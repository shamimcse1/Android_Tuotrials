package com.codercamp.android_tuorials

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView

    private  lateinit var button : Button // Button Declaration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView = findViewById(R.id.textView)

        // Button Initialization
        button = findViewById(R.id.button)

        textView.setOnClickListener{v->

            textView.text = "Hello Programmer"
        }

        textView.isSelected = true


        // Button Click Event

        button.setOnClickListener{
            // Change Text
            textView.text = "Hello World"
            // Change Background Color
            textView.setBackgroundColor(resources.getColor(R.color.green))
            // Change Text Color
            textView.setTextColor(resources.getColor(R.color.white))
        }

    }
}