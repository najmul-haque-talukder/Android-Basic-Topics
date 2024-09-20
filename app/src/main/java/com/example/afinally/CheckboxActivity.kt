package com.example.afinally

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckboxActivity : AppCompatActivity() {

    private lateinit var fruits : CheckBox
    private lateinit var juice : CheckBox
    private lateinit var milk :CheckBox
    private  lateinit var showBtn : Button
    private lateinit var display1 : TextView
    private lateinit var display2 : TextView
    private lateinit var display3 : TextView
    private lateinit var display4 : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkbox)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fruits = findViewById(R.id.fruites)
        milk = findViewById(R.id.milk)
        juice = findViewById(R.id.juice)
        showBtn = findViewById(R.id.showBtn)
        display1 = findViewById(R.id.display1)
        display2 = findViewById(R.id.display2)
        display3 = findViewById(R.id.display3)



        //------------------------------------------------------------------------------------------------------




        showBtn.setOnClickListener {

            if (milk.isChecked()){
                display1.setText("Milk is Odered")
            }
            else if (milk.isChecked() == false){
                display1.setText("")
            }


            if (fruits.isChecked()){
                display2.setText("Fruites is Ordered")
            }
            else if (fruits.isChecked() == false){
                display2.setText("")
            }

            if (juice.isChecked()){
                display3.setText("Juice is Ordered")
            }
            else if (juice.isChecked() == false){
                display3.setText("")
            }

        }
    }
}