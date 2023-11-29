package com.example.signupform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var email : EditText
    private  lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email =findViewById(R.id.etEmail)
        password=findViewById(R.id.etPassword)
        val btnLOG = findViewById<Button>(R.id.btnLogIN)
        btnLOG.setOnClickListener {
            startActivity(Intent(this, LogIN::class.java))
        }
    }

    fun signUp(view: View) {
        val userEmail = email.text.toString()
        val userPassword = password.text.toString()

        if (userEmail.isEmpty() || userPassword.isEmpty()) {
            Toast.makeText(this, " empty", Toast.LENGTH_SHORT).show()
            return // Add this line to prevent the function from continuing if fields are empty
        }

        val auth: FirebaseAuth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(userEmail, userPassword)
            .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Toast.makeText(this, " Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, " failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

}