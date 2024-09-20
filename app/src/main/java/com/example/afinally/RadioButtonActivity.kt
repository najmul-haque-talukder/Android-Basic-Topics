package com.example.afinally

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioButtonActivity : AppCompatActivity() {

    private lateinit var radioGroup : RadioGroup
    private lateinit var showButton : Button
    private lateinit var result : TextView
    private lateinit var chandpurButton : RadioButton
    private lateinit var cumillaButton : RadioButton
    private lateinit var dhakaButton : RadioButton
    private lateinit var noneButton: RadioButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_button)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        radioGroup = findViewById(R.id.radioGroup)
        showButton = findViewById(R.id.showButton)
        result = findViewById(R.id.result)
        chandpurButton = findViewById(R.id.chandpurButton)
        cumillaButton = findViewById(R.id.cumillaButton)
        dhakaButton = findViewById(R.id.dhakaButton)
        noneButton = findViewById(R.id.noneButton)



        //---------------------------------------------------------------------


        showButton.setOnClickListener {



            if (chandpurButton.isChecked()){
                result.setText("Your Currently City is : Chandpur")
            }
            else if(cumillaButton.isChecked()){
                result.setText("Your Currently City is : Cumilla")
            }
            else if (dhakaButton.isChecked()){
                result.setText("Your Currently City is : Dhaka")
            }
            else if (noneButton.isChecked()){
                result.setText("Unselected")
            }
            else{
                result.setText("Unselected")
            }



        }
    }
}