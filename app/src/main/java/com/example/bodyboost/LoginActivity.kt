package com.example.bodyboost

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    var googleBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<View>(R.id.loginButton) as Button
        loginButton.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }
        val registerButton = findViewById<View>(R.id.registerButton) as Button
        registerButton.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        googleBtn = findViewById(R.id.loginButton)
    }
}