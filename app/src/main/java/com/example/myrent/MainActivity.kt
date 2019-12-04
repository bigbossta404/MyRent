package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrent.bigfam
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnbigfam.setOnClickListener {
            val intent = Intent(this, bigfam::class.java)
            startActivity(intent)
        }
        btnsweetfam.setOnClickListener {
            val intent = Intent(this, sweetfam::class.java)
            startActivity(intent)
        }
        btnmatic.setOnClickListener {
            val intent = Intent(this, matic::class.java)
            startActivity(intent)
        }
    }
}
