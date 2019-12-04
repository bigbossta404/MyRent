package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sweetfam.*

class sweetfam : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweetfam)

        btnagya.setOnClickListener {
            val intent = Intent(this, terpilih_sf_agya::class.java)
            startActivity(intent)
        }
        btnayla.setOnClickListener {
            val intent = Intent(this, terpilih_sf_ayla::class.java)
            startActivity(intent)
        }
        btnbrio.setOnClickListener {
            val intent = Intent(this, terpilih_sf_brio::class.java)
            startActivity(intent)
        }
    }
}
