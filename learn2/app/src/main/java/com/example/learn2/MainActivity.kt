package com.example.learn2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val upload = findViewById<Button>(R.id.btnupload)
        val dwd = findViewById<Button>(R.id.btndwd)
        upload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }
        dwd.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}