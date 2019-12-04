package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tepilih_bf_sigra.*

class terpilih_bf_sigra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tepilih_bf_sigra)

        reservasi_sigra.setOnClickListener {
            val intent = Intent(this, tr_sigra::class.java)
            startActivity(intent)
        }
    }
}
