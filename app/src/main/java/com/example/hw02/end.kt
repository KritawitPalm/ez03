package com.example.hw02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class end : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)


        val total: TextView = findViewById(R.id.total)

        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("jumeng", 0)
        total.setText(numrand.toString())
    }
}