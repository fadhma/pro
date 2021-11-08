package com.fati.allen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_Login
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        btn_entree.setOnClickListener {
            val EmailaPhone = edt_email.text.toString()
            val Password = edt_password.text.toString()
            if (EmailaPhone.isEmpty()) {
                edt_email.error = "Email required"
                return@setOnClickListener
            }
            if (Password.isEmpty()) {
                edt_email.error = "motDePasse required"
                return@setOnClickListener
            }
            Toast.makeText(this, "$EmailaPhone\n $Password", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, MainActivity3::class.java))
        }





    }
}
