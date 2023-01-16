package com.hamker.quizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ResetPassActivity : AppCompatActivity() {
    private lateinit var email : EditText
    private lateinit var sendEmail : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass)
        init()
    }

    private fun init() {
        email = findViewById(R.id.resetEmail)
        sendEmail = findViewById(R.id.resetPWD)
    }

    private fun registerListeners() {
        sendEmail.setOnClickListener {
            val email = email.text.toString()
            if (email.isEmpty()) {
                Toast.makeText(this, "Email is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(this, "Email has been sent!", Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "Email didn't been sent!", Toast.LENGTH_SHORT).show()
//                }
//            }
        }
    }
}