package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_first_frame).setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack("firstFragment")
                .replace(R.id.activity_main_frame, BlankFragment())
                .commit()
        }

        findViewById<Button>(R.id.button_second_frame).setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack("secondFragment")
                .replace(R.id.activity_main_frame, BlankFragment2())
                .commit()
        }

    }
}