package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrent.history
import kotlinx.android.synthetic.main.activity_tersewa_agya.*
import kotlinx.android.synthetic.main.activity_tersewa_ayla.*
import kotlinx.android.synthetic.main.activity_tersewa_ayla.history

class tersewa_ayla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tersewa_ayla)
        history.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)
        }
    }
}
