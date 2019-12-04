package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terpilih_sf_agya.*

class terpilih_sf_agya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_sf_agya)
            reservasi_agya.setOnClickListener {
                val intent = Intent(this, tr_agya::class.java)
                startActivity(intent)
            }
    }
}
