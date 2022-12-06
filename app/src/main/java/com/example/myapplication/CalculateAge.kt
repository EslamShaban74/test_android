package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.calculate_age.*
import java.util.Calendar

class CalculateAge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculate_age)

    }

    fun calculateAge(view: View) {
        if(editText.text.isEmpty()){
            Toast.makeText(this,"birth year cant be empty",Toast.LENGTH_LONG).show()
        }else{
            val birthYear = editText.text.toString().toInt()
            val age = Calendar.getInstance().get(Calendar.YEAR) - birthYear
            textView.text = "your age is $age years old"
        }

    }
}