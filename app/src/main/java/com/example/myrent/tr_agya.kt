package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_agya.*

class tr_agya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_agya)

            kembali.setOnClickListener {
                val intent = Intent(this, terpilih_sf_agya::class.java)
                startActivity(intent)
            }
                pesan_agya.setOnClickListener {
                    val intent = Intent(this, tersewa_agya::class.java)
                    startActivity(intent)
                }
    }
}
