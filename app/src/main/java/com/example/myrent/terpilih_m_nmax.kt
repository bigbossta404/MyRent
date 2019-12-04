package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terpilih_m_nmax.*

class terpilih_m_nmax : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_m_nmax)

            reservasi_nmax.setOnClickListener {
                val intent = Intent(this, tr_nmax::class.java)
                startActivity(intent)
        }
    }
}
