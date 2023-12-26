package com.example.hw02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val b1:Button = findViewById(R.id.b1)
        val b2:Button = findViewById(R.id.b2)
        val b3:Button = findViewById(R.id.b3)
        val b4:Button = findViewById(R.id.b4)

        b1.setOnClickListener {
            val intent = Intent(this, three::class.java)
            intent.putExtra("jumeng", numrand +1)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val intent = Intent(this, three::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        b3.setOnClickListener {
            val intent = Intent(this, three::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        b4.setOnClickListener {
            val intent = Intent(this, three::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}

