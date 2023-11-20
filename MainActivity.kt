package com.example.intent_putextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit_values(view: View) {
        var intent = Intent(this, home::class.java)
        var etName = findViewById<EditText>(R.id.etName)
        var etAge = findViewById<EditText>(R.id.etAge)
        var strName = etName.text.toString()
        var strAge = etAge.text.toString()
        // putExtra( Key , value )
        intent.putExtra("name",strName)
        intent.putExtra("age",strAge)
        startActivity(intent)
    }
}





