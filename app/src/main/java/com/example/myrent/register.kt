package com.example.myrent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myrent.Adapter.LoginChild
import kotlinx.android.synthetic.main.activity_register.*


class register : AppCompatActivity() {
    lateinit var v_nama: EditText
    lateinit var v_nik: EditText
    lateinit var v_email: EditText
    lateinit var v_pass: EditText
    lateinit var v_repass: EditText
    lateinit var btn: Button
    lateinit var List: MutableList<LoginChild>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        lanjut.setOnClickListener {
            val  intent = Intent(this, regusername::class.java)
            intent.putExtra("nama", reg_nama.getText().toString())
            intent.putExtra("nik", reg_identitas.getText().toString())
            intent.putExtra("email", reg_email.getText().toString())
            intent.putExtra("pass", reg_pass.getText().toString())
            startActivity(intent)
        }

        kembali.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)
        }
        v_nama = findViewById(R.id.reg_nama)
        v_nik = findViewById(R.id.reg_identitas)
        v_email = findViewById(R.id.reg_email)
        v_pass = findViewById(R.id.reg_pass)
        btn = findViewById(R.id.lanjut)

    }

//    private fun alertRegisBox() {
//
//        val nama = v_nama.text.toString().trim()
//        val nik = v_nik.toString().trim()
//        val email = v_email.toString().trim()
//        val pass = v_pass.text.toString().trim()
//        val repass = v_repass.text.toString().trim()
//
//        if (nama.isEmpty()) {
//            v_nama.error = "Masukkan Nama!"
//            return
//        }
//        if (nik.isEmpty()) {
//            v_nik.error = "Masukkan Identitas!"
//            return
//        }
//        if (email.isEmpty()) {
//            v_email.error = "Masukkan Identitas"
//            return
//        }
//        if (pass.isEmpty()) {
//            v_pass.error = "Masukkan Password!"
//            return
//        }
//        if (!repass.equals(pass)) {
//            v_repass.error = "Password Tidak Cocok!"
//            return
//        }else{
//
//        }
//    }

}
