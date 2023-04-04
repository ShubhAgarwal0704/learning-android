package com.example.learn

import androidx.appcompat.app.AppCompatActivity  /*all header files
                                                  imported (files which are later
                                                   used in the program)*/
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.ViewCompat.setBackground

class MainActivity : AppCompatActivity() //class main
{
    override fun onCreate(savedInstanceState: Bundle?) //fun = function
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dark =  findViewById<Button>(R.id.darkbtn)
        val light = findViewById<Button>(R.id.lightbtn)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)

        light.setOnClickListener{
            layout.setBackgroundResource(R.color.teal_200)
        }
        dark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
    }
}