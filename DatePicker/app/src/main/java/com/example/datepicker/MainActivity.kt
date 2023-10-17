package com.example.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show_date_time(view: View) {
        var dpDob = findViewById<DatePicker>(R.id.dpDOB)
        var tpTime =findViewById<TimePicker>(R.id.tpTime)
        var output = findViewById<TextView>(R.id.tvOutput)

        var d = dpDob.dayOfMonth
        var m = dpDob.month.toInt() + 1
        var y = dpDob.year
        var str = d.toString() + "/" + m.toString() + "/" + y.toString()

        var h = tpTime.hour
        var min = tpTime.minute

        var str_time = " "

        if( h > 11 ) {
            h = h - 12
            if(h == 0 )
                h = 12

            str_time = h.toString() + ":" + min.toString()+ " PM"
        } else {
            str_time = h.toString() + ":" + min.toString()+ " AM"

        }


        output.setText(str+ " "+ str_time)

    }



}


