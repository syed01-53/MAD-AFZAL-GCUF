package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toggle_action(view: View) {
        var tgButton = findViewById<ToggleButton>(R.id.tbWifi)
        var tvOutput = findViewById<TextView>(R.id.tvOutput)
        if(tgButton.isChecked)
            tvOutput.setText("State is OFF.. Turn off Wifi")
        else
            tvOutput.setText("State is ON.. Turn on Wifi")
    }
}







