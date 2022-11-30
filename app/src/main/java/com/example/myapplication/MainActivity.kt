package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // btn.setOnClickListener {
        //  Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
        // }
    }

    fun btnClick(view: View) {
        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
    }

    fun press(view: View) {
        if (view == tv) {
            Toast.makeText(this, "Hello text view", Toast.LENGTH_LONG).show()
        } else {
          startActivity(Intent(this, calculate_age::class.java))
        }
    }
}