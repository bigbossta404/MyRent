package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_ayla.*

class tr_ayla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_ayla)
            kembali.setOnClickListener {
                val intent = Intent(this, terpilih_sf_ayla::class.java)
                startActivity(intent)
            }
                pesan_ayla.setOnClickListener {
                    val intent = Intent(this, tersewa_ayla::class.java)
                    startActivity(intent)
                }
    }
}
