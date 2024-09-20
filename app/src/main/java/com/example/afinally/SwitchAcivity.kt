package com.example.afinally

import android.os.Bundle
import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SwitchAcivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var switch: Switch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_switch_acivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView = findViewById(R.id.imageView)
        switch = findViewById(R.id.switch1)



        switch.setOnCheckedChangeListener { compoundButton, b ->

            if (switch.isChecked()){
                imageView.visibility = View.VISIBLE
            }
            else{
                imageView.visibility = View.GONE
            }
        }
    }
}