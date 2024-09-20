package com.example.afinally

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.transition.Visibility
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerBtn : CardView
    private lateinit var webView : CardView
    private lateinit var progressBarBtn : CardView
    private lateinit var switch : CardView
    private lateinit var alertDialog : CardView
    private lateinit var snackbar : CardView
    private lateinit var radioButton : CardView
    private lateinit var checkbox : CardView
    private lateinit var listView : CardView
    private lateinit var constraintLayout : ConstraintLayout
    private lateinit var progressbar : ProgressBar
    private lateinit var listView2 : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        listView = findViewById(R.id.Listview)
        checkbox = findViewById(R.id.Checkbox)
        radioButton = findViewById(R.id.radioBtn)
        snackbar = findViewById(R.id.snackbar)
        alertDialog = findViewById(R.id.alertDialog)
        switch = findViewById(R.id.Switch)
        webView = findViewById(R.id.WebView)
        progressBarBtn = findViewById(R.id.progressbarbtn)
        spinnerBtn = findViewById(R.id.spineerBtn)
        constraintLayout = findViewById(R.id.main)
        progressbar = findViewById(R.id.progressBar)
        listView2 = findViewById(R.id.listView2)





        //------------------------------------------------------------------------------



        //Web View
        webView.setOnClickListener {
            Toast.makeText(this, "Yeah, This is Working", Toast.LENGTH_SHORT).show()
        }



        //Snacbar
        snackbar.setOnClickListener {
            var snack = Snackbar.make(constraintLayout, "This is a Snack", Snackbar.LENGTH_LONG)
            snack.show()
        }


        //Progress Bar
        progressBarBtn.setOnClickListener {

            progressbar.visibility = View.VISIBLE

            if (progressBarBtn.isLongClickable){
                progressbar.visibility = View.GONE
            }

        }


        // Alert Dialog
        alertDialog.setOnClickListener {
            AlertDialog.Builder(this).
                    setTitle("Tumi ki chobi dekhte chaw?")

                        .setMessage("Jodi chobi dekhte chaw, tahole hae te click koro, tarpor switch ta on koiro")

                        .setPositiveButton("Hae", DialogInterface.OnClickListener { dialogInterface, i ->
                        //dialogInterface.dismiss()
                            var intent = Intent(this, SwitchAcivity::class.java)
                            startActivity(intent)
                    })

                        .setNegativeButton("Na", DialogInterface.OnClickListener { dialogInterface, i ->
                        dialogInterface.cancel()
                    })

                        .setCancelable(false)
                .show()
        }


        //Radio Button
        radioButton.setOnClickListener {
            val intent = Intent(this, RadioButtonActivity::class.java)
            startActivity(intent)
        }


        //checkBox
        checkbox.setOnClickListener {
            val radioIntent = Intent(this, CheckboxActivity::class.java )
            startActivity(radioIntent)
        }



        //Switch
        switch.setOnClickListener {
            var switchIntent = Intent(this, SwitchAcivity::class.java)
            startActivity(switchIntent)
        }



        //Spineer
        spinnerBtn.setOnClickListener {
            var spineerIntent = Intent(this, Spinner::class.java)
            startActivity(spineerIntent)
        }



        //ListView
        listView.setOnClickListener {
            var intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        //list View 2
        listView2.setOnClickListener {
            var intent = Intent(this, ListViewActivity2::class.java)
            startActivity(intent)
        }





    }
}