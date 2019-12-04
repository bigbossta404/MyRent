package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_brio.*

class tr_brio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_brio)

        kembali.setOnClickListener {
            val intent = Intent(this, terpilih_sf_brio::class.java)
            startActivity(intent)
        }
        pesan_brio.setOnClickListener {
            val intent = Intent(this, tersewa_brio::class.java)
            startActivity(intent)
        }
    }
}
