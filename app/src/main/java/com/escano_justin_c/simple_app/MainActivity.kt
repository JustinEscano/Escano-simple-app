package com.escano_justin_c.simple_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        enableEdgeToEdge()  // Ensure this method is defined elsewhere or remove if unnecessary

        val firstNum = findViewById<EditText>(R.id.firstnum)
        val secondNum = findViewById<EditText>(R.id.secondnum)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subtractButton)
        val mulButton = findViewById<Button>(R.id.multiplyButton)
        val divButton = findViewById<Button>(R.id.divideButton)
        val resultNum = findViewById<TextView>(R.id.Resultnum)

        addButton.setOnClickListener {
            val firstNumber = firstNum.text.toString().trim()
            val secondNumber = secondNum.text.toString().trim()

            val pfirstNumber = firstNumber.toInt()
            val psecondNumber = secondNumber.toInt()

            val sum = pfirstNumber + psecondNumber
            resultNum.text = sum.toString()
        }

        /* test comment*/

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}