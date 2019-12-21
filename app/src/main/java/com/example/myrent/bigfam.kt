package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bigfam.*
import kotlinx.android.synthetic.main.activity_login.*

class bigfam : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bigfam)

        btnluxio.setOnClickListener {
            val intent = Intent(this, terpilih_bf_luxio::class.java)
            startActivity(intent)
        }
        btnsigra.setOnClickListener {
            val intent = Intent(this, terpilih_bf_sigra::class.java)
            startActivity(intent)
        }
        btncalya.setOnClickListener {
            val intent = Intent(this, terpilih_bf_calya::class.java)
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
                    Toast.makeText(this,"belum buat",Toast.LENGTH_SHORT).show()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }


        }
}
