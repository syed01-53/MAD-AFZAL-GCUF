package com.example.intendend

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Answer4(view: View) {
        val intent3 = Intent(this,MainActivity2::class.java)
                startActivity(intent3)
    }

    fun google(view: View) {
        val explicit=Intent (Intent.ACTION_VIEW)
        explicit.data= Uri.parse("https://www.google.com/")
         startActivity(explicit);
    }
}