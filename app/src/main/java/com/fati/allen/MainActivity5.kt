package com.fati.allen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btn_entree
import kotlinx.android.synthetic.main.activity_main2.edt_password
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main4.btn_create
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar?.hide()

        btn_done.setOnClickListener {
            finish();
            System.exit(0);//java pas dans kotlin
        }
        val sendANewCode = edt_Send.text.toString()
        if (sendANewCode.isEmpty()) {
            edt_email.error = "sendANewCode required"

        }
}}