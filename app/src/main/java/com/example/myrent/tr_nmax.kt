package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_luxio.*
import kotlinx.android.synthetic.main.activity_tr_nmax.*
import kotlinx.android.synthetic.main.activity_tr_nmax.kembali

class tr_nmax : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_nmax)

        kembali.setOnClickListener {
            val intent = Intent(this, terpilih_bf_luxio::class.java)
            startActivity(intent)
        }
        pesan_luxio.setOnClickListener {
            val intent = Intent(this, tersewa_luxio::class.java)
            startActivity(intent)
        }
    }
}
