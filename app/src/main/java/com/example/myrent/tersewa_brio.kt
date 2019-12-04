package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrent.history
import kotlinx.android.synthetic.main.activity_tersewa_agya.*
import kotlinx.android.synthetic.main.activity_tersewa_brio.*
import kotlinx.android.synthetic.main.activity_tersewa_brio.history

class tersewa_brio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tersewa_brio)
        history.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)
        }
    }
}