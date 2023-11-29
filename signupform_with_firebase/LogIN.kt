package com.example.signupform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LogIN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        var btnSU = findViewById<Button>(R.id.btnSignUP1)
        var btnLIN = findViewById<Button>(R.id.btnLogIN1)

        btnSU.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnLIN.setOnClickListener {
            sign_in_user()
        }
    }

    private fun sign_in_user() {
        var email = findViewById<EditText>(R.id.etEmail1)
        var password = findViewById<EditText>(R.id.etPassword1)
        val userEmail = email.text.toString()
        val userPassword = password.text.toString()

        if (userEmail.isEmpty() || userPassword.isEmpty()) {
            Toast.makeText(this, " empty", Toast.LENGTH_SHORT).show()
            return // Add this line to prevent the function from continuing if fields are empty
        }

        val auth: FirebaseAuth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword(userEmail, userPassword)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, " Log IN Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, " Log in failed" + task.exception, Toast.LENGTH_SHORT).show()
                }
            }
    }
}



