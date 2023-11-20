package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        val secretButton = findViewById<Button>(R.id.secretButton)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            Toast.makeText(this, "Hello World", LENGTH_SHORT).show()
        }

        secretButton.setOnClickListener{
            Toast.makeText(this, "I love Algortihms", LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.sticker_algo)
        }
    }
}
