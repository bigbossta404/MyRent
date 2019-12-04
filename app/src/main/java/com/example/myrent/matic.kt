package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_matic.*

class matic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matic)

        btnvario.setOnClickListener {
            val intent = Intent(this, terpilih_m_vario::class.java)
            startActivity(intent)
        }
        btnnmax.setOnClickListener {
            val intent = Intent(this, terpilih_m_nmax::class.java)
            startActivity(intent)
        }
    }
}
