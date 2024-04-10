package com.example.appgorjeta

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val tvTitle:TextView = findViewById(R.id.tv_title)
        val btnClean:Button = findViewById(R.id.btn_clean)
        val btnDone:Button = findViewById(R.id.btn_caculator)
        val edtTotal: TextInputEditText = findViewById(R.id.tie_total)
        val edtNumPeople: TextInputEditText = findViewById(R.id.tie_num_people)



        btnClean.setOnClickListener(){

        }
    }
}