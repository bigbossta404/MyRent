package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_regusername.*

class regusername : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regusername)

        buat.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
       var kembali = findViewById(R.id.kembali) as ImageView
        kembali.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}
