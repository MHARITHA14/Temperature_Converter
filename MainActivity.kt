package com.example.temperatureconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.temperature_converter.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempInput = findViewById<EditText>(R.id.tempInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val btnCtoF = findViewById<Button>(R.id.btnCtoF)
        val btnFtoC = findViewById<Button>(R.id.btnFtoC)

        btnCtoF.setOnClickListener {
            val celsius = tempInput.text.toString().toDouble()
            val fahrenheit = (celsius * 9/5) + 32
            resultText.text = "Fahrenheit: $fahrenheit"
        }

        btnFtoC.setOnClickListener {
            val fahrenheit = tempInput.text.toString().toDouble()
            val celsius = (fahrenheit - 32) * 5/9
            resultText.text = "Celsius: $celsius"
        }
    }
}
