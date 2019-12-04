package com.example.myrent

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_loadingboot.*
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        masuk.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        txtregister.setOnClickListener {
                val intent = Intent(this, register::class.java)
                startActivity(intent)
        }
    }
}
