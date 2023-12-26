package com.example.hw02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val g1: Button = findViewById(R.id.g1)
        val g2: Button = findViewById(R.id.g2)
        val g3: Button = findViewById(R.id.g3)
        val g4: Button = findViewById(R.id.g4)

        g1.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        g2.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        g3.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        g4.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}



