package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() ,TextWatcher{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /// to watch email and password edit text is empty or not at the overridden method
        email.addTextChangedListener(this)
        password.addTextChangedListener(this)

        loginBtn.setOnClickListener{
            if( progressBar.visibility == View.VISIBLE){
                progressBar.visibility = View.GONE
            }else{
                progressBar.visibility = View.VISIBLE
            }

        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int){

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        val email =email.text.toString()
        val password =password.text.toString()
        loginBtn.isEnabled = email.trim().isNotEmpty() && password.trim().isNotEmpty()
    }

    override fun afterTextChanged(p0: Editable?) {

    }
}