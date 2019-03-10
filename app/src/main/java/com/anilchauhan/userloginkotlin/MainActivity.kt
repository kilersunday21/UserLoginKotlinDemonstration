package com.anilchauhan.userloginkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userEt = findViewById<EditText>(R.id.etUsername)
        val passEt = findViewById<EditText>(R.id.etPassword)
        val errorTv=findViewById<TextView>(R.id.tvError)

        val loginBtn = findViewById<Button>(R.id.btnLogin)
        val resetBtn = findViewById<Button>(R.id.btnReset)



        loginBtn.setOnClickListener {

            var username = userEt.text.toString()
            var password = passEt.text.toString()

            if (username == "anil" && password == "anil")
            {
                val intent = Intent(this@MainActivity, Main2Activity::class.java)
                intent.putExtra("name", username)
                startActivity(intent)
            }
            else
            {
                //Toast.makeText(this,"Invalid Username/Password",Toast.LENGTH_SHORT)
                errorTv.text = "Invalid Username or Password"
            }
        }

        resetBtn.setOnClickListener {
            userEt.setText("")
            passEt.setText("")
        }

    }
}
