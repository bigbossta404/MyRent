package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myrent.bigfam
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle: Bundle? = intent.extras
        val usr = bundle?.get("user").toString()

        hiuser.text = usr

        btnbigfam.setOnClickListener {
            val intent = Intent(this, bigfam::class.java)
            startActivity(intent)
        }
        btnsweetfam.setOnClickListener {
            val intent = Intent(this, sweetfam::class.java)
            startActivity(intent)
        }
        btnmatic.setOnClickListener {
            val intent = Intent(this, matic::class.java)
            startActivity(intent)
        }

        navbar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
//                R.id.navhome -> {
//                    Toast.makeText(this,"belum buat", Toast.LENGTH_SHORT).show()
//                }
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

    override fun onBackPressed() {
        moveTaskToBack(true);
        exitProcess(-1)
    }
}
