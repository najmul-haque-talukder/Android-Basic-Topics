package com.example.afinally

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var listViewFrist : ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listViewFrist = findViewById(R.id.listViewFrist)

        var familyMembersOfNajmuls = arrayOf("Nasir Uddin Talukder", "Zahima Begum Tahmina", "Najmul Haque Talukder", "Rafsin Talukder")


        var arrayAdapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, familyMembersOfNajmuls)
        listViewFrist.adapter = arrayAdapter

        listViewFrist.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Selected : "+familyMembersOfNajmuls[i], Toast.LENGTH_SHORT).show()
        }

    }
}