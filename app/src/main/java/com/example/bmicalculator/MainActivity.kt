package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display_bmi:TextView
    lateinit var weight_text:EditText
    lateinit var height_text:EditText
    lateinit var calculate_bmi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_bmi = findViewById(R.id.bmidisp)
        weight_text = findViewById(R.id.weightent)
        height_text = findViewById(R.id.heightent)
        calculate_bmi = findViewById(R.id.calcbtn)

        calculate_bmi.setOnClickListener {
            var weight = weight_text.text.toString().trim().toDouble()
            var height = height_text.text.toString().trim().toDouble()
            var calculate = weight / (height * height)
            var display = "Your BMI is $calculate"
            display_bmi.setText(display)
        }
    }
}
