package com.wsthoughts.simplemenubar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    lateinit var tbar : Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tbar = findViewById(R.id.tb_menu)
        setSupportActionBar(tbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var output = findViewById<TextView>(R.id.tv_output)
        when (item.itemId){
            R.id.mi_search ->   output.text = "Search is Clicked"
            R.id.mi_Profile ->  output.text = "Profile is Clicked"
            R.id.mi_Display -> output.text = "Display is Clicked"
            R.id.mi_exit    -> {
                this.finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }


}





