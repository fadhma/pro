package com.fati.allen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
        btn_entree.setOnClickListener {
            val EmailaPhone = edt_email.text.toString()

            if (EmailaPhone.isEmpty()) {
                edt_email.error = "Email required"
                return@setOnClickListener
            }
            startActivity(Intent(this, MainActivity4::class.java))





        }





    }
}