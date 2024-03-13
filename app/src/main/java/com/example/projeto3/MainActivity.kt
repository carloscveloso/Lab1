package com.example.projeto3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActButton = findViewById<Button>(R.id.button)
        secondActButton.setOnClickListener {
            val Intent = Intent(this,Activity_main2::class.java)
            startActivity(Intent)
        }
    }
}