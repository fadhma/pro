package com.fati.allen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btn_entree
import kotlinx.android.synthetic.main.activity_main2.edt_password
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()

        btn_create.setOnClickListener {
            val Email = edt_email.text.toString()
            val Password = edt_password.text.toString()
            val UserName= edt_name.text.toString()
            val Phone = edt_phone.text.toString()
            if (Email.isEmpty()) {
                edt_email.error = "Email required"
                return@setOnClickListener
            }
            if (Password.isEmpty()) {
                edt_email.error = "motDePasse required"
                return@setOnClickListener
            }
            if (UserName.isEmpty()) {
                edt_name.error = "UserName required"
                return@setOnClickListener
            }
            if (Phone.isEmpty()) {
                edt_phone.error = "Phone required"
                return@setOnClickListener
            }
            Toast.makeText(this, "$Email\n $Password\n $UserName\n $Phone", Toast.LENGTH_LONG).show()

        }
        btn_suivant.setOnClickListener{
            startActivity(Intent(this, MainActivity5::class.java))

        }
    }
}