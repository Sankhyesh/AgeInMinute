package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get referance to button
//        val btnclickme = findViewById(R.id.button) as Button
//        val mytextView = findViewById(R.id.textView) as TextView
        var timeClicked = 0
        // set on-click listener

        button.setOnClickListener{
            timeClicked += 1
            textView.text = timeClicked.toString()
            Toast.makeText(this@MainActivity,"you clicked on me",Toast.LENGTH_SHORT).show()
        }
    }
}