package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_calya.*

class tr_calya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_calya)
        kembali.setOnClickListener {
            val intent = Intent(this, tr_luxio::class.java)
            startActivity(intent)
        }

        pesan_calya.setOnClickListener {
            val intent = Intent(this, tersewa_calya::class.java)
            startActivity(intent)
        }
    }
}
