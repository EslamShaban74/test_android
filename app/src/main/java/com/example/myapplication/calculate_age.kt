package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.calculate_age.*
import java.util.Calendar

class calculate_age : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculate_age)
    }

    fun calculateAge(view: View) {
        val birthYear = editText.text.toString().toInt()
        val age = Calendar.getInstance().get(Calendar.YEAR) - birthYear
        textView.text = "your age is $age years old"
    }
}