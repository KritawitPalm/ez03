package com.example.hw02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val e1: Button = findViewById(R.id.e1)
        val e2: Button = findViewById(R.id.e2)
        val e3: Button = findViewById(R.id.e3)
        val e4: Button = findViewById(R.id.e4)

        e1.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        e2.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        e3.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        e4.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", numrand +1)
            startActivity(intent)
        }
    }
}


