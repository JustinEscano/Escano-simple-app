package com.escano_justin_c.simple_app

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
        enableEdgeToEdge()

        val firstNum = findViewById<EditText>(R.id.firstnum)
        val secondNum = findViewById<EditText>(R.id.secondnum)
        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subtractButton)
        val mulButton = findViewById<Button>(R.id.multiplyButton)
        val divButton = findViewById<Button>(R.id.divideButton)
        val resultNum = findViewById<TextView>(R.id.Resultnum)

        addButton.setOnClickListener {
            val firstNumb = firstNum.text.toString().trim()
            val secondNumb = secondNum.text.toString().trim()

            val firstNumber = firstNumb.toInt()
            val secondNumber = secondNumb.toInt()

            val sumadd = firstNumber + secondNumber
            resultNum.text = sumadd.toString()
        }

        subButton.setOnClickListener {
            val firstNumb = firstNum.text.toString().trim()
            val secondNumb = secondNum.text.toString().trim()

            val firstNumber = firstNumb.toInt()
            val secondNumber = secondNumb.toInt()

            val sumsub = firstNumber - secondNumber
            resultNum.text = sumsub.toString()
        }

        mulButton.setOnClickListener {
            val firstNumb = firstNum.text.toString().trim()
            val secondNumb = secondNum.text.toString().trim()

            val firstNumber = firstNumb.toInt()
            val secondNumber = secondNumb.toInt()

            val summul = firstNumber * secondNumber
            resultNum.text = summul.toString()
        }

        divButton.setOnClickListener {
            val firstNumb = firstNum.text.toString().trim()
            val secondNumb = secondNum.text.toString().trim()

            val firstNumber = firstNumb.toDouble()
            val secondNumber = secondNumb.toDouble()

            val sumdiv = firstNumber / secondNumber
            resultNum.text = sumdiv.toString()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}