package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terpilih_m_vario.*

class terpilih_m_vario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_m_vario)

            reservasi_vario.setOnClickListener {
                val intent = Intent(this,tr_vario::class.java)
                startActivity(intent)
            }
    }
}
