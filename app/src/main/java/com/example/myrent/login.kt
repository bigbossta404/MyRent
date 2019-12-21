package com.example.myrent

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.myrent.Adapter.LoginChild
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_login.*
import kotlin.system.exitProcess

class login : AppCompatActivity() {
    lateinit var v_user: EditText
    lateinit var v_pass: EditText
    lateinit var adapchild: MutableList<LoginChild>

//====================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        v_user = findViewById(R.id.username)
        v_pass = findViewById(R.id.password)
        adapchild = mutableListOf()


        masuk.setOnClickListener {
            login()
        }

        txtregister.setOnClickListener {
                val intent = Intent(this, register::class.java)
                startActivity(intent)
        }
    }
//=====================================================================================

    override fun onBackPressed() {
        moveTaskToBack(true);
        exitProcess(-1)
    }

    private fun login(){
        val user = v_user.text.toString().trim()
        val pass = v_pass.text.toString().trim()
        val loading = ProgressDialog(this)

        if(user.isEmpty()){
            v_user.error = "Masukkan Username!"
            return
        }

        if(pass.isEmpty()){
            v_pass.error = "Masukkan Password!"
            return
        }


        val ref = FirebaseDatabase.getInstance().reference
        val ref_user = ref.child("identitas_user").orderByChild("username").equalTo(user)
        val ref_pass = ref.child("identitas_user").orderByChild("pass").equalTo(pass)

        //cek user apakah ada tidak pemirsaaa....

        ref_user.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(p1: DataSnapshot){
                loading.setMessage("Memuat data...")
                loading.show()
                ref_pass.addValueEventListener(object: ValueEventListener {
                    override fun onDataChange(p0: DataSnapshot){

                        //jika user & pass ditemukan
                        if(p1.exists() && p0.exists()){
                            for(h in p0.children){
                                val logdapter = h.getValue(LoginChild::class.java)
                                adapchild.add(logdapter!!)
                                val nik = logdapter.nik
                                loading.dismiss()
                                Toast.makeText(applicationContext, "Berhasil Masook", Toast.LENGTH_SHORT).show()
                                val intent = Intent(applicationContext, MainActivity::class.java)
                                intent.putExtra("user",user)
                                startActivity(intent)
                            }
                        }
                        else{
                            Toast.makeText(applicationContext, "User tidak ada", Toast.LENGTH_SHORT).show()
                            loading.dismiss()
                        }
                    }
                    override fun onCancelled(p0: DatabaseError){}
                })
            }
            override fun onCancelled(p1: DatabaseError){}
        })

        loading.dismiss()
    }
}
