package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tr_vario.*

class tr_vario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_vario)

        kembali.setOnClickListener {
            val intent = Intent(this, terpilih_m_vario::class.java)
            startActivity(intent)
        }

        pesan_vario.setOnClickListener {
            val intent = Intent(this, tersewa_vario::class.java)
            startActivity(intent)
        }
    }
}
