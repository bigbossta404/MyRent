package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_terpilih_bf_luxio.*

class terpilih_bf_luxio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_bf_luxio)

        reservasi_luxio.setOnClickListener {
            val intent = Intent(this, tr_luxio::class.java)
            startActivity(intent)
        }
    }
}
