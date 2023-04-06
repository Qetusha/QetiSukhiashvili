package com.example.qetisukhiashvili

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val etUserName = findViewById<View>(R.id.enName) as EditText

        findViewById<Button>(R.id.button3).setOnClickListener {
            val strUserName = etUserName.text.toString()
            if (TextUtils.isEmpty(strUserName)) {
                etUserName.error = "Please Enter Email"
            } else {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }
        }
    }
}