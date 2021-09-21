package com.shahzadian.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textView.text = editText.text
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })

        button
            .setOnClickListener {
                Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
            }

//        f(object : SomeInterface {
//            override fun someFun() {
//                TODO("Not yet implemented")
//            }
//        })
    }
}

interface SomeInterface {

    fun someFun()
}

fun f(i: SomeInterface) {

}