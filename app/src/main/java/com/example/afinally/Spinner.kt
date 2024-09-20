package com.example.afinally

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afinally.Spinner as Spinner1

class Spinner : AppCompatActivity() {

    private lateinit var spinner1 : Spinner
    private lateinit var showBtn : Button
    private lateinit var spineerDisplay : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        spinner1 = findViewById(R.id.spinner1)
        spineerDisplay = findViewById(R.id.spineerDisplay)
        showBtn = findViewById(R.id.showBtn)

        //for Get from Resourch>Values>strings file
        var arrayData = resources.getStringArray(R.array.country)

        //for kt files array
        val country = arrayOf("Bangladesh", "Japan", "Nepal", "Vhutan", "United Kingdom", "United States","United Arab Emirats", "Soudi Arab", "Germany", "Sweezerland")

        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayData)
        spinner1.adapter = arrayAdapter


        showBtn.setOnClickListener {
            var value = spinner1.selectedItem.toString()
            spineerDisplay.text = value

        }






    }


}