package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_loadingboot.*
import kotlinx.android.synthetic.main.activity_main.*

class loadingboot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loadingboot)

        boot.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)

        }
    }
}
