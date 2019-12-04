package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terpilih_sf_brio.*

class terpilih_sf_brio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_sf_brio)

            reservasi_brio.setOnClickListener {
                val intent = Intent(this, tr_brio::class.java)
                startActivity(intent)
            }
    }
}
