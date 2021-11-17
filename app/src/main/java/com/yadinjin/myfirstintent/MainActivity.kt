package com.yadinjin.myfirstintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.show_button)
        showButton.setOnClickListener {
            showSnackbar(it)
        }

        //val textViewDemo: TextView = findViewById(R.id.textViewDemo)

        val switchMaterial: SwitchMaterial = findViewById(R.id.switchMaterial)

        switchMaterial.setOnCheckedChangeListener { View, isChecked ->
            val textViewDemo: TextView = findViewById(R.id.textViewDemo)
            if (isChecked) {
                textViewDemo.text = "Переключатель Включен!"
                //textViewDemo.visibility=View.VISIBLE
            }
            else {
                textViewDemo.text = "Переключатель ВЫключен!"
                //textViewDemo.visibility = View.INVISIBLE
            }
        }
        val nextButton: Button = findViewById(R.id.next_button)

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.app_name))

        val chooser = Intent.createChooser(intent, "Поделиться!!!")

        nextButton.setOnClickListener {
            startActivity(chooser)
        }


    }



    private fun showSnackbar(view: View) {
        Snackbar.make(this, view, "Snackbar showed", Snackbar.LENGTH_INDEFINITE)
            .setAction("Action") {
                Toast.makeText(this, "Toast!", Toast.LENGTH_LONG).show()
            }
            .show()
    }
}