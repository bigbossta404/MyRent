package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bigfam.*
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
        navbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navhome -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.navhistory -> {
                    val intent = Intent(this, history::class.java)
                    startActivity(intent)
                }
                R.id.navprofile -> {
                    Toast.makeText(this,"belum buat", Toast.LENGTH_SHORT).show()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
