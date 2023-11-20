package com.example.intent_putextras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text


class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var tvName = findViewById<TextView>(R.id.tvName)
        var tvAge = findViewById<TextView>(R.id.tvAge)
        var intent = intent
        var strName = intent.getStringExtra("name")
        var strAge = intent.getStringExtra("age")
        tvName.text = strName
        tvAge.text = strAge
    }
}