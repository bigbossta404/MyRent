package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}
