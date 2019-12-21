package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_terpilih_bf_luxio.*

class terpilih_bf_luxio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terpilih_bf_luxio)

        reservasi_luxio.setOnClickListener {
            val intent = Intent(this, tr_luxio::class.java)
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
