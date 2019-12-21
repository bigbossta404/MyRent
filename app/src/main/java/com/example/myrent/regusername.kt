package com.example.myrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.myrent.Adapter.AdapterUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_regusername.*

class regusername : AppCompatActivity() {


    lateinit var v_username: EditText
    lateinit var v_nama: EditText
    lateinit var v_nik: EditText
    lateinit var v_email: EditText
    lateinit var v_pass: EditText
    lateinit var btn: Button
    lateinit var adapuser: MutableList<AdapterUser>
    lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regusername)

        adapuser = mutableListOf()

        buat.setOnClickListener {
            savesaveuser()
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

       var kembali = findViewById(R.id.kembali) as ImageView
        kembali.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }

    private fun savesaveuser() {

        val usr = reg_username.getText().toString()

        val bundle: Bundle? = intent.extras
        val nama = bundle?.get("nama").toString()
        val nik = bundle?.get("nik").toString()
        val email = bundle?.get("email").toString()
        val pass = bundle?.get("pass").toString()

        if(usr.isEmpty()){
            v_username.error = "Masukkan Username!"
            return
        }
        else{
            val ref = FirebaseDatabase.getInstance().getReference("identitas_user")
            val userr = AdapterUser(
                nama,
                nik,
                email,
                pass,
                usr
            )
            ref.child(nik).setValue(userr).addOnCompleteListener{
                Toast.makeText(applicationContext, "Berhasil Menambah Data", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
