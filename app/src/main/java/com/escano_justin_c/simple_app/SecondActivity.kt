package com.escano_justin_c.simple_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvAge = findViewById<TextView>(R.id.tvAge)

        val intent = intent
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")

        tvName.text = "Name: $name"
        tvAge.text = "Age: $age"

        btnBack.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}