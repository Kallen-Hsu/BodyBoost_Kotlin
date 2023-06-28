package com.example.bodyboost

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val registerButton = findViewById<View>(R.id.next) as Button
        registerButton.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@RegisterActivity, RegisterInfoActivity::class.java)
            startActivity(intent)
        }
    }
}