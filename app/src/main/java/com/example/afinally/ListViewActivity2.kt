package com.example.afinally

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity2 : AppCompatActivity() {

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        listView = findViewById(R.id.listView2)

        val country = arrayOf("Bangladesh", "Japan", "Nepal", "Vhutan", "United Kingdom", "United States","United Arab Emirats", "Soudi Arab", "Germany", "Sweezerland")


        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter(this, R.layout.list_view_style,R.id.textView4, country)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Country : "+country[i], Toast.LENGTH_SHORT).show()

        }

    }
}