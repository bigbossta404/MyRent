package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terpilih_bf_calya.*

class terpilih_bf_calya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_bf_calya)

            reservasi_calya.setOnClickListener {
                val intent = Intent(this, tr_calya::class.java)
                startActivity(intent)
            }
    }
}
